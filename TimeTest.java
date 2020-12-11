package ggg;

public class TimeTest {
	static Time a= new Time (5, 23, 55);
	static Time b= new Time ();
	static Time c= new Time (555550000);
	public static void main(String[] args) {
		b.setTime(b.ms);
		c.setTime(c.ms);
		System.out.println(a.getH()+":"+a.getM()+":"+a.getS());
		System.out.println(b.getH()+":"+b.getM()+":"+b.getS());
		System.out.println(c.getH()+":"+c.getM()+":"+c.getS());
		
	}

}
