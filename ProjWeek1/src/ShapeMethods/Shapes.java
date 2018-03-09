/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeMethods;

import java.util.Scanner;
/**
 *  Questions and Praise to:
 *  Younes Qubatisw
 *  Robert Landstedt
 */
public class Shapes {

    static double value1 = 0;
    static double value2 = 0;
    static double value3 = 0;
    static Scanner input;
    static boolean correctChoice = true;
    static Circle circle;
    static Rectangle rectangle;
    static Triangle triangle;

    public static void main(String[] args) {
        String shape = null;
        String operation = null;

        while (correctChoice) {
            shape = getInputFromUser("\n Please select:\n C for circle \n R for rectangle \n T for triangle \n ");

            switch (shape) {
                case "C": {     // CIRCLE
                    operation = getInputFromUser("Please select:\n A for Area \n C for Circumference \n P for Perimeter \n ");

                    if (operation.equalsIgnoreCase("A")) {
                        processCircle("Area");
                    } else if (operation.equalsIgnoreCase("C") || operation.equalsIgnoreCase("P")) {
                        processCircle("Circumference");
                    } else {
                        System.out.println("Not a valid choice!");
                    }
                    break;
                }

                case "R": {     // RECTANGLE
                    operation = getInputFromUser("Please select:\n A for Area \n C for Circumference \n P for Perimeter \n ");

                    if (operation.equalsIgnoreCase("A")) {
                        processRectangle("Area");
                    } else if (operation.equalsIgnoreCase("C") || operation.equalsIgnoreCase("P")) {
                        processRectangle("Perimeter");
                    } else {
                        System.out.println("Not a valid choice!");
                    }
                    break;
                }
                case "T": {     // TRIANGLE
                    operation = getInputFromUser("Please select:\n A for Area \n C for Circumference \n P for Perimeter \n ");
                
                    if (operation.equalsIgnoreCase("A")) {
                        processTriangle("Area");
                    } else if (operation.equalsIgnoreCase("C") || operation.equalsIgnoreCase("P")) {
                        processTriangle("Perimeter");
                    } else {
                        System.out.println("Not a valid choice!");
                    }
                    break;
                }
                default:
                    System.out.println("It is not a valid choice.\n ");
            }
            newOperation();
        }
        input.close();
    }

    public static void newOperation() {
        String answere = null;
        input = new Scanner(System.in);
        System.out.println("Do you want to run it again? (y\\n)");
        answere = input.nextLine();
        if (answere.equalsIgnoreCase("y") || answere.equalsIgnoreCase("yes")) {
            correctChoice = true;
        } else {
            System.out.println("Thank you for using our application.");
            correctChoice = false;
        }
    }

    public static void processCircle(String methodName) {
        try {
            System.out.print("Please enter the radius of the circle: ");
            value1 = input.nextDouble();
            if (value1 <= 0) {
                throw new Exception();
            }
            createCircle(methodName);
        } catch (Exception e) {
            System.out.println("Wrong: Enter a number (bigger than 0) not string or letter.");
        }
    }

    public static void createCircle(String methodName) {
        circle = new Circle(value1);
        switch (methodName) {
            case "Area":
                circle.Area();
                break;
            case "Circumference":
                circle.Circumference();
                break;
        }
    }

    public static void processRectangle(String methodName) {
        try {
            System.out.print("Please enter the width of the rectangle:  ");
            value1 = input.nextDouble();
            if (value1 <= 0) {
                throw new Exception();
            }
            System.out.print("Please enter the height of the rectangle: ");
            value2 = input.nextDouble();
            if (value2 <= 0) {
                throw new Exception();
            }
            createRectangle(methodName);
        } catch (Exception e) {
            System.out.println("Wrong: Enter a number (bigger than 0) not string or letter.");
        }
    }

    public static void createRectangle(String methodName) {
        rectangle = new Rectangle(value1, value2);
        switch (methodName) {
            case "Area":
                rectangle.Area();
                break;
            case "Perimeter":
                rectangle.Perimeter();
                break;
        }
    }

    public static void processTriangle(String methodName) {
        try {
            System.out.print("Please enter the base of the rectangle:  ");
            value1 = input.nextDouble();
            if (value1 <= 0) {
                throw new Exception();
            }
            if (methodName.equals("Area")) {
                System.out.print("Please enter the height of the rectangle: ");
                value2 = input.nextDouble();
                if (value2 <= 0) {
                    throw new Exception();
                }
            }
            if (methodName.equals("Perimeter")) {
                System.out.print("Please enter side2 of the rectangle: ");
                value2 = input.nextDouble();
                if (value2 <= 0) {
                    throw new Exception();
                }
                System.out.print("Please enter side3 of the rectangle: ");
                value3 = input.nextDouble();
                if (value3 <= 0) {
                    throw new Exception();
                }
            }
            createTriangle(methodName);
        } catch (Exception e) {
            System.out.println("Wrong: Enter a number (bigger than 0) not string or letter.");
        }
    }

    public static void createTriangle(String methodName) {
        triangle = new Triangle(value1, value2, value3);
        switch (methodName) {
            case "Area":
                triangle.Area();
                break;
            case "Perimeter":
                triangle.Perimeter();
                break;
        }
    }

    public static String getInputFromUser(String msg) {
        input = new Scanner(System.in);
        System.out.println(msg);
        return input.nextLine().toUpperCase();
    }
}
