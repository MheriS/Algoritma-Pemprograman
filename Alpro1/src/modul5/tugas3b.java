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
public class tugas3b {
    public static void main(String[]args)throws IOException {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String nilai1;
      System.out.print("Masukan Nilai 1-10 : ");
      nilai1=input.readLine();
      int nilai = Integer.parseInt(nilai1);
      
      switch (nilai){
         case 1 :
           System.out.println("satu");
           break;
         case 2:
           System.out.println("dua");
           break;
         case 3:
           System.out.println("tiga");
           break;
         case 4:
           System.out.println("empat");
           break;
         case 5:
           System.out.println("lima");
           break;
         case 6:
           System.out.println("enam");
           break;  
         case 7:
           System.out.println("tujuh");
           break;
         case 8:
           System.out.println("delapan");
           break;
         case 9:
           System.out.println("sembilan");
           break;
         case 10:
           System.out.println("sepuluh");
           break;  
         default :
            System.out.println("invalid number");
      }
      
    }
}
