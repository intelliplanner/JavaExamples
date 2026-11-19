/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

//Write a Java Program to reverse a string without using String inbuilt function?

/** Purpose: Encapsulates string reverse behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class StringReverse {
        
        public static void main(String s[]){
//       reverseStringWithPreFunction();
//       reverseStringWithoutFunction();
       newReverse();
    }

	/** Purpose: Performs the reverse string with pre function operation. */
	private static void reverseStringWithPreFunction() {
        String str = "Reverse";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        System.out.println("str2:   "+str2);
    }

    /** Purpose: Performs the reverse string without function operation. */
    private static void reverseStringWithoutFunction() {
        String str = "Hello";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1 ; i >= 0; i--) {
            char c = ch[i];
            System.out.print(c );
        }
        System.out.println();
    }

    /** Purpose: Performs the new reverse operation. */
    private static void newReverse() {
    	String str = "Reverse";
    	for (int i = str.length()-1; i >= 0; i--) {
    		System.out.print(str.charAt(i));
    	}
 	}
}
