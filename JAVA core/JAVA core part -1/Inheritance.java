// The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you
// inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

// Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
class A{
    int a,b,c;
    public A(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


}
class B extends A{
    public B(int a, int b, int c) {
        super(a, b, c);
    }
    public void print_sum(){
        System.out.println("The sum of Number is : " +(a+b+c));
    }

}
public class Inheritance {
    public static void main(String[] args) {
        B b = new B(1,2,3);
        b.print_sum();
    }
}