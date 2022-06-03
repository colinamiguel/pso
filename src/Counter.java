
import java.io.BufferedReader;
import java.util.concurrent.Semaphore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Counter {
    
    public Integer days;
    public Integer phones;
    public Integer pin_expenses;
    public Integer camera_expenses;
    public Integer button_expenses;
    public Integer screen_expenses;
    public Integer boss_wage_expenses;
    public Integer manager_wage_expenses;
    public Integer assembler_wage_expenses;
    public Integer producers_wage_expenses;
    public String data;
    public Integer ganancias;
    public Integer ganancias_netas;
    
    public Counter(Integer days, Integer phones, Integer pin_expenses, Integer camera_expenses, Integer button_expenses, Integer screen_expenses, Integer boss_wage_expenses,
                   Integer manager_wage_expenses, Integer assembler_wage_expenses, Integer producers_wage_expenses, String data, Integer ganancias){
        
        this.days = days;
        this.phones = phones;
        this.camera_expenses = camera_expenses;
        this.button_expenses = button_expenses;
        this.pin_expenses = pin_expenses;
        this.screen_expenses = screen_expenses;
        this.boss_wage_expenses = boss_wage_expenses;
        this.manager_wage_expenses = manager_wage_expenses;
        this.assembler_wage_expenses = assembler_wage_expenses;
        this.producers_wage_expenses = producers_wage_expenses;
        this.data = data;
        this. ganancias = ganancias;
        this.ganancias_netas = ganancias_netas;
        
    }

    public Integer getDays() {
        return days;
    }
    
    public Integer getPhones(){
        return phones;
    }
    
    public void set_phones(Integer phones){
        this.phones = phones;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPin_expenses() {
        return pin_expenses;
    }

    public void setPin_expenses(Integer pin_expenses) {
        this.pin_expenses = pin_expenses;
    }

    public Integer getCamera_expenses() {
        return camera_expenses;
    }

    public void setCamera_expenses(Integer camera_expenses) {
        this.camera_expenses = camera_expenses;
    }

    public Integer getButton_expenses() {
        return button_expenses;
    }

    public void setButton_expenses(Integer button_expenses) {
        this.button_expenses = button_expenses;
    }

    public Integer getScreen_expenses() {
        return screen_expenses;
    }

    public void setScreen_expenses(Integer screen_expenses) {
        this.screen_expenses = screen_expenses;
    }
    
    public void writeCsv() throws FileNotFoundException{
    
        File file = new File("C:/Users/USER/Desktop/results.csv");
        
        String data = "";
        Scanner myReader = new Scanner(file);
        
        while (myReader.hasNextLine()) {
            data = data + myReader.nextLine() + "\n";
        }
          
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(data);
        
//        stringBuilder.append("Telefonos").append(",").append("Salario Jefe").append(",").append("Salario Manager").append(",").append("Salario Ensambladores").append(",").append("Salario productores").append(",")
//            .append("Gastos pantalla").append(",").append("Gastos botones").append(",").append("Gastos pin").append(",").append("Gastos camara").append("\n");
                
        stringBuilder.append(Integer.toString(this.phones)).append(",").append(Integer.toString(this.boss_wage_expenses)).append(",").append(Integer.toString(this.manager_wage_expenses)).append(",").append(Integer.toString(this.assembler_wage_expenses)).append(",").append(Integer.toString(this.producers_wage_expenses)).append(",")
            .append(Integer.toString(this.screen_expenses)).append(",").append(Integer.toString(this.button_expenses)).append(",").append(Integer.toString(this.pin_expenses)).append(",").append(Integer.toString(this.camera_expenses)).append("\n");
        
        //System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.toString());
        
        try {
            FileWriter writer = new FileWriter("C:/Users/USER/Desktop/results.csv");
            writer.write(stringBuilder.toString());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
