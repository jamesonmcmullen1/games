import java.util.Scanner;
public class nerdle{
    public static void main(String [] args){
        //scanner
        Scanner reader = new Scanner(System.in);

        //rules
        System.out.println("Welcome to Nerdle!! \n\nAt the moment our game is a two player game. This game works just like the well known wordle. The rules go as follows:\n\n1.\tPlayer One enters a hidden, correct equation consisting of eight characters.\n2.\tPlayer Two enters correct, eight character equations to figure out Player One's equation.\n3.\tPlayer Two has six guesses.\n4.\tAfter each of Player Two's guesses, the results of the guess are output.\n\nGood luck and have fun!!");

        //while loop to keep in game
        String play = "yes";
        while(play == "yes"){
            //hidden equation
            int getStart = 1;
            while(getStart == 1){
                System.out.println("Enter the first number in the start equation (must be 1 to 3 digits): ");
                int num1 = reader.nextInt();

            }
        }
    }
}
