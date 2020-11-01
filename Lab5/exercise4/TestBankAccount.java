package Lab5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
      String text;

      BankAccount b1 = new BankAccount();
      BankAccount b2 = new BankAccount("Richy Rich",2342343);
      b2.setInterestRate(.75);

      text = "Calling the no-argument BankAccount  constructor. The first BankAccount object details are:\n\n" +
              "Owner: " + b1.getOwner() + " Account Number: " + b1.getNumber() + "Interest Rate: " + b1.getInterestRate();

    }
}
