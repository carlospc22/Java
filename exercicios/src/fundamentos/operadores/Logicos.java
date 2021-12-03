package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3> 7;
		System.out.println(condicao1&&condicao2);// E logico
		System.out.println(condicao1||condicao2);// Ou logico
		System.out.println(condicao1^condicao2);// XOR logico
		System.out.println(!condicao1);
		
		//Tabela verdade E
		System.out.println(true&&true);
		System.out.println(true&&false);
		//System.out.println(false&&true);
		//System.out.println(false&&false);
		//Tabela verdade OU
		//System.out.println(true||true);
		//System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		//Tabela verdade OU Exclusivo (XOR)
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		//Tabela verdade NOT
		System.out.println(!true);
		System.out.println(!false);		
				
	}
}
