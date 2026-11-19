package inteviewQuestion.Exception;


/**
 * Encapsulates exception test behavior for the represented coding problem.
 */
public class ExceptionTest {
	/**
 * Verifies validate conditions before processing continues.
 */
	static void  validate(int age){
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("valid");
	}
	
	
	/**
 * Performs the age validate operation required by the represented example.
 */
	static void  ageValidate(int age) throws CustomException{
		if(age<18)
			throw new CustomException("age not valid");
		else
			System.out.println("valid age");
	}
	
	
		public static void main(String[] args) {
		//validate(13);
		try {
			ageValidate(15);
			
		}catch(CustomException e) {
			System.out.println(e);
		}
		try {
			//validate(15);
			int x=0;
			int y= 5/x;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
