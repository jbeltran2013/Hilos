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
public class DelayMemoryThread extends Thread {
    public void run() {
    //
    for (int i = 0; i < 12; i++) {
    try {
    // 5000 ms
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }   
        long mem0 = Runtime.getRuntime().totalMemory();
        long mem1 = Runtime.getRuntime().freeMemory();
        long mem2 = Runtime.getRuntime().availableProcessors();
        long mem3 = Runtime.getRuntime().maxMemory();
        System.out.println("");
        System.out.println("Estado de la Memoria en "+(i+1)*5+" Seg.:");
        System.out.println("================================");
        System.out.println("Memoria  Total: "+mem0);
        System.out.println("Memoria  Libre: "+mem1);
        System.out.println("CPU Disponible: "+mem2);
        System.out.println("Memoria Máxima: "+mem3);
        //Limpiar Pantalla
    }
  }
}
