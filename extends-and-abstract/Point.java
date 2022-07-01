package w3;

import java.util.Scanner;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(Point b) {
		this.x = b.x;
		this.y = b.y;
	}

	public Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		this.x = sc.nextInt();
		System.out.println("Enter y:");
		this.y = sc.nextInt();
//		sc.close();
	}

	public void output() {
		System.out.println(x + " " + y);
	}

	public double distanceToO() {
		return Math.sqrt(x * x + y * y);

	}
}
