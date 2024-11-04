public class RandomWalker {
    public static void main (String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        while (Math.abs(x) + Math.abs(y) != r) {
            int direction = (Math.random() < 0.5) ? 0 : 1;
            int step = (Math.random() < 0.5) ? 1 : -1;
            if (direction == 0) x += step;
            else                y += step;

            System.out.println("(" + x + ", " + y + ")");
            steps += 1;
        }
        System.out.println("steps = " + steps);
    }
}
