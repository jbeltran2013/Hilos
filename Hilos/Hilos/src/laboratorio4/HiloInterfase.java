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
public class HiloInterfase implements Runnable {
    public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println(i);
    }
  }
}
