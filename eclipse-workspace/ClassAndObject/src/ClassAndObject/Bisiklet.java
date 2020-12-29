package ClassAndObject;

public class Bisiklet {

	dInsan binmisInsan;
	
	public Bisiklet() {
		
		binmisInsan=null;
	}
public Bisiklet(dInsan gelenInsan) {
		
		binmisInsan=gelenInsan;
	}
	
	
	public void bin(dInsan gelenInsan) {
		
		if(binmisInsan==null) {
			binmisInsan=gelenInsan;
			System.out.println(binmisInsan.getIsim()+" basariyla bindi.");
		}
		else {
			System.out.println("Zaten "+binmisInsan.getIsim()+" binmis");
		}
		
		
	}
	public void in() {
		if(binmisInsan==null) {
			System.out.println("Zaten bisiklet boþ.");
		}
		else {
			String inen=binmisInsan.getIsim();
			
			binmisInsan=null;
			System.out.println(inen+" binmis");
		}
	}
	
	
}
