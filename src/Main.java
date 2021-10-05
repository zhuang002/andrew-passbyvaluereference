import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		String b = new String("100");
		Integer c = 200;
		int[] d = {2,3,4};
		
		ArrayList<Integer> e = new ArrayList<>();
		e.add(a);
		
		method(a, b, c, d, e);
		
		System.out.println(a+","+b+","+c+","+d[0]+","+e);
	}

	private static void method(int p1, String p2, Integer p3, int[] p4, ArrayList p5) {
		// TODO Auto-generated method stub
		p1 = 500;
		
		p3 = 300;
		p4[0] = 200;
		
		p5 = new ArrayList();
		p5.add(500);
	}

}
