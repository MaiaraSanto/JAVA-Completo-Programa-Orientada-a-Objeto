import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double N;
		
		System.out.println("Digite um número");
		N= input.nextDouble();
		
		if (N > 25.0 && N < 100.0 ) {
			System.out.println("Inervalo (25,30]");
		}
		else if (N >0.0 && N < 25.1) {
			System.out.println("Inervalo (0,25]");
		}
		
		else if (N > 90.0 ) {
			System.out.println("Inervalo (75,100]");
		}
		else {
			System.out.println("fora do intervalo");
		}
		
		input.close();
	}

}
