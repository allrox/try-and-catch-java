// Importando a classe Scanner
import java.util.Scanner;

public class AppExcecaoNoException {

	public static void main(String[] args) {

		// Instanciando a classe Scanner para o objeto scan
		Scanner scan = new Scanner(System.in);
		
		// Definindo as vari�veis
		int numerador, denominador, resultado, resto;
		
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
						
			scan.close();
		}

}
