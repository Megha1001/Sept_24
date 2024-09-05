package standardAlgo.mathematics.GCD;
/*
 * Instead of performing repetative subtraction use %
 * Time Complexity : O(log(min(a,b)))
 * Auxiliary Space : O(log(min(a,b)))
 */

public class OptimizedImplEuclidienAlgo {

    public static void main(String args[]){
        int a = 4;
        int b = 6;

        System.out.println("GCD of given numbers is :"+findGCDUsingEuclidienOptimizedVersionAlgo(a,b));
    }
    
    public static int findGCDUsingEuclidienOptimizedVersionAlgo(int a, int b){
        if(b==0){
            return a;
        }else{
            return findGCDUsingEuclidienOptimizedVersionAlgo(b, a%b);
        }
    }

}
