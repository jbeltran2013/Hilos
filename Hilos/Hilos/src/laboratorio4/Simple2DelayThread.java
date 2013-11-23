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
public class Simple2DelayThread extends Thread {
    public String name = null;
    public int delay = 0;

    public Simple2DelayThread(String str, int d) {
        this.name = str;
        this.delay = d;
    }
    public void run() {
    try {
        Thread.sleep(delay);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("name : " + name + " | delay : " + delay);
    }
}
