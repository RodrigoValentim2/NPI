package br.ufc.npi.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidade")
public class Unidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_unidade")
	private int id;
	
	@OneToMany(mappedBy = "unidade", cascade={CascadeType.ALL})
	private List<Item> itens;
	
	@OneToMany(mappedBy = "unidade", cascade={CascadeType.ALL})
	private List<Item_Unidade> itens_Unidades;
	
	@OneToMany(mappedBy = "unidade", cascade={CascadeType.ALL})
	private List<Progressao> progressoes; 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Item_Unidade> getItem_Unidade() {
		return itens_Unidades;
	}

	public void setItem_Unidade(List<Item_Unidade> item_Unidade) {
		this.itens_Unidades = item_Unidade;
	}

	public List<Progressao> getProgressoes() {
		return progressoes;
	}

	public void setProgressoes(List<Progressao> progressoes) {
		this.progressoes = progressoes;
	}
	
	

}
