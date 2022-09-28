import java.util.Scanner;

public class aula06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		System.out.println("digite o valor do raio");
		raio = input.nextDouble();
		
		area = raio * raio * pi;
		
		System.out.println("O valor da área é :" + area);
		
		input.close();
	}

}
