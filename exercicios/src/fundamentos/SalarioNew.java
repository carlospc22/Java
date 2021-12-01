package fundamentos;

import javax.swing.JOptionPane;

public class SalarioNew {
	public static void main(String[] args) {
		String salario1 = JOptionPane.showInputDialog(
				"Digite o primeiro salario: ");
		String salario2 = JOptionPane.showInputDialog(
				"Digite o segundo salario: ");
		String salario3 = JOptionPane.showInputDialog(
				"Digite o terceiro salario: ");
		
		salario1 = salario1.replaceAll(",", ".");
		salario2 = salario2.replaceAll(",", ".");
		salario3 = salario3.replaceAll(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double soma = sal1+sal2+sal3;
		
		System.out.println("O Primeiro salario é " + salario1);
		System.out.println("O Segundo salario é " + salario2);
		System.out.println("O Terceiro salario é " + salario3);
		
		System.out.println("A Soma é "+ soma);
	}
}
