package abstractclass;

public class OgrAnaForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogr o1=new FenOgr("ali",2);
		Ogr o2=new MatOgr("ayþe",3);
		
		o1.adSoyle();
		o2.adSoyle();
		
		((FenOgr) o1).bil();
		((MatOgr) o2).hesapla();
		o1.bolumSoyle();
		o2.bolumSoyle();
		
		((MatOgr) o2).bilgisayardaYaz();
		((FenOgr) o1).bilgisayardaYaz();
	}

}
