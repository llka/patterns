# Visitor Design Pattern

## Purpose
    Define a new operation which can be applied to a set of objects at runtime, without modifications to an existing object structure.
     
    Над каждым объектом структуры выполняется одна или более операций. Нужно определить новую операцию, не изменяя классы объектов.
    
## Use When
     - An object structure must have many unrelated operations performed upon it.
     - The object structure can't change but operations performed on it can.
     - Operations should be able to operate on multiple object structures that implement the same interface sets. 
     
## Advantages
     - Good use of the Open/Closed principle as we won’t modify the code, but we’ll still be able to extend the functionality by providing a new Visitor implementation.