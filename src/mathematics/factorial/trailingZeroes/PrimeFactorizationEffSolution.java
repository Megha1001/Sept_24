package mathematics.factorial.trailingZeroes;

/*
 * Idea : 10 comes when we multiply 2*5, so if we find pair of 2,5 then it will be the number of trailing zeroes. Moreover, 5 comes less than 2 . So find number of 5 in prime factorization(i.e. n/5)
 * 
 * 1*2*3*4*5*5*6*7...*10*....*25*.....*125
 * But we have to consider second 5 in 25 also and all three 5's in 125 also
 *  res = n/5 + n/25 + n/125 + ....
 * 
 * in n/5 : we considered all first 5 in prime factorization of number;
 * in n/25 : we considered all second 5 and in n/125 : we consider all third 5's and so on
 * 
 * Time Complexity : Theta(logN)
 * i increases as 
 *  First Iteration : 5^1
 *  Second Iteration : 5^2 
 *  Third Iteration : 5^3
 *  Kth Iteration : 5^k
 * 
 *  5^k <= N
 *  => k <= logN (base 5) => logN => TOTAL ITERATIONS
 * 
 * 
 * AUXILARY SPACE : Theta(1)
 * 
 * 
 * It prevent overflow
 *
 */

public class PrimeFactorizationEffSolution {

    public static void main(String args[]){
        int n = 251;
        System.out.println("Number of trailing zeroes in factorial of given number is : "+findTrailingZeroes(n));
    }

    public static int findTrailingZeroes(int n){
        int res = 0;

        for(int i=5; i<=n ; i=i*5){
            res = res + (n/i);
        }

        return res;
    }
    
}
