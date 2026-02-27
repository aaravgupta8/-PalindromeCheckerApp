public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App\n");

        String ip = "madam";
        boolean isPalindrome = true;
        for(int i=0; i<ip.length()/2; i++) {
            if(ip.charAt(i) != ip.charAt(ip.length()-i-1)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println("The input is a palindrome!");
        } else {
            System.out.println("The input is NOT palindrome!");
        }
    }
}