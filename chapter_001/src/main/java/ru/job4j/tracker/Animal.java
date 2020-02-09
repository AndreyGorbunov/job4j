package ru.job4j.tracker;

public class Animal {
    public String name;
    public Animal() {
        System.out.println("Animal");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        Animal Animal = new Animal("Animal");
    }
}
