package br.ufc.npi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comissao")
public class Comissao {
	
	//https://www.thoughts-on-java.org/many-relationships-additional-proper
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comissao")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_membro", insertable = false, updatable = false)
	private Servidor membro;
    
	@ManyToOne
	@JoinColumn(name = "id_progressao", insertable = false, updatable = false)
    private Progressao progressao;
    
    @ManyToOne
	@JoinColumn(name = "id_secretaria", referencedColumnName = "id_servidor")
    private Servidor secretaria;
    
    private Boolean presidente;
    
    
   ////////////////////////////////////////////////////////////////

	public Progressao getProgressao() {
		return progressao;
	}

	public void setProgressao(Progressao progressao) {
		this.progressao = progressao;
	}

	public Servidor getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Servidor secretaria) {
		this.secretaria = secretaria;
	}

	public Boolean getPresidente() {
		return presidente;
	}

	public void setPresidente(Boolean presidente) {
		this.presidente = presidente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servidor getMembro() {
		return membro;
	}

	public void setMembro(Servidor membro) {
		this.membro = membro;
	}
	
    
    
}
