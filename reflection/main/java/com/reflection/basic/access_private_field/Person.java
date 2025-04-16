package com.reflection.basic.access_private_field;

class Person {
    private int age; // Private field

    public Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

