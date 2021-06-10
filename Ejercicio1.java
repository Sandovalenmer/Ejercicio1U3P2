import java.util.*;

public class Ejercicio1{
	public static void main(String[] args){
		int numero, numero1, contador;
		int n =(int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		contador = 1;
		n = 0;


		System.out.println("Ingrese un número del 1 al 100");
		numero1 = scanner.nextInt();
		System.out.println("Números generados basados al ingreso");


		while (contador<=numero1){
			contador++;
			n =(int)(Math.random()*100)+1;
			
			if ( n % 2==0) {
				System.out.println(n+" Es par");
							
			}
			else  {
				System.out.println(n+" Es impar");
			}
			

		}
	}
}