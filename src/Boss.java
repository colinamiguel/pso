import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Boss extends Thread{
    
    
    
    public String status;
    private Integer hourly_wage;
    private Integer worked_hours;
    public int id;
    private Boolean hired;
    private Semaphore counter_semaphore;
    public Integer counter;
    private Boolean updated_counter;
    private Integer hour_counter;
    public Integer wage;
    public Semaphore boss_manager_semaphore;
    public Simulation simulation;
    
    public Boss(Integer hourly_wage, Integer worked_hours, int id, Boolean hired,
                Integer counter, Semaphore counter_semaphore,
                Semaphore boss_manager_semaphore, Simulation simulation){
        
        this.status = status;
        this.hourly_wage = hourly_wage;
        this.worked_hours = worked_hours;
        this.id = id;
        this.hired = hired;
        this.counter = counter;
        this.updated_counter = false;
        this.hour_counter = 24000;
        this.counter_semaphore = counter_semaphore;
        this.wage = 0;
        this.boss_manager_semaphore = boss_manager_semaphore;
        this.simulation = simulation;
    }
    
    @Override
    public void run(){
        
        
        while(this.hired){
            
            if(this.updated_counter == false ){
                
                this.status = "Ocioso";
                this.simulation.boss_status_label.setText(this.status);
                System.out.println("El jefe esta ocioso.");
                
                
                try{
                    
                    boss_manager_semaphore.acquire(1);
                    counter_semaphore.acquire();
                    this.status = "Revisando contador";
                    this.simulation.boss_status_label.setText(this.status);
                    
                    this.counter = this.counter - 1;
                    this.simulation.days_label.setText(Integer.toString(this.counter));
                    System.out.println("El jefe está actualizando el contador.");
                    this.simulation.boss_status_label.setText(this.status);
                    Thread.sleep(1000*7);
                    this.hour_counter = this.hour_counter - (1000*7);
                    this.updated_counter = true;
                    counter_semaphore.release(); 
                    boss_manager_semaphore.release();
                    
                    this.status = "ocioso";
                    System.out.println("ocioso");
                    
                }catch (InterruptedException ex) {
                    Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(this.updated_counter == true & this.hour_counter > 0){
               
                try {
                    boss_manager_semaphore.acquire(1);
                    this.status = "Jugando";
                    this.simulation.boss_status_label.setText(this.status);
                    Thread.sleep((1000*21)/60);
                    this.hour_counter = this.hour_counter - ((1000*21)/60);
                    
                    System.out.println("El jefe esta jugando.");
                    boss_manager_semaphore.release(1);
                    
                    boss_manager_semaphore.acquire(1);
                    this.status = "Revisando papeles";
                    this.simulation.boss_status_label.setText(this.status);
                    Thread.sleep((1000*21)/60);
                    this.hour_counter = this.hour_counter - ((1000*21)/60);
                    System.out.println("El jefe esta revisando papeles.");
                    boss_manager_semaphore.release(1);
                    
                    if (this.hour_counter <= 0) {
                        this.updated_counter = false;
                        this.worked_hours = this.worked_hours + 24;
                        this.wage = this.wage + (this.hourly_wage*24);
                        this.simulation.boss_wage.setText(Integer.toString(this.wage));
                        this.updated_counter = false;
                        this.hour_counter = 24000;
                    }
                    
                    if (this.counter == 0) {
                        this.status = "Preparando lote.";
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
