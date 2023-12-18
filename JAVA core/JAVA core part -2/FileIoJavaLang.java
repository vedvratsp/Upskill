import java.io.*;

public class FileIoJavaLang {
    public static void main(String[] args) {
        // File I/O example
        writeFile("ved.txt", "Hello SRE-TEAM, this is a file I/O example.");

        // java.lang package example
        String stringValue = "123";
        int intValue = Integer.parseInt(stringValue);

        // Display the result
        System.out.println("Parsed Integer: " + intValue);

        // Read from the file
        String content = readFile("ved.txt");
        System.out.println("File Content: " + content);
    }

    // Method to write content to a file
    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File write completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println("File read completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}


/*
    -File I/O:
    The writeFile method writes content to a file using BufferedWriter and FileWriter.
    The readFile method reads content from a file using BufferedReader and FileReader.

    -java.lang package:
    We use the parseInt method from Integer class in the java.lang package to convert a string to an integer.
    
    -Displaying Result:
    We display the parsed integer and the content read from the file.

    This example demonstrates basic file I/O operations and the use of a class from the java.lang package for string-to-integer conversion. 
*/