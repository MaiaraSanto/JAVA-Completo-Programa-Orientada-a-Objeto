import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cod1, cod2, n1,n2;
		double valor1,valor2, preco;
		
		System.out.println("Digite o primeiro código");
		cod1 = input.nextInt();

		System.out.println("Digite o primeiro número");
		n1 = input.nextInt();

		System.out.println("Digite o primeiro valor");
		valor1 = input.nextDouble();

		System.out.println("Digite o segundo código");
		cod2 = input.nextInt();
		
		System.out.println("Digite o segundo número");
		n2 = input.nextInt();
		
		System.out.println("Digite o segundo valor");
		valor2 = input.nextDouble();
		
		
		
		
		preco =   n1 * valor1 +    valor2 * n2 ;
		
		System.out.printf(" o valor a pagar é :" + preco);
		
		input.close();
		
		
	}

}
