     //SumOfUserNums.java
    // dh 8/19/25

import java.util.Scanner;  // Import the Scanner class

public class SumOfUserNums {
    public static void main(String[] args) {
        // Get 3 ints from the user and output the sum of ints

        // Create the variables needed
        Scanner userinput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to the Sum Of Users ");

        System.out.print("Enter first integer: ");
        int num1 = userinput.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = userinput.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = userinput.nextInt();
        int sumofint = num1 + num2  + num3;
        System.out.println("The sum of the numbers is: " + sumofint);

    }
}