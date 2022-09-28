import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x= 10.35784;
		double renda = 400.00;
		String nome = "Maria";
		
		System.out.println("Hello World!!");
		System.out.println("Boa tarde!");
		System.out.println(y);
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.1f%n", x);
		System.out.println("resultado = " +x+ " metros");
		System.out.printf("resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e recebe %.2f reais", nome, y, renda);
		
	}

}
