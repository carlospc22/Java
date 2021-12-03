package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		int a = (int) Math.pow(6*(3+2),2);
		a = a/(3*2);

		int b = (int) Math.pow((((1-5)*(2-7))/2), 2);

		int c =(int) Math.pow((a-b), 3);

		c = c/1000;
		System.out.println(c);
				
	}
}
