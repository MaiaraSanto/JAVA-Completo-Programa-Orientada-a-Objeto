import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A,B,C,D, dif;
		
		System.out.println("Digite o valor da primeira letra");
		A = input.nextInt();
		System.out.println("Digite o valor da primeira letra");
		B = input.nextInt();
		System.out.println("Digite o valor da primeira letra");
		C = input.nextInt();
		System.out.println("Digite o valor da primeira letra");
		D = input.nextInt();
		
		dif = A*B - C*D;
		
		System.out.println(" A diferença é :" + dif);
		
		input.close();
		
	}

}
