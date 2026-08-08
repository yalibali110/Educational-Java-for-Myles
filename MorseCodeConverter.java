import java.util.*;

public class MorseCodeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Create a hashMap, an array that stores each character with its associated string
        //Used to translate it into morse code, as you can see the Character and String
        //variable types are defined from the start, and the morseMap.put command fills in
        //each new entry to the hashMap array. The name given to the array is morseMap
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('a', ".-");
        morseMap.put('b', "-...");
        morseMap.put('c', "-.-.");
        morseMap.put('d', "-..");
        morseMap.put('e', ".");
        morseMap.put('f', "..-.");
        morseMap.put('g', "--.");
        morseMap.put('h', "....");
        morseMap.put('i', "..");
        morseMap.put('j', ".---");
        morseMap.put('k', "-.-");
        morseMap.put('l', ".-..");
        morseMap.put('m', "--");
        morseMap.put('n', "-.");
        morseMap.put('o', "---");
        morseMap.put('p', ".--.");
        morseMap.put('q', "--.-");
        morseMap.put('r', ".-.");
        morseMap.put('s', "...");
        morseMap.put('t', "-");
        morseMap.put('u', "..-");
        morseMap.put('v', "...-");
        morseMap.put('w', ".--");
        morseMap.put('x', "-..-");
        morseMap.put('y', "-.--");
        morseMap.put('z', "--..");

        //This is just the initial line read from the terminal and the user input
        System.out.print("Enter text: ");
        String input = scanner.nextLine().toLowerCase();

        //String builder creates an editable string, this way as we go through each
        //character in the input string we can add its morse code result to the
        //end message in a loop. This keeps the final product as one single string
        //rather than a combination of strings.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                result.append("/ ");
                // Turns any existing spaces into '/' characters
                
            } else if (morseMap.containsKey(c)) {
                result.append(morseMap.get(c)).append(" ");
                // Looks for a character within the morseMap hashMap
                
            } else {
                result.append("? ");
                //if there are any unrecognized characters or symbols print out ?
            }
        }
        //printing out the morse code result, .toString() converts the result from
        //stringBuilder to a string.
        System.out.println("Morse Code: " + result.toString());
    }
}
