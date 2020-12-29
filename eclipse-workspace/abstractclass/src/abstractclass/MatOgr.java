package abstractclass;

public class MatOgr extends Ogr implements Bil{

	public MatOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	public void hesapla() {
		System.out.println("hesapladým");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim Bölümüm Matematik");
	}
	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("tamam tamam yazdým...");
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a*b*b;
	}
}
