package Calculator;

import java.util.Scanner;

public class SCal {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scientific Calculator");

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Factorial");
        System.out.println("7. Natural Log");
        System.out.println("8. Power");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        double a, b;

        switch (choice) {

            case 1:
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                System.out.print("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Result = " + (a / b));
                break;

            case 5:
                System.out.print("Enter number: ");
                a = sc.nextDouble();
                System.out.println("Square Root = " + Math.sqrt(a));
                break;

            case 6:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Factorial = " + factorial(n));
                break;

            case 7:
                System.out.print("Enter number: ");
                a = sc.nextDouble();
                System.out.println("Natural Log = " + Math.log(a));
                break;

            case 8:
                System.out.print("Enter base: ");
                a = sc.nextDouble();
                System.out.print("Enter power: ");
                b = sc.nextDouble();
                System.out.println("Result = " + Math.pow(a, b));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}