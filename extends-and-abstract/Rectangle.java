package w3;

import java.util.Scanner;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(Point location, int chieuDai, int chieuRong) {
		super(location);
		this.width = chieuDai;
		this.height = chieuRong;
	}

	public Rectangle(Rectangle h) {
		super(h.location);
		this.width = h.width;
		this.height = h.height;
	}

	public Rectangle() {
		super();
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width:");
		this.width = sc.nextInt();
		System.out.print("Enter height:");
		this.height = sc.nextInt();
		this.location = new Point();
		this.location.input();//
		sc.close();
	}

	public void output() {
		System.out.println(this.width + " " + this.height + " " + this.location);
	}

	public double p() {
		return (width + height) * 2;
	}

	public double area() {
		return this.width * this.height;
	}

}
