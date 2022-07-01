package w6.orders;

import java.util.Date;
import java.util.HashMap;
import java.util.TreeSet;

public class TestOrderManager {
	public static void main(String[] args) {
		Product p1 = new Product("C2", "Nuoc giai khat", 100, new Date());
		Product p2 = new Product("Sting", "Nuoc giai khat", 80, new Date());
		Product p3 = new Product("Bap bo", "Tuoi song", 1000, new Date());
		Product p4 = new Product("Tom su", "Tuoi song", 900, new Date());

		Order o1 = new Order("001", "An", "Binh", new Date());
		o1.addOrderItem(new OrderItem(p1, 10));
		o1.addOrderItem(new OrderItem(p3, 2));

		Order o2 = new Order("002", "Bao", "Minh", new Date());
		o2.addOrderItem(new OrderItem(p2, 2));
		o2.addOrderItem(new OrderItem(p4, 2));

		OrderManager man = new OrderManager();
		man.addOrder(o1);
		man.addOrder(o2);
		// San pham co gia ban cao nhat
		System.out.println(man.maxProduct());

		// Thong ke so luong ban ra theo loai
		HashMap<String, Integer> map = man.productTypesStatistics();
		System.out.println(map);

		// Sap xep cac hoa don theo gia tri hoa don
		System.out.println(o1.cost() + " vs " + o2.cost());
		TreeSet<Order> sortedOrders = man.ordersByCost();
		System.out.println(sortedOrders);
	}
}
