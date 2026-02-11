public class biasedshuffle {

    public static void main(String[] args) {

        int N = 10;
        int[] shuffled = new int[N];

        // Initialize array 1..N
        for (int i = 0; i < N; i++) {
            shuffled[i] = i + 1;
        }

        // Fisher–Yates shuffle
        for (int i = N - 1; i > 0; i--) {

            int r = (int)(Math.random() * (i + 1)); // 0..i

            // swap shuffled[i] and shuffled[r]
            int temp = shuffled[i];
            shuffled[i] = shuffled[r];
            shuffled[r] = temp;
        }

        // Print result
        for (int i = 0; i < N; i++) {
            System.out.print(shuffled[i] + " ");
        }
    }
}