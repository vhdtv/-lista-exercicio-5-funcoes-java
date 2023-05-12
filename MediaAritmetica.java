package ListaExercicios5;
import java.util.Scanner;
public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor dos dois números que deseja obter a média:");
		float numero1 = scan.nextFloat();
		float numero2 = scan.nextFloat();
		scan.close();
		CalculaMediaAritmetica(numero1, numero2);
	}
	public static void CalculaMediaAritmetica(float numero1, float numero2) {
		float resultado = (numero1 + numero2)/2;
		System.out.println("O resultado da média é: "+resultado);
	}
}
