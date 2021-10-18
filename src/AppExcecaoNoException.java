// Importando a classe Scanner
import java.util.Scanner;

public class AppExcecaoNoException {

	public static void main(String[] args) {

		// Instanciando a classe Scanner para o objeto scan
		Scanner scan = new Scanner(System.in);
		
		// Definindo as variáveis
		int numerador, denominador, resultado, resto;
		
			System.out.println("Informe o numerador da divisão: ");
			numerador = scan.nextInt();
			
			System.out.println("Informe o denominador da divisão: ");
			denominador = scan.nextInt();
			
			resultado = (numerador / denominador);
			resto = numerador % denominador;
			System.out.println("O resultado da operação é " + resultado);
			if(resto != 0) {
				System.out.println("O resto da divisão é: " + resto);
			}
						
			scan.close();
		}

}
