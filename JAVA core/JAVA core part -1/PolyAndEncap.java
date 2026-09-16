/*
Polymorphism in Java:
Polymorphism in Java allows a single interface to represent different underlying forms, enabling objects to be treated as instances of their base class while dynamically invoking their specific implementations through method overriding.

Encapsulation in Java:
Encapsulation in Java involves bundling the data (attributes) and methods (functions) that operate on the data within a single unit (class), providing access control through access modifiers (e.g., private, public) to restrict direct access to internal details, promoting security and modular design. */



public class PolyAndEncap {
    public static void main(String[] args) {
       
        Animal myDog = new Dog();
        myDog.makeSound(); 
        Dog myRealDog = new Dog();
        myRealDog.setBreed("Labrador");
        System.out.println("Breed: " + myRealDog.getBreed());
    }
}


class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
   
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

