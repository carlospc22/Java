package JavaTuto;

public class LearnJava {
	public static void main(String[] args) {
	
		String exclamacao = addExclamation("Henderson");
		System.out.println(exclamacao);
		Animal conta = new Animal();
		conta.contar();
	}
	
	public static String addExclamation(String s) {
		return s+"!";
	}
}
