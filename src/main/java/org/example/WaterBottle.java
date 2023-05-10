package org.example;

public class WaterBottle {
    int volume = 100;

    public void WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        return volume -= 10;
    }

    public int empty() {
        return volume = 0;
    }

    public int fill() {
        return volume = 100;
    }
}
