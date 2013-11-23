/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio4;

/**
 *
 * @author User
 */
public class Test_HiloInterfase {
    public static void main(String[] args) {
     HiloInterfase st = new HiloInterfase ();
     Thread th = new Thread(st);
     th.start();
   }
}
