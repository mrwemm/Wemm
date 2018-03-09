/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeMethods;
/**
 *  Questions and Praise to:
 *  Younes Qubatisw
 *  Robert Landstedt
 */
public class Rectangle {
    private double width;
    private double height;
    
    public void Area() {
        double area = width*height;
        System.out.println("The area of the rectangle is: " + area +"\n");
    }
    
    public void Perimeter() {
        double perimeter = 2*(width+height);
        System.out.println("The perimeter of the rectangle is: " + perimeter+"\n");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    } 
}
