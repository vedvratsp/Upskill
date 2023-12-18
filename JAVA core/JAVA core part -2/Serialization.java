import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Serialization {
    public static void main(String[] args) {
       Person person = new Person("Vedvrat", 28);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("Serialization completed");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialization completed");
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/* Serialization: The process of saving (or) writing state of an object to a file is called serialization
 * De-Serialization: The process of reading state of an object from a file is called DeSerialization
 * Concept:Serialization allows objects to be converted into a byte stream, which can be persisted to a file, a database, or transmitted over a network. This provides a way to save the state of an object and reconstruct it later, enabling object persistence.
*/



