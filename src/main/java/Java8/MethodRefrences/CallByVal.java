package Java8.MethodRefrences;
/**
 * Encapsulates call by val behavior for the represented example workflow.
 */
public class CallByVal {

	int u = 20;

	/**
 * Performs the call by val mtd operation required by the represented example.
 */
	private void CallByValMtd(int i) {
		u= u+i;
	}
	
        public static void main(String[] args) { 
		CallByVal obj = new CallByVal();
		System.out.println(obj.u);
		obj.CallByValMtd(10);
		System.out.println(obj.u);
	}


}
