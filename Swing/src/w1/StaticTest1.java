package w1;

public class StaticTest1 {
	byte b = Byte.MAX_VALUE;
	static double PI = 3.14;
	double E = 2.7;

	public void m(double d) {
		E = E + d;
	}

	public static void main(String[] args) {
//		StaticTest1 t = new StaticTest1();
//		t.m(2.7);//5.4
//				
//		StaticTest1 t2 = new StaticTest1();
//		t2.m(2.8);//5.4 : 5.5
//		System.out.println(t.E+" "+t2.E+" "+PI);//5.4 : 5.5
		int age = 50;
		short AGE = (short) age;
	}
}