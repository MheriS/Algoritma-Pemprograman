/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyobak;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author herib
 */
public class hmm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukan kata/kalimat yang akan di analisis:");
        String a = userInput.nextLine();
        System.out.println("Anda memasukan kata/kalimat: " + a);
        System.out.println("Berikut analisi dari kata/kalimat yang anda masukan:");
        System.out.println("----------------------------------------------------");

        int panjangKata = a.length();
        int jumlahKata = 1;
        int jumlahKarakter = 0;
        Map jumlahVokal = new HashMap<>();
        Map jumlahKonsonan = new HashMap<>();

        //PENTING: pake huruf besar
        char[] vokal = {'A', 'I', 'U', 'E', 'O'};
        char[] konsonan = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};


        a = a.toUpperCase();
        for (int i = 0; i < panjangKata; i++) {
            char k = a.charAt(i);

            //mencari Vokal dalam kalimat
            for (int j = 0; j < vokal.length; j++) {
                if (k == vokal[j]) {
                    if (jumlahVokal.containsKey(k)) {
                        int jumV = jumlahVokal.get(k);
                        jumV++;
                        jumlahVokal.put(k, jumV);
                    } else {
                        jumlahVokal.put(k, 1);
                    }
                }
            }

            //mencari Konsonan dalam kalimat
            for (int l = 0; l < konsonan.length; l++) {
                if (k == konsonan[l]) {
                    if (jumlahKonsonan.containsKey(k)) {
                        int jumK =  jumlahKonsonan.get(k);
                        jumK++;
                        jumlahKonsonan.put(k, jumK);
                    } else {
                        jumlahKonsonan.put(k, 1);
                    }
                }
            }


            //Menentukan Jumlah Kata
            if (k == ' ' || k == '.' || k == '?' || k == '!') {
                jumlahKata++;
            } else {
                jumlahKarakter++;
            }
        }

        System.out.println("Jumlah huruf dan karakter: " + jumlahKarakter);
        System.out.println("Jumlah kata: " + jumlahKata + " kata.");
        System.out.println();
        System.out.println("JUMLAH HURUF VOKAL");
        int totV = 0;
        for (int j = 0; j < vokal.length; j++) {
            int jumV = 0;
            if (jumlahVokal.get(vokal[j]) != null) {
                jumV = jumlahVokal.get(vokal[j]);
            }
            System.out.print(vokal[j] + " = " + jumV + ", ");
            totV += jumV;
        }
        System.out.println();
        System.out.println("TOTAL HURUF VOKAL: " + totV + " HURUF");
        
        //konsonan
        System.out.println();
        System.out.println("JUMLAH HURUF KONSONAN");
        int totK = 0;
        for (int j = 0; j < konsonan.length; j++) {
            int jumK = 0;
            if (jumlahKonsonan.get(konsonan[j]) != null) {
                jumK = jumlahKonsonan.get(konsonan[j]);
            }
            System.out.print(konsonan[j] + " = " + jumK + ", ");
            totK += jumK;
        }
        System.out.println();
        System.out.println("TOTAL HURUF KONSONAN: " + totK + " HURUF");
    }
}