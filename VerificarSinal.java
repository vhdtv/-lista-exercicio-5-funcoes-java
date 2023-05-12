package ListaExercicios5;
import java.util.Scanner;
public class VerificarSinal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		Double numero = scan.nextDouble();
		scan.close();
		char resultado = verificaNumero(numero);
		System.out.printf("O numero %f é %c.", numero, resultado);
	}
	public static char verificaNumero(Double numero1) {
		if(numero1 >= 1)
			return 'P';
		else
			return 'N';
	}
}
