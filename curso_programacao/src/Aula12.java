import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N;
		N= 10;
		
		System.out.println("digite o número");
		N = input.nextInt();
		if (N <  10 ) {
			System.out.println("Bom dia");
		}
		else if (N == 10) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		input.close();
	}
		
}
