//Variablefun.java
// dh 8/14/25
//
  // Reference:
// https://www.w3schools.com/java/showjava.asp?filename=demo_api_scanner

// import statements are at the top of the program
import java.util.Scanner; // import scanner class

public class VariableFun {
       public static void main (String[] args) {

           // Create a coupe of int vars named num1 and num2
           int num1 = 0;
           int num2 = 1;


            // create a scanner object named scanner
            Scanner scanner = new Scanner(System.in);

             //Get a value from the user ad store it in num1.
            System.out.print("\n Please enter a whole number for num1 ");
            num1 = scanner.nextInt();

            // Prove that you got an int from the user.
             System.out.println("num1 = " + num1);

            //Get a value from the user ad store it in num1.

           System.out.print("\n Please enter a whole number for num2 ");
           num2 = scanner.nextInt();

           // Prove that you got an int from the user.
           System.out.println("num2 = " + num2);

           int num3 = num1 + num2;
           System.out.println("the answer is = " + num3);

       }
}