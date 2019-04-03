// A program that prompts the user to enter the numerator and denominator of a fraction.
// The program determines whether the number is a proper fraction or an improper fraction.

import java.util.Scanner;

public class ReduceFractions {
    public static void main(String [] args){
        checkFraction();
    }

    static void checkFraction(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int numerator = Integer.parseInt(reader.nextLine());
        System.out.println("Enter a denominator: ");
        int denominator = Integer.parseInt(reader.nextLine());

        if(numerator < denominator){
            System.out.println(numerator+"/"+denominator+" is a proper fraction");
        }
        else{
            int mixed = 0;
            boolean keep = true;
            int newNumerator = numerator;
            while(keep){
                int reducedNumerator = newNumerator-denominator;
                mixed++;
                newNumerator = reducedNumerator;
                if(reducedNumerator < denominator){
                    if(reducedNumerator==0){
                        System.out.println(numerator+"/"+denominator+" is an improper fraction and it can be reduced to "+mixed);
                    }
                    else{
                        System.out.println(numerator+"/"+denominator+" is an improper fraction and its mixed fraction is");
                        System.out.println(mixed+" + "+reducedNumerator+"/"+denominator);
                    }
                    keep = false;
                }
            }
        }
    }
}
