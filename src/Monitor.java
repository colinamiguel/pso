/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Monitor {
    
    public Integer phones_produced;
    public Double producers_wages;
    public Double boss_wage;
    public Double manager_wage;
    public Integer button_expenses;
    public Integer camera_expenses;
    public Integer screen_expenses;
    public Integer pin_expenses;
    public Integer assemblers_expenses;
    
    public Monitor(Productores productor_boton, Productores productor_pin, Productores productor_camara, Assemblers assembler){
        this.phones_produced = 0;
        this.producers_wages = 0.0;
        this.boss_wage = 0.0;
        this.manager_wage = 0.0;
        this.button_expenses = 0;
        this.camera_expenses = 0;
        this.screen_expenses = 0;
        this.pin_expenses = 0;
        this.assemblers_expenses = 0;
        
        
    }
    
}
