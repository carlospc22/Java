package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpres =28;
		short numerosDeVoos=542;
		int id =56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario =11_445.44F;
		double vendasAcumulados = 2_991_797_103.01;
		
		// Tipos booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		//char status = '\u0010';
		char status= 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpres*365);
		
		// Número de viagens
		System.out.println(numerosDeVoos/2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados/vendasAcumulados);
		
		System.out.println(id+":ganha ->"+ salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: "+status);
		
	}
}
