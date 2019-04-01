package ru.ilka.patterns.visitor;

import ru.ilka.patterns.entity.Circle;
import ru.ilka.patterns.entity.Rectangle;
import ru.ilka.patterns.entity.Triangle;

public interface Visitor<T> {
    T visit(Circle element);

    T visit(Rectangle element);

    T visit(Triangle element);
}
