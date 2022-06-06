package com.super_bonus;

import java.util.Date;
import java.util.Scanner;

class GeometricObject{
    final protected double pi = 3.14;
    protected String color;
    protected boolean filled;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    Date dateCreated = new Date();


    public GeometricObject(){

    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public String toString(Date dateCreated){ 
        return dateCreated.toString();
    }

}


class Circle extends GeometricObject{
    double radius;
    public Circle(){

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getArea(){
        return (pi * radius * radius);
    }

    public double getDiameter(){
        return (2 * radius);
    }

    public double getPerimeter(){
        return (2 * pi * radius);
    }

    public void printCircle(){
        System.out.println("pretend this is a circle");
    }

}

class Rectangle extends GeometricObject{

    double width;
    double height;


    public Rectangle(){

    }

    public Rectangle(double width, double height, String color, boolean filled){

        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
        
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea(){
        return (width * height);
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }


}


class Triangle extends GeometricObject{

    private double side1;
    private double side2;
    private double side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
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


    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getArea(){
        
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

}



public class SuperBonus 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color of a triangle (e.g.) \"red\" : ");
        String triangle1Color = scanner.nextLine();
        System.out.println("Is the triangle filled (y or n) : ");
        String triangle1Filled = scanner.next();
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        Triangle triangle1 = new Triangle(side1,side2,side3);
        if(triangle1Filled.equals("y")){
            triangle1.setFilled(true);
        }
        else if(triangle1Filled.equals("n")){
            triangle1.setFilled(false);
        }

        triangle1.setColor(triangle1Color);



        System.out.println("Enter the color of a triangle (e.g.) \"red\" : ");
        String triangle2Color = scanner.nextLine();
        
        System.out.println("Is the triangle filled (y or n) : ");
        String triangle2Filled = scanner.next();
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double triangle2Side1 = scanner.nextDouble();
        double triangle2Side2 = scanner.nextDouble();
        double triangle2Side3 = scanner.nextDouble();
        scanner.nextLine();
        
        Triangle triangle2 = new Triangle(triangle2Side1,triangle2Side2,triangle2Side3);
        if(triangle2Filled.equals("y")){
            triangle2.setFilled(true);
        }
        else if(triangle2Filled.equals("n")){
            triangle2.setFilled(false);
        }

        triangle2.setColor(triangle2Color);




        System.out.print("Enter the color of a triangle (e.g.) \"red\" : ");
        String triangle3Color = scanner.nextLine();
        
        System.out.println("Is the triangle filled (y or n) : ");
        String triangle3Filled = scanner.next();
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double triangle3Side1 = scanner.nextDouble();
        double triangle3Side2 = scanner.nextDouble();
        double triangle3Side3 = scanner.nextDouble();
        
        Triangle triangle3 = new Triangle(triangle3Side1,triangle3Side2,triangle3Side3);
        if(triangle3Filled.equals("y")){
            triangle3.setFilled(true);
        }
        else if(triangle3Filled.equals("n")){
            triangle3.setFilled(false);
        }

        triangle3.setColor(triangle3Color);



        System.out.println("\n \n");
        System.out.println("Triangle: side1 = "+((Triangle) triangle1).getSide1()+" side2 = " + ((Triangle) triangle1).getSide2()+" side3 = " + ((Triangle) triangle1).getSide3());
        System.out.println("created on " + ((Triangle) triangle1).getDateCreated());
        System.out.println("color: " + ((Triangle) triangle1).getColor() + " and " + "filled = " + ((Triangle) triangle1).isFilled());
        System.out.println("Area = " + ((Triangle) triangle1).getArea());
        System.out.println("\n \n");
        
        System.out.println("Triangle: side1 = "+((Triangle) triangle2).getSide1()+" side2 = " + ((Triangle) triangle2).getSide2()+" side3 = " + ((Triangle) triangle2).getSide3());
        System.out.println("created on " + ((Triangle) triangle2).getDateCreated());
        System.out.println("color: " + ((Triangle) triangle2).getColor() + " and " + "filled = " + ((Triangle) triangle2).isFilled());
        System.out.println("Area = " + ((Triangle) triangle2).getArea());
        System.out.println("\n \n");

        System.out.println("Triangle: side1 = "+((Triangle) triangle3).getSide1()+" side2 = " + ((Triangle) triangle3).getSide2()+" side3 = " + ((Triangle) triangle3).getSide3());
        System.out.println("created on " + ((Triangle) triangle3).getDateCreated());
        System.out.println("color: " + ((Triangle) triangle3).getColor() + " and " + "filled = " +  triangle3.isFilled());
        System.out.println("Area = " + ((Triangle) triangle3).getArea());
        System.out.println("\n \n");

        scanner.close();

        
    }
}
