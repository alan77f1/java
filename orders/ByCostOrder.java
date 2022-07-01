package w6.orders;

import java.util.Comparator;

public class ByCostOrder implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		return Integer.compare(o1.cost(), o2.cost());
	}
	
}
