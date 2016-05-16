package heng.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class State extends GenericDomain {

	@Column(length = 2, nullable = false)
	private String sigla;

	@Column(length = 50, nullable = false)
	private String name;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
