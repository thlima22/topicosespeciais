package fvs.edu.br.topicos.domain;

import javax.persistence.Entity;

import fvs.edu.br.topicos.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numerosDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido,Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numerosDeParcelas = numeroDeParcelas;
	
	}

	public Integer getNumerosDeParcelas() {
		return numerosDeParcelas;
	}

	public void setNumerosDeParcelas(Integer numerosDeParcelas) {
		this.numerosDeParcelas = numerosDeParcelas;
	}
	
	
}
