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
public class Prioridades {
    public static void main(String[] args) {
    Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 1000);
    Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 500);
    Simple2DelayThread thread3 = new Simple2DelayThread("thread3", 500);
    
    // Modificando las prioridades
    thread1.setPriority(Thread.MIN_PRIORITY);
    thread2.setPriority(Thread.MAX_PRIORITY);
    thread3.setPriority(Thread.MIN_PRIORITY);
    
    thread3.start();
    thread1.start();
    thread2.start();
    }
}
