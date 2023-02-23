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
public class Tugas3 {
    public static void main(String[] args){
     //input data
     int biaya_haji=50000000, tabungan=20000000, terbayar_haji=10000000, targetcicilan=24, sudah_menabung=1;
     //proses
     int sisa_biaya_haji = biaya_haji - terbayar_haji;
     int sisa_targetcicilan = targetcicilan - sudah_menabung;
     int total_cicilanPerbulan = sisa_biaya_haji/sisa_targetcicilan;
     //output
        System.out.println("Cicilan perBulan selama 2tahun = Rp. "+total_cicilanPerbulan);
    }
}
