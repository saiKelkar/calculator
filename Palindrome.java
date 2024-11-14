public class Palindrome {
    public static void main (String[] args) {
        int num = Integer.parseInt (args[0]);
        int result = 0;

        for (int i = 10; i < 100; i++) {
            if (num % i == 0) {
                result = num / i;
                if (result < 100) {
                    System.out.println (i + " x " + result);
                }
            }

        }
    }
}
