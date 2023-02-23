/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;


public class Tugas2 {
    public static void main(String [] args){
        
     String nilai1 = JOptionPane.showInputDialog("Masukan nilai pertama ");
     String nilai2 = JOptionPane.showInputDialog("Masukan nilai kedua "); 
     String nilai3 = JOptionPane.showInputDialog("Masukan nilai ketiga "); 
      
     String msg = "Nilai-nilai yang dimasukkan = " + nilai1+","+nilai2+","+nilai3;
     JOptionPane.showMessageDialog(null,msg);
     System.out.println(nilai1);
     System.out.println(nilai2);
     System.out.println(nilai3);
        }
} 