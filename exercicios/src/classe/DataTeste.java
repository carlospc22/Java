package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1= new Data(14,11,1995);
		

		
		Data d2 = new Data();
		d2.dia=9;
		d2.mes=6;
		d2.ano=1991;
		
//		C�digo comentado para uma vers�o aprimorada
//		System.out.printf("No dia %d/%d/%d e no dia %d/%d/%d \nduas almas gemeas nasceram", 
//				d1.dia, d1.mes, d1.ano ,d2.dia, d2.mes, d2.ano);
		System.out.printf("No dia %s e no dia %s \nduas almas gemeas nasceram", d1.dataFormatada(),d2.dataFormatada());
	}
}
