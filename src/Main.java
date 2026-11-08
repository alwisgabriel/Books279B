import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        long timeLimit = scanner.nextLong();
        int[] readingTimes = new int[n];

        for (int i = 0; i < n; i++) {
            readingTimes[i] = scanner.nextInt();
        }

        int left = 0;
        int maxBooks = 0;
        long currentTime = 0;

        for (int right = 0; right < n; right++) {
            currentTime += readingTimes[right];

            while (currentTime > timeLimit) {
                currentTime -= readingTimes[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }

        System.out.println(maxBooks);
    }

    private static class FastScanner {
        private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer tokenizer;

        private String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        private int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        private long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
