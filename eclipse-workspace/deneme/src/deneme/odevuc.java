package deneme;

import java.util.Scanner;
public class odevuc {

	public static void main(String args[]) {
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Birinci uzaklýk x deðerini giriniz:");
	float x1=sc1.nextFloat();
	System.out.println("Birinci uzaklýgýn y deðerini giriniz:");
	float y1=sc1.nextFloat();
	System.out.println("Ýkinci uzaklýðýn x degerini giriniz:");
	float x2=sc1.nextFloat();
	System.out.println("Ýkinci uzaklýgýn y giriniz:");
	float y2=sc1.nextFloat();
	
	
	double a=Math.pow((x2-x1), 2);
	double b=Math.pow((y2-y1), 2);
	double c=a+b;
	double d=Math.sqrt(c);
	double e=Math.pow(d, 2);
	System.out.println("sonuc:"+e);
	
	}
}
