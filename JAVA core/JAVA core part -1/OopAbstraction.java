/*Java abstract class is a class that can not be initiated by itself, it needs to be subclassed by another class to use its properties.
An abstract class is declared using the “abstract” keyword in its class definition. */
/*NOTE: We cannot create a obj of a abstract class */

public class OopAbstraction {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.Greet();
        Child3 c3 = new Child3();
        c3.Greet();
    }
}
abstract class Parent2{
    public Parent2(){
        System.out.println("I am a Base2 Constructor");
    }
    public void  sayhello(){
        System.out.println("Hello");
    }
    abstract public void  Greet();
}

class Child2 extends Parent2{
    @Override
    public void Greet() {
        System.out.println("Good Morning");
    }
}

class Child3 extends Parent2{
    @Override
    public void Greet() {
        System.out.println("Good Evening");
    }
}
