package abstractclass;

public class FenOgr extends Ogr implements Bil {

	public FenOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	public void bil() {
		
		System.out.println("bildim");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim B�l�m�m Fen");
	}
	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("Tamam Tamam Yazd�m...");
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a*b*b;
	}

}
