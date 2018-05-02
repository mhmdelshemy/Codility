/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author MElShemy
 */
public class CyclicRotation {

    public static void main(String args[]) {

        int[] A = {2};
        int[] Res = new int[A.length];

        int K = 3;
        Res = solution(A, K);
        for (int i = 0; i < Res.length; i++) {
            System.out.println(Res[i]);
        }
    }

    public static int[] solution(int[] A, int K) {


        if (A.length == 0 || A.length == 1) {
            return A;
        }

        
            while (K > A.length) {
                K /= A.length;
            }
        
            if(A.length == K){
                return A;
            }
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (K + i <= A.length - 1) {
                arr[K + i] = A[i];
            } else {

                arr[K + i - A.length] = A[i];
            }
        }
        return arr;



    }
}
