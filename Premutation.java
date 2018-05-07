/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author MElShemy
 */
public class Premutation {
    
    public static void main(String args[]){
        
        int A[]={4,1,3};
        System.out.println(solution(A));
        
    }
    
    
     public static int solution(int[] A) {
        
         int sumOfA=(A.length/2) *(1+A.length);
         int sum=0;
         if(A.length==1){
             if(A[0]==1)
                 return 1;
             return 0;
         }
         
         for(int i=0;i<A.length;i++){
             if(A[i]>A.length)
                 return 0;
             sum+=A[i];
    }
         if(sum!=sumOfA)
             return 0;
         return 1;
}
}   