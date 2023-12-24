
public class Daire extends Konut implements Comparable<Daire> {
	private int apartmentNumber;

	//yapıcı metot
	Daire(String adres, int apartmentNumber) {
		super(adres);
		this.apartmentNumber = apartmentNumber;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Apartman numarası "+this.apartmentNumber + " Adres : " + this.adres);

	}

	//compareTo override 
	public int compareTo(Daire dr1) {

		return Integer.compare(this.apartmentNumber, dr1.apartmentNumber);
	}
	//getter ve setter metotlar
	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	};

}
