import java.util.Scanner;

public class Aula15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int A,B;
		
		System.out.println("Digite o primeiro número");
		A = input.nextInt();
		System.out.println("Digite o segundo número");
		B = input.nextInt();
		
		if (A % B ==0 || B % A ==0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}
		
		input.close();
	}

}
