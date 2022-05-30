
import java.util.concurrent.Semaphore;

public class Factory {
    
    //Monitor monitor = new Monitor();
    
    public static Integer number_screen_producers = 2;
    public static Integer number_button_producers = 2;
    public static Integer number_pin_producers = 2;
    public static Integer number_camera_producers = 2;
    public static Integer number_assemblers = 2;
    
    public static Semaphore factory_semaphore = new Semaphore(1);
    public static Semaphore screen_producer_semaphore = new Semaphore(number_screen_producers);
    public static Semaphore button_producer_semaphore = new Semaphore(number_button_producers);
    public static Semaphore pin_producer_semaphore = new Semaphore(number_pin_producers);
    public static Semaphore camera_producer_semaphore = new Semaphore(number_camera_producers);
    
    public static Semaphore counter_semaphore = new Semaphore(1);
    
    public static Semaphore boss_manager_semaphore = new Semaphore(2);
    
   public Simulation simulation;
    
    public void start_factory(){
        
    
    
    Semaphore employee_semaphore = new Semaphore(16);
    Semaphore screen_consumer = new Semaphore(1);
    Semaphore button_consumer = new Semaphore(1);
    Semaphore pin_consumer = new Semaphore(1);
    Semaphore camera_consumer = new Semaphore(1);
    
    Warehouse screen_warehouse = new Warehouse(40,"pantalla", 0);
    Warehouse button_warehouse = new Warehouse(45,"botton", 0);
    Warehouse pin_warehouse = new Warehouse(15,"pin", 0);
    Warehouse camera_warehouse = new Warehouse(20,"camara", 0);
    
        for (int i = 0; i < number_screen_producers; i++) {
            Productores productor_pantalla = new Productores(4, "pantalla", i+1, 3, screen_warehouse, 0, screen_producer_semaphore, true);
            System.out.println("Se creó el productor de pantallas de id: " + productor_pantalla.id);
            productor_pantalla.start();
            System.out.println("El productor de pantallas: " + productor_pantalla.id + " ha comenzado a trabajar.");
        };
        
        for (int i = 0; i < number_button_producers; i++) {
            Productores productor_boton = new Productores(4, "boton", i+1, 3, button_warehouse, 0, button_producer_semaphore, true);
            System.out.println("Se creó el productor de botones de id: " + productor_boton.id);
            productor_boton.start();
            System.out.println("El productor de botones: " + productor_boton.id + " ha comenzado a trabajar.");
        };
        
        for (int i = 0; i < number_pin_producers; i++) {
            Productores productor_pin = new Productores(4, "pin", i+1, 3, pin_warehouse, 0, pin_producer_semaphore, true);
            System.out.println("Se creó el productor de pins de id: " + productor_pin.id);
            productor_pin.start();
            System.out.println("El productor de pines: " + productor_pin.id + " ha comenzado a trabajar.");
        };
        
        for (int i = 0; i < number_camera_producers; i++) {
            Productores productor_camara = new Productores(4, "camera", i+1, 3, camera_warehouse, 0, camera_producer_semaphore, true);
            System.out.println("Se creó el productor de camaras de id: " + productor_camara.id);
            productor_camara.start();
            System.out.println("El productor de camaras: " + productor_camara.id + " ha comenzado a trabajar.");
        };
        
        for (int i = 0; i < number_assemblers; i++) {
            Assemblers assembler = new Assemblers(2,6,screen_warehouse, button_warehouse, camera_warehouse, pin_warehouse,
            i+1);
            System.out.println("Se creo al ensamblador de id: " + assembler.id);
            assembler.start();
            System.out.println("El ensamblador de id: " + assembler.id + " ha comenzado su turno de trabajo.");
        }
    
        Boss boss = new Boss(7, 0, 1, true, 15, counter_semaphore, simulation, boss_manager_semaphore);
        System.out.println("Se creó al Jefe de id: " + boss.id);
        boss.start();
        System.out.println("El jefe ha comenzado su turno de trabajo.");
        
        Manager manager = new Manager(6,0, 1, true, counter_semaphore, boss, boss_manager_semaphore);
        System.out.println("Se ha creado al gerente de id: " + manager.id);
        manager.run();
            System.out.println("El gerente ha comenzado su turno de trabajo.");
        
//    Productores productor_boton = new Productores(4.0, "boton", 2, 3.0, button_warehouse, 0, factory_semaphore, true);
//    Productores productor_pin = new Productores(4.0, "pin", 3, 3.0, pin_warehouse, 0, factory_semaphore, true);
//    Productores productor_camara = new Productores(4.0, "camara", 4, 3.0, camera_warehouse, 0, factory_semaphore, true);


//    productor_boton.start();
//    productor_pin.start();
//    productor_camara.start();
    }
    
    
}
