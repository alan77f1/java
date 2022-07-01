package w6.orders;

public class OrderItem {
	private Product item;
	private int amount;

	public OrderItem(Product item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public Product getItem() {
		return item;
	}

	public boolean isHigerPrice(OrderItem that) {
		return this.item.isHigherPrice(that.item);
	}

	public String getProductType() {
		return item.getType();
	}
// Tinh gia tri cua chi tiet hoa don
	public int cost() {
		return this.item.getPrice()*this.amount;
	}
}
