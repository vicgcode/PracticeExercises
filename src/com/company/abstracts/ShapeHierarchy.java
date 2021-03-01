package com.company.abstracts;

abstract class Shape {
    abstract double getPerimeter();
    abstract double getArea();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    double getArea() {
        return Math.PI * Math.pow(r, 2);

    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter() {
        return a + b + c;
    }

    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p *(p - a)*(p - b)*(p - c));
    }
}

class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getPerimeter() {
        return (a + b) * 2;
    }

    double getArea() {
        return a * b;
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(1,2,3);
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Circle perimeter: " + circle.getPerimeter() + " and circle area: " + circle.getArea());
    }
}
