/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionInterFace;

@FunctionalInterface
interface Test {
    
    /** Purpose: Performs the abs operation. */
    public void abs(int i);
}

/** Purpose: Encapsulates func interface behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class FuncInterface {

        public static void main(String s[]) {
        Test t = (a) -> {
            System.out.println("test");
        };
    }

}
