package games;

import java.util.Scanner;

public class FillinTheBlanks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let´s create a Story!");
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("Enter a season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("On a(n) " + adjective + " " + season + " day, I drink a minimun of "
        + number + " cups of coffee.");
    }
}
