package br.ufc.npi.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item_unidade")
public class Item_Unidade {	
	
	//https://www.thoughts-on-java.org/many-relationships-additional-properties/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EmbeddedId
	@Column(name = "id_item_unidade")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_item", insertable = false, updatable = false)
	private Item item;
    
	@ManyToOne
	@JoinColumn(name = "id_unidade", insertable = false, updatable = false)
	private Unidade unidade;	
	
	@OneToMany(mappedBy = "item_unidade", cascade={CascadeType.ALL})
	private List<Atividade> atividades;
	
	private int peso;
	private Boolean classe_d;
	private int limite;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Unidade getUmidade() {
		return unidade;
	}
	public void setUmidade(Unidade umidade) {
		this.unidade = umidade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public Boolean getClasse_d() {
		return classe_d;
	}
	public void setClasse_d(Boolean classe_d) {
		this.classe_d = classe_d;
	}
	
	

}
