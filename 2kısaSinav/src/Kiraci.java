
public class Kiraci {
	private String kiraciAdi;
	evSahibi evsahibi;

	//yapıcı metot
	public Kiraci(String kiraciAdi, evSahibi evsahibi) {

		this.kiraciAdi = kiraciAdi;
		this.evsahibi = evsahibi;
	}
	//getter Setter metotları
	public String getKiraciAdi() {
		return kiraciAdi;
	}

	public void setKiraciAdi(String kiraciAdi) {
		this.kiraciAdi = kiraciAdi;
	}

	public evSahibi getEvsahibi() {
		return evsahibi;
	}

	public void setEvsahibi(evSahibi evsahibi) {
		this.evsahibi = evsahibi;
	}

	public void displayInfo(Kiraci krc) {
		System.out.println("Kiracinın ev Sahibi Adı :  " + krc.evsahibi.getEvSahibiAdi() + "\nKiraci Adi : " + krc.getKiraciAdi()
				+ "\nKiracının daire numarası : " + krc.evsahibi.daire.getApartmentNumber());

	}
}
