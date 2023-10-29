public class RomanToInteger {
    public static void main(String[] args) {

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = System.console().readLine().toUpperCase(); // Convert to uppercase for case insensitivity

      
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            int value = 0;

            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }
}
