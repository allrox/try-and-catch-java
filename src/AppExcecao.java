// Importando a classe Scanner
import java.util.Scanner;

public class AppExcecao {

	public static void main(String[] args) {

		// Instanciando a classe Scanner para o objeto scan
		Scanner scan = new Scanner(System.in);
		
		// Definindo as vari�veis
		int numerador, denominador, resultado, resto;
		
		/**
		 * Iniciando o tratamento de exce��es com o bloco try and catch
		 * Em 'Try' a aplica��o executa as instru��es que poder�o eventualmente retornar erro
		 */
		try {
			System.out.println("Informe o numerador da divis�o: ");
			numerador = scan.nextInt();
			
			System.out.println("Informe o denominador da divis�o: ");
			denominador = scan.nextInt();
			
			resultado = (numerador / denominador);
			resto = numerador % denominador;
			System.out.println("O resultado da opera��o � " + resultado);
			if(resto != 0) {
				System.out.println("O resto da divis�o �: " + resto);
			}
			
		/**
		 * Em 'Catch' � realizado o tratamento das exce��e que, quando geradas, 
		 * s�o lan�adas na hierarquia do fluxo at� que seja capturada por alguma das exce��es 
		 */
			
		// Exce��o lan�ada quando h� uma condi��o de viola��o aritm�tica
		} catch ( ArithmeticException excecao ) {
			System.out.println("Exce��o gerada: " + excecao.getMessage());
			System.out.println("Ocorreu uma exce��o aritm�tica resultante de divis�o por zero.");
			System.out.println("O denominador n�o pode ser igual a zero.");
		
		// Exce��o lan�ada quando h� uma condi��o por convers�o de String em tipos num�ricos
		} catch ( NumberFormatException excecao ) {
			System.out.println("*** Exce��o gerada: " + excecao.getMessage() + " ***");
			System.out.println("Ocorreu uma exce��o de convers�o de dados.");
			System.out.println("Os valores informados precisam ser inteiros.");
			
		// Ra�z das classes origin�rias da classe 'Throwable'
		// Captura as exce��es abaixo na hierarquia
		} catch ( Exception excecao ) {
			System.out.println("*** Ocorreu uma exce��o. ***");
			
		// O bloco 'finally' sempre � executado finalizando a sequ�ncia, 
		// independente do surgimento de erros no sistema
		} finally {
			System.out.println("\nAplica��o finalizada.");
			
			scan.close();
		}
		
	}

}
