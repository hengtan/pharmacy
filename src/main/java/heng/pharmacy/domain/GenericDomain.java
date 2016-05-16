package heng.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//CLASS DON'T CREATE TABLE, BUT IT WILL USED
//TO CREATED TABLE's
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable {
	// PRIMARY KEY
	@Id
	// GENERATED AUTO VALUE
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long code;

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

}
