package ornekdeneme;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class soruBir {
	public static void main(String args[]) {
		int vizeNotu  = 0;
        int finalNotu = 0;
        String[] bilgiler=new String[4];
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen adýnýzý giriniz");
        String ad=tara.next();
        bilgiler[0]=ad;
        String harf="";
        vizeNotu = Integer.parseInt(JOptionPane.showInputDialog("Vize notunuzu giriniz."));
        while (vizeNotu<0||vizeNotu>100) {
            vizeNotu = Integer.parseInt(JOptionPane.showInputDialog
                    ("Vize notunuzu giriniz.\nGirilen not 0 ile 100 arasýnda olmalýdýr."));
        }
		
        finalNotu = Integer.parseInt(JOptionPane.showInputDialog("Lütfen Final Notunu Giriniz"));
        while (finalNotu<0||finalNotu>100) {
            finalNotu = Integer.parseInt(JOptionPane.showInputDialog
                    ("Final notunuzu giriniz.\nGirilen not 0 ile 100 arasýnda olmalýdýr."));
        }
        
        double sonuc=(0.3*vizeNotu)+(0.6*finalNotu);
        bilgiler[1]=String.valueOf(vizeNotu);
        bilgiler[2]=String.valueOf(finalNotu);
        if(sonuc>88||sonuc<100) {
        	
        	harf="AA";
        	bilgiler[3]=harf;
        }
        else if(sonuc>80||sonuc<87) {
        	harf="BA";
        	bilgiler[3]=harf;
        }
        else if(sonuc>73||sonuc<79) {
        	harf="BB";
        	bilgiler[3]=harf;
        }
        else if(sonuc>66||sonuc<72) {
        	harf="CB";
        	bilgiler[3]=harf;
        }
        else if(sonuc>60||sonuc<65) {
        	harf="CC";
        	bilgiler[3]=harf;
        }
        else if(sonuc>55||sonuc<59) {
        	harf="DC";
        	bilgiler[3]=harf;
        }
        else if(sonuc>50||sonuc<54) {
        	harf="DD";
        	bilgiler[3]=harf;
        }
        else if(sonuc<=49) {
        	harf="FF";
        	bilgiler[3]=harf;
        }
        /*int i=0;
        for(i=0:::) {
        	
        }*/
        
	}
}
