package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num = 10000;
		System.out.println(num.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		System.out.println((""+num2).length());
	}
}
