package mathematics.factorial;

/*
 * Time Complexity : Theta(N)
 * Space Complexity : Theta(1)
 */

public class IterativeSolFactorial{

    public static void main(String []args){
        int n = 5;
        System.out.println("Factorial of given number is : "+findFac(n));
    }

    public static int findFac(int n){
        int res = 1;

        for(int i=2; i<=n; i++){
            res *= i;
        }
        return res;
    }

}