package com.oop;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Person [name=%s, age=%s]", name, age);
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Person p1 = new Person("sai", 25);
        Person p2 = new Person("sai", 25);
        Person p3 = new Person("sri", 23);

        System.out.println("p1 equals p2=" + p1.equals(p2) + " " + p1.hashCode() + " =" + p2.hashCode());
        System.out.println("p1 equals p3=" + p1.equals(p3) + " " + p1.hashCode() + " =" + p3.hashCode());
        System.out.println(p1);
        System.out.println(p3);
    }
}
