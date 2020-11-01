package Lab5.exercise3;

public class Thermometer {

    private int MaxTemp;
    private int MinTemp;
    private int CurrentTemp;

    public Thermometer(){
    setCurrentTemp(0);
    setMaxTemp(Integer.MAX_VALUE);
    setMinTemp(Integer.MIN_VALUE);
    }

    public Thermometer(int currentTemp){
        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getMaxTemp(){
        return MaxTemp;
    }

    public void setMaxTemp(int MaxTemp) {
        this.MaxTemp = MaxTemp;
    }

    public int getMinTemp(){
        return MinTemp;
    }

    public void setMinTemp(int MinTemp){
        this.MinTemp = MinTemp;
    }

    public void setCurrentTemp(int CurrentTemp){
        this.CurrentTemp = CurrentTemp;
    }

    public void setTemp(int CurrentTemp){
        setCurrentTemp(CurrentTemp);
        updateMaxMinTemp();
    }

    public int getCurrentTemp(){
        return CurrentTemp;
    }

    private void updateMaxMinTemp() {

        if(CurrentTemp > MaxTemp)
            MaxTemp = CurrentTemp;

        if(CurrentTemp < MinTemp)
            MinTemp = CurrentTemp;
    }

    public String toString() {
       return "Current temperature: " + getCurrentTemp() + "\n" +
              "Maximum temperature: " + getMaxTemp() + "\n" +
              "Minimum temperature: " + getMinTemp() + "\n";
    }


}
