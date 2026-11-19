package inteviewQuestion.Exception;

/**
 * Encapsulates throw execute finally behavior for the represented coding problem.
 */
public class ThrowExecuteFinally {

		public static void main(String[] args) throws Exception {
		try{
			int x = 10/0;
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception();
		}finally {
			System.out.println("Finny Called After Throw");
		}
	}

}
