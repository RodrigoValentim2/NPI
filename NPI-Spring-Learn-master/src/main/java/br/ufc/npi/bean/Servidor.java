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
@Table(name = "servidor")
public class Servidor {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servidor")
	private int id;
	
	@OneToMany(mappedBy = "servidor", cascade={CascadeType.ALL})
	private List<Progressao> progressoes;
	
	@OneToMany(mappedBy = "membro", cascade={CascadeType.ALL})
	private List<Comissao> participacao_comissoes;
	
	@OneToMany(mappedBy = "secretaria", cascade={CascadeType.ALL})
	private List<Comissao> criacao_comissoes;
	
	
	//////////////////////////////////////////////////////////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Progressao> getProgressoes() {
		return progressoes;
	}

	public void setProgressoes(List<Progressao> progressoes) {
		this.progressoes = progressoes;
	}

	public List<Comissao> getParticipacao_comissoes() {
		return participacao_comissoes;
	}

	public void setParticipacao_comissoes(List<Comissao> participacao_comissoes) {
		this.participacao_comissoes = participacao_comissoes;
	}

	public List<Comissao> getCriacao_comissoes() {
		return criacao_comissoes;
	}

	public void setCriacao_comissoes(List<Comissao> criacao_comissoes) {
		this.criacao_comissoes = criacao_comissoes;
	}
	
	
	
	
	

}
