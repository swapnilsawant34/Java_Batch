package com.oop;

class Human {
    void walk() {
        System.out.println("Human can walk");
    }
}

interface Flight {
    void fly();  
}

class Man extends Human implements Flight {
    @Override
    public void fly() {
        System.out.println("Man can fly with the help of flight");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        Human man = new Man();
        man.walk();
        
        Flight f = new Man();
        f.fly();
    }
}
