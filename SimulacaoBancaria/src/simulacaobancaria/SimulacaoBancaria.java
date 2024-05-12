package simulacaobancaria;

import java.util.Scanner;

public class SimulacaoBancaria {
	static double saldo = 0.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean finalizar = false;
		int opcaoDeFinalizacao;
		int opcaoDeOperacao;
		
		System.out.println("OLÁ SEJA BEM VINDO AO NOSSO BANCO");
		System.out.println("POR FAVOR ESCOLHA UMA DAS OPÇÕES:\n");
		
		while(finalizar == false) {
			
			System.out.println("1 - DEPOSITAR");
			System.out.println("2 - SACAR");
			System.out.println("3 - CONSULTAR SALDO");
			System.out.println("4 - ENCERRAR");
			
			opcaoDeOperacao = scanner.nextInt();
			switch(opcaoDeOperacao) {
				case 1:{
					depositar();
					break;
				}
				case 2:{
					sacar();
					break;
				}
				case 3:{
					consultarSaldo();
					break;
				}
				case 4:{
					System.out.println("FINALIZANDO A SECÇÃO...");
					System.out.println("OBRIGADO E VOLTE SEMPRE!");
					System.exit(0);
					break;
				}
				default:
					System.out.println("OPÇÃO INVALIDA.");
					break;
			}
			
			
			
			
			System.out.println("DESEJA REALIZAR OUTRA OPERAÇÃO ?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			opcaoDeFinalizacao = scanner.nextInt();
			if(opcaoDeFinalizacao == 2) {
				finalizar = true;
				System.out.println("FINALIZANDO A SECÇÃO...");
				System.out.println("OBRIGADO E VOLTE SEMPRE!");
				System.exit(0);
			}
			
			
			//finalizar = opcao == 1 ? false : true;
			
		}
		

	}
	
	 public static void depositar(){
		 
		 double deposito;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("INFORME O VALOR PARA DEPOSITO RS: ");
		 deposito = scanner.nextDouble();
		 saldo = saldo + deposito;
		 System.out.println("SUCESSO!!! R$: "+deposito);
		 System.out.println("SALDO ATUAL DE R$: "+saldo);   
	 }
	 
	 public static void sacar(){
		 
		 double saque;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("INFORME O VALOR PARA SAQUE RS: ");
		 saque = scanner.nextDouble();
		 
		 if(saque > saldo) {
			 System.out.println("LIMITE INSUFICIENTE.");
			 System.out.println("SEU SALDO ATUAL É DE R$ " + saldo);
			 
		 }
		 else {
			 saldo = saldo - saque;
			 System.out.println("SALDO ATUAL DE R$: "+saldo);
		 }
		 
	      
	 }
	 
	 public static void consultarSaldo(){
		 
		
		 System.out.println("SEU SALDO ATUAL É DE R$: "+saldo);   
	 }

}
