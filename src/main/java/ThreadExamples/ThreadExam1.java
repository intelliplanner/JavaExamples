/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExamples;

/** Purpose: Encapsulates thread exam1 behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class ThreadExam1{
    TrheadService th = null;
    
    /** Purpose: Performs the test operation. */
    void test(){
        if(th == null){
            th = new TrheadService();
            th.setHandler(new ClassInterface() {

                @Override
                
                /** Purpose: Performs the print operation. */
                public void print(int val) {
                    System.out.println("Print Method "+val);
                }

                @Override
                
                /** Purpose: Performs the change text operation. */
                public void changeText(String str) {
                    System.out.println("changeText Method " +str );
                }
            });
            th.start();
        }
    }

        public static void main(String[] args) {
        ThreadExam1 t1 = new ThreadExam1();
        t1.test();
    }
}
