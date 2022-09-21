import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        //Generate Random Number betwen 1 and 100
        Random random = new Random();
        int valueToGuess = random.nextInt(101);

        boolean finishGame = false;
        int numOfTries = 0;
        int diff = 100;

        System.out.println("Pick a number between 1 and 100");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        while (!finishGame) {
            //Convert to Integer
            int reply = myObj.nextInt();
            myObj.nextLine();
            //Check if number is between 1 and 100
            if (reply > 0 && reply < 101) {
                numOfTries = numOfTries + 1;
                if (numOfTries < 5) {
                    diff = reply - valueToGuess;
                    if (diff > 0) {
                        System.out.println("Please pick a lower number");
                    } else if (diff < 0) {
                        System.out.println("Please pick a higher number");
                    } else {
                        finishGame = true;
                    }
                } else {
                    finishGame = true;
                }
            } else {
                System.out.println("Your guess is not between 1 and 100, please try again");
            }

        }

        if (diff == 0) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        System.out.println("The number to guess was: " + valueToGuess);


    }
}
