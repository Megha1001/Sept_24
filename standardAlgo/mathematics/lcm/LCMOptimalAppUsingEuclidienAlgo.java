package standardAlgo.mathematics.lcm;

/*
 * Approach : Use optimal Euclidien algorithm
 *            a*b = LCM(a,b) * GCD(a,b)
 * 
 * Time Complexity : O(log(min(a,b))), Auxiliary Space : O(log(min(a,b))) -> Same as Euclidiean algorithm
 */

public class LCMOptimalAppUsingEuclidienAlgo {

    public static void main(String args[]){
        int a = 4;
        int b = 6;

        System.out.println("LCM of given number is :" +findLCMUsingEuclidienAlgo(a,b));
    }

    public static int findLCMUsingEuclidienAlgo(int a, int b){
        int gcd = findGCD(a, b);
        return a*b/gcd;
    }


    //Time Complexity : O(log(min(a,b))), Auxiliary Space : O(log(min(a,b)))
    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return findGCD(b, a%b);
        }
    }
    
}
