/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;
public class Tugas1 {
    public static void main (String[] arg){
     int uangkomisi; 
     String a = JOptionPane.showInputDialog("Hasil penjualan barang");
     int b = Integer.parseInt(a);
        
    if (b==2000000){
     uangkomisi = b*10/100;
     JOptionPane.showMessageDialog(null,"Salesman mendapatkan penghasilan Rp. "+ (uangkomisi+100000));
    }else if (b>2000000&&b<=5000000){
     uangkomisi = b*15/100;   
     JOptionPane.showMessageDialog(null,"Salesman mendapatkan penghasilan Rp. "+ (uangkomisi+200000));
    }else if (b>5000000){
      uangkomisi = b*20/100;  
     JOptionPane.showMessageDialog(null,"Salesman mendapatkan penghasilan Rp. "+ (uangkomisi+300000));
    } else 
      JOptionPane.showMessageDialog(null,"Salesman Tidak berpenghasilan");
     
     
     
       
     
    
}
}    
