package fvs.edu.br.topicos.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class produto {

	private Integer id;
	private String nome;
	private Double preco;
	
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA", joinColumns = @Joincolumn(name = "produto_id"),
	inverseJoincolumns = @JoinColumn(name = "categoria_id");
	
	
	List<Categoria> categorias = new ArrayList<>();
	
}
