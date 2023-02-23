/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyobak;

import java.util.Scanner;

/**
 *
 * @author herib
 */
public class satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double angka1,angka2;
        String op;
        Scanner A1 = new Scanner(System.in);
        Scanner O = new Scanner(System.in);
        Scanner A2 = new Scanner(System.in);
        while(true){
            System.out.print("Angka Pertama : ");
            angka1 = A1.nextDouble();
            System.out.print("Angka Kedua : ");
            angka2 = A2.nextDouble();
            System.out.print("Operator--> +, -, x, / : ");
            op = O.next();
            
            if(op.equals("+"))
                System.out.println(angka1 + angka2);
            else if(op.equals("-"))
                System.out.println(angka1 - angka2);
            else if(op.equals("x"))
                System.out.println(angka1 * angka2);
            else if(op.equals("/"))
                System.out.println(angka1 / angka2);
            else
                System.out.println("Operator tidak ditemukan");
        }
    } 
}
