import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class Manager extends Thread{
    
    private String status;
    private int hourly_wage;
    private Integer worked_hours;
    public int id;
    private Boolean hired;
    private Semaphore counter_semaphore;
    public Boss boss;
    public Semaphore boss_manager_semaphore;
    public Integer wage;
    
    public Manager(int houtly_wage, Integer worked_hours, int id, 
                   Boolean hired, Semaphore counter_semaphore, Boss boss, Semaphore boss_manager_semaphore){
        this.status = status;
        this.hourly_wage = hourly_wage;
        this.worked_hours = worked_hours;
        this.id = id;
        this.hired = hired;
        this.counter_semaphore = counter_semaphore;
        this.boss = boss;
        this.boss_manager_semaphore = boss_manager_semaphore;
        this.wage = 0;
    }
    
    @Override
    public void run(){
        while(hired){

            try {
                this.boss_manager_semaphore.acquire();
                
                int tiempo = (int)Math.floor(Math.random()*(18-12+1)+12);
                
                Thread.sleep(24000-tiempo*1000);
                
                int time = (int)Math.floor(Math.random()*(90-30+1)+30);
                Thread.sleep((time*1000)/60);
                System.out.println("El generente está supervisando al jefe por un tiempo de: " + time);
                if(boss.status == "Jugando"){
                    boss.wage = boss.wage - 2;
                    System.out.println("Se ha descontado $2 al jefe.");
                    
                }
                this.boss_manager_semaphore.release();
                
                this.worked_hours = this.worked_hours + 24;
                this.wage = this.wage + (this.hourly_wage*24);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
