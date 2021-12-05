package controle;

import javax.swing.JOptionPane;

public class DesafioDia {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog(
				"Diga o dia da semana");
		dia = dia.toLowerCase();
		if(dia.equals("domingo")) {
			System.out.print("1");
		} else if(dia.equals("segunda")) {
			System.out.print("2");
		}else if(dia.equals("terça")) {
			System.out.print("3");
		}else if(dia.equals("quarta")) {
			System.out.print("4");
		}else if(dia.equals("quinta")) {
			System.out.print("5");
		}else if(dia.equals("sexta")) {
			System.out.print("6");
		}else if(dia.equals("sabado")) {
			System.out.print("7");
		}else {
			System.out.println("Dia da Semana inválido");
		}
	}
}
