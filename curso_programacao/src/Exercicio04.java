import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double largura, comprimento,MetroQuadrado;
		double Area, preco;
		
		System.out.println("Digite a largura");
		largura =input.nextDouble();

		System.out.println("Digite o comprimento");
		 comprimento =input.nextDouble();

		System.out.println("Digite o metro quadrado");
		MetroQuadrado =input.nextDouble();
		
		Area = largura * comprimento;
		preco = Area * MetroQuadrado;
		
		System.out.printf("A área do terreno é " + Area + "\n" );

		System.out.printf("O  preço do terreno é " + preco + "\n" );
		
		input.next();
		
		

	}

}
