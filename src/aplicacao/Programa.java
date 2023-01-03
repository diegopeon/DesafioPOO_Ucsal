package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entidades.Acessorio;
import model.entidades.RoupaPMG;
import model.entidades.RoupaTamanhoUnico;

public class Programa {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Object[] itens = new Object[5];

		itens[0] = new RoupaPMG("Camisa", 10, 15, 20, 5, 40);
		itens[1] = new RoupaPMG("Saia", 10, 15, 20, 5, 30);
		itens[2] = new Acessorio("Cinto", 20, 5, 30);
		itens[3] = new Acessorio("Pulseira", 10, 5, 20);
		itens[4] = new RoupaTamanhoUnico("Saída de praia", 30, 10, 40);
		
		try {
			int numero = 0;
			while (numero != 5) {
				System.out.println("  Selecione os itens: \n" 
									+ "|--------------------| \n"
									+ "| 0 - " +((RoupaPMG) itens[0]).getDescricao() + "         | \n" 
									+ "| 1 - " +((RoupaPMG) itens[1]).getDescricao() + "           | \n" 
									+ "| 2 - " +((Acessorio) itens[2]).getDescricao() + "          | \n"
									+ "| 3 - " +((Acessorio) itens[3]).getDescricao() + "       | \n" 
									+ "| 4 - " +((RoupaTamanhoUnico) itens[4]).getDescricao() + " | \n"
									+ "| 5 - Sair do Sistema| \n"
									+ "|--------------------| \n");
				numero = scan.nextInt();
				if (numero > 5) {
					System.out.println("Seleção inválida: selecione os itens de 0 a 5 " + "\n");
				}
				switch (numero) {
				case 0:
					System.out.print("Quantidade de camisa P: " + ((RoupaPMG) itens[0]).getQuantidadeP() + "\n"
							+ "Quantidade de camisa M: " + ((RoupaPMG) itens[0]).getQuantidadeM() + "\n"
							+ "Quantidade de camisa G: " + ((RoupaPMG) itens[0]).getQuantidadeG());
					System.out.println();
					((RoupaPMG) itens[0]).venda();
					((RoupaPMG) itens[0]).reposicaoDeEstoque();
					break;
				case 1:
					System.out.print("Quantidade de Saia P: " + ((RoupaPMG) itens[1]).getQuantidadeP() + "\n" 
							+ "Quantidade de saia M: " + ((RoupaPMG) itens[1]).getQuantidadeM() + "\n" 
							+ "Quantidade de saia G: " +((RoupaPMG) itens[1]).getQuantidadeG());
					System.out.println();
					((RoupaPMG) itens[1]).venda();
					((RoupaPMG) itens[1]).reposicaoDeEstoque();
					break;
				case 2:
					System.out.print("Quantidade de cinto: " + ((Acessorio) itens[2]).getQuantidade());
					System.out.println();
					((Acessorio) itens[2]).venda();
					((Acessorio) itens[2]).reposicaoEstoque();
					break;
				case 3:
					System.out.print("Quantidade de pulseiras: " + ((Acessorio) itens[3]).getQuantidade());
					System.out.println();
					((Acessorio) itens[3]).venda();
					((Acessorio) itens[3]).reposicaoEstoque();
					break;
				case 4:
					System.out.print("Quantidade de Roupas de praia: " + ((RoupaTamanhoUnico) itens[4]).getQuantidade());
					System.out.println();
					((RoupaTamanhoUnico) itens[4]).venda();
					((RoupaTamanhoUnico) itens[4]).reposicaoEstoque();
					break;
				case 5:
					System.out.println("Sistema finalizado");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro: Seleção inválida");
		}
	}
}