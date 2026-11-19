/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

/** Purpose: Encapsulates factorial behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class Factorial {

        public static void main(String str[]){
        Factorial obj = new Factorial();
        obj.getFactorial(5);
    } 

    /** Purpose: Retrieves get factorial data. */
    private void getFactorial(int i) {
        int fact = 1 ; 
        for (int j = 1; j <= i; j++) {
             fact = fact * j;    
        }
        System.out.println("Factorial : " +fact );
    }
}
