package ru.ilka.patterns.entity;

import ru.ilka.patterns.visitor.Visitor;

public interface Element {
    <T> T accept(Visitor<T> visitor);
}
