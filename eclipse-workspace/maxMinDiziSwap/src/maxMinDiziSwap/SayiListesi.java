package maxMinDiziSwap;

public class SayiListesi {
	int[] liste;
	int elemanSayisi;
	int sinir;
	public SayiListesi(int elemanKapasitesi) {
		liste= new int[elemanKapasitesi];
		elemanSayisi=0;
		sinir=elemanKapasitesi;
		
	}
	
	public void listeyeEkle(int eklenecekOlan) {
		if (elemanSayisi<sinir) {
			liste[elemanSayisi] = eklenecekOlan;
			elemanSayisi++;
		}
		else {
			System.out.println("Boþ yer kalmadý!");
		}
	}
	public void yaz() {
		for (int i = 0; i <= elemanSayisi-1; i++) {
			System.out.print(liste[i]+" ");
		}
	}
	
	public void sil(int index){
		
		if (index>=0&&index <= elemanSayisi-1&& elemanSayisi>0) {
			for (int i = index; i < elemanSayisi-1; i++) {
				liste[i]=liste[i+1];
			}
			elemanSayisi--;
		}
		else {
			System.out.println("-----------hatali index yaptýnýz-----------");
		}
		
	}
	public void ekle(int eklenecekEleman,int index) {
		if (index <= elemanSayisi && index >=0&& elemanSayisi<sinir) {
			for (int i = elemanSayisi-1; i >= index; i--) {
				liste[i+1]=liste[i];
			}
			
			liste[index]=eklenecekEleman;
			elemanSayisi++;
		}
		else {
			System.out.println("----------hatali index yaptýnýz-----------");
		}
		
	}
	public int max() {
		int enbuyuk =liste[0];
		for (int i = 0; i < elemanSayisi; i++) {
			if (liste[i]>enbuyuk) {
				enbuyuk=liste[i];
			}
		}
		return enbuyuk;
	}
	public int min() {
		int enkucuk =liste[0];
		for (int i = 0; i < elemanSayisi; i++) {
			if (liste[i]<enkucuk) {
				enkucuk=liste[i];
			}
		}
		return enkucuk;
	}
	
	public void swap(int i1,int i2) {
		
		int tmp=liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
		
	}
	
	public void selectionSort() {
		
		int enkucukIndex;
		for (int i = 0; i < elemanSayisi; i++) {
			enkucukIndex=i;
			for (int j = i; j < elemanSayisi; j++) {
				if (liste[j]<liste[enkucukIndex]) {
					enkucukIndex=j;
				}
			}
			swap(enkucukIndex,i);
		}
				
	}
	
	public void bubleSort()
	{
		boolean swapped =true;
		
		while (swapped) {
			swapped=false;
			for (int i = 1; i < elemanSayisi; i++) {
				if (liste[i-1]>liste[i]) {
					swap(i-1,i);
					swapped=true;
				}
			}
			
		}
		
	}
	
public void selectionSortTers() {
		
		int enBuyukIndex;
		for (int i = 0; i < elemanSayisi; i++) {
			enBuyukIndex=i;
			for (int j = i; j < elemanSayisi; j++) {
				if (liste[j]>liste[enBuyukIndex]) {
					enBuyukIndex=j;
				}
			}
			swap(enBuyukIndex,i);
		}
				
	}
}
