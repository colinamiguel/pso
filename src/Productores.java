import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Productores extends Thread {
    
    private Semaphore factory_semaphore;
    private Integer hourly_wage;
    private String type;
    public Integer id;
    private Integer capacity;
    private Warehouse warehouse;
    private Integer worked_hours;
    private Boolean hired;
    public String status;
    public Integer wage;
    public Simulation simulation;
    public Integer produced_parts;
    
    public Productores(Integer hourly_wage, String type, Integer id, Integer capacity, 
                       Warehouse warehouse, Integer worked_hours, Semaphore factory_semaphore, Boolean hired, Simulation simulation){
        this.hourly_wage = hourly_wage;
        this.type = type;
        this.id = id;
        this.capacity = capacity;
        this.warehouse = warehouse;
        this.worked_hours = 0;  
        this.hired = hired;
        this.factory_semaphore = factory_semaphore;
        this.status = status;
        this.wage = 0;
        this.simulation = simulation;
        this.produced_parts = produced_parts;
    };

    public Semaphore getFactory_semaphore() {
        return factory_semaphore;
    }

    public void setFactory_semaphore(Semaphore factory_semaphore) {
        this.factory_semaphore = factory_semaphore;
    }

    public Integer getHourly_wage() {
        return hourly_wage;
    }

    public void setHourly_wage(Integer hourly_wage) {
        this.hourly_wage = hourly_wage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getWorked_hours() {
        return worked_hours;
    }

    public void setWorked_hours(Integer worked_hours) {
        this.worked_hours = worked_hours;
    }

    public Boolean getHired() {
        return hired;
    }

    public void setHired(Boolean hired) {
        this.hired = hired;
    }
    
    
    @Override
    public void run(){
        switch(this.type){
            case "pantalla": 
                this.hourly_wage = hourly_wage;
                this.warehouse = warehouse;
                this.worked_hours = worked_hours;
                this.capacity = capacity;
                this.factory_semaphore = factory_semaphore;
                this.hired = hired;
                this.status = "trabajando";
                warehouse.setType("pantalla");
                break;
            case "boton":
                this.hourly_wage = hourly_wage;
                this.warehouse = warehouse;
                this.worked_hours = worked_hours;
                this.capacity = capacity;
                this.factory_semaphore = factory_semaphore;
                this.hired = hired;
                this.status = "trabajando";
                warehouse.setType("boton");
                break;
            case "pin":
                this.hourly_wage = hourly_wage;
                this.warehouse = warehouse;
                this.worked_hours = worked_hours;
                this.capacity = capacity;
                this.factory_semaphore = factory_semaphore;
                this.hired = hired;
                this.status = "trabajando";
                warehouse.setType("pin");
                break;
            case "camara":
                this.hourly_wage = hourly_wage;
                this.warehouse = warehouse;
                this.worked_hours = worked_hours;
                this.capacity = capacity;
                this.factory_semaphore = factory_semaphore;
                this.hired = hired;
                this.status = "trabajando";
                warehouse.setType("camara");
                break;
        };
        
        while(hired){
            
            Integer work_day_hours = 1000*24;
            
            try {
                
                Thread.sleep(work_day_hours);
                factory_semaphore.acquire(1);
                this.warehouse.add_part(this.capacity, this.simulation);
                this.produced_parts = this.produced_parts +this.capacity;
                
                System.out.println(this.id);
                
                this.worked_hours = this.worked_hours + 24;
                this.wage = this.wage + (this.hourly_wage*24);
                
                factory_semaphore.release();
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Productores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
};
