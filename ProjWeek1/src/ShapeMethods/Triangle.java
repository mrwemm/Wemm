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
public class Triangle {
    private double base;
    private double height;
    private double side2;
    private double side3;
    
    public void Area() {
        double area = (base*height)/2;
        System.out.println("The area of the triangle is: " + area+"\n");
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public void Perimeter() {
        double perimeter = base+side2+side3;
        System.out.println("The perimeter of the triangle is: " + perimeter+"\n");
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double side2, double side3) {
        this.base = base;
        this.height = side2;
        this.side2 = side2;
        this.side3 = side3;
    }    
}