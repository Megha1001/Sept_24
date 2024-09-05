/*
 * Tiling Problem : If we have two numbers a, b and if we make a rectangle of size a*b, then our GCD problem is finding sides of the largest square using which we can tile the whole rectangle.
 * USE : EUCLIDIEN ALGO
 * TIME Complexity : O(N)
 * Auxilary Space : Theta(1)
 */

 package standardAlgo.mathematics.GCD;

 public class LargestSquareTileThatCanFileWholeRectangle{

    public static void main(String args[]){
        int a = 4;
        int b = 6;

        System.out.println("GCD of given number is : "+findGCDUsingEuclidienAlgo(a,b));
    }


    public static int findGCDUsingEuclidienAlgo(int a, int b){
        
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }

        return a; //we can return any a or b
    }

 }