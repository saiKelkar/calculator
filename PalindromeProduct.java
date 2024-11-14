public class PalindromeProduct {
    public static void main(String[] args) {
        int result = 0;
        int max = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                result = i * j;

                String str = Integer.toString (result);
                int midIndex = str.length() / 2;
                String a = str.substring(0, midIndex);
                String b = new StringBuilder(str.substring(midIndex)).reverse().toString();

                if (a.equals(b) && result > max) {
                    max = result;
                }
            }
        }
        System.out.println(max);
    }
}
