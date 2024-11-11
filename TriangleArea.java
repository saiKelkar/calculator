public class TriangleArea {
    public static void main (String[] args) {
        double b = Double.parseDouble (args[0]);
        double h = Double.parseDouble (args[1]);

        double area = 0.5 * b * h;
        System.out.println(area);
    }
}