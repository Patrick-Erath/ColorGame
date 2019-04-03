import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args){
        binaryToDecimal();
    }

    //1111
    static void binaryToDecimal(){
        System.out.println("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();

        int sum = 0;
        int x = 0;
        for(int i=binary.length()-1; i>-1; i--){
            int value = Character.getNumericValue((binary.charAt(i)));

            if(value==1){
                sum+=Math.pow(2,x);
            }
            x++;
        }
        System.out.println(sum);
    }
}
