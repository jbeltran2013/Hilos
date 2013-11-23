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
public class SimpleDelayThread extends Thread {
    public void run() {
    //
    for (int i = 0; i < 5; i++) {
    try {
    // 1000 ms
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println(i);
    }
  }
}
