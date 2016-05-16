package heng.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class City extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String nome;

	@ManyToOne
	@JoinColumn(nullable = false)
	private State state;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
