/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author Lenovo
 */
public class Tugas4 {
    public static void main(String[]args){
        //Tugas 4 : A
        
        //input
        double hasil,hasil1;
        int total;
        //proses
        hasil= Math.pow(2,8);
        hasil1= Math.pow(4,4);
        total = (int) ( hasil+hasil1);
        //output
        System.out.println("Total Penjumlahan = "+ total);
        
        //Tugas 4 : B
        
        //input
        double a,b,c;
        int nilai;
        //proses
        a=Math.pow(2,2);
        b=Math.pow(4,1);
        c=Math.pow(2,2);
        nilai=(int)((a+b)/c);
        //output
        System.out.println("\n\nTotal penjumlahan = "+ nilai);
    }
}
