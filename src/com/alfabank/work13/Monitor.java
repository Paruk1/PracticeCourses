package com.alfabank.work13;

import java.util.Objects;

public class Monitor extends Device{
    private int x;
    private int y;

    public Monitor(String serialNumber, String manufacturer, double price, int x, int y) {
        super(serialNumber, manufacturer, price);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", x=" + x +
                ", y=" + y;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return x == monitor.x && y == monitor.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
