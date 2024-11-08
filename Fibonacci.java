public class Fibonacci {
    public static void main (String[] args) {
        int i_0 = 1;
        int i_1 = 2;
        int sum = 2;
        int j = i_0 + i_1;

        while (j < 4000000) {
            i_0 = i_1;
            i_1 = j;
            j = i_0 + i_1;
        
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
