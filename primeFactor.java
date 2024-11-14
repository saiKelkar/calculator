public class primeFactor {
    public static void main (String[] args) {
        long num = Long.parseLong (args[0]);
        int i = 2;

        // Divide the number until it cannot be divided any further
        while (i * i <= num) {
            if (num % i == 0) {
                num = num / i;
            }
            i ++;
        }
        // Once the number is divided completely, and cannot be divided any further,
        // we find the prime factor <-- the remaining num
        System.out.println (num);
    }
}