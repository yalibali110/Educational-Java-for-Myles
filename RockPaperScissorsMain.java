import java.util.Scanner;

/*This is the main class for the program, in this programs case we use methods,
which are blocks of code for performing a specific task. These methods live in
the RockPaperScissors.java file and are called upon whenever they are needed in
the Main.java file.                                                         */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*"RockPaperScissors game" creates a variable named game and uses '='
        to assign the variable to the object RockPaperScissors, "new RockPaperScissors()"
        creates the object, calling the constructor "public class RockPaperScissors()"
        file as a reference*/
        RockPaperScissors game = new RockPaperScissors();

        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine();

        //This next line calls the choose() class to generate a random number for
        //the computers choice.
        game.choose();
        
        //compares the users choice with the computers choice
        String result = RockPaperScissors.whoWon(userChoice);

        System.out.println("Winner: " + result);
    }
}
