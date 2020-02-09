package ru.job4j.tracker;

public class Predator extends Animal {
    public String name;
    public Predator() {
        System.out.println("Predator");
    }
    public Predator(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        Predator Predator = new Predator("Predator");
    }
}
