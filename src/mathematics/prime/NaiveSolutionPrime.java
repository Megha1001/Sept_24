package mathematics.prime;

/*
 * Prime number : A number is said to be prime if its only divisors are 1 and itself. Ex : 2,3,5,7,9,11 etc . 
 * NOte : 1 is neither prime nor composite(non-prime)
 * 
 * Time complexity : O(N) //more preciously N-2, since in worst case it would run for N-2 times.
 * Auxiliary space : O(1)
 */
public class NaiveSolutionPrime {

    public static void main(String args[]){
        int n = 19;
        System.out.println("Is given number prime ? "+checkIfPrime(n));
    }
    
    public static boolean checkIfPrime(int n){
        
        //Don't check for 1, n divisibility

        if(n==1){
            return false;
        }

        for(int i=2; i<n; i++){ //not considering i<=n since any number would be divisible by itself
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
}
