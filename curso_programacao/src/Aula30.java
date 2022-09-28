import java.util.Scanner;

public class Aula30 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N, x;
		
		System.out.println("Digite um número");
		N =input.nextInt();
		
		for (int i =1 ; i <=10 ; i++) {
			
			x = i * N;
			System.out.println(i + " x " + N + " = " + x);
		}

	}

}
