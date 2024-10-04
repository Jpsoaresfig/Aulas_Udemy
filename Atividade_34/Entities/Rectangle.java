package Atividade_34.Entities;

import Atividade_34.color.Enums;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(Enums enums, double width, double height) {
        super(enums);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    @Override
    public double area(){
        return width * height;
    }
}
