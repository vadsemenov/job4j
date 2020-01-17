package ru.job4j.poly;

public class Bus implements Transport {
    private boolean drive = false;
    private int passengers = 0;

    @Override
    public void drive() {
        if (!this.drive) {
            this.drive = true;
        } else {
            this.drive = false;
        }
    }

    @Override
    public void passengers(int number) {
        this.passengers += number;
    }

    @Override
    public double fuel(double liters) {
        double priceLiter = 46.1d;
        return liters * priceLiter;
    }
}
