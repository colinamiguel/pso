import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assemblers extends Thread{
    
    Semaphore assemblers_semaphore = new Semaphore(1);
    Integer workday_hours = 24;
    
    private Integer capacity;
    private Integer hourly_wage;
    private Integer worked_hours;
    private Warehouse screen_warehouse;
    private Warehouse button_warehouse;
    private Warehouse camera_warehouse;
    private Warehouse pin_warehouse;
    public Integer id;
    private String status;
    private Boolean hired;
    public Integer wage;
    public Integer assembled_phones;
    public Counter counter;
    public Simulation simulation;
    
    
    public Assemblers(Integer capacity, Integer hourly_wage, Warehouse screen_warehouse,
                      Warehouse button_warehouse, Warehouse camera_warehouse, Warehouse pin_warehouse,
                      Integer id, Counter counter, Simulation simulation){
        this.capacity = capacity;
        this.hourly_wage = hourly_wage;
        this.worked_hours = 0;
        this.screen_warehouse = screen_warehouse;
        this.button_warehouse = button_warehouse;
        this.pin_warehouse = pin_warehouse;
        this.camera_warehouse = camera_warehouse;
        this.id = id;
        this.status = status;
        this.hired = true;
        this.wage = 0;
        this.assembled_phones = 0;
        this.counter = counter;
        this.simulation = simulation;
        
    }
    
    @Override
    public void run(){
        while(this.hired){
            
            try {
                assemblers_semaphore.acquire();
                if (this.screen_warehouse.stock >= 1 & this.button_warehouse.stock >= 2 & 
                this.camera_warehouse.stock >= 2 & this.pin_warehouse.stock >= 1) {
                    this.status = "Trabajando";

                    this.worked_hours = this.worked_hours + 24*2;
                    this.wage = this.wage + (this.hourly_wage*24*2); 
                    this.counter.assembler_wage_expenses = this.counter.assembler_wage_expenses + this.wage;

                    screen_warehouse.remove_part();
                    camera_warehouse.remove_part();
                    button_warehouse.remove_part();
                    pin_warehouse.remove_part();
                    Thread.sleep(1000*workday_hours*capacity);
                    this.simulation.messageCenter.setText("El ensamblador número " + this.id + " ha ensamblado un teléfono.\n");
                    System.out.println("En ensamblador número: " + id + " ha ensamblado un telefono.");

                    this.assembled_phones = this.assembled_phones + 1;
                    this.counter.ganancias = this.counter.ganancias + 600;
                    this.counter.phones = this.counter.phones + 1;
                    this.simulation.phones_p.setText(Integer.toString(this.counter.phones));
                    this.simulation.ganancias.setText(Integer.toString(this.counter.ganancias));

                    System.out.println("\n " + this.id + " " + this.worked_hours + " " + this.wage+ "\n");
                }else{
                    this.status = "Ocioso";
                }

                assemblers_semaphore.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Assemblers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
