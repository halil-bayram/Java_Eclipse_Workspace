package deneme;

import java.util.Scanner;
public class odeviki {
	public static void main(String args[]) {
		
				int kurus25=0,kurus10=0,kurus5=0,kurus1=0,sayac=0,toplam=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Paranýzý Kuruþ Cinsinden Girin(1TL=100Kurus):");
				int para=sc.nextInt();
				System.out.println("Paranýz:"+para);
				
				for(int i=1;;i++)
				{
				
					kurus25=i*25;
					if(kurus25<=para) {
						sayac++;
					}
					else
					{
						break;
					}
				
				}
				System.out.println("Paranýzda "+sayac+"adet 25 kurus var");
				para=para-(sayac*25);
				toplam=toplam+sayac;
				sayac=0;
				for(int i=1;;i++)
				{
				
					kurus10=i*10;
					if(kurus10<=para) {
						sayac++;
					}
					else
					{
						break;
					}
				
				}
				System.out.println("Paranýzda "+sayac+"adet 10 kurus var");
				para=para-(sayac*10);
				toplam=toplam+sayac;
				sayac=0;
				for(int i=1;;i++)
				{
				
					kurus5=i*5;
					if(kurus5<=para) {
						sayac++;
					}
					else
					{
						break;
					}
				
				}
				System.out.println("Paranýzda "+sayac+"adet 5 kurus var");
				para=para-(sayac*5);
				toplam=toplam+sayac;
				sayac=0;
				for(int i=1;;i++)
				{
				
					kurus1=i*1;
					if(kurus1<=para) {
						sayac++;
					}
					else
					{
						break;
					}
				
				}
				System.out.println("Paranýzda "+sayac+"adet 1 kurus var");
				System.out.println("Toplam  "+toplam+"  adet madeni paranýz var");
			}
		
				
}	

