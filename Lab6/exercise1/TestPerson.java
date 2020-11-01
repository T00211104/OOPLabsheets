package Lab6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args)
    {
        String text,firstName,lastName;

        text = "Calling the Person() constructor .....";
        Person person1 = new Person();
        text += "\nValue of first object is: " + person1;

        text += "\n\nCalling the Person(String,String) constructor after getting user-supplied values .....";

        firstName = JOptionPane.showInputDialog("Please enter the first name of 2nd person");
        lastName = JOptionPane.showInputDialog("Please enter the last name of 2nd person");

        Person person2 = new Person(firstName, lastName);
        text += "\n\nValue of second person object is: " + person2;

        JOptionPane.showMessageDialog(null,"*****Person Class Tester*****\n\n" + text,"",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
