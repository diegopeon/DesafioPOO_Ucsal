package model.entidades;

import model.interfaces.Item;

public class RoupaTamanhoUnico extends Peca implements Item {

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinino, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinino, estoqueMaximo);
	}

	@Override
	public final void venda() {
	this.quantidade -= 1;
		
	}
	@Override
	public final void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinino) {
			this.quantidade = this.estoqueMaximo;
		}
	}
	

}
