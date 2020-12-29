package ClassAndConstructorslar;

public class AnaForm {

	public static void main(String[] args) {
		
		
		Kedi k=new Kedi("Tekir",10,"Et");
		k.yuru();
		k.sesCikar();
		
		Kopek t=new Kopek("Karabaþ",3,8,10);
		t.sesCikar();
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("yapilan islem: "+k.islemYap(3, 5));
		System.out.println("yapilan islem: "+k.islemYap(5, 5));
		System.out.println("yapilan islem: "+t.islemYap(3, 5));
	}

}
