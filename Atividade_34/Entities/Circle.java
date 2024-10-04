package Atividade_34.Entities;

import Atividade_34.color.Enums;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(Enums enums, double radius) {
        super(enums);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

   
}
