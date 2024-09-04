package mathematics;

/*
 * Idea is to find the reverse of the number and compare with original
 * Time Complexity : Theta(len(N))
 * Auxilary Space : Theta(1)
 */

class PalindromeTest {

    public static void main(String args[]){
        int input = 78987;
        System.out.println("Is the given number palindrome ? "+isPalindrome(input));
    }

    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;

        while(temp>0){
            rev = rev*10 + (temp%10); //add last digit
            temp /= 10;
        }

        return n==rev;
    }
    
}
