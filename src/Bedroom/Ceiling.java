package Bedroom;

public class Ceiling {
    private int numberOfLights;
    private String color;
    private Size size;
    private double width;
    private double length;

    public Ceiling(int numberOfLights, String color, Size size, double width, double length) {
        this.numberOfLights = numberOfLights;
        this.color = color;
        this.size = size;
        this.width = width;
        this.length = length;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getWidth(){
        return size.getWidth();
    }

    public double getLength(){
        return size.getLength();
    }



    public void setSize(Size size) {
        this.size = size;
    }
}
