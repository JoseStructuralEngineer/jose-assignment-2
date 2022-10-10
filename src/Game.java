import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //Generate Random Number betwen 1 and 100
        Random random = new Random();
        int max = 100;
        int min = 1;
        int valueToGuess = random.nextInt(max-min) + min;
        int diff = 100;
        System.out.println("Pick a number between 1 and 100");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        for(int i = 0;i<5;i++){
            int reply = myObj.nextInt();
            myObj.nextLine();
            if (reply > 0 && reply < 101) {
                diff = reply - valueToGuess;
                //Note Only print Please pick a lower number or pick higher number if tries are less than 5
                if (diff > 0) {
                    if(i != 4){
                        System.out.println("Please pick a lower number");
                    }
                } else if (diff < 0) {
                    if(i != 4){
                        System.out.println("Please pick a lower number");
                    }
                } else {
                    i = 5;
                }
            } else {
                i = i - 1;
                System.out.println("Your guess is not between 1 and 100, please try again");
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
