package mathematics.factorial.trailingZeroes;

import java.math.BigInteger;

public class NaiveSolutionTrailingZeroes {
    public static void main(String args[]){
        int n = 100;
        BigInteger fact = findFact(n);
        int res = 0;
        while(fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            ++res;
            fact = fact.divide(BigInteger.TEN);
        }
        System.out.println("Number of zeroes in factorial of given number is : "+res);
        
    }

    public static BigInteger findFact(int n){
        BigInteger res = BigInteger.ONE;

        for(int i=2; i<=n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
    
}
