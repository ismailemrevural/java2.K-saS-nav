
public abstract class Konut {

	protected String adres;

	abstract void displayInfo();
	
	//Yapıcı metot
	Konut(String adres) {
		this.adres = adres;
	}
}