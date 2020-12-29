package Dowhile;

import java.util.*;

public class SayiTamin {

	public static void main(String[] args) {
		int cevap=20;
		int girdi=0;
		boolean oyunDevam=true;
		Scanner tara=new Scanner(System.in);
			
		do {
			System.out.println("Lutfen bir sayi giriniz:  ");
			girdi=tara.nextInt();
			if(girdi>cevap) {
				System.out.println("Sayiyi Kucultun");
			}
			else if(girdi<cevap) {
				System.out.println("Sayiyi Buyultun");
			}
			else if(girdi==cevap) {
				System.out.println("Tebrikler Bildiniz");
				oyunDevam=false;
			}
		}while(oyunDevam);
		
	}
	

}
