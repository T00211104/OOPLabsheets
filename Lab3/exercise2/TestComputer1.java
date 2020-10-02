package Lab3.exercise2;

import javax.swing.*;

public class TestComputer1 {
    public static void main(String[] args) {
        String output = "";

        Computer1 c3 = new Computer1();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c3.toString();

        Computer1 c5 = new Computer1();

        c5.setType("Desktop");

        output += "\n\nCalling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c5.toString();

        Computer1 c4 = new Computer1("Apple", "Desktop", 2.9, 12, 865.00);

        c3.setSpeed(-3.15);


        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + c4.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

