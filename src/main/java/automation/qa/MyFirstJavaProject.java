package automation.qa;

import java.util.Scanner;

public class MyFirstJavaProject {
    public static void main(String[] args) {
        System.out.println("Enter your first name");
        Scanner scanner = new Scanner(System.in);
        String FirstName = scanner.next();
        System.out.println("Your name is " + FirstName);
        System.out.println("Please enter your age ");
        int Age = scanner.nextInt();
        System.out.println ("Your age is "+Age+" and");
        if (Age>=18) {
            System.out.println("You can drink vodka");
        }
        if (Age<18) System.out.println("You can not drink vodka");
    }
}
