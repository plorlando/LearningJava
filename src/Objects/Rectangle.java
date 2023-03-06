package Objects;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLenght(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public void setLenght(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

}
