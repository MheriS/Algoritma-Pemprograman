/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyobak;

/**
 *
 * @author herib
 */
public class bentukFrasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat 3 kumpulan kata-kata untuk dipilih. Silahkan menambah kata-kata anda
        String[] listKataSatu = {"rumah", "sepeda", "ayam", "jam", "baju", "mobil", "laptop", "smartphone", "jaket", "celana"};
        String[] listKataDua = {"canggih", "nyaman", "enak", "terbaru", "besar", "hitam", "bagus", "luas", "ber merk", "terkenal"};
        String[] listKataTiga = {"itu", "di atas", "milikmu", "miliknya", "di toko", "baru", "di tv", "milik artis"};
        
        // banyak kata kata di dalam list
        int banyakKataSatu = listKataSatu.length;
           int banyakKataDua = listKataDua.length;
              int banyakKataTiga = listKataTiga.length;
        
        //menggenerate 3 bilangan random sesuai dengan banyaknya kata dalam list
        int ambil = (int)(Math.random()*banyakKataSatu);
         int ambil1 = (int)(Math.random()*banyakKataDua);
          int ambil2 = (int)(Math.random()*banyakKataTiga);
          
        //membuat sebuah frasa
        String frasa = (listKataSatu[ambil]+ " yang " +listKataDua[ambil1]+ " seperti " +listKataTiga[ambil2]);
        
        //mencetak frasa
        System.out.println("Saya menginginkan sebuah "+frasa);
    }
    
}
