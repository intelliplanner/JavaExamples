package company.tcs;

import java.util.Scanner;

/** Purpose: Encapsulates tcs_17 jan_2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class TCS_17Jan_2 {
        
        public static void main(String[] at) {
        System.out.println("Please Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str = Integer.toString(i);
        System.out.println("Number: " + str);

//        123  == one hundred twenty three

        int size =   str.length();// 3 - hundred , 2 -

        char[] ch = str.toCharArray();
        for (int j = 0; j < ch.length; j++) {

        }

//        char[] ch = str.toCharArray();
//        for (int j = 0; j < ch.length; j++) {
//            int n = ch[j] - '0';
//            switch (n) {
//                case 1:
//                    System.out.print(" One ");
//                    break;
//                case 2:
//                    System.out.print(" Two");
//                    break;
//                case 3:
//                    System.out.print(" Three");
//                    break;
//                case 4:
//                    System.out.print(" Four ");
//                    break;
//                case 5:
//                    System.out.print(" Five ");
//                    break;
//                case 6:
//                    System.out.print(" Six ");
//                    break;
//                case 7:
//                    System.out.print(" Seven ");
//                    break;
//                case 8:
//                    System.out.print(" Eight ");
//                    break;
//                case 9:
//                    System.out.print("Nine ");
//                    break;
//
//                default:
//                    System.out.print("Zero ");
//            }
//        }

    }

}
