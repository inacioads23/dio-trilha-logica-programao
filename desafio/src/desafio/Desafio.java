package desafio;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor do salário: R$ ");
		float valorSalario = ler.nextFloat();
		System.out.print("digite o valor dos benefícios: R$ ");
		float valorBeneficios = ler.nextFloat();
		String perc = null;

		float valorImposto = 0;
		if (valorSalario > 2500.0) {
			valorImposto = 0.15f * valorSalario;
			perc = "15%";
		} else if (valorSalario > 1100.0) {
			valorImposto = 0.1f * valorSalario;
			perc = "10%";
		} else if (valorSalario > 0) {
			valorImposto = 0.05f * valorSalario;
			perc = "5%";
		}else {
			valorImposto = 0;
			perc = "0%";
		}

		float saida = (valorSalario - valorImposto) + valorBeneficios;
		
		System.out.printf("%nSalário bruto R$ %.2f", valorSalario);
		System.out.printf("%nPercentual impostos %s", perc);
		System.out.printf("%nDesconto impostos R$ %.2f", valorImposto);
		System.out.printf("%nSalário pós impostos R$ %.2f", valorSalario - valorImposto);
		System.out.printf("%nValor Benefícios R$ %.2f", valorBeneficios);
		System.out.printf("%nSalário recebido R$ %.2f", saida);
	}

}
