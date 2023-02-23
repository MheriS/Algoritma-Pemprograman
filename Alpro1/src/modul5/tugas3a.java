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
public class tugas3a {
    public static void main (String[]args)throws IOException{
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String nilai1;
      System.out.print("Masukan Nilai 1-10 : ");
      nilai1=input.readLine();
      int nilai = Integer.parseInt(nilai1);
      
        if(nilai==1){
        System.out.println("Satu");        
        } else if (nilai==2){
        System.out.println("Dua");
        } else if (nilai==3){
        System.out.println("Tiga");
        } else if (nilai==4){
        System.out.println("Emapat");
        } else if (nilai==5){
        System.out.println("Lima");
        } else if (nilai==6){
        System.out.println("Enam");
        } else if (nilai==7){
        System.out.println("Tujuh");
        } else if (nilai==8){
        System.out.println("Delapan");
        } else if (nilai==9){
        System.out.println("Sembilan");
        }else if (nilai==10){
        System.out.println("Sepuluh");
      } else {
        System.out.println("Invalid number");
        }  
    }    
}
