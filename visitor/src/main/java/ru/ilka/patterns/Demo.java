package ru.ilka.patterns;

import ru.ilka.patterns.entity.Circle;
import ru.ilka.patterns.entity.Figure;
import ru.ilka.patterns.entity.Rectangle;
import ru.ilka.patterns.entity.Triangle;
import ru.ilka.patterns.visitor.AreaVisitor;
import ru.ilka.patterns.visitor.CircumscribedCircleRadiusVisitor;

import java.util.stream.Stream;

public class Demo {
    public static void main(String... args) {
        System.out.println("Hi");

        AreaVisitor areaVisitor = new AreaVisitor();
        CircumscribedCircleRadiusVisitor extRadiusVisitor = new CircumscribedCircleRadiusVisitor();

        Figure[] figures = {new Circle(3), new Rectangle(6, 8), new Triangle(3, 4, 5)};

        System.out.println("Figures: ");
        Stream.of(figures).forEach(System.out::println);


        System.out.println("Areas: ");
        Stream.of(figures).forEach(figure -> System.out.println(figure.accept(areaVisitor)));

        System.out.println("Circumscribed Circle Radius: ");
        Stream.of(figures).forEach(figure -> System.out.println(figure.accept(extRadiusVisitor)));
    }
}
