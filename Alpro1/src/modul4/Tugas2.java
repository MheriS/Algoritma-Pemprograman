/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;



/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;
public class Tugas2 {
    public static void main (String[] args){
    String a = JOptionPane.showInputDialog("Nilai adi adalah");
    String b = JOptionPane.showInputDialog("Nilai Budi adalah");
    String c = JOptionPane.showInputDialog("Nilai Caca adalah");
    String d = JOptionPane.showInputDialog("Nilai Deny adalah");
    
    int e = Integer.parseInt(a);
    int f = Integer.parseInt(b);
    int g = Integer.parseInt(c);
    int h = Integer.parseInt(d);
    
    if(e>=36 && e<=45){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah D");
    } else if (e>=46 && e<=55){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah C");    
    } else if (e>=56 && e<=65){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah C+");
    } else if (e>=66 && e<=75){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah B");
    } else if (e>=76 && e<=85){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah B+");
    } else if (e>=86 && e<=100){
    JOptionPane.showMessageDialog(null, "Nilai Adi adalah A");
    } else JOptionPane.showMessageDialog(null,"Tidak ada nilai");
    
    
    if(f>=36 && f<=45){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah D");
    } else if (f>=46 && f<=55){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah C");    
    } else if (f>=56 && f<=65){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah C+");
    } else if (f>=66 && f<=75){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah B");
    } else if (f>=76 && f<=85){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah B+");
    } else if (f>=86 && f<=100){
    JOptionPane.showMessageDialog(null, "Nilai Budi adalah A");
    } else JOptionPane.showMessageDialog(null, "Tidak ada nilai");
    
    
    if(g>=36 && g<=45){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah D");
    } else if (g>=46 && g<=55){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah C");    
    } else if (g>=56 && g<=65){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah C+");
    } else if (g>=66 && g<=75){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah B");
    } else if (g>=76 && g<=85){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah B+");
    } else if (g>=86 && g<=100){
    JOptionPane.showMessageDialog(null, "Nilai Caca adalah A");
    } else JOptionPane.showMessageDialog(null, "Tidak ada nilai");
    
    
    if(h>=36 && h<=45){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah D");
    } else if (h>=46 && h<=55){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah C");    
    } else if (h>=56 && h<=65){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah C+");
    } else if (h>=66 && h<=75){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah B");
    } else if (h>=76 && h<=85){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah B+");
    } else if (h>=86 && h<=100){
    JOptionPane.showMessageDialog(null, "Nilai Deny adalah A");
    } else JOptionPane.showMessageDialog(null, "Tidak ada nilai");
    
    int min = e;
    int max = e;
        
        if (min>f) min = f;
        if (min>g) min = g;
        if (min>h) min = h;
      JOptionPane.showMessageDialog(null, "Nilai Terendah " + min);
      
        if (max<f) max = f;
        if (max<g) max = g;
        if (max<h) max = h;
    JOptionPane.showMessageDialog(null, "Nilai Tertinggi " + max);
    
    
    
    
    
    }        
}
