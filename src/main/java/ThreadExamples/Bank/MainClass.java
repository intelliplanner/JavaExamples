/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExamples.Bank;

/** Purpose: Encapsulates main class behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class MainClass {

        public static void main(String s[]) {
        final UIBank c = new UIBank();
        new Thread() {
            @Override
            
            /** Purpose: Executes the run workflow. */
            public void run() {
                c.withDrawal(15000);
            }
        }.start();
        new Thread() {
            
            /** Purpose: Executes the run workflow. */
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
