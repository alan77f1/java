package w3;

import java.util.Scanner;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		super();
	}

	public Circle(Point location, int radius) {
		super(location);
		this.radius = radius;
	}

	public Circle(Circle c) {
		super();
		this.location = new Point(c.location);
		this.radius = c.radius;
	}

	@Override
	public void input() {
		super.input();// location
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:");
		this.radius = sc.nextInt();
		sc.close();
	}

	@Override
	public void output() {
		super.output();
		System.out.println("r: " + radius);
	}

	public double p() {
		return 2 * Math.PI * this.radius;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}
