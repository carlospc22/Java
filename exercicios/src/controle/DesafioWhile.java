package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas=0;
		double nota=0;
		double total=0;
		
		while (nota != -1) {
			System.out.print("Insira a nota: ");
			nota=entrada.nextDouble();
			if (nota>=0 && nota<=10) {
				total+= nota;
				quantidadeDeNotas++;
			}else {
				System.out.println("Insira uma nota valida");
			}
		
		double media = total/quantidadeDeNotas;
		System.out.println("M�dia = "+ media);
		}

		entrada.close();
	}
}
