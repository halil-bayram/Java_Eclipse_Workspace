package maxMinDiziSwap;

public class SayiDene {

	public static void main(String[] args) {
		
		SayiListesi liste=new SayiListesi(10);
		liste.ekle(5, 0);
		liste.ekle(2, 0);
		liste.ekle(1, 0);
		liste.ekle(4, 0);
		liste.ekle(5, 0);
		liste.ekle(22, 0); 
		liste.ekle(8, 0);
		
		liste.yaz();
		liste.selectionSort();
		System.out.println();
		liste.yaz();
		liste.selectionSortTers();
		System.out.println();
		liste.yaz();
		System.out.println();
		liste.bubleSort();
		
		liste.yaz();
		
	}

}
