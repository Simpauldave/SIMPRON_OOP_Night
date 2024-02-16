package simpron_oop_night;

import java.util.Scanner;

public class SIMPRON_OOP_Night {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String input = scanner.nextLine();
        
        boolean correctplacement = checkplacement(input);

        if(correctplacement){
            System.out.println("uWu");
        } else {
            System.out.println("JEJE!"); 
        }
    }
    public static boolean checkplacement(String input){
        boolean correctplacement = true;
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            
            if(Character.isUpperCase(c)){
                if(i > 0 && Character.isLowerCase(input.charAt(i-1))){
                    correctplacement = false;
                    break;
                }
            }
        }
        return correctplacement;
    }
}