package OOPS.Abstraction;

import java.util.Scanner;

abstract class Shape {
    public float area;

    public abstract void acceptInput();

    public abstract void calculateArea();

    public void displayArea() {
        System.out.println("The area of the shape  is : " + area);
    }

}

class Square extends Shape {
    private float side;

    @Override
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        side = sc.nextInt();
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

}

class Rectangle extends Shape {
    private float length;
    private float breadth;

    @Override
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        breadth = sc.nextInt();
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
    }

}

class Circle extends Shape {
    private float radius;

    @Override
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        radius = sc.nextInt();
    }

    @Override
    public void calculateArea() {
        area = (3.14f) * radius * radius;
    }

}

public class Homework {
    public static void main(String[] args) {

        Shape shape = new Square();

        shape.acceptInput();
        shape.calculateArea();
        shape.displayArea();
    }

}
