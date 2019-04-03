// A program that prompts the user to enter a string and displays its first and last character,
// its length and the number of uppercase letters

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args){
        findString();
    }

    static void findString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println(input);
        searchString(input);
    }

    static void searchString(String input){
        System.out.println("String length: "+input.length());
        System.out.println("First character: "+input.charAt(0));
        System.out.println("Last character: "+input.charAt(input.length()-1));
        int upper = 0;
        for(int i=0; i<input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                upper++;
            }
        }
        System.out.println("Number of uppercase: "+upper);
    }
}
