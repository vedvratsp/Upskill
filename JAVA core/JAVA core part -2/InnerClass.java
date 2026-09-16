class Outer {
    private int outerVar = 10;

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Inside Member Inner Class");
            System.out.println("Outer variable: " + outerVar);
        }
    }

    // Static Inner Class
    static class StaticInner {
        void display() {
            System.out.println("Inside Static Inner Class");
        }
    }

    // Method with Local Inner Class
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
                System.out.println("Outer variable: " + outerVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Anonymous Inner Class (Interface implementation)
    interface MyInterface {
        void myMethod();
    }

    void anonymousInnerClass() {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Inside Anonymous Inner Class");
            }
        };

        myInterface.myMethod();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outerObject = new Outer();

        // Accessing Member Inner Class
        Outer.Inner innerObject = outerObject.new Inner();
        innerObject.display();

        // Accessing Static Inner Class
        Outer.StaticInner staticInnerObject = new Outer.StaticInner();
        staticInnerObject.display();

        // Accessing Local Inner Class through a method
        outerObject.outerMethod();

        // Accessing Anonymous Inner Class
        outerObject.anonymousInnerClass();
    }
}

/* Innerclass: Sometimes we can declare a class inside another class such type of classes are called inner classes.
    Example: to test Account object we need to have Bank object
    1. Inner is a member inner class.
    2. StaticInner is a static inner class.
    3. LocalInner is a local inner class defined inside a method.
    4. MyInterface is an interface used for creating an anonymous inner clas

*/