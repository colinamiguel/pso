

public class Counter {
    
    public Integer days;
    public Integer phones;
    public Integer pin_expenses;
    public Integer camera_expenses;
    public Integer button_expenses;
    public Integer screen_expenses;
    
    public Counter(Integer days, Integer phones, Integer pin_expenses, Integer camera_expenses, Integer button_expenses, Integer screen_expenses){
        this.days = days;
        this.phones = phones;
        this.camera_expenses = camera_expenses;
        this.button_expenses = button_expenses;
        this.pin_expenses = pin_expenses;
        this.screen_expenses = screen_expenses;
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
    
    
    
    
}
