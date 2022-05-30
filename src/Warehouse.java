
import java.util.concurrent.Semaphore;

public class Warehouse {
    
    private Integer size;
    private String type;
    public Integer stock;
    
    public Warehouse(Integer size, String type, Integer stock){
        this.size = size;
        this.type = type;
        this.stock = stock;
        
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

    
    public void add_part(Integer capacity){
        if (this.stock + capacity<size) {
            this.stock = this.stock + capacity;
            System.out.println("Se ha agregado al almacén una pieza de tipo: " + this.type);
        }else if(this.stock + capacity > size & this.stock < size){
            this.stock = this.stock + capacity - size;
        }else{
            System.out.println("El almacén " + this.type + " esta a su máxima capacidad.");
        }
    }
    
    public void remove_part(){
        if(this.stock>0){
        this.stock = this.stock - 1;
            System.out.println("Se ha extraido del almacén una pieza de tipo: " + this.type);
        }else{
            System.out.println("No hay stock en el almacén "+ this.type + ".");
        }
    }
}
