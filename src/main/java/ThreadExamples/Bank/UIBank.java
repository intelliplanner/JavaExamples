/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExamples.Bank;

import java.util.logging.Level;
import java.util.logging.Logger;

/** Purpose: Encapsulates ui bank behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class UIBank {
    int amt=1000;
    
    /** Purpose: Performs the with drawal operation. */
    synchronized void withDrawal(int amt){
        System.out.println("Withdraw Amt Started");
        if(this.amt<amt){
            System.out.println("Withdraw Amt is less please wait for deposit");
            try{
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(UIBank.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Withdraw Amt Completed:"+amt);
        }
    }
    
    /** Purpose: Performs the deposit operation. */
    synchronized void deposit(int amt){
        System.out.println("Deposit Amt");
        this.amt += amt;
        notify();
    }
        
}
