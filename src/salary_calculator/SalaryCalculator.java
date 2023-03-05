package salary_calculator;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        // Initialie know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknow
        System.out.println("How many sales did the emplyee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
         if(sales < quota){
             int salesShort = quota - sales;
             System.out.println("You did not make you quota. You were " + salesShort + " sales short!");
         }
         else if(sales == quota){
             System.out.println("Congrats! You've met your quota.");
         } else{
             salary = salary + bonus;
             System.out.println("Congrats! You've exceeded your quota.");
         }

        // Output
        System.out.println("The employee´s pay is $ " + salary);
    }
}
