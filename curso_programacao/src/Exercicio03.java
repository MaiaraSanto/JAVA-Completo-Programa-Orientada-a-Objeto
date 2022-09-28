import java.util.regex.Matcher;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = 5.0;
		double A,B,C;
		
		A= Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("Raiz Quadrada de " + x + " = " + A);
		System.out.println("Raiz Quadrada de " + y + " = " + B);
		System.out.println("Raiz Quadrada de " + z + " = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(y, z);
		C = Math.pow(z, y);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(y + " elevado a " + z + " = " + B);
		System.out.println(z +  " elevado a" + y + " = " + C);
		
		A = Math.abs(x);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + x + " = " + A);
		System.out.println("Valor absoluto de " + y + " = " + B);
		System.out.println("Valor absoluto de " + z + " = " + C);

	}

}
