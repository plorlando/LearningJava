package TextProcessing;

import java.util.Scanner;

public class PasswordValidator {
    private static String currentUsername = "johndoe";
    private static String currentPassowrd = "ABC_1234";

    public static void main(String[] args){
        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do{
            System.out.println("Enter your new password:");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        }while(!valid);

        System.out.println("The proposed password is valid");

        scanner.close();
    }

    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static boolean changePassword(String newPassowrd){

        boolean valid = true;
        String errorMessage = "";

        if(newPassowrd.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be al least 8 characters.";
        }

        if(newPassowrd.equals((newPassowrd.toLowerCase()))){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        if(newPassowrd.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must include an special character (e.g. %,$[:}._";
        }


        if(newPassowrd.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain you username.";
        }

        if(newPassowrd.equals(currentPassowrd)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }

        if(!valid){
            System.out.println(errorMessage);
        }

        return valid;
    }
}
