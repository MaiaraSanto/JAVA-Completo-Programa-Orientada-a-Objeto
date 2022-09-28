import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Aula16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial");
		horaInicial= input.nextInt();

		System.out.println("Digite a hora final");
		horaFinal= input.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao =  horaInicial- horaFinal;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		input.close();
	}
	
}
