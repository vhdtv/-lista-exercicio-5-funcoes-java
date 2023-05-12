package ListaExercicios5;
import java.util.Scanner;
public class SomaTresArgumentos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do numero 1");
		double numeroUm = scan.nextDouble();
		System.out.println("Digite o valor do numero 2");
		double numeroDois = scan.nextDouble();
		System.out.println("Digite o valor do numero 3");
		double numeroTres = scan.nextDouble();
		somaTresNumeros(numeroUm, numeroDois, numeroTres);
		scan.close();
	}
	public static void somaTresNumeros(double numero1, double numero2, double numero3) {
		System.out.printf("O resultado da soma é:%.2f",numero1 + numero2 + numero3);
	}
}
