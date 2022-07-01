package w6.orders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class OrderManager {
	private List<Order> orders = new ArrayList<>();

	public OrderManager() {
		super();
	}

//
	public void addOrder(Order o) {
		this.orders.add(o);
	}

	// Lay ra san pham co gia ban cao nhat
	public Product maxProduct() {
		Product result = orders.get(0).maxProduct();
		for (int i = 1; i < orders.size(); i++) {
			Product curr = orders.get(i).maxProduct();
			if (!result.isHigherPrice(curr)) {
				result = curr;
			}
		}
		return result;
	}

//Thong ke so luong ban ra cua moi loai san pham
	public HashMap<String, Integer> productTypesStatistics() {
		HashMap<String, Integer> re = new HashMap<>();
		for (int i = 0; i < orders.size(); i++) {
			Order o = orders.get(i);
			HashMap<String, Integer> tmp = o.productTypesStatistics();

			for (Entry<String, Integer> entry : tmp.entrySet()) {
				String type = entry.getKey();
				int amount = entry.getValue();

				if (re.containsKey(type)) {
					amount += re.get(type);
				}
				re.put(type, amount);
			}
		}
		return re;
	}

	// Sap xep theo gia tri cua hoa don, cung gia tri sap xep theo ngay
	public TreeSet<Order> ordersByCost() {
		TreeSet<Order> re = new TreeSet<>(new ByCostAndDateOrder());
		re.addAll(orders);
		return re;
	}
	
	
}
