package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
			boolean trabalhot = false;
			boolean trabalhoq = false;
			
			if(trabalhot && trabalhoq) {
				System.out.println("Compramos a TV de 55 polegadas 4K");
				System.out.println("Tomamos sorvete");
			}
			
			else if(trabalhot || trabalhoq) {
				System.out.println("Compramos a TV de 32 polegadas 4K");
				System.out.println("Tomamos sorvete");
			}
			
			else if (!(trabalhot && trabalhoq)) {
				System.out.println("Fome");
			}
	}
}
