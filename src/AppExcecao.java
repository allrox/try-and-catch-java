// Importando a classe Scanner
import java.util.Scanner;

public class AppExcecao {

	public static void main(String[] args) {

		// Instanciando a classe Scanner para o objeto scan
		Scanner scan = new Scanner(System.in);
		
		// Definindo as variáveis
		int numerador, denominador, resultado, resto;
		
		/**
		 * Iniciando o tratamento de exceções com o bloco try and catch
		 * Em 'Try' a aplicação executa as instruções que poderão eventualmente retornar erro
		 */
		try {
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
			
		/**
		 * Em 'Catch' é realizado o tratamento das exceçõe que, quando geradas, 
		 * são lançadas na hierarquia do fluxo até que seja capturada por alguma das exceções 
		 */
			
		// Exceção lançada quando há uma condição de violação aritmética
		} catch ( ArithmeticException excecao ) {
			System.out.println("Exceção gerada: " + excecao.getMessage());
			System.out.println("Ocorreu uma exceção aritmética resultante de divisão por zero.");
			System.out.println("O denominador não pode ser igual a zero.");
		
		// Exceção lançada quando há uma condição por conversão de String em tipos numéricos
		} catch ( NumberFormatException excecao ) {
			System.out.println("*** Exceção gerada: " + excecao.getMessage() + " ***");
			System.out.println("Ocorreu uma exceção de conversão de dados.");
			System.out.println("Os valores informados precisam ser inteiros.");
			
		// Raíz das classes originárias da classe 'Throwable'
		// Captura as exceções abaixo na hierarquia
		} catch ( Exception excecao ) {
			System.out.println("*** Ocorreu uma exceção. ***");
			
		// O bloco 'finally' sempre é executado finalizando a sequência, 
		// independente do surgimento de erros no sistema
		} finally {
			System.out.println("\nAplicação finalizada.");
			
			scan.close();
		}
		
	}

}
