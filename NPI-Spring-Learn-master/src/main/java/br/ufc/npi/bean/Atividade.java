package br.ufc.npi.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_atividade")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_progressao", referencedColumnName = "id_progressao")	
	private Progressao progressao;
	
	@ManyToOne
	@JoinColumn(name = "id_item_unidade", referencedColumnName = "id_item_unidade")
	private Item_Unidade item_unidade;	
    
	@Enumerated(EnumType.STRING)
	private Preenchimento preenchimento;
	
	private String comprovante;
	private String descricao;
	private int realizado;
	private Date data_inicio;
	private Date data_fim;
	private int pontos;
	private Boolean finalizado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Progressao getProgressao() {
		return progressao;
	}
	public void setProgressao(Progressao progressao) {
		this.progressao = progressao;
	}
	public Preenchimento getPreenchimento() {
		return preenchimento;
	}
	public void setPreenchimento(Preenchimento preenchimento) {
		this.preenchimento = preenchimento;
	}
	public String getComprovante() {
		return comprovante;
	}
	public void setComprovante(String comprovante) {
		this.comprovante = comprovante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getRealizado() {
		return realizado;
	}
	public void setRealizado(int realizado) {
		this.realizado = realizado;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Item_Unidade getItem_unidade() {
		return item_unidade;
	}
	public void setItem_unidade(Item_Unidade item_unidade) {
		this.item_unidade = item_unidade;
	}
	
	
		
	
	


}
