package deneme;

import java.util.Scanner;
import javax.swing.*;
public class JOptionPane {

		public static void main(String args[]) {
			int vizeNotu  = 0;
	        int finalNotu = 0;
	        
	        Scanner tara=new Scanner(System.in);
	        System.out.println("L�tfen ad�n�z� giriniz");
	        String ad=tara.next();
	        System.out.println(ad);
	        String harf;
	        vizeNotu = Integer.parseInt(JOptionPane.showInputDialog("Vize notunuzu giriniz."));
	        while (vizeNotu<0||vizeNotu>100) {
	            vizeNotu = Integer.parseInt(JOptionPane.showInputDialog
	                    ("Vize notunuzu giriniz.\nGirilen not 0 ile 100 aras�nda olmal�d�r."));
	        }
			
	        finalNotu = Integer.parseInt(JOptionPane.showInputDialog("L�tfen Final Notunu Giriniz"));
	        while (finalNotu<0||finalNotu>100) {
	            finalNotu = Integer.parseInt(JOptionPane.showInputDialog
	                    ("Final notunuzu giriniz.\nGirilen not 0 ile 100 aras�nda olmal�d�r."));
	        }
	        
	        double sonuc=(0.3*vizeNotu)+(0.6*finalNotu);
	        
	        if(sonuc>88||sonuc<100) {
	        	
	        	harf="AA";
	        }
	        else if(sonuc>80||sonuc<87) {
	        	harf="BA";
	        }
	        else if(sonuc>73||sonuc<79) {
	        	harf="BB";
	        }
	        else if(sonuc>66||sonuc<72) {
	        	harf="CB";
	        }
	        else if(sonuc>60||sonuc<65) {
	        	harf="CC";
	        }
	        else if(sonuc>55||sonuc<59) {
	        	harf="DC";
	        }
	        else if(sonuc>50||sonuc<54) {
	        	harf="DD";
	        }
	        else if(sonuc<=49) {
	        	harf="FF";
	        }
		}

		

}
