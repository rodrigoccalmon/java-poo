package ex02calculadora;
import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		int resultado;
		int operacao = 0;
		
		System.out.println("===============================");
		System.out.println("Calculadora JAVA");
		System.out.println("===============================");		
		System.out.println("Digite um n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Digite outro n�mero: ");
		n2 = ler.nextInt();
		System.out.println("1 [ + ]");
		System.out.println("2 [ - ]");
		System.out.println("3 [ * ]");
		System.out.println("4 [ / ]");
		System.out.println("Digite o n�mero da opera��o que quer fazer com os n�meros digitados:");
		operacao = ler.nextInt();

		switch (operacao) {
			case 1: 
				resultado = n1 + n2;
				System.out.println("Resultado da soma de " + n1 + " + " + n2 + " = "+resultado);
			break;
			
			case 2:
				resultado = n1 - n2;
				System.out.println("Resultado da subtra��o de " + n1 + " - " + n2 + " = "+resultado);
			break;
			
			case 3: 
				resultado = n1 * n2;
				System.out.println("Resultado da multiplica��o de " + n1 + " * " + n2 + " = "+resultado);
			break;
			
			case 4:
				resultado = n1 / n2;
				System.out.println("Resultado da divis�o de " + n1 + " / " + n2 + " = "+resultado);
			break;
			
						
		}
		
		
		
		
		

	}

}
