package inteviewQuestion;

/**
 * Encapsulates tcs_16jan2025 behavior for the represented coding problem.
 */
public class TCS_16jan2025 {

        public static void main(String[] at) {
//          A
//        B  B
//        C  C
//        D  D
//        C  C
//        B  B
//          A

        String str = "Today is Java interview"; //reverse
        String[] arr1 = {"A", "B", "C","D"};
        for (int i = 0; i < 7; i++) { //i = 0,1 ,2,
            for (int j = 0; j < 2; j++) {
                if (i == 0 || i == 6) {
                    System.out.print(" "+arr1[0] );
                    break;
                }
                else if(i == 4 ){
                    System.out.print(arr1[2] + " ");
                }
               else if( i == 5){
                    System.out.print(arr1[1] + " ");
                }
                else {
                    if(i < arr1.length) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
}