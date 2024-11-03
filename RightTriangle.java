public class RightTriangle {
    public static void main(String[] args) {
        int a  = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result;

        int c_square = a * a + b * b;
        int a_square = c * c + b * b;
        int b_square = a * a + c * c;
        result = ((c * c == c_square || a * a == a_square || b * b == b_square) && a > 0 && b > 0 && c > 0);

        System.out.println(result);
    }
}
