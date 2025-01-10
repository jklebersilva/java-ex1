package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String produto1 = "Computador";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf(" Products%n %s, which price is $ %.2f%n Office desk, which price is $ %.2f%n", product1,price1,price2);
		System.out.printf(" Produtos%n %s, que custa R$ %.2f%n Mesa de escritório que custa R$ %.2f%n",produto1,price1,price2);
		System.out.printf("%n Record: %d years old, code %d and gender: %c",age,code,gender);
		System.out.printf("%n Recorde: %d anos de idade, código %d e sexo: %c%n",age,code,gender);
		System.out.printf("%n Measue with eigth decimal places: %.8f",measure);
		System.out.printf("%n Medida com oito casas decimais: %.8f",measure);
		System.out.printf("%n Rouded (three decimal places): %.3f",measure);
		System.out.printf("%n Arredondado (três casas decimais): %.3f",measure);
		Locale.setDefault(Locale.US);
	    System.out.printf("%n US decimal point: %.3f",measure);
	    System.out.printf("%n Ponto Decimal dos EUA: %.3f",measure);
	}

}
