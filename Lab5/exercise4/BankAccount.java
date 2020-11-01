package Lab5.exercise4;

public class BankAccount {
    private String Owner;
    private int Number;
    private static double InterestRate;

public BankAccount(String Owner, int Number){
    Owner = "Owner Not Available";
    Number = 0;
    InterestRate = 0;
}

public BankAccount(){
    setOwner(Owner);
    setNumber(Number);
    setInterestRate(InterestRate);

}
public void setOwner(String Owner){
    this.Owner = Owner;
}
public void setNumber(int Number){
    this.Number = Number;
}

public static void setInterestRate(double InterestRate)
{
    BankAccount.InterestRate=InterestRate;

}

public String getOwner(){
    return Owner;
}

public int getNumber(){
    return Number;
}
public double getInterestRate(){
    return InterestRate;
}

public String toString() {
    return "Owner: " + getOwner() + " " +
           " Number: " + getNumber() + " " +
           " Interest Rate: " + getInterestRate();
}

}


