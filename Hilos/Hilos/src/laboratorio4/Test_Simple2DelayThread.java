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
public class Test_Simple2DelayThread {
    public static void main(String[] args) {
        int delay1 = (int)(Math.random()*2000);
        int delay2 = (int)(Math.random()*2000);
        int delay3 = (int)(Math.random()*2000);
        int delay4 = (int)(Math.random()*3000);
        
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1",delay1);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2",delay2);
        Simple2DelayThread thread3 = new Simple2DelayThread("thread3",delay3);
        Simple2DelayThread thread4 = new Simple2DelayThread("thread4",delay4);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
