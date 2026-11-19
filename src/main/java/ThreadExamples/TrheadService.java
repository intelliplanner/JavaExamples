/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExamples;

/** Purpose: Encapsulates trhead service behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class TrheadService implements Runnable{ 
    ClassInterface handler = null;
    boolean isRunning = false;
    Thread mThread = null;
    Object lock = new Object();
    private long refreshRate = 5000;
    
    /** Purpose: Creates a trhead service instance. */
    TrheadService() {
        
    }

    @Override
    
    /** Purpose: Executes the run workflow. */
    public void run() {
        System.out.println("Thread is Running");
        int i = 1;
		try{
			while(isRunning){
				try{
					handler.changeText("VICKY");
                                    System.out.println("Hello" +i);
                                    i++;
                                    if(i == 10){
                                          stop();
                                          System.out.println("Thread Stop");
//                                        System.out.println("Thread is Waiting");
//                                        i = 1;
                                    }
                                    
                                }catch(Exception ex){
					ex.printStackTrace();
				}finally{
					try{
						Thread.sleep(refreshRate);
					}catch(Exception ex){
						ex.printStackTrace();
					}
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
    }

    /** Purpose: Updates set handler data. */
    void setHandler(ClassInterface handler) {
        this.handler = handler;
    }

    /** Purpose: Executes the start workflow. */
    public void start(){
        stop();
        if(mThread == null){
            mThread = new Thread(this);
            isRunning = true;
            mThread.start();
        }else{
            isRunning = true;
        }
        
    }

    /** Purpose: Performs the stop operation. */
    public void stop() {
        synchronized (lock) {
            try {
                if (mThread != null) {
//					mThread.stop();
                    mThread = null;
                }
                
                isRunning = false;
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
