
import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class Factory extends Thread{
    
    public static String data;
    
    
    
    public static Integer number_screen_producers = 2;
    public static Integer number_button_producers = 2;
    public static Integer number_pin_producers = 2;
    public static Integer number_camera_producers = 2;
    public static Integer number_assemblers = 2;
    
    public static Semaphore factory_semaphore = new Semaphore(1);
    public static Semaphore screen_producer_semaphore;
    public static Semaphore button_producer_semaphore;
    public static Semaphore pin_producer_semaphore;
    public static Semaphore camera_producer_semaphore;
    
    public static Semaphore counter_semaphore = new Semaphore(1);
    
    public static Semaphore boss_manager_semaphore = new Semaphore(2);
    
    public static Semaphore manager_semaphore = new Semaphore(1);
    
    public Simulation simulation;
    public Counter counter;
    public boolean stop;
    
    public HashMap config;
    
    
    
    public Factory(Simulation simulation, Counter counter, String data){
        this.simulation = simulation;
        this.counter = counter;
        this.stop = true;
        this.config = config;
        this.data = data;
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }  
    
    @Override
    public void run(){
        
        screen_producer_semaphore = new Semaphore(Integer.parseInt(data.split(",")[4].split("=")[1]));
        button_producer_semaphore = new Semaphore(Integer.parseInt(data.split(",")[14].split("=")[1].split("}")[0]));
        pin_producer_semaphore = new Semaphore(Integer.parseInt(data.split(",")[7].split("=")[1]));
        camera_producer_semaphore = new Semaphore(Integer.parseInt(data.split(",")[11].split("=")[1]));
        
        
        
    
        while(this.stop){

            Semaphore employee_semaphore = new Semaphore(16);
            Semaphore screen_consumer = new Semaphore(1);
            Semaphore button_consumer = new Semaphore(1);
            Semaphore pin_consumer = new Semaphore(1);
            Semaphore camera_consumer = new Semaphore(1);

            Warehouse screen_warehouse = new Warehouse(Integer.parseInt(data.split(",")[8].split("=")[1]),"pantalla", 0, simulation);
            simulation.button_warehouse_current_stock3.setText(Integer.toString(screen_warehouse.getSize()));

            Warehouse button_warehouse = new Warehouse(Integer.parseInt(data.split(",")[5].split("=")[1]),"botton", 0, simulation);
            simulation.button_warehouse_current_stock1.setText(Integer.toString(screen_warehouse.getSize()));

            Warehouse pin_warehouse = new Warehouse(Integer.parseInt(data.split(",")[2].split("=")[1]),"pin", 0, simulation);
            simulation.button_warehouse_current_stock2.setText(Integer.toString(screen_warehouse.getSize()));

            Warehouse camera_warehouse = new Warehouse(Integer.parseInt(data.split(",")[3].split("=")[1]),"camara", 0, simulation);
            simulation.button_warehouse_current_stock4.setText(Integer.toString(screen_warehouse.getSize()));

                for (int i = 0; i < Integer.parseInt(data.split(",")[4].split("=")[1]); i++) {
                    Productores productor_pantalla = new Productores(3, "pantalla", i+1, Integer.parseInt(data.split(",")[6].split("=")[1]), screen_warehouse, 0, screen_producer_semaphore, true, simulation, 0, counter, number_camera_producers, number_pin_producers, number_button_producers, number_screen_producers, data);
                    System.out.println("Se creó el productor de pantallas de id: " + productor_pantalla.id);
                    this.simulation.messageCenter.append("Se creó el productor de pantallas de id: " + productor_pantalla.id + ".\n");
                    productor_pantalla.start();
                    System.out.println("El productor de pantallas: " + productor_pantalla.id + " ha comenzado a trabajar.");
                    this.simulation.messageCenter.append("El productor de pantallas de id: " + productor_pantalla.id + " ha comenzado su turno de trabajo.\n");
                };


                simulation.screen_producer_label.setText(Integer.toString(Integer.parseInt(data.split(",")[4].split("=")[1])));

                for (int i = 0; i < Integer.parseInt(data.split(",")[14].split("=")[1].split("}")[0]); i++) {
                    Productores productor_boton = new Productores(4, "boton", i+1, Integer.parseInt(data.split(",")[9].split("=")[1]), button_warehouse, 0, button_producer_semaphore, true, simulation, 0, counter, number_camera_producers, number_pin_producers, number_button_producers, number_screen_producers, data);
                    System.out.println("Se creó el productor de botones de id: " + productor_boton.id);
                    this.simulation.messageCenter.append("Se creó el productor de botones de id: " + productor_boton.id + ".\n");
                    productor_boton.start();
                    System.out.println("El productor de botones: " + productor_boton.id + " ha comenzado a trabajar.");
                    this.simulation.messageCenter.append("El productor de botones de id: " + productor_boton.id + " ha comenzado su turno de trabajo.\n");
                };

                simulation.button_producer_label.setText(Integer.toString(Integer.parseInt(data.split(",")[14].split("=")[1].split("}")[0])));

                for (int i = 0; i < Integer.parseInt(data.split(",")[7].split("=")[1]); i++) {
                    Productores productor_pin = new Productores(5, "pin", i+1, Integer.parseInt(data.split(",")[11].split("=")[1]), pin_warehouse, 0, pin_producer_semaphore, true, simulation, 0, counter, number_camera_producers, number_pin_producers, number_button_producers, number_screen_producers, data);
                    System.out.println("Se creó el productor de pins de id: " + productor_pin.id);
                    this.simulation.messageCenter.append("Se creo al ensamblador de pins de id: " + productor_pin.id + ".\n");
                    productor_pin.start();
                    System.out.println("El productor de pines: " + productor_pin.id + " ha comenzado a trabajar.");
                    this.simulation.messageCenter.append("El productor de pins de id: " + productor_pin.id + " ha comenzado su turno de trabajo.\n");
                };

                simulation.pin_producer_label.setText(Integer.toString(Integer.parseInt(data.split(",")[7].split("=")[1])));

                for (int i = 0; i < Integer.parseInt(data.split(",")[12].split("=")[1]); i++) {
                    Productores productor_camara = new Productores(5, "camara", i+1, Integer.parseInt(data.split(",")[13].split("=")[1]), camera_warehouse, 0, camera_producer_semaphore, true, simulation, 0, counter, number_camera_producers, number_pin_producers, number_button_producers, number_screen_producers, data);
                    System.out.println("Se creó el productor de camaras de id: " + productor_camara.id);
                    this.simulation.messageCenter.append("Se creo al productor de cámaras de id: " + productor_camara.id + ".\n");
                    productor_camara.start();
                    System.out.println("El productor de camaras: " + productor_camara.id + " ha comenzado a trabajar.");
                    this.simulation.messageCenter.append("El productor de cámaras de id: " + productor_camara.id + " ha comenzado su turno de trabajo.\n");
                };

                simulation.number_camera_label.setText(Integer.toString(Integer.parseInt(data.split(",")[12].split("=")[1])));

                for (int i = 0; i < Integer.parseInt(data.split(",")[1].split("=")[1]); i++) {
                    Assemblers assembler = new Assemblers(2,6,screen_warehouse, button_warehouse, camera_warehouse, pin_warehouse,
                    i+1, counter, simulation);
                    System.out.println("Se creo al ensamblador de id: " + assembler.id);
                    this.simulation.messageCenter.append("Se creo al ensamblador de id: " + assembler.id + ".\n");
                    assembler.start();
                    System.out.println("El ensamblador de id: " + assembler.id + " ha comenzado su turno de trabajo.");
                    this.simulation.messageCenter.append("El ensamblador de id: " + assembler.id + " ha comenzado su turno de trabajo.\n");
                }

                Boss boss = new Boss(7, 0, 1, true, Integer.parseInt(data.split(",")[10].split("=")[1]), counter_semaphore,  boss_manager_semaphore, simulation, counter, data);
                System.out.println("Se creó al Jefe de id: " + boss.id);
                boss.start();
                System.out.println("El jefe ha comenzado su turno de trabajo.");
                this.simulation.messageCenter.append("El jefe ha comenzado su turno de trabajo.\n");


                Manager manager = new Manager(6,0, 1, true, counter_semaphore, boss, boss_manager_semaphore,manager_semaphore, simulation, counter);
                System.out.println("Se ha creado al gerente de id: " + manager.id);
                this.simulation.messageCenter.append("Se ha creado al gerente.\n");
                manager.run();
                System.out.println("El gerente ha comenzado su turno de trabajo.");
                this.simulation.messageCenter.append("El gerente ha comenzado su turno de trabajo.\n");

        }
    
    }

    
    
}
