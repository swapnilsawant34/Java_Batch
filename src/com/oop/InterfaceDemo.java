


package com.oop;

interface IAtm {
    String slogan = "Best Service"; // public, static, final
    double getBalance(); // public, abstract
    void withdraw(double amount);
}

class HdfcBank implements IAtm {
    private double balance;

    HdfcBank(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

class IciciBank implements IAtm {
    private double balance;

    IciciBank(double balance) {
        System.out.println(slogan);
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Hdfc Bank transaction");
        IAtm atm = new HdfcBank(10000);
        System.out.println("Opening balance = " + atm.getBalance());
        atm.withdraw(1000);
        System.out.println("After withdraw balance = " + atm.getBalance());

        System.out.println("Icici bank transaction");
        atm = new IciciBank(20000);
        System.out.println("Opening balance = " + atm.getBalance());
        atm.withdraw(1000);
        System.out.println("After withdraw balance = " + atm.getBalance());
    }
}
