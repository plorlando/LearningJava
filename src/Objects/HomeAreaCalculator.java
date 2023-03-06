package Objects;

import java.util.Scanner;

public class HomeAreaCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLenght(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        System.out.println("ROOM1 " + areaOfRoom1);
        System.out.println("ROOM2 " + areaOfRoom2);

        Rectangle kitchen = new Rectangle(200, 400);
        Rectangle bathroom = new Rectangle(300, 700);
        double area = calculatedTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);


        Rectangle k = getRoom();
        Rectangle b = getRoom();
        double areaWithMethods = calculatedTotalArea(k, b);
        System.out.println("The total area is: " + areaWithMethods);
        scanner.close();

    }

    public static double calculatedTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

}
