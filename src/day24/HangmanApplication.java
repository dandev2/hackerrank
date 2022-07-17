package day24;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Welcome to hangman!  I will pick a word and you will try to guess it.\n"
                + "If you guess wrong 6 times, then I win.  If you can guess it before then, you win.\n"
                + "Are you ready?  I hope so, because I am");
        System.out.println();
        System.out.println("I have picked my word.  Below is a picture, and below \n"
                + "that is your current guess, which starts off as nothing.  Every time you \n"
                + "guess incorrectly.  I add a body part to the picture.  When there is a full \n"
                + "person, you lose");
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            System.out.println();
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();

            do {
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());

                System.out.println("Enter a character that you think is in the word");
                char guess = (stdIn.next().toLowerCase()).charAt(0);
                System.out.println();

                /* See if the character is guessed already */
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again!  You've already guessed that character.");
                    guess = (stdIn.next().toLowerCase()).charAt(0);
                }

                if (game.playGuess(guess)) {
                    System.out.println("Great Guess! That character is in the word!");
                } else {
                    System.out.println("Unfortunately that character isn't in the word");
                }

            } while(!game.gameOver());

            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (stdIn.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');

        }

    }

}
