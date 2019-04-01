package ru.ilka.patterns.entity;

import ru.ilka.patterns.visitor.Visitor;

public class Circle extends Figure implements Element {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
