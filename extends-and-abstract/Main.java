package w3;

public class Main {
//	public static void m(Rectangle h) {
//		h.getLocation().setY(100);
//
//	}

	public static void main(String[] args) {
//		Point p1 = new Point();
		//Rectangle r1 = new Rectangle();
		Point p2 = new Point(3, 4);
		Shape p0 = new Circle();
		Shape r2 = new Rectangle(p2, 5, 6);
		Shape c1 = new Circle(p2, 5);
//		Rectangle r3 = new Rectangle(r2);
//		p1.input();
//		m(r3);
////		System.out.println(v4.getLocation().getY()+" "+ v5.getLocation().getY());
//		System.out.println(p1.getY());
		
//		r1.input();
//		r1.output();
		System.out.println(r2.distanceToO()+""+p2.distanceToO());
		System.out.println(c1.distanceToO());
		
	}
}
