package w6.orders;

import java.util.Date;

public class Product {
	private String name;
	private String type;
	private int price;
	private Date expiredDate;

	public Product(String name, String type, int price, Date expiredDate) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.expiredDate = expiredDate;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public boolean isHigherPrice(Product item) {
		return this.price > item.price;
	}

	@Override
	public String toString() {
		return this.name + " " + this.type + " " + this.price;//+ expiredDate 
	}
}
