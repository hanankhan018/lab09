import java.util.Random;

class RandomFrequencyCounter {

    public void generateAndCount() {
        int[] freq = new int[21];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(21);
            freq[num]++;
        }

        for (int i = 0; i <= 20; i++) {
            System.out.println("Number " + i + ": " + freq[i] + " times");
        }
    }

    public static void main(String[] args) {
        RandomFrequencyCounter rfc = new RandomFrequencyCounter();
        rfc.generateAndCount();
    }
}
