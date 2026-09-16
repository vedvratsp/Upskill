
import java.util.Scanner;
public class FlowControl {
/*control-Flow*/
//If-else
//switch
/*LOOPS */
//while
//do-while
//for

public static void main(String[] args) {
    // In this lecture we are going to learn about Conditional Statements in Java
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Age");
            int age = sc.nextInt();
            if(age >=18){
                System.out.println("Yes you can Vote");
            }
            else{
                System.out.println("You cannot Vote");
            }

            switch (age){
                case 5:
                    System.out.println("Your age is 5 Now");
                    break;
                case 18:
                    System.out.println("Your age is 18 Now");
                    break;
                default:
                    System.out.println("Case Not Matched");
            }

            System.out.println("This is a For loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//  While loop
        System.out.println("\n\nNow its time for while loop");
        int a = 1;
        while (a <= 10){
            System.out.println(a);
        a++;
    }
        System.out.println();


//  Do- While loop
        System.out.println("\n\nNow its time for Do-while loop");
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while (x<=10);


//  Break Statement -> Whenever the break condition occur break the loop there
        System.out.println("Example of Break Statement");
        for(int i = 0;i<=5;i++) {
            if (i == 2) break;
            System.out.println(i);
        }

//  Continue Statement -> leave the continue condition and jump to next one
        System.out.println("Example of Continue Statement");
        for(int i = 1;i<=5;i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }


}