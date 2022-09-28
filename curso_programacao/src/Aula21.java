import java.util.Scanner;

public class Aula21 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N;
		
		System.out.println("Insira um número");
		N = input.nextInt();
		
		double desconto = (N < 20) ? N * 0.1 : N * 0.05;
		
		System.out.println("O valor é :" + desconto);

	}

}
