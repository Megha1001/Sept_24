package standardAlgo.primeNumber;

/*
 * Concept : Every number divisors always appears in pair
 * 30 -> (1,30), (2,15), (3,10), (5,6)
 *          x*y = n
 *          if x<=y
 *          x*x <=n
 *          =>x <= Sqrt(n)
 * That means if the given number is not prime then the small divisors should be less than Sqrt(n)
 * 
 * Time Complexity : O(Sqrt(N))
 * Auxiliary Space : Theta(1)
 * 
 */

public class EfficientAppUsingSqrtNTheory {

    public static void main(String args[]){
        int n = 19;
        System.out.println("Is given number is prime ? "+checkIfPrime(n));
    }

    public static boolean checkIfPrime(int n){
        
        if(n==1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
}
