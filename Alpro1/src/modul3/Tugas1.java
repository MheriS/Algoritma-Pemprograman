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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main(String [] args){
     BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nilai1 = ("");
        String nilai2 = ("");
        String nilai3 = ("");
        try{
        System.out.print("Silahkan Masukan nilai pertama = ");    
        nilai1 = dataIn.readLine();
        System.out.print("Silahkan Masukan nilai kedua = ");
        nilai2 = dataIn.readLine();
        System.out.print("Silahkan Masukan nilai ketiga = ");
        nilai3 = dataIn.readLine();
        }catch (IOException e ){
        System.out.println("Error"); 
        }
        System.out.println("Nilai-nilai yang dimasukkan = " + nilai1+","+nilai2+","+nilai3 );
    }
    
}
