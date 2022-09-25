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
            numOfTries = numOfTries + 1;
            if (numOfTries <= 5) {
                int reply = myObj.nextInt();
                myObj.nextLine();
                //Check if number is between 1 and 100
                if (reply > 0 && reply < 101) {
                    diff = reply - valueToGuess;
                    //Note Only print Please pick a lower number or pick higher number if tries are less than 5
                    if (diff > 0) {
                        if (numOfTries < 5) {
                            System.out.println("Please pick a lower number");
                        }
                    } else if (diff < 0) {
                        if (numOfTries < 5) {
                            System.out.println("Please pick a lower number");
                        }
                    } else {
                        finishGame = true;
                    }
                } else {
                    numOfTries = numOfTries - 1;
                    System.out.println("Your guess is not between 1 and 100, please try again");
                }
            } else {
                finishGame = true;
            }
        }

        if (diff == 0) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
            System.out.println("The number to guess was: " + valueToGuess);
        }



    }
}
