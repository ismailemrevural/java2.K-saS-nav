
public class Bina extends Konut {

	private int numberOfFloors;
	
	//yapıcı metot
	Bina(String adres,int numberOfFloors) {
		super(adres);
		this.numberOfFloors=numberOfFloors;
	}
	
	
	@Override
	void displayInfo() {
		System.out.println(this.adres+" "+this.numberOfFloors);
	}
	//getter ve Setter metotları
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

}
