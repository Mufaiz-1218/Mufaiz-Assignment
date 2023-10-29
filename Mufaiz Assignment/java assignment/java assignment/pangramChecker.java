public class PangramChecker {
    public static void main(String[] args) {
 
        System.out.print("Enter a sentence: ");
        String sentence = System.console().readLine().toLowerCase(); 

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

   
        boolean isPangram = true;
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
