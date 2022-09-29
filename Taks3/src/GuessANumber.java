
import java.util.Random;
import java.util.Scanner;

    public class GuessANumber {
        private static int rnd_number;

        public static void main(String[] args) {
            // pick a random number
            Random random = new Random();
            rnd_number = random.nextInt(100) + 1;
            System.out.println("I'm thinking of a number between 1 and 100 (including both).");
            System.out.println("Can you guess what it is?...");
            makeAGuess();
        }


        private static void makeAGuess() {
            Scanner scanner = new Scanner(System.in);
            int tryCount = 0;

         while (true){
                System.out.println("Enter your guess ( 1-100):");

                int playerGuess = scanner.nextInt();
                tryCount++;

                if (playerGuess == rnd_number) {
                    System.out.println("Correct! You Win");
                    System.out.println("It took you " + tryCount + " tries ");
                    break;

                } else if (rnd_number > playerGuess) {
                    System.out.println("Nope! The number is higher. Guess again");
                } else {
                    System.out.println("Nope! The number is lower. Guess again");


                }


            }
            scanner.close();
        }
    }

