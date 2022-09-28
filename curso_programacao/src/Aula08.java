import java.util.Scanner;

public class Aula08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		double horas, valor, salario;
		
		System.out.println("digite o número do funcionário");
		n = input.nextInt();
		System.out.println("digitr as horas trabalhadas deste Funcionário");
		horas = input.nextDouble();
		System.out.println("Digite o valor das horas trabalhadas do funcionário");
		valor = input.nextDouble();
		
		salario = horas * valor;
		
		System.out.printf(" O número do Funcionário é :" + n + "\n");
		System.out.println("O salário do funcionário é :" + salario);

	}

}
