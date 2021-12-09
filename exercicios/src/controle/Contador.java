package controle;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o número");
		int num = entrada.nextInt();
		
		for(int i=0;i<= num;i++) {
			System.out.println(i);
		}
		entrada.close();
	}
}
