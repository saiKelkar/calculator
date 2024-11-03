public class GreatCircle {
    public static void main(String[] args) { 
        double x_1 = Math.toRadians(Double.parseDouble(args[0]));
        double y_1 = Math.toRadians(Double.parseDouble(args[1]));
        double x_2 = Math.toRadians(Double.parseDouble(args[2]));
        double y_2 = Math.toRadians(Double.parseDouble(args[3]));

        double radius = 6371.0;

        double part_1 = Math.pow((Math.sin((x_2 - x_1)/2)), 2);
        double part_2 = Math.cos(x_1) * Math.cos(x_2) * Math.pow((Math.sin((y_2 - y_1)/2)), 2);

        double sqrt = Math.sqrt(part_1 + part_2);
        double distance = 2 * radius * Math.asin(sqrt);

        System.out.println(distance + " kilometers");
    }
}
