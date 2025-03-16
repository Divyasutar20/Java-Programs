public

import java.util.*;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks on land...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.walk();
        dog.bark(); 
   }
}{

}
