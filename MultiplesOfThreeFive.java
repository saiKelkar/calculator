public class MultiplesOfThreeFive {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) { // Check if the number is a multiple of 3 or 5
                sum += i;
                // System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}