package model.entidades;

import java.util.Scanner;

import model.interfaces.Item;

public class Acessorio extends Peca implements Item {

	public Acessorio(String descricao, int quantidade, int estoqueMinino, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinino, estoqueMaximo);
	}

	@Override
	public final void venda() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
			System.out.print("Quantidade a ser vendida: ");
			
			int quantidadeVendida = scan.nextInt();
			if(quantidadeVendida > this.quantidade) {
				System.out.println();
				System.out.println("Erro: Quantidade acima do limite do estoque");
				System.out.println();
			} else {
			this.quantidade -= quantidadeVendida;
		}
	}

	@Override
	public final void reposicaoEstoque(){
		if(this.quantidade < this.estoqueMinino) {
			this.quantidade = this.estoqueMaximo;
		}
	}

}
