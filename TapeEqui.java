/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author MElShemy
 */
public class TapeEqui {
    
    
    public static void main(String args[]){
        int A[]={-1000,1000};
        System.out.print(solution(A));
    
    }
    
     public static int solution(int[] A) {
        int summition=0;
        int summitionSiparated=A[0];
        int min=0;
        for(int i=1;i<A.length;i++){
            if(A[i]<0)
                A[i]=A[i]*-1;
            summition+=A[i];
            
        }
        
        min=summition-A[0];
        if(min<0)
            min*=-1;
        for(int i=1;i<A.length;i++){
            summition-=A[i];
            summitionSiparated+=A[i];
            if(summition-summitionSiparated<0){
               if((summition-summitionSiparated)*-1 < min)
                   min=(summition-summitionSiparated)*-1;
            }else {
                if(summition-summitionSiparated <min)
                    min=summition-summitionSiparated;
            }
            
        }
         
        
         return min;
    }
    
}
