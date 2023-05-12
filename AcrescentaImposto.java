package ListaExercicios5;
import java.util.Scanner;
public class AcrescentaImposto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o custo do produto.");
		double custo = scan.nextDouble();
		System.out.println("Agora digite em porcentagem a taxa de imposto.");
		double taxaImposto = scan.nextDouble();
		scan.close();
		double custoFinal = somaImposto(taxaImposto,custo);
		System.out.printf("O custo final do produto com acrescimo de %.2f"
				+ "sobre o produto é: %.2f", taxaImposto, custoFinal);
	}
	public static double somaImposto(double taxaImpostoFuncao, double custoFuncao) {
		double custoFinalFuncao = custoFuncao + (custoFuncao * taxaImpostoFuncao);
		return custoFinalFuncao;
	}
}
