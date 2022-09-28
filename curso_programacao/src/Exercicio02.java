import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String x; 
		x = input.nextLine();
		int y;
		y = input.nextInt(); 
		double a;
		a = input.nextDouble();
		char e;
		e = input.next().charAt(0);
		
		System.out.println("você digitou o nome " + x);
		System.out.println("você digitou o valor " + y);
		System.out.println("você digitou o valor " + a);
		System.out.println("você digitou a letra " + e);
		
		input.close();
		

	}

}
