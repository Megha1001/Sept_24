package mathematics;

/*
 * Idea is to remove last digit in every iteration by dividing by 10 and update the input and do a count
 * Time Complexity : Theta(len(N))
 * Auxilary Space : Theta(1)
 */

public class CountOfDigits{


    public static void main(String args[]){
        int input = 9345;
        System.out.println("Number of digits in input is : "+countNumOfDigits(input));
    }


    public static int countNumOfDigits(int n){
        int count = 0;

        while(n>0){
            ++count;
            n /= 10;
        }

        return count;
    }

}