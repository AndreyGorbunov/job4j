package ru.job4j.tracker;

public class Tiger extends Predator {
    public String name;
    public Tiger() {
        System.out.println("Tiger");
    }
    public Tiger(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        Tiger Tiger = new Tiger("Tiger");
    }
}
