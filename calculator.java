public class calculator {
    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]);
        String operation = args[1];
        float b = Float.parseFloat(args[2]);
        float answer = 0;

        if(operation.equals("+")) {
            answer = a + b;
        }
        else if(operation.equals("-")) {
            if(a > b) {
                answer = a - b;
            }
            else {
                answer = b - a;
            }
        }
        // In command line, enter value as java calculator 5 \* 8 for multiplication
        // * is considered as a wild card character which is expecting a file name input
        else if(operation.equals("*")) {
            answer = a * b;
        }
        else if(operation.equals("/")) {
            if(b != 0) {
                answer = a / b;
            }
            else {
                System.out.println("Error: Cannot divide by zero");
            }
        }
        else {
            System.out.println("Error: Invalid operation");
            return;
        }

        String formattedAnswer = String.format("%.2f", answer);
        System.out.println("Your answer is " + formattedAnswer);
    }
}
