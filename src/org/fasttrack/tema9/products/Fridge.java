package org.fasttrack.tema9.products;

public class Fridge extends Electronics {
    private double temperature;

    public Fridge(int price, String name, String description, int quantity, double length, double width, double height, double weight, double temperature) {
        super(price, name, description, quantity, length, width, height, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
