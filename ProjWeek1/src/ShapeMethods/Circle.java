
package ShapeMethods;
/**
 *  Questions and Praise to:
 *  Younes Qubatisw
 *  Robert Landstedt
 */
public class Circle {
    private double radius;
    private final double PI = 3.1415;
    
    
    public void Area() {
        double area = PI*radius*radius;
        System.out.printf("The area of circle is: %.2f" , area);
        System.out.println("\n");
    }
    
    public void Circumference() {
        double circumference = 2*PI*radius;
         System.out.printf("The circumference of circle is: %.2f" , circumference);
         System.out.println("\n");
    }

    public Circle(double radius) {
        this.radius = radius;
    }    
}


