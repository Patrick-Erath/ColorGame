import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner reader = new Scanner(System.in);
        System.out.println("scissor (0), rock (1) , paper (2):");
        int value = 0;

        try {
            value = Integer.parseInt(reader.nextLine());
            if(value<3 && value>-1) {
                Random rand = new Random();
                int computer = rand.nextInt(3);
                gameLogic(value, computer);
            }
            else {
                System.out.println("Please enter a valid number: 0,1 or 2 ");
            }
        }
        catch(Exception e){
            System.out.println("Please enter a valid number");
        }
    }

    static int gameLogic(int value, int computer) {
        String game[] = {"Scissor", "Rock", "Paper"};
        String playerChoice = game[value];
        String computerChoice = game[computer];

        if(value==0){
            switch(computer){
                case 0: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! too. It is a draw.");
                break;
                case 1: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You lost");
                break;
                case 2: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You won!");
                break;
            }
        }
        if(value==1){
            switch(computer){
                case 0: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You won!");
                    break;
                case 1: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! too. It is a draw.");
                    break;
                case 2: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You lost!");
                    break;
            }
        }
        if(value==2){
            switch(computer){
                case 0: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You lost");
                    break;
                case 1: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! You won!");
                    break;
                case 2: System.out.println("The Computer is "+computerChoice+". You are "+playerChoice+"! too. It is a draw.");
                    break;
            }
        }
        return 0;
    }

}
