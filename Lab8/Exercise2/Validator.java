package Lab8.Exercise2;

public class Validator {

    //algorithm taken and modified from last years Lab Sheet 10 Extra, Exercise 4
    public static boolean isValidRegistrationNumber(String registrationNumber){

        if(registrationNumber.length()>=6 && registrationNumber.length()<=12)
            if(Character.isDigit(registrationNumber.charAt(2)) && Character.isDigit(registrationNumber.charAt(1)))
                if(registrationNumber.charAt(2)=='-')
                    if(Character.isUpperCase(registrationNumber.charAt(3))&&
                            Character.isUpperCase(registrationNumber.charAt(4))&&
                            registrationNumber.charAt(5)=='-' || (Character.isUpperCase(registrationNumber.charAt(3))&&
                            registrationNumber.charAt(4)=='-' && Character.isDigit(registrationNumber.charAt(5))))
                    {

                        int j;
                        for(j=6;j<registrationNumber.length();j++)
                            if (j == registrationNumber.length())
                                return true;
                    }
        return false;
    }
}
