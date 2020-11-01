package Lab5.exercise1;

//TestBook.java
/*A driver class for the Book class, modified to try to access the Computer class from a different
 * package (the Computer class has package access)*/

import Lab3.exercise1.Computer;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println(Book.getCount());

        System.exit(0);
    }
}
