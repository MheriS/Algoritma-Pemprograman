/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author Lenovo
 */
public class tugas2b {
    public static void main (String[]args){
        int angka1=5,angka2=4;
        int faktorial1=angka1,faktorial2=angka2;
        
        for (int i=1;i<angka1;i++){
            faktorial1 *= angka1-i;
        for (int a=1;a<angka2;a++){
            faktorial2 *= angka2-a;
            
          int total = faktorial1+faktorial2;
          System.out.println("5!+4!=" + total);
        }    
    }
    }
}
