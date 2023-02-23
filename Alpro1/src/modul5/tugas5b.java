/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class tugas5b {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan Angka yang Anda inginkan : ");
        System.out.println(">>>SEGITIGA PERTAMA<<<");
        int n = Integer.parseInt(angka);
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*"); 
            }
            System.out.print("\t");
            
        for (int j=n;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
        }
        
        
        String angka1 = JOptionPane.showInputDialog("Masukkan Angka yang Anda inginkan : ");
        System.out.println(">>>SEGITIGA KEDUA<<<");
        n = Integer.parseInt(angka1);
        for (int i=0;i<=n;i++)
        { 
        for (int j=n;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.print("\t");
        for (int j=n;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
        }
    }
}

