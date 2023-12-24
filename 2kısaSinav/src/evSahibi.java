
public class evSahibi {
	private Bina bina;
	private String evSahibiAdi;
	Daire daire;

	// yapıcı metot
	public evSahibi(Bina bina, String evSahibiAdi) {
		this.bina = bina;
		this.evSahibiAdi = evSahibiAdi;

	}
	//daire Ekleme Metodu
	public void addApartment(Daire daire) {
		this.daire = daire;
	}

	public void displayInfo(evSahibi evs) {
		System.out.println(evs.evSahibiAdi + " " + evs.daire.adres);
	}
	
	//getter ve Setterlar
	public String getEvSahibiAdi() {
		return evSahibiAdi;
	}

	public void setEvSahibiAdi(String evSahibiAdi) {
		this.evSahibiAdi = evSahibiAdi;
	}

}
