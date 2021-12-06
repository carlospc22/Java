package controle;

import java.util.Scanner;

public class DesWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = ""; 
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Informe a saida");
			valor = entrada.next();
		}
		entrada.close();
	}
}
