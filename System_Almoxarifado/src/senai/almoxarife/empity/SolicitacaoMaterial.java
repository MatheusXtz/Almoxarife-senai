package senai.almoxarife.empity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SolicitacaoMaterial {
	
	@Id
	@GeneratedValue
	private int quantidade;
	
	@OneToOne
	private Solicitacao solicitacao;
	
	@OneToMany
	private Collection<Material> materiais;
	
	public SolicitacaoMaterial() {
		materiais = new ArrayList<Material>();
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	public Collection<Material> getMateriais() {
		return materiais;
	}
	public void setMateriais(Material materiais) {
		this.materiais.add(materiais);
	}
	
	
	
	

}
