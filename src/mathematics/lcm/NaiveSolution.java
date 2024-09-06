package mathematics.lcm;

/*
 * LCM is the smallest number which is divisible by both the numbers
 * Time Complexity : O(a*b - max(a,b))
 * Auxiliary Space : Theta(1)
 */

public class NaiveSolution {

    public static void main(String args[]){
        int a = 4;
        int b = 6;

        System.out.println("LCM of two given number is : "+findLCM(a, b));
    }
    

    public static int findLCM(int a, int b){
        int res = Math.max(a,b);

        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            ++res;
        }
    }

}
