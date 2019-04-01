package ru.ilka.patterns.visitor;

import ru.ilka.patterns.entity.Circle;
import ru.ilka.patterns.entity.Rectangle;
import ru.ilka.patterns.entity.Triangle;

public class AreaVisitor implements Visitor<Double> {
    private static final double PI = 3.14;

    @Override
    public Double visit(Circle circle) {
        return PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    @Override
    public Double visit(Triangle triangle) {
        double p = (triangle.getBaseLength() + triangle.getASideLength() + triangle.getBSideLength()) / 2.0;
        return Math.pow(p * (p - triangle.getBSideLength()) * (p - triangle.getASideLength()) * (p - triangle.getBaseLength()), 0.5);
    }
}
