package mathematics.primeFactors;

/*
 * Idea : Prepare the list that will contains all prime factors for given number
 *  1. check if number itself is prime => return
 * 2. for (i=2;i<=n;i++) => checkIfPrime => add to list
 * 
 * Time Complexity L: O(N*logN*Sqrt(N))
 * Auxiliary Space : Theta(1)
 */

public class NaiveSolution {

    public static void main(String args[]){
        int n = 12;
        System.out.println("prime factors of given number is/are : ");
        if(checkIfPrime(n)){
            System.out.print(n);
        }else{
            findPrimeFactors(n);
        }

    }
    

    public static void findPrimeFactors(int n){
        for(int i=2; i<n; i++){ // TC : O(N-3)
            if(checkIfPrime(i)){
                int x = i;
                while(n%x==0){ // TC : O(logN)
                    System.out.print(" "+i);
                    x=x*i; //Multiple powers of i can also divide n (12 -> 2, 4)
                }
            }
        }
    }

    public static boolean checkIfPrime(int n){
        if(n==2||n==3){
            return true;
        }

        if(n==1 || n%2==0 || n%3==0){
            return false;
        }

        for(int i=5; i*i<=n; i=i+6){ // TC : O(Sqrt(N))
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }


}
