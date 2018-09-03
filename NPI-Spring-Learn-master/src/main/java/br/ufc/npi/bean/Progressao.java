package br.ufc.npi.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "progressao")
public class Progressao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_progressao")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_servidor", referencedColumnName = "id_servidor")	
	private Servidor servidor;	
	
	@ManyToOne
	@JoinColumn(name = "id_unidade", referencedColumnName = "id_unidade")
	private Unidade unidade;
	
	@OneToMany(mappedBy = "progressao", cascade={CascadeType.ALL})
	private List<Atividade> atividades;
	
	@OneToMany(mappedBy = "progressao", cascade={CascadeType.ALL})
	private List<Comissao> comissoes;
	
	@OneToMany(mappedBy = "progressao", cascade={CascadeType.ALL})
	private List<Historico> historicos;
	
	@Enumerated(EnumType.STRING)
	private Denominacao denominacao;
	
	private Date inicio_interticio;
	private Date fim_interticio;
	
	
	///////////////////////////////////////////////////////////////
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Servidor getServidor() {
		return servidor;
	}
	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public Denominacao getDenominacao() {
		return denominacao;
	}
	public void setDenominacao(Denominacao denominacao) {
		this.denominacao = denominacao;
	}
	public Date getInicio_interticio() {
		return inicio_interticio;
	}
	public void setInicio_interticio(Date inicio_interticio) {
		this.inicio_interticio = inicio_interticio;
	}
	public Date getFim_interticio() {
		return fim_interticio;
	}
	public void setFim_interticio(Date fim_interticio) {
		this.fim_interticio = fim_interticio;
	}
	
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	public List<Comissao> getComissoes() {
		return comissoes;
	}
	public void setComissoes(List<Comissao> comissoes) {
		this.comissoes = comissoes;
	}
	public List<Historico> getHistoricos() {
		return historicos;
	}
	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}
	
	
	
	

}
