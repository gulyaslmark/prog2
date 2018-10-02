package main;


public class Rectangle {
    public double width, height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "width: " + this.width + "\nheight: " + this.height + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
    
    
    
}
