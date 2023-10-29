public class panagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        
        boolean[] alphabet = new boolean[26];

       
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}