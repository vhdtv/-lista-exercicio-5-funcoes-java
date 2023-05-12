package ListaExercicios5;
import java.util.Scanner;
public class PorcentagemAcrescida {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do produto que deseja acrescentar 10% do valor.");
		double valorDoProduto = scan.nextDouble();
		scan.close();
		AcrescentaPorcentagemNoValorFinal(valorDoProduto);
	}
	public static void AcrescentaPorcentagemNoValorFinal(double valorDoProduto) {
		double valorFinal = (valorDoProduto * 0.1) + valorDoProduto;
		System.out.println("Valor final do produto: "+valorFinal);
	}
}