import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        // 1. Simple Pattern Matching
        simplePatternMatching();

        // 2. Character Classes
        characterClasses();

        // 3. Quantifiers
        quantifiers();

        // 4. Groups and Capturing
        groupsAndCapturing();

        // 5. Predefined Character Classes
        predefinedCharacterClasses();
    }

    private static void simplePatternMatching() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String pattern = "fox";

        Pattern simplePattern = Pattern.compile(pattern);
        Matcher matcher = simplePattern.matcher(text);

        System.out.println("Simple Pattern Matching:");
        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start());
        }
        System.out.println();
    }

    private static void characterClasses() {
        String text = "The cat and the hat sat on the mat.";
        String pattern = "[c|h]at";

        Pattern charClassPattern = Pattern.compile(pattern);
        Matcher matcher = charClassPattern.matcher(text);

        System.out.println("Character Classes:");
        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start());
        }
        System.out.println();
    }

    private static void quantifiers() {
        String text = "ab abbb abbbb abbbbb";
        String pattern = "ab{2,4}";

        Pattern quantifierPattern = Pattern.compile(pattern);
        Matcher matcher = quantifierPattern.matcher(text);

        System.out.println("Quantifiers:");
        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start());
        }
        System.out.println();
    }

    private static void groupsAndCapturing() {
        String text = "Ved Singh,  Sanchit Ahuja, Alex Smith";
        String pattern = "(\\w+) (\\w+)";

        Pattern groupPattern = Pattern.compile(pattern);
        Matcher matcher = groupPattern.matcher(text);

        System.out.println("Groups and Capturing:");
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group(0) + ", First Name: " + matcher.group(1) +
                    ", Last Name: " + matcher.group(2));
        }
        System.out.println();
    }

    private static void predefinedCharacterClasses() {
        String text = "123-456-7890";
        String pattern = "\\d{3}-\\d{3}-\\d{4}";

        Pattern predefCharClassPattern = Pattern.compile(pattern);
        Matcher matcher = predefCharClassPattern.matcher(text);

        System.out.println("Predefined Character Classes:");
        if (matcher.matches()) {
            System.out.println("Valid phone number format: " + text);
        } else {
            System.out.println("Invalid phone number format: " + text);
        }
    }
}


/*
 REGULAR EXP: A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text,
  you can use this search pattern to describe what you are searching for
 Types: 
 1. Pattern Class - Defines a pattern (to be used in a search)
 2. Matcher Class - Used to search for the pattern
 3. PatternSyntaxException Class - Indicates syntax error in a regular expression pattern 

 */