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
    public Semaphore manager_semaphore;
    Simulation simulation;
    
    public Manager(int houtly_wage, Integer worked_hours, int id, 
                   Boolean hired, Semaphore counter_semaphore, Boss boss, Semaphore boss_manager_semaphore,
                   Semaphore manager_semaphore, Simulation simulation){
        
        this.status = status;
        this.hourly_wage = hourly_wage;
        this.worked_hours = worked_hours;
        this.id = id;
        this.hired = hired;
        this.counter_semaphore = counter_semaphore;
        this.boss = boss;
        this.boss_manager_semaphore = boss_manager_semaphore;
        this.wage = 0;
        this.manager_semaphore = manager_semaphore;
        this.simulation = simulation;
    }
    
    @Override
    public void run(){
        while(hired){

            try {
                this.boss_manager_semaphore.acquire();
                
                int tiempo = (int)Math.floor(Math.random()*(18-12+1)+12);
                
                int time = (int)Math.floor(Math.random()*(90-30+1)+30);
                
                this.manager_semaphore.acquire();
                this.status = "Supervisando";
                
                this.simulation.manager_status_label.setText(this.status);
                
                System.out.println("El generente está supervisando al jefe por un tiempo de: " + time);
                Thread.sleep((time*1000)/60);
                if(boss.status == "Jugando" ){
                    boss.wage = boss.wage - 2;
                    this.simulation.boss_wage.setText(Integer.toString(this.wage));
                    System.out.println("Se ha descontado $2 al jefe.");
                    
                }
                this.manager_semaphore.release();
                
                this.status = "Fuera de la fábrica";
                this.simulation.manager_status_label.setText(this.status);
                Thread.sleep(24000-tiempo*1000);
                
                this.boss_manager_semaphore.release();
                
                this.worked_hours = this.worked_hours + 24;
                this.wage = this.wage + 180;
                this.simulation.boss_wage.setText(Integer.toString(this.wage));
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
