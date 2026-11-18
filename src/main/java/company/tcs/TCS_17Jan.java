package company.tcs;

public class TCS_17Jan {

    public static void main(String[] at) {

        String str = "Today is Java interview"; //reverse
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String st = arr[i];
            char[] ch = st.toCharArray();
            for (int j = ch.length-1; j >= 0;j--){
                System.out.print(ch[j]);
            }
            System.out.println(" ");
        }
    }
}
