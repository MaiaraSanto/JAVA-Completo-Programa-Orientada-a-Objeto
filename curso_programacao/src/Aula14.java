import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um número");
		N= input.nextInt();
		
		if (N %2 ==0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("IMPAR");
		}
		
		input.close();

	}

}
