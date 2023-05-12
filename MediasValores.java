package ListaExercicios5;
import java.util.Scanner;
public class MediasValores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorA, valorB, valorC;
		System.out.println("Digite o valor dos trés números para calcular suas médias:");
		valorA = scan.nextDouble();
		valorB = scan.nextDouble();
		valorC = scan.nextDouble();
		CalculoMediaAritmetica(valorA, valorB, valorC);
		CalculoMediaHarmônica(valorA, valorB, valorC);
		CalculoMediaGeométrica(valorA, valorB, valorC);
		
		scan.close();
	}
	public static void CalculoMediaAritmetica(double valorA ,double valorB, double valorC) {
		double resultado = (valorA + valorB + valorC) / 3;
		System.out.println("A média aritmetica dos números digitados é: "+ resultado);
	}
	public static void CalculoMediaHarmônica(double valorA ,double valorB, double valorC) {
		double resultado = (3/((1/valorA)+(1/valorB)+(1/valorC)));
		System.out.println("A média harmônica dos números digitados é: "+ resultado);
		
	}
	public static void CalculoMediaGeométrica(double valorA ,double valorB, double valorC) {
		double resultado = Math.cbrt(valorA * valorB * valorC);
		System.out.println("A média geométrica dos números digitados é: "+ resultado);
	
	}
}
