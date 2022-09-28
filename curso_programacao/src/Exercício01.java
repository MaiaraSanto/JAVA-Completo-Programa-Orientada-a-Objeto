import java.util.Locale;

public class Exercício01 {

	public static void main(String[] args) {
		
		int x;
		int a,c;
		double resultado;
		double y;
		double b,B, h, area;
		x = 5;
		y =2 * x;
		b=6.0;
		B=8.0;
		h = 5.0;
		a =5;
		c=2;
		
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.1f%n",y);
		
		area = (b+B) / 2.0 * h;
		
		System.out.println(area);
		
		resultado = (double) a /c;
		System.out.println(resultado);		

	}
}
