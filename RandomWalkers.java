public class RandomWalkers {
    public static void main (String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double avg = 0.0;
        long sum = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0; // Reset x to 0
            int y = 0; // Reset y to 0
            int steps = 0; 

            while (Math.abs(x) + Math.abs(y) != r) {
                int direction = (Math.random() < 0.5) ? 0 : 1;
                int step = (Math.random() < 0.5) ? 1 : -1;
                if (direction == 0) x += step;
                else                y += step;
                steps += 1;
            }
            sum += steps; // Calculate the sum of steps at each trial
        }
        avg = (double) sum / trials;
        System.out.println("average number of steps = " + avg);
    }
}
