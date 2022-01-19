package lab;

public class House {

	private int SQFT;
	private int bedrooms;
	private double bathrooms;
	private int price;
	private String address;
	private String image;
	
	
	//constructor
	public House(int SQFT, int bedrooms, double bathrooms, int price, String address, String image) {
		this.SQFT = SQFT;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.price = price;
		this.address = address;
		this.image = image;
	}
	
	//getter methods
	public int getSQFT() { return SQFT; }
	public int getBedrooms() { return bedrooms; }
	public double getBathrooms() {return bathrooms; }
	public int getPrice() {return price; }
	public String getAddress() {return address; }
	public String getImage() {return image; }
}
