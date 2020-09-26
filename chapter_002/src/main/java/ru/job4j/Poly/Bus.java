package ru.job4j.Poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет на Колыму.");
    }

    @Override
    public void passengers(int amt) {
        System.out.println("В автобусе находится " +  amt + " пассажиров.");
    }

    @Override
    public int fill(int fuel) {
        int price = fuel * 40;
        System.out.println("Автобус заправлен на " +  fuel + " литров. Потрачено " + price + " рублей." );
        return price;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.fill(150);
        bus.passengers(40);
        bus.drive();
    }
}



