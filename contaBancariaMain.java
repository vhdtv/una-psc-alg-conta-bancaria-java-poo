package contaBancaria;

import java.util.Scanner;

public class contaBancariaMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		contaBancariaPOO contaBancariaPOO = new contaBancariaPOO();
		System.out.println("Digite o seu nome:");
		contaBancariaPOO.setNome(scan.nextLine());
		System.out.println("Digite o numero da sua conta bancária:");
		contaBancariaPOO.setNumeroConta(scan.nextLine());
		System.out.println("Digite o seu saldo inicial da conta:");
		contaBancariaPOO.depositarValor(contaBancariaPOO.setValorDeposito(scan.nextDouble()));
		System.out.println("Conta bancária criada com sucesso!\n--------------------------");
		int opcaoOperacaoBancaria = 5;
		while (opcaoOperacaoBancaria != 4) {
			System.out.printf(
					"\tOperações bancárias\n1- Depositar valor\n2- Sacar valor\n" + "3-Vizualizar saldo\n4-Sair\n");
			opcaoOperacaoBancaria = scan.nextInt();
			switch (opcaoOperacaoBancaria) {
			case 1:
				System.out.println("\tDepósito\nDigite o valor que deseja depositar:");
				contaBancariaPOO.depositarValor(contaBancariaPOO.setValorDeposito(scan.nextDouble()));
				System.out.printf("Depósito de %.2f realizado com sucesso.", contaBancariaPOO.getValorDeposito());
				opcaoOperacaoBancaria = 5;
				break;
			case 2:
				System.out.println("\n\tSaque\nDigite o valor que deseja sacar:");
				contaBancariaPOO.setValorSaque(scan.nextDouble());
				if (contaBancariaPOO.getValorSaque() > contaBancariaPOO.getSaldo())
					System.out.println("Saldo insuficiente para realizar a operação.");
				else if (contaBancariaPOO.getValorSaque() > 5000)
					System.out.println("Valor do saque acima do permitido.");
				else {
					contaBancariaPOO.sacarValor(contaBancariaPOO.setValorSaque(scan.nextDouble()));
					System.out.printf("Saque de %.2f realizado com sucesso.", contaBancariaPOO.getValorSaque());
				}
				opcaoOperacaoBancaria = 5;
				break;
			case 3:
				System.out.println("Saldo:" + contaBancariaPOO.getSaldo());
				opcaoOperacaoBancaria = 5;
				break;
			case 4:
				System.out.println("Aplicativo finalizado.");
				opcaoOperacaoBancaria = 5;
			}
		}
		scan.close();
	}
}