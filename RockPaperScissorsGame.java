import java.util.Random;

public class RockPaperScissors {

    //Random is another utility like scanner used for generating random numbers
    private Random generator;
    private static String computerChoice;

    
    public RockPaperScissors() {
        computerChoice = "";
        generator = new Random();
    }

    public void choose() {
        //Using the random we created earlier called generator, we tell it to generate
        //a number from 0 to 2 then tell it +1 because what we actually want is a
        //between 1 and 3
        int num = generator.nextInt(3) + 1;

        if (num == 1) {
            computerChoice = "rock";
        } else if (num == 2) {
            computerChoice = "paper";
        } else {
