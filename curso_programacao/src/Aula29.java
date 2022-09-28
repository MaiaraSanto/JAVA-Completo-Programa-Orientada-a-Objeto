import java.util.Iterator;
import java.util.Scanner;

public class Aula29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int  x,n, soma;
		soma =0;
		
		System.out.println("Quantos números você quer digitar?");
		n = input.nextInt();
		System.out.println("digite o número");
		x =input.nextInt();
		
		for (int i = 0; i <n ; i++) {
		
			soma = soma + x;
				
		}
		
		System.out.println(soma);
		
		input.close();

	}

}
