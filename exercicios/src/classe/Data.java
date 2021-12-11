package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	
	Data(){
		dia = 1;
		mes=1;
		ano=1970;
	}
	Data(int dia1, int mes1, int ano1){
		dia=dia1;
		mes=mes1;
		ano=ano1;
		
	}
	
	String dataFormatada() {
//		String dias = Integer.toString(dia);
//		String meses = Integer.toString(mes);
//		String anos = Integer.toString(ano);
//		return dias+"/"+meses+"/"+anos;
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
