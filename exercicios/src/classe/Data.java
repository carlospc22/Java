package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		String dias = Integer.toString(dia);
		String meses = Integer.toString(mes);
		String anos = Integer.toString(ano);
		return dias+"/"+meses+"/"+anos;
	}
}
