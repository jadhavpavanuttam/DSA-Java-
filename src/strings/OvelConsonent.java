package strings;

public class OvelConsonent {
    public static void main(String[] args) {
        countLetters("jagruti");
        countLetters("rock");
    }

    static void countLetters(String s) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

/*
Count number of char
static int countCharacters(String s) {
    return s.length();
}

 */