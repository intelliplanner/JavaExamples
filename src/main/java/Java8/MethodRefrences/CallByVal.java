package Java8.MethodRefrences;

/** Purpose: Encapsulates call by val behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class CallByVal {

	int u = 20;

	/** Purpose: Performs the call by val mtd operation. */
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
