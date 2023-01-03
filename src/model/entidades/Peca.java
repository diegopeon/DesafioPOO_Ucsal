package model.entidades;

public abstract class Peca {
	
	String descricao;
	int quantidade;
	int estoqueMinino;
	int estoqueMaximo;
	
	protected void peca() {	
	}

	protected Peca(String descricao, int quantidade, int estoqueMinino, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinino = estoqueMinino;
		this.estoqueMaximo = estoqueMaximo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinino() {
		return estoqueMinino;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}


	public abstract void venda();
	
	public void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinino) {
			this.quantidade = this.estoqueMaximo;
		}
	}

}
