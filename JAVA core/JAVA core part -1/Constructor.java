/*In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor,
memory for the object is allocated in the memory.*/

class child{
    String name;
    int age;
    int Numofgames;
    public child(String name1,int age1,int numofgames1){ // Here is the Constructor of Java
        name = name1;
        age = age1;
        Numofgames = numofgames1;
    }
    public void print_data(){
        System.out.println("The name is : "+name);
        System.out.println("The Age is : "+age);
        System.out.println("The Number of games is : "+Numofgames);
    }
}

public class Constructor {

    public static void main(String[] args) {

        child ved = new child("Ved",3,6);

        ved.print_data();
    }
}