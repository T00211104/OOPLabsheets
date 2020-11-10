package Lab9.exercise1;

//SelfEmployedWorker.java
/*A subclass of the Employee class*/

public class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName,lastName);
        setEstimatedIncome();
    }

    @Override
    public double earnings() {
        return super.earnings();
    }

    public void setEstimatedIncome(){
        this.estimatedIncome = (int) (Math.random()*900-400+1)+400;
    }

    public String toString(){
        return "Self-employed worker's name is " + super.toString();
    }
}
