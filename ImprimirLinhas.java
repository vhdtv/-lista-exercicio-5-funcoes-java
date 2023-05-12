package ListaExercicios5;
import java.util.Scanner;
public class ImprimirLinhas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de números que você deseja que apareça na tela:");
		int numero = scan.nextInt();
		scan.close();
		exibeNumerosNaTela(numero);
	}
	public static void exibeNumerosNaTela(int numero) {
		for(int i = 1; i<=numero; i++) {
			int contador =1;
	        while (true) {
	        	System.out.print(i +" ");
	        	if (contador == i) {
	        		break;
	        }
	        contador++;
	        }
	        System.out.println();
		}
		
	}
}
