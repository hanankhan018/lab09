class CountVowelsAndConsonants {

    public void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        CountVowelsAndConsonants cvc = new CountVowelsAndConsonants();
        cvc.countVowelsAndConsonants("Hello World!"); // Output: Vowels: 3, Consonants: 7
    }
}
