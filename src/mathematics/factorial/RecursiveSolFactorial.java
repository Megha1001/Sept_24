package mathematics.factorial;

/*
 * Time Complexity : Theta(N)
 * Space Complexity : Theta(N) => Iterative solution doesn't take this. Hence, iterative is better
 */

public class RecursiveSolFactorial {

    public static void main(String args[]){
        int n = 5;
        System.out.println("Factorial of the given number is : "+findFac(n));
    }

    public static int findFac(int n){
        
        //base condition
        if(n==0 || n==1){
            return 1;
        }

        return n * findFac(n-1);
    }
    
}
