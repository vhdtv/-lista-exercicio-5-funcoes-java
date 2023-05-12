package ListaExercicios5;
import java.util.Scanner;
public class ReversoNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero que deseja inverter:");
		int numero = scan.nextInt();
		scan.close();
		int reverse = inverteNumero(numero);
		System.out.println(""+reverse);
		
	}
	public static int inverteNumero(int numeroFuncao) {
		String numeroFuncaoString = Integer.toString(numeroFuncao);
		StringBuilder inverteBuilder = new StringBuilder(numeroFuncaoString.length());
		for(int i= numeroFuncaoString.length()-1; i>=0; i--)
			inverteBuilder.append(numeroFuncaoString.charAt(i));
		int reverso = Integer.parseInt(inverteBuilder.toString());
		return reverso;
	}
	
}
