package ListaExercicios5;
import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor em Fahrenheit que deseja converter para Celsius.");
		double valorEmFahrenheit = scan.nextDouble();
		scan.close();
		ConverteDeFahrenheitParaCelsius(valorEmFahrenheit);
	}
	public static void ConverteDeFahrenheitParaCelsius(double valorEmFahrenheit) {
		double valorEmCelsius = (valorEmFahrenheit - 32) / 1.8;
		System.out.println("Valor em Celsius: "+valorEmCelsius);
	}
}
