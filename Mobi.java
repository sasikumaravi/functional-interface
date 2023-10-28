package functionInterface;

public class Mobi implements Comparable<Mobi> {
	private String brand;
	private String model;
	private int price;
	private String color;
	private int ram;
	private String gen;
	private int	rom;
	private float rating;
	public Mobi(String brand,String model,int price,String color,int ram,String gen,int rom,float rate) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
		this.ram=ram;
		this.gen=gen;
		this.rom=rom;
		rating=rate;
	}
    public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int compareTo(Mobi m) {
		return price-m.price;
	}
	public String toString() {
		return brand+" "+model+" "+price+" "+color+" "+ram+" "+gen+" "+rom+" "+rating;
	}

}
