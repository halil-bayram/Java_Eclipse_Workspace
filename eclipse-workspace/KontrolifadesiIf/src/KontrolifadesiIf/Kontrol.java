package KontrolifadesiIf;
	
	public class Kontrol {
		public static void main(String args[]) {
			/*
			Atama "="
			Toplama "+"
			Çýkarma "-"
			Çarpma "*"
			Bölme "/"
			Mod Alma "%"
			
			Toplama ve Atama "+="
			Çýkarma ve Atama "-="
			Çarpma ve Atama "*="
			Bölme ve Atama "/="
			Mod Alma ve Atama "%="
			
			Arttýrma ++
			Azaltma --
			
					ÝLÝÞKÝSEK OPERATÖRLER
					Eþitlik "=="
					Eþit deðildir "!="
					Büyüktür ">"
					Küçüktür "<"
					Büyüktür ya da eþittir ">="
					Küçüktür ya da eþittir "<="
			
			Ve "&&"
			Veya "||"
			Deðil "!"
			
			if yapýsý aþaðýda tanýmlandýðý gibidir lakin þöyle bir vark vardýr.if yapýsýnýn küme parantezlerini koymazsak sonuc olarak yazdýrýlan son koþul gercekleþir.Küme parantezini yazarsak içine yazýlan her koþul yazdýrýlýp gerçekleþtirilir.*/
			int a=1,b=5;
			if(a<b)
				System.out.println("a küçüktür b den ");
			/*Eðer if yapýsý böyle olursa ekrana çýktý basan satýrýn altýna bir satýrdaha yazýlýrsa üsteki satýr çalýþmaz.*/
			int c=1,d=5;
			if(c<d) {
				System.out.println("a küçüktür b den ");
			}
			//þeklinde bir if yapýsý olursa Küme parantezlerin içinde kaç satýr olursa olsun hepsi satýr satýr iþlenir.
			
			//print yazdýrma fonksiyonun da eðer parantez içine string bir yazdýrma iþlemiyle baþlarsak + ile baðladýðýmýz integer deðiþkenlerde matematiksel iþlemler yapamaz sayýlarý stringmiþ gibi kabulþ eder ve sadece yazar.
			System.out.println("toplam ="+a+b);
			//Bu sorundan parantez kullanarak kurtula biliriz.
			System.out.println("toplam ="+(a+b));
			if(a==b) {
				System.out.println("Sayýlar Eþittir.");
			}
			else {
				System.out.println("Sayýlar Eþit deðil.");
			}
			
			
			boolean deger=true;
			
			//boolean de bir deðiþken türüdür aslýnda integer ve string gibi tek farký iki farklý deðer alýr baþka deðer almaz bunlarda true ve false dur.
			
				
		}	
		
}

