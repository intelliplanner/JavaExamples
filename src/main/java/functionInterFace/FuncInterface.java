/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionInterFace;

/**
 *
 * @author IPSSI
 */

@FunctionalInterface
interface Test {
    /**
 * Performs the abs operation required by the represented example.
 */
    public void abs(int i);
}

/**
 * Encapsulates func interface behavior for the represented example workflow.
 */
public class FuncInterface {

        public static void main(String s[]) {
        Test t = (a) -> {
            System.out.println("test");
        };
    }

}
