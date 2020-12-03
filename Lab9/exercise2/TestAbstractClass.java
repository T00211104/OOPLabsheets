package Lab9.exercise2;

public class TestAbstractClass {
    public static void main(String[] args)
    {
        //Creating some Circle objects and displaying their state
        Circle circle1 = new Circle();
        System.out.println("Details of 1st Circle object: \n" + circle1);

        Circle circle2 = new Circle(5.5);
        System.out.println("\n\nDetails of 2nd Circle object: \n" + circle2);

        //Creating some Circle objects and displaying their state

        Rectangle rectangle1 = new Rectangle();
        System.out.println("\n\nDetails of 1st Rectangle object: \n" + rectangle1);

        Rectangle rectangle2 =new Rectangle(4.3,1.8);
        System.out.println("\n\nDetails of 2nd Rectangle object: \n" + rectangle2);

        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle(3.24,4.23,5.78);

        Ellipse ellipse1 = new Ellipse();

        Ellipse ellipse2 = new Ellipse(5.62,4.19);
        //Creating an array of Shape to store references to all the Circle and Rectangle objects
        //This is legal since a Circle is-a Shape and a Rectangle is-a Shape (also Triangle and Ellipse)
        //A Shape reference can reference an object that subclasses Shape

        Shape[] allShapes = {circle1,circle2,rectangle1,rectangle2,triangle1,triangle2,ellipse1,ellipse2};

        System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
        for (int i=0;i<allShapes.length;i++)
            System.out.println(allShapes[i] + "\n\n");
    }
}
