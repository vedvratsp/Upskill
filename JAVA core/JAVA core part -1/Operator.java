/*Simple Assignment Operator
=       Simple assignment operator
Arithmetic Operators
+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators
+       Unary plus operator; indicates
        positive value (numbers are 
        positive without this, however)
-       Unary minus operator; negates
        an expression
++      Increment operator; increments
        a value by 1
--      Decrement operator; decrements
        a value by 1
!       Logical complement operator;
        inverts the value of a boolean
Equality and Relational Operators
==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to
Conditional Operators
&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for 
        if-then-else statement)
Type Comparison Operator
instanceof      Compares an object to 
                a specified type 
Bitwise and Bit Shift Operators
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR */

public class Operator{

        public static void main(String[] args) {
        
            int a = 100,b = 21;
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
    
    
    // Logical Operator in Java
        boolean x = true,y=false;
            System.out.println(x==false && y==false);
            System.out.println(x==true || y==true);
    
    
    //  Relation Operator in Java
        int num1 = 10;
        int num2 = 20;
            System.out.println(num1>num2);
            System.out.println(num1<num2);
            System.out.println(num1>=num2);
            System.out.println(num1<=num2);
            System.out.println(num1==num2);
            System.out.println(num1!=num2);
    
    //  Assignment Operator(=,+=,-=,/=,*=)
            int assn = 10;
            System.out.println(assn);
            assn += 10;
            System.out.println(assn);
            assn -= 10;
            System.out.println(assn);
            assn *= 10;
            System.out.println(assn);
            assn /= 10;
            System.out.println(assn);
    
    //  Increment Operator
            System.out.println("Increment Operator \n");
            System.out.println(assn++); 
            System.out.println(assn);
            System.out.println(++assn); 
            System.out.println();
    
    //  Decrement Operator
            System.out.println("Decrement Operator \n");
            System.out.println(assn--);
            System.out.println(assn);
            System.out.println(--assn);
        }
    }
