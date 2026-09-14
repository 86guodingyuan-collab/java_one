package model;
import base.Drawable;
import base.Shape;
public class Rectangle extends Shape implements Drawable {
    private double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("画一个 " + color + " 的矩形");
    }
}
