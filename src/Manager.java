import java.io.FileNotFoundException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import javax.swing.JOptionPane;

public class Manager extends Thread{
    
    private String status;
    private int hourly_wage;
    private Integer worked_hours;
    public int id;
    public Boolean hired;
    private Semaphore counter_semaphore;
    public Boss boss;
    public Semaphore boss_manager_semaphore;
    public Integer wage;
    public Semaphore manager_semaphore;
    public Simulation simulation;
    public Counter counter;
    public boolean stop;
   
    
    
    public Manager(int houtly_wage, Integer worked_hours, int id, 
                   Boolean hired, Semaphore counter_semaphore, Boss boss, Semaphore boss_manager_semaphore,
                   Semaphore manager_semaphore, Simulation simulation, Counter counter){
        
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
        this.counter = counter;
        this.stop = true;
        
        
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }    
    
    @Override
    public void run(){
        while(this.stop){

            try {
                this.boss_manager_semaphore.acquire();
                
                int tiempo = (int)Math.floor(Math.random()*(18-12+1)+12);
                
                int time = (int)Math.floor(Math.random()*(90-30+1)+30);
                
                this.manager_semaphore.acquire();
                this.status = "Supervisando";
                
                this.simulation.manager_status_label.setText(this.status);
                
                
                Thread.sleep((time*1000)/60);
                if(boss.status == "Jugando" ){
                    boss.wage = boss.wage - 2;
                    this.counter.boss_wage_expenses = this.counter.boss_wage_expenses - 2;
                    this.simulation.boss_wage.setText(Integer.toString(boss.wage));
                   
                }
                
                this.manager_semaphore.release();
                
                this.status = "Ocupado";
                this.simulation.manager_status_label.setText(this.status);
                
                Thread.sleep(24000-tiempo*1000);
                
                this.boss_manager_semaphore.release();
                
                this.worked_hours = this.worked_hours + 24;
                this.wage = this.wage + 180;
                this.counter.boss_wage_expenses = this.counter.boss_wage_expenses + 180;
                this.counter.manager_wage_expenses = this.counter.manager_wage_expenses + this.wage;
                this.simulation.manager_wage.setText(Integer.toString(this.wage));
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(this.counter.days == 0){
                this.status = "Preparando pedido.";
            }
            
            if(this.counter.days == -1 ){
                try {
                    this.status = "Terminó la corrida.";
                    this.simulation.manager_status_label.setText(this.status);
                    this.counter.writeCsv();
                    
                    JOptionPane.showMessageDialog(simulation, "Se ha terminado la simulación con éxito.\nPara ver los resultados, diriíjase al Dashboard.");
                    
                    this.simulation.exit();
                    
                    
                    
                    this.stopToggle();
                    this.boss.stopToggle();
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
           
            
        }
    }
    
    
    
}


