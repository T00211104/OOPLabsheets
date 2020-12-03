package Lab10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth,String staffID,
                    String[] coursesTaught,GregorianCalendar dateOfAppointment){
      setName(name);
      setAddress(address);
      setDateOfBirth(dateOfBirth);
      setStaffID(staffID);
      setCoursesTaught(coursesTaught);
      setDateOfAppointment(dateOfAppointment);
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String toString(){
        String str="Lecturer name is " +  getName() +
                "\nLecturer address is " + getAddress() +
                "\nLecturer date of birth is ";
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        if(getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dateOfBirth = getDateOfBirth().getTime();
            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            String strDob = formatDate.format(dateOfBirth);
            str+=strDob;
        }
        else
            str+="Undefined";

        str+="\nLecture StaffID is " + getStaffID() +
                "\nLecturer Courses Taught are " + Arrays.toString(getCoursesTaught()) +
                "\nLecturer Date of Appointment is " + formatDate.format(getDateOfAppointment().getTime()) +
                "\nLecturer Status is " + getStatus() +
                "\nLecturer Point on Scale is " + getPointOnScale();

        return str;
    }
}
