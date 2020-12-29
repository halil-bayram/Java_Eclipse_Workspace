package ornekdeneme;

import java.util.Random;
import java.util.*;
public class odev {
	 public static int[] sayilar=new int[10];
 public static void main(String[] args) {
	 
	 
	 uret();
	 System.out.println("küçük sayý");
	 kucuk();
	 System.out.println("sýrala");
	 listele();
	 System.out.println("silinecek");
	 sil();
	 listele();
 }
 
 
 public static void uret() {
	 Random rnd=new Random();
	 
	 for (int i=0; i<((sayilar.length)-5); i++){
		 sayilar[i]=rnd.nextInt(10);
		 System.out.println(sayilar[i]);
		 } 
 }
 
 public static void kucuk()
 {
	 int en=sayilar[1];
	 
	 for (int i=0; i<((sayilar.length)-5); i++){
		 
		 if(sayilar[i]<en) {
			 en=sayilar[i];
			 
		 }
		 
		 }
	 System.out.println(en);
 }
 
 public static void sil() {
	 Scanner tara= new Scanner(System.in);
	 System.out.println("Silinecek Sayýyý Giriniz: ");
	 int silinecek=tara.nextInt();
	 
	 sayilar[silinecek]=0;
	 
 }

 
 public static void listele() {

	 
 
 
 for(int i=0;i<sayilar.length - 1;i++){
     for(int j=0;j<sayilar.length - (i+1);j++){
         if(sayilar[j]>sayilar[j+1]){
             int tmp = sayilar[j];
             sayilar[j] = sayilar[j+1];
             sayilar[j+1] = tmp;
             
         }
         
     }
     
 }
 
 for (int i=0; i<((sayilar.length)-5); i++){
	 System.out.println(sayilar[i]);
	 } 
 
	 /*for (int i=0; i<5; i++){
		 
		 if(sayilar[i]>sayilar[i+1]) {
			 kalacak=sayilar[i];
			 sayilar[i]=sayilar[i+1];
			 sayilar[i+1]=kalacak;
			 
		 }
		 System.out.println(sayilar[i]);
		 }*/
	 
 }

public static void ekle() {
	Scanner tara= new Scanner(System.in);
	 System.out.println("Eklenecek Sayýyý Giriniz:  ");
	 int ekle=tara.nextInt();
	 
}


}

