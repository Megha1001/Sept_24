package mathematics;

/* 
 * Idea : Find the min(a,b)
 * Start from last and find the number that divides both a,b
 * Time Complexity : O(min(a,b))
 * Auxiliary Space : Theta(1)
 */

public class GCDNaiveSolution {

    public static void main(String args[]){
        int a = 100;
        int b = 200;
        System.out.println("GCD of given number is : "+findGCD(a, b));
    }

    public static int findGCD(int a, int b){
        int res = 1;
        int n = Math.min(a, b);

        for(int i=n; i>1; i--){
            if(a%i==0 && b%i==0){
                res = i;
                return res;
            }
        }
        return res;
    }
}
