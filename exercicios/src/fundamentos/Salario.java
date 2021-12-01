package fundamentos;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String salario1 = entrada.next();
		String salario2 = entrada.next();
		String salario3 = entrada.next();
		
		salario1 = salario1.replaceAll(",",".");
		salario2 = salario2.replaceAll(",",".");
		salario3 = salario3.replaceAll(",",".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double soma = sal1+sal2+sal3;
		
		System.out.println("O Primeiro salario é " + salario1);
		System.out.println("O Segundo salario é " + salario2);
		System.out.println("O Terceiro salario é " + salario3);
		
		System.out.println("A Soma é "+ soma);
		entrada.close();
	}
}
