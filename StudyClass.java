package com.notmyfault02;

public class StudyClass {

    public static void main(String[] args) {
        Animal lion = new Animal();
        Animal tiger = new Animal();
        Animal Bear = new Animal();
        lion.setAnimal("Lion", 60, 100);
        tiger.setAnimal("Tiger", 61, 99);
        Bear.setAnimal("Pooh", 99, 200);
        lion.print();
        tiger.print();
        Bear.print();
    }
}

class Animal {
    String name;
    int weight;
    int power;

    void print() {
        System.out.println("("+name+", "+weight+", "+power+")");
    }

    void setAnimal(String n, int w, int p) {
        name = n;
        weight = w;
        power = p;
    }
}
