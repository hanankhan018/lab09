import java.util.Random;

class RandomPrimeNumber {

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int generateRandomPrime(int min, int max) {
        Random random = new Random();
        int prime = -1;
        while (prime == -1) {
            int num = random.nextInt(max - min + 1) + min;
            if (isPrime(num)) {
                prime = num;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        RandomPrimeNumber rpn = new RandomPrimeNumber();
        System.out.println(rpn.generateRandomPrime(10, 20)); // Example output: 11 or 13
    }
}
