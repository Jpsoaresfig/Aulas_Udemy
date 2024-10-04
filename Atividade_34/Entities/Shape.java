package Atividade_34.Entities;

import Atividade_34.color.Enums;

public abstract class Shape {

    private Enums enums;

    public Shape() {

    }

    public Shape(Enums enums) {
        this.enums = enums;
    }

    public Enums getEnums() {
        return enums;
    }

    public void setEnums(Enums enums) {
        this.enums = enums;
    }

    public abstract double area();
}
