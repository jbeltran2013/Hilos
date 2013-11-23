/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class DelayRunProcessThread extends Thread {
    public void run() {
    //
    for (int i = 0; i < 12; i++) {
    try {
    // 10000 ms
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }   
        LeeProcesos(i+1);
        //Limpiar Pantalla
    }
  }
    
  static public void LeeProcesos(int i){
      try {
        System.out.println(i+"º Corrida en: "+i*10+" Seg.");
        System.out.println("=====================");
        //Process proceso = Runtime.getRuntime().exec("ps -ef"); //para linux
        Process proceso = Runtime.getRuntime().exec("tasklist"); //para windows
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(
        proceso.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(
        proceso.getErrorStream()));
        String s = null;
        System.out.println("Here is the standard output of the command:\n");
         while ((s = stdInput.readLine()) != null) {
         System.out.println(s);
    }
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
        System.out.println(s);
    }
        //System.exit(0);
    } catch (IOException e) {
        e.printStackTrace();
    }
  }  
}
