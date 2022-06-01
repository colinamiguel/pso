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
    public Counter counter;
    public Integer number_of_camera_producers;
    public Integer number_of_pin_producers;
    public Integer number_of_button_producers;
    public Integer number_of_screen_producers;
    
    public Productores(Integer hourly_wage, String type, Integer id, Integer capacity, 
                       Warehouse warehouse, Integer worked_hours, Semaphore factory_semaphore, Boolean hired, Simulation simulation, Integer produced_parts, Counter counter,
                       Integer number_of_camera_producers, Integer number_of_pin_producers, Integer number_of_button_producers, Integer number_of_screen_producers){
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
        this.counter = counter;
        this.number_of_camera_producers = number_of_camera_producers;
        this.number_of_pin_producers = number_of_pin_producers;
        this.number_of_button_producers = number_of_button_producers;
        this.number_of_screen_producers = number_of_screen_producers;
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
                this.produced_parts = produced_parts;
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
                this.produced_parts = produced_parts;
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
                this.produced_parts = produced_parts;
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
                this.produced_parts = produced_parts;   
                break;
        };
        
        while(hired){
            
            Integer work_day_hours = 1000*24;
            
            try {
                
                
                
                Thread.sleep(work_day_hours);
                factory_semaphore.acquire(1);
                
                switch(this.type){
                    case "camara":
                        this.warehouse.add_part(this.capacity, this.simulation);
                        this.produced_parts = this.produced_parts + (this.capacity*number_of_camera_producers);
                        this.simulation.camera_ammount.setText(Integer.toString(this.produced_parts));
                        this.counter.camera_expenses = this.counter.camera_expenses + (this.capacity*8);
                        this.simulation.camera_expenses.setText(Integer.toString(this.counter.camera_expenses));
                        break;
                    case "pin":
                        this.warehouse.add_part(this.capacity, this.simulation);
                        this.produced_parts = this.produced_parts + (this.capacity*number_of_pin_producers);
                        this.simulation.pin_ammount.setText(Integer.toString(this.produced_parts));
                        this.counter.pin_expenses = this.counter.pin_expenses + (this.capacity*3);
                        this.simulation.pin_expenses.setText(Integer.toString(this.counter.pin_expenses));
                        break;
                    case "pantalla":
                        this.warehouse.add_part(this.capacity, this.simulation);
                        this.produced_parts = this.produced_parts + (this.capacity*number_of_screen_producers);
                        this.simulation.screen_ammount.setText(Integer.toString(this.produced_parts));
                        this.counter.screen_expenses = this.counter.screen_expenses + (this.capacity*1);
                        this.simulation.screen_expenses.setText(Integer.toString(this.counter.screen_expenses));
                        break;
                    case "boton":
                        this.warehouse.add_part(this.capacity, this.simulation);
                        this.produced_parts = this.produced_parts + (this.capacity*number_of_button_producers);
                        this.simulation.button_ammount.setText(Integer.toString(this.produced_parts));
                        this.counter.button_expenses = this.counter.button_expenses + (this.capacity*10);
                        this.simulation.button_expenses.setText(Integer.toString(this.counter.button_expenses));
                        break;
                }
                
                
                //this.produced_parts = this.produced_parts +this.capacity;
                
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
