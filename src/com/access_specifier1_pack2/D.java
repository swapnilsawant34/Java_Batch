package com.access_specifier1_pack2;

import com.access_specifier1_pack1.A;

public class D extends A {
    public void accessA() {
        A obj = new A();
        // System.out.println("private member " + obj.a);
        // System.out.println("default member " + obj.num);
        System.out.println("protected member " + s);
        System.out.println("public member " + obj.b);
    }
}
