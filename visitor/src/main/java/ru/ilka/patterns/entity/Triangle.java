package ru.ilka.patterns.entity;

import ru.ilka.patterns.visitor.Visitor;

public class Triangle extends Figure implements Element {
    private double baseLength;
    private double aSideLength;
    private double bSideLength;

    public Triangle(double baseLength, double aSedeLength, double bSideLength) {
        this.baseLength = baseLength;
        this.aSideLength = aSedeLength;
        this.bSideLength = bSideLength;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getASideLength() {
        return aSideLength;
    }

    public void setaSideLength(double aSideLength) {
        this.aSideLength = aSideLength;
    }

    public double getBSideLength() {
        return bSideLength;
    }

    public void setbSideLength(double bSideLength) {
        this.bSideLength = bSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "baseLength=" + baseLength +
                ", aSideLength=" + aSideLength +
                ", bSideLength=" + bSideLength +
                '}';
    }
}
