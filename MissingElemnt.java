/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author MElShemy
 */
public class MissingElemnt {
    
    
    public static void main(String args[]){
        
        int[] A = {2,1,3,5};
        int res;
        res=solution(A);
    System.out.print(res);
    }
    
    
    public static int solution(int[] A) {
        int sum=0;
        for(int i=1;i<=A.length+1;i++){
            sum+=i;
        }
        int arrSum=0;
        for(int i=0;i<A.length;i++){
            arrSum+=A[i];
        }
        
        return sum-arrSum;
    }

}
