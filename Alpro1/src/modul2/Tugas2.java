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
public class Tugas2 {
    public static void main(String[]args){
        //input
        int gajikotor=5000000;
        double pajak=0.1;
        //proses
        int potongan = (int)(gajikotor*pajak);
        int gajibersih=gajikotor-potongan;
        
        //output
        System.out.println("gaji bersih = Rp "+gajibersih);
     
    }
}
