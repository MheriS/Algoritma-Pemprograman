/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lenovo
 */
public class tugas4a {
    public static void main (String[]args)throws IOException{
        for (int i=0;i<10;i++){
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String nilai1;
       
       System.out.print("Masukan Nilai : ");
       nilai1=input.readLine();
       int a=Integer.parseInt(nilai1);
       if (a%2==1){
           System.out.println(a+" adalah bilangan Ganjil");
       } else {
           System.out.println(a+" adalah bilangan Genap");
       }
       }
        }
        
    }

