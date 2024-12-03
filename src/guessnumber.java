
import java.util.Scanner;
import java.util.Random;

public class guessnumber {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();

        int total=0;
        char playagain;
        do {
            int numberguess = random.nextInt(50) + 1;
            int maxattempt = 3;
            int attempt = 0;
            boolean guesscorrect = false;

            System.out.println("\n Welcome to Guess Number Game!");
            System.out.println("Think a number from 1 to 50");
            System.out.println("you have " + maxattempt + " to guess .");

            while (attempt < maxattempt) {
                System.out.println("Enter number to guess: ");
                int userguess = scanner.nextInt();
                attempt++;

                if (userguess == numberguess) {
                    System.out.println("Congrats! you guessed right");
                    guesscorrect = true;

                    int roundscore = maxattempt - attempt + 1;
                    total += roundscore;
                    System.out.println("you scored " + roundscore + " in this round");
                    break;
                } else if (userguess < numberguess) {
                    System.out.println("Too low! try again.");
                } else {
                    System.out.println("Too high ! try again.");
                }
                System.out.println("Attempts left " + (maxattempt - attempt));
            }
                if (!guesscorrect) {
                    System.out.println("Sorry, you are out of attempts.");
                    System.out.println("The number was:" + numberguess);
                }
                System.out.println("\n Total score is" + total);
                System.out.println("do u want to play again? (y/n):");
                playagain = scanner.next().charAt(0);
            }
            while (playagain == 'y') ;

            System.out.println("thanks for playing.");
            System.out.println("Your final score is: " + total);

            scanner.close();

    }
}


