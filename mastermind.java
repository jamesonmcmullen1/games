import java.util.Scanner;
public class mastermind{
    public static void main(String [] args){
        //scanner
        Scanner reader = new Scanner(System.in);

        //welcome
        System.out.println("Welcome to Mastermind!\n\nIn this game there are four randomly selected colored pins hidden from the player.\nThe player has ten guesses to figure out the pattern.\nYou must enter colors in order from left to right.\nAfter you input your guess, the result of your guess is output.\nThe different colors are Red, Yellow, Green, Blue, White, and Black. Good luck and have fun!!!\n");

        String play = "yes";
        while(play.equalsIgnoreCase("yes")){
            //array to output final look
            String [] arr = new String[40];

            //random pattern
            String space1 = randomColor();
            String space2 = randomColor();
            String space3 = randomColor();
            String space4 = randomColor();

            //last guesses
            String lg1 = "";
            String lg2 = "";
            String lg3 = "";
            String lg4 = "";

            //wrong guesses
            int wg = 0;

            //total guesses
            int tg = 0;

            for(int i = 0; i<10; i++){
                //initiate holder
                String holder1 = space1;
                String holder2 = space2;
                String holder3 = space3;
                String holder4 = space4;

                //initiate guesses
                String guess1 = "";
                String guess2 = "";
                String guess3 = "";
                String guess4 = "";
                int correct = 1;

                //while loop to make sure guesses are valid
                while(correct == 1){
                    int cor = 0;
                    //take guesses
                    System.out.println("What is your guess? Enter a color and then press enter, then enter the next color and so on: ");
                    guess1 = reader.nextLine();
                    if(guess1.equalsIgnoreCase("red") || guess1.equalsIgnoreCase("yellow") || guess1.equalsIgnoreCase("green") || guess1.equalsIgnoreCase("blue") || guess1.equalsIgnoreCase("white") || guess1.equalsIgnoreCase("black")){
                        cor++;
                    }
                    guess2 = reader.nextLine();
                    if(guess2.equalsIgnoreCase("red") || guess2.equalsIgnoreCase("yellow") || guess2.equalsIgnoreCase("green") || guess2.equalsIgnoreCase("blue") || guess2.equalsIgnoreCase("white") || guess2.equalsIgnoreCase("black")){
                        cor++;
                    }
                    guess3 = reader.nextLine();
                    if(guess3.equalsIgnoreCase("red") || guess3.equalsIgnoreCase("yellow") || guess3.equalsIgnoreCase("green") || guess3.equalsIgnoreCase("blue") || guess3.equalsIgnoreCase("white") || guess3.equalsIgnoreCase("black")){
                        cor++;
                    }
                    guess4 = reader.nextLine();
                    if(guess4.equalsIgnoreCase("red") || guess4.equalsIgnoreCase("yellow") || guess4.equalsIgnoreCase("green") || guess4.equalsIgnoreCase("blue") || guess4.equalsIgnoreCase("white") || guess4.equalsIgnoreCase("black")){
                        cor++;
                    }

                    if(cor == 4){
                        correct = 0;
                    }
                    else{
                        System.out.println("Your inputs were invalid. Try again. ");
                    }
                }

                //enter last guesses
                lg1 = guess1;
                lg2 = guess2;
                lg3 = guess3;
                lg4 = guess4;

                //add to array
                arr[4*i] = guess1;
                arr[4*i+1] = guess2;
                arr[4*i+2] = guess3;
                arr[4*i+3] = guess4;

                //initiate right place and right color wrong place
                int rp = 0;
                int wp = 0;

                //add to right place if in right place
                //one
                if(guess1.equalsIgnoreCase(space1)){
                    rp++;
                    guess1 = "none";
                    holder1 = "none";
                }
                //two
                if(guess2.equalsIgnoreCase(space2)){
                    rp++;
                    guess2 = "none";
                    holder2 = "none";
                }
                //three
                if(guess3.equalsIgnoreCase(space3)){
                    rp++;
                    guess3 = "none";
                    holder3 = "none";
                }
                //four
                if(guess4.equalsIgnoreCase(space4)){
                    rp++;
                    guess4 = "none";
                    holder4 = "none";
                }
                
                //add to wrong place is right color
                //one
                if(!guess1.equals("none")){
                    if(guess1.equalsIgnoreCase(holder2)){
                        wp++;
                        holder2 = "none";
                        guess1 = "none";
                    }
                    else if(guess1.equalsIgnoreCase(holder3)){
                        wp++;
                        holder3 = "none";
                        guess1 = "none";
                    }
                    else if(guess1.equalsIgnoreCase(holder4)){
                        wp++;
                        holder4 = "none";
                        guess1 = "none";
                    }
                }
                
                //two
                if(!guess2.equals("none")){
                    if(guess2.equalsIgnoreCase(holder1)){
                        wp++;
                        holder1 = "none";
                        guess2 = "none";
                    }
                    else if(guess2.equalsIgnoreCase(holder3)){
                        wp++;
                        holder3 = "none";
                        guess2 = "none";
                    }
                    else if(guess2.equalsIgnoreCase(holder4)){
                        wp++;
                        holder4 = "none";
                        guess2 = "none";
                    }
                }

                //three
                if(!guess3.equals("none")){
                    if(guess3.equalsIgnoreCase(holder1)){
                        wp++;
                        holder1 = "none";
                        guess3 = "none";
                    }
                    else if(guess3.equalsIgnoreCase(holder2)){
                        wp++;
                        holder2 = "none";
                        guess3 = "none";
                    }
                    else if(guess3.equalsIgnoreCase(holder4)){
                        wp++;
                        holder4 = "none";
                        guess3 = "none";
                    }
                }

                //four
                if(!guess4.equals("none")){
                    if(guess4.equalsIgnoreCase(holder1)){
                        wp++;
                        holder1 = "none";
                        guess4 = "none";
                    }
                    else if(guess4.equalsIgnoreCase(holder2)){
                        wp++;
                        holder2 = "none";
                        guess4 = "none";
                    }
                    else if(guess4.equalsIgnoreCase(holder3)){
                        wp++;
                        holder3 = "none";
                        guess4 = "none";
                    }
                }

                //result
                if(rp<4){
                    System.out.println("You got "+rp+" color(s) in the right place and "+wp+" color(s) correct in the wrong place.");
                    wg++;
                    tg++;
                }
                else{
                    System.out.println("\nYou got it!!\n");
                    tg++;
                    break;
                }
            }
            //result lose
            if(wg==10){
                System.out.println("\nYou lost!! Better luck next time!\n");
            }

            //what the total board looks like
            for(int c = 0; c<tg; c++){
                System.out.println("\nGuess "+(c+1)+":\t\t"+arr[4*c]+"\t"+arr[4*c+1]+"\t"+arr[4*c+2]+"\t"+arr[4*c+3]);
            }
            System.out.println("\nHidden pattern:\t\t"+space1+"\t"+space2+"\t"+space3+"\t"+space4+"\n");
            
            //play again?
            System.out.println("\nWould you like to play again?");
            play = reader.nextLine();
        }
    }

    public static String randomColor(){
        int rand = (int)(Math.random()*6);
        if(rand == 1){
            return "red";
        }
        else if(rand == 2){
            return "yellow";
        }
        else if(rand == 3){
            return "green";
        }
        else if(rand == 4){
            return "blue";
        }
        else if(rand == 5){
            return "white";
        }
        else{
            return "black";
        }
    }
}
