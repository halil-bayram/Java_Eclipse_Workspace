package KontrolifadesiIf;
	
	public class Kontrol {
		public static void main(String args[]) {
			/*
			Atama "="
			Toplama "+"
			��karma "-"
			�arpma "*"
			B�lme "/"
			Mod Alma "%"
			
			Toplama ve Atama "+="
			��karma ve Atama "-="
			�arpma ve Atama "*="
			B�lme ve Atama "/="
			Mod Alma ve Atama "%="
			
			Artt�rma ++
			Azaltma --
			
					�L��K�SEK OPERAT�RLER
					E�itlik "=="
					E�it de�ildir "!="
					B�y�kt�r ">"
					K���kt�r "<"
					B�y�kt�r ya da e�ittir ">="
					K���kt�r ya da e�ittir "<="
			
			Ve "&&"
			Veya "||"
			De�il "!"
			
			if yap�s� a�a��da tan�mland��� gibidir lakin ��yle bir vark vard�r.if yap�s�n�n k�me parantezlerini koymazsak sonuc olarak yazd�r�lan son ko�ul gercekle�ir.K�me parantezini yazarsak i�ine yaz�lan her ko�ul yazd�r�l�p ger�ekle�tirilir.*/
			int a=1,b=5;
			if(a<b)
				System.out.println("a k���kt�r b den ");
			/*E�er if yap�s� b�yle olursa ekrana ��kt� basan sat�r�n alt�na bir sat�rdaha yaz�l�rsa �steki sat�r �al��maz.*/
			int c=1,d=5;
			if(c<d) {
				System.out.println("a k���kt�r b den ");
			}
			//�eklinde bir if yap�s� olursa K�me parantezlerin i�inde ka� sat�r olursa olsun hepsi sat�r sat�r i�lenir.
			
			//print yazd�rma fonksiyonun da e�er parantez i�ine string bir yazd�rma i�lemiyle ba�larsak + ile ba�lad���m�z integer de�i�kenlerde matematiksel i�lemler yapamaz say�lar� stringmi� gibi kabul� eder ve sadece yazar.
			System.out.println("toplam ="+a+b);
			//Bu sorundan parantez kullanarak kurtula biliriz.
			System.out.println("toplam ="+(a+b));
			if(a==b) {
				System.out.println("Say�lar E�ittir.");
			}
			else {
				System.out.println("Say�lar E�it de�il.");
			}
			
			
			boolean deger=true;
			
			//boolean de bir de�i�ken t�r�d�r asl�nda integer ve string gibi tek fark� iki farkl� de�er al�r ba�ka de�er almaz bunlarda true ve false dur.
			
				
		}	
		
}

