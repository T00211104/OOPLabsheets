package Lab5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        int temp;
        String tempAsString;
        String text;

        text = "Calling the single-argument constructor....." +
                "setting the temperature of first thermometer to 35C";

        Thermometer firstThermometer = new Thermometer(35);

        text += "\nFirst Thermometer: \n" + firstThermometer;

        text += "\nFirst Thermometer: \nCalling the no-argument constructor....." +
                "setting the temperature of second thermometer to 0C";

        Thermometer secondThermometer = new Thermometer();

        text += "\nSecond Thermometer: \n" + secondThermometer;

        text += "\nCalling the no-argument constructor....." +
                "setting the temperature of the second thermometer to 25C";

        secondThermometer.setTemp(25);

        text += "\nSecondThermometer:\n" + secondThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        tempAsString = JOptionPane.showInputDialog("Please enter the current " +
                "temperature of the first thermometer: ");

        temp = Integer.parseInt(tempAsString);

        text += "\nCalling setTemp()....." +
                "setting the temperature of the first thermometer  to " + temp + "C";
                firstThermometer.setTemp(temp);

        text += "\nFirst Thermometer: \n" + firstThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
        JOptionPane.INFORMATION_MESSAGE);
    }




}
