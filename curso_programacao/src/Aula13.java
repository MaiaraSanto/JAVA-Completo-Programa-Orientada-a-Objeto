import java.util.Scanner;

public class Aula13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N;
		
		System.out.println("Digite um número");
		N= input.nextInt();
		
		if (N < 0) {
			System.out.println("É número negativo");
			
		}
		
		else {
			System.out.println("Número positivo");
		}
		
		input.close();
	}

}
