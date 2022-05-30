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
    Simulation simulation;
    public Semaphore boss_manager_semaphore;
    
    public Boss(Integer hourly_wage, Integer worked_hours, int id, Boolean hired,
                Integer counter, Semaphore counter_semaphore, Simulation simulation,
                Semaphore boss_manager_semaphore){
        
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
    }
    
    @Override
    public void run(){
        
        
        while(this.hired){
            
            if(this.updated_counter == false ){
                
                this.status = "ocioso";
                System.out.println("El jefe esta ocioso.");
                
                
                try{
                    
                    counter_semaphore.acquire();
                    this.status = "Revisando contador";
                    this.counter = this.counter - 1;
                    System.out.println("El jefe está actualizando el contador.");
                    Thread.sleep(1000*7);
                    this.hour_counter = this.hour_counter - (1000*7);
                    this.updated_counter = true;
                    counter_semaphore.release(); 
                    
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
                    Thread.sleep((1000*21)/60);
                    this.hour_counter = this.hour_counter - ((1000*21)/60);
                    
                    System.out.println("El jefe esta jugando.");
                    boss_manager_semaphore.release(1);
                    
                    boss_manager_semaphore.acquire(1);
                    this.status = "Revisando papeles";
                    Thread.sleep((1000*21)/60);
                    this.hour_counter = this.hour_counter - ((1000*21)/60);
                    System.out.println("El jefe esta revisando papeles.");
                    boss_manager_semaphore.release(1);
                    
                    if (this.hour_counter <= 0) {
                        this.updated_counter = false;
                        this.worked_hours = this.worked_hours + 24*2;
                        this.wage = this.wage + (this.hourly_wage*24*2);
                        this.updated_counter = false;
                        this.hour_counter = 24000;
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
