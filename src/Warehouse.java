
import java.util.concurrent.Semaphore;

public class Warehouse {
    
    public Integer size;
    public String type;
    public Integer stock;
    public Simulation simulation;
    
    public Warehouse(Integer size, String type, Integer stock, Simulation simulation){
        this.size = size;
        this.type = type;
        this.stock = stock;
        this.simulation = simulation;
        
        switch(this.type){
        case "pantalla":
            this.size = size;
            break;
        case "boton":
            this.size = size;
            break;
        case "pin":
            this.size = size;
            break;
        case "camara":
            this.size = size;
            break;
        };
    };

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    
    public void add_part(Integer capacity, Simulation simulation){
        if (this.stock + capacity<size) {
            this.stock = this.stock + capacity;
            System.out.println("Se ha agregado al almacén una pieza de tipo: " + this.type);
            change_text(simulation);
        }else if(this.stock + capacity > size & this.stock < size){
            this.stock = this.stock + capacity - size;
            change_text(simulation);
        }else{
            System.out.println("El almacén " + this.type + " esta a su máxima capacidad.");
            
        }
    }
    
    public void remove_part(){
        if(this.stock>0){
        this.stock = this.stock - 1;
        change_text(simulation);
            System.out.println("Se ha extraido del almacén una pieza de tipo: " + this.type);
        }else{
            System.out.println("No hay stock en el almacén "+ this.type + ".");
        }
    }
    
    public void change_text(Simulation simulation){
        switch(this.type){
            case "pantalla":
                this.simulation.screen_warehouse_current_stock.setText(Integer.toString(this.stock));
                break;
            case "pin":
                this.simulation.pin_warehouse_current_stock.setText(Integer.toString(this.stock));
                break;
            case "camara":
                this.simulation.camera_warehouse_current_stock.setText(Integer.toString(this.stock));
                break;
            case "boton":
                this.simulation.button_warehouse_current_stock.setText(Integer.toString(this.stock));
                break;
        }
    }
}
