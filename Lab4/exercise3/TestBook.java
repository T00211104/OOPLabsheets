package Lab4.exercise3;

/*a driver class for the book class*/

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        book b1 = new book();

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        book b2 = new book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
