package ru.ilka.patterns.visitor;

import ru.ilka.patterns.entity.Circle;
import ru.ilka.patterns.entity.Rectangle;
import ru.ilka.patterns.entity.Triangle;

public class CircumscribedCircleRadiusVisitor implements Visitor<Double> {
    @Override
    public Double visit(Circle circle) {
        return circle.getRadius();
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return Math.pow((Math.pow(rectangle.getHeight(), 2) + Math.pow(rectangle.getWidth(), 2)), 0.5) / 2.0;
    }

    @Override
    public Double visit(Triangle triangle) {
        return (triangle.getBaseLength() * triangle.getASideLength() * triangle.getBSideLength()) /
                (4 * triangle.accept(new AreaVisitor()));
    }
}
