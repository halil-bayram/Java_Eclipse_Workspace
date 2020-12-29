package ClassAndObject;

import java.util.Scanner;

public class dIlkProgram {

	public static void main(String[] args) {
		
		dInsan i1=new dInsan();
		dInsan i2=new dInsan(30,"yusuf");
		i1.setIsim("halil");
		i1.setYas(20);
		System.out.println("isim: "+i1.getIsim()+"\tyas: "+i1.getYas());
		System.out.println("isim: "+i2.getIsim()+"\tyas: "+i2.getYas());
		System.out.println("----------------------------------------------");
		i1.selamla();
		System.out.println("----------------------------------------------");
		i1.biriniSelamla(i2);
		System.out.println("----------------------------------------------");
		
		Bisiklet bis=new Bisiklet();
		
		bis.bin(i1);
		bis.in();
		bis.bin(i2);
		bis.in();
		System.out.println("----------------------------------------------");
		int baslangic,son;
		Scanner tara=new Scanner(System.in);
		System.out.println("Lütfen baslangic degerini giriniz");
		baslangic=tara.nextInt();
		System.out.println("Lütfen bitis degerini giriniz");
		son=tara.nextInt();
		i1.sayiSay(baslangic,son);
	}

}
