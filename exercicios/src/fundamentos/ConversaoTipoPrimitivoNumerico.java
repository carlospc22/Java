package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a =1;
		System.out.println(a);
		float b = (float) 1.2345678888;
		System.out.println(b);
		
		int c = 4;
		byte d= (byte) c;
		System.out.println(d);
		
		double e = 4.99999;
		int f = (int) e;
		System.out.println(e);
		System.out.println(f);
	}
}
