package exercicios;

public class CalculadoraSalario {

	public static void main(String[] args) {
		double salario = 10.599;
		double desconto;		
		double salarioNovo;
				
		if (salario <= 1.751) {
			desconto = salario * 0.08; 
			salarioNovo = salario - desconto;			
			System.out.println("Seu sal�rio com desconto de 8% ser�: " + salarioNovo);
			
		} else if (salario > 1.751 && salario < 2.920 ) {
			desconto = salario * 0.09;
			salarioNovo = salario - desconto;
			System.out.println("Seu sal�rio com desconto de 9% ser�: " + salarioNovo);
			
		} else if (salario > 2.921 && salario < 5.839) {
			desconto = salario * 0.10;
			salarioNovo = salario - desconto;
			System.out.println("Seu sal�rio com desconto de 9% ser�: " + salarioNovo);
			
		} else if (salario > 5.840) {
			desconto = salario * 0.11;
			salarioNovo = salario - desconto;
			System.out.println("Seu sal�rio com desconto de 9% ser�: " + salarioNovo);
		}

	}

}
