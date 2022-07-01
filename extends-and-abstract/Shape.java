package w3;

public abstract class Shape {
	protected Point location;

	public Shape() {
		super();
	}

	public Shape(Point location) {
		super();
		this.location = new Point(location);
	}

	public void input() {
		this.location = new Point();
		this.location.input();

	}

	public void output() {
		System.out.println(this.location);
	}

	public double distanceToO() {
		return this.location.distanceToO();

	}

	public abstract double area();

	public abstract double p();
}
