package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(�F - 32)x5/9 =�C
		double fator= 5.0/9.0;
		double f=65.58;
		double calculadora=(f-32)*fator;
		System.out.println(calculadora+"�C");
		f=100.0;
		calculadora=(f-32)*fator;
		System.out.println(calculadora + "�C");
	}
}