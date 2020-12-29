package maxMinDiziSwap;

public class PazarListesi {
	String[] liste;
	int elemanSayisi;
	int sinir;
	public PazarListesi(int elemanKapasitesi) {
		liste= new String[elemanKapasitesi];
		elemanSayisi=0;
		sinir=elemanKapasitesi;
		
	}
	
	public void listeyeEkle(String eklenecekOlan) {
		if (elemanSayisi<sinir) {
			liste[elemanSayisi] = eklenecekOlan;
			elemanSayisi++;
		}
		else {
			System.out.println("Bo� yer kalmad�!");
		}
	}
	public void yaz() {
		for (int i = 0; i <= elemanSayisi-1; i++) {
			System.out.println(liste[i]);
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
			System.out.println("-----------hatali index yapt�n�z-----------");
		}
		
	}
	public void ekle(String eklenecekEleman,int index) {
		if (index <= elemanSayisi && index >=0&& elemanSayisi<sinir) {
			for (int i = elemanSayisi-1; i >= index; i--) {
				liste[i+1]=liste[i];
			}
			
			liste[index]=eklenecekEleman;
			elemanSayisi++;
		}
		else {
			System.out.println("----------hatali index yapt�n�z-----------");
		}
		
	}
	public String max() {
		String enbuyuk =liste[0];
		for (int i = 0; i < elemanSayisi; i++) {
			if (liste[i].compareToIgnoreCase(enbuyuk)>0) {
				enbuyuk=liste[i];
			}
		}
		return enbuyuk;
	}
	public String min() {
		String enkucuk =liste[0];
		for (int i = 0; i < elemanSayisi; i++) {
			if (liste[i].compareToIgnoreCase(enkucuk)<0) {
				enkucuk=liste[i];
			}
		}
		return enkucuk;
	}
	
	public void swap(int i1,int i2) {
		
		String tmp=liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
		
	}
	
	
}
