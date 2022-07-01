package w6.orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Order {
	private String id;
	private String customer;
	private String employee;
	private Date date;
	private List<OrderItem> items = new ArrayList<>();

	public Order(String id, String customer, String employee, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void addOrderItem(OrderItem item) {
		this.items.add(item);
	}

	// Lay ra san pham co gia ban cao nhat
	public Product maxProduct() {
		OrderItem tmp = items.get(0);
		for (int i = 1; i < items.size(); i++) {
			OrderItem curr = items.get(i);
			if (curr.isHigerPrice(tmp)) {
				tmp = curr;
			}
		}
		return tmp.getItem();
	}

	// Thong ke so luong ban ra cua moi loai san pham cho tung hoa don
	public HashMap<String, Integer> productTypesStatistics() {
		HashMap<String, Integer> re = new HashMap<>();
		for (int i = 0; i < items.size(); i++) {
			OrderItem oi = items.get(i);
			String type = oi.getProductType();
			int amount = oi.getAmount();
			if (re.containsKey(type)) {
				amount += re.get(type);
			}
			re.put(type, amount);
		}
		return re;
	}

	// Tinh gia tri hoa don
	public int cost() {
		int re = 0;
		for (OrderItem oi : items) {
			re += oi.cost();
		}
		return re;
	}
	
	@Override
	public String toString() {
		return this.id+" "+cost();
	}
}
