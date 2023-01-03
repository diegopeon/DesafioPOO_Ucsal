package model.entidades;

import java.util.Scanner;

import model.interfaces.Item;

public class RoupaPMG implements Item {

	String descricao;
	int quantidadeP;
	int quantidadeM;
	int quantidadeG;
	int estoqueMinimo, estoqueMaximo;

	public RoupaPMG() {
	}

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public int getQuantidadeP() {
		return quantidadeP;
	}

	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}

	public int getQuantidadeM() {
		return quantidadeM;
	}

	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}

	public int getQuantidadeG() {
		return quantidadeG;
	}

	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void venda() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Selecione o tamanho (p, m ou g): ");
		char tamanho = scan.next().charAt(0);
		if (tamanho != 'p' && tamanho != 'm' && tamanho != 'g') {
			System.out.println();
			System.out.println("Erro: Selecione um tamanho válido (p, m ou g).");
			System.out.println();
		} else {

			switch (tamanho) {
			case 'p':
				this.quantidadeP -= 1;
				break;
			case 'm':
				this.quantidadeM -= 1;
				break;
			case 'g':
				this.quantidadeG -= 1;
				break;
			}
			System.out.println();
		}
	}

	public void reposicaoDeEstoque() {
		if (this.quantidadeP < this.estoqueMinimo) {
			this.quantidadeP = this.estoqueMaximo;
		} else if (this.quantidadeM < this.estoqueMinimo) {
			this.quantidadeM = this.estoqueMaximo;
		} else if (this.quantidadeG < this.estoqueMinimo) {
			this.quantidadeG = this.estoqueMaximo;
		}
	}

}
