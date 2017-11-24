/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarygap;

/**
 *
 * @author uranus
 */
public class BinaryGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print(solution(9));
    }
 
    //1041
     public static int solution(int N) {
        int binaryGap=0;
        int iterate =1;
        int start=0;
        int end=0;
         while(N!=0){
                if(N%2==1){
                  if(start==0){
                      start=iterate;
                  }else {
                      end=iterate;
                      if(end-start!=1){
                         if(binaryGap<((end-start)-1))
                          binaryGap=end-start-1;
                  }
                      start=end;
                          end=0;
                  }
                }
         iterate++;
         N=N/2;
         }
    return binaryGap;
}
}