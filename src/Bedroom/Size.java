package Bedroom;

public class Size {
    private double height;
    private String color;
    private Size size;


    public Size(double height, String color, Size size) {
        this.height = height;
        this.color = color;
        this.size = size;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public void setSize(Size size) {
        this.size = size;
    }

    public double getWidth(){
        return size.getWidth();
    }

    public double getLength(){
        return size.getLength();
    }



}

