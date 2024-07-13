package com.access_specifier1_pack1;

public class C {

    void accessA() {
        A obj = new A();
        // System.out.println("private member " + obj.a);
        System.out.println("default member " + obj.num);
        System.out.println("protected member " + obj.s);
        System.out.println("public member " + obj.b);
    }
}
