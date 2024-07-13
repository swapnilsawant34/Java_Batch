
package com.oop;



class Base {
    int a;

    Base(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("base class show method");
    }
}

class Derived extends Base {
    int a;

    Derived(int x, int y) {
        super(x); // Calling Base class constructor with parameter x
        this.a = y; // Initializing Derived class variable a with y
    }

    void show() {
        System.out.println("derived class show method");
        System.out.println("derived class a=" + a);
        System.out.println("base class a=" + super.a);
        super.show(); // Calling Base class show method
    }
}

public class Super {
    public static void main(String[] args) {
        Derived d = new Derived(5, 10);
        d.show(); // Calling show method of Derived class
    }
}

