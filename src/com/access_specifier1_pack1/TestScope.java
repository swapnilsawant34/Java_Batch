package com.access_specifier1_pack1;

import com.access_specifier1_pack2.D;

public class TestScope {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B b = new B();
        C c = new C();
        com.access_specifier1_pack2.C c1 = new com.access_specifier1_pack2.C();
        D d = new D();

        System.out.println("From non-sub class within the package");
        b.accessA();

        System.out.println("From sub class within the package");
        c.accessA();

        System.out.println("From non-sub class outside the package");
        c1.accessA();

        System.out.println("From sub class outside the package");
        d.accessA();
    }
}
