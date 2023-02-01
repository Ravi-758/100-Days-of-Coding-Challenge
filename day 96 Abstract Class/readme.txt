An abstract class in Java is one that is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies). 
An abstract is a java modifier applicable for classes and methods in java but not for Variables. 

Illustration: Abstract class

abstract class Shape 
{
    int color;
    // An abstract function
    abstract void draw();
}
In java, the following some important observations about abstract classes are as follows:

An instance of an abstract class can not be created.
Constructors are allowed.
We can have an abstract class without any abstract method.
There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final 
method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
We can define static methods in an abstract class
We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
If a class contains at least one abstract method then compulsory should declare a class as abstract 
If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so
that the next level Child class should provide implementation to the remaining abstract method
