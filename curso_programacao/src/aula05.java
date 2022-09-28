import java.util.Scanner;

public class aula05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1,n2,soma;
		
		System.out.println("Digite o primeiro valor");
		n1 = input.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = input.nextInt();
		
		
		soma = n1 + n2;
		
		System.out.printf( "o valor da some é :" + soma);
		
		input.close();
	}

}
