import java.util.Scanner;

public class Aula25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int idade = input.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = input.nextInt();
			
		
			
			if (cont >= 0) {
				double media = (double) soma /cont;
				System.out.printf("%.2f%n", media);
			}
			
			else {
				System.out.println("Impossível calcular");
				
			}
			
		}
		
		
		input.close();

	}

}
