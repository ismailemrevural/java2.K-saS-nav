
public class main {

	public static void main(String[] args) {
		
		Daire daire1 = new Daire("adres", 13);
		Bina bina1 = new Bina("adres", 4);
		
		evSahibi evsahibi1 = new evSahibi(bina1, "emre");
		evsahibi1.addApartment(daire1);
		evsahibi1.displayInfo(evsahibi1);
		
		Kiraci kiraci1 = new Kiraci("mustafa", evsahibi1);
		kiraci1.displayInfo(kiraci1);
		
		
		Daire daire2 = new Daire("adres", 4);
		
		int sonuc = daire1.compareTo(daire2);
		if (sonuc < 0) {
		    System.out.println("daire1, daire2'den önce gelir.");
		} else if (sonuc > 0) {
		    System.out.println("daire1, daire2'den sonra gelir.");
		} else {
		    System.out.println("daire1, daire2 daire no ları  eşittir.");
		}
	}

}
