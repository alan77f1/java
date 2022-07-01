package w6.orders;

import java.util.Comparator;

public class ByCostAndDateOrder implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		int re = -Integer.compare(o1.cost(), o2.cost());
		if(re==0) {
			return -o1.getDate().compareTo(o2.getDate());
		}
		return re;
	}

}
