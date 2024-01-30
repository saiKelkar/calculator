import java.util.Scanner;

public class CalculatorUpdated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter another number: ");
        double b = scanner.nextDouble();

        // since nextInt() captures only the integer value, the new line (enter key) is consumed by nextLine(), and we aren't able to input any operators
        // hence we use the following to consume the newline character left by nextInt() 
        scanner.nextLine();

        System.out.print("Enter any operator from (*, /, +, -): ");
        String operator = scanner.nextLine();

        switch (operator) {
            case "*": 
                System.out.println("Result of multiplication is: " + MathOperator.multiply(a, b));
                break;

            case "+":
                System.out.println("Result of addition is: " + MathOperator.add(a, b));
                break;

            case "-":
                System.out.println("Result of subtraction is: " + MathOperator.subtract(a, b));
                break;

            case "/":
                System.out.println("Result of division is: " + MathOperator.division(a, b));
                break;

            default:
                System.out.println("Invalid operator. Please enter a valid operator.");
        }
    }
}

class MathOperator {
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        if(a > b) {
            return a - b;
        }
        else {
            return b - a;
        }
    }

    public static double division(double a, double b) {
        if(b != 0) {
            return a / b;
        }
        else {
            return 0;
        }
    }
}

