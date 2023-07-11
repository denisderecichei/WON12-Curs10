package org.fasttrack.tema9.products;

public class Electronics extends Product {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(int price, String name, String description, int quantity, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
