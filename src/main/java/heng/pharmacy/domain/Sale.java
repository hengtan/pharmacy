package heng.pharmacy.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Sale extends GenericDomain {
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date schedule;

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal totalPriece;

	@ManyToOne
	private Client client;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Employee employee;

	public Date getSchedule() {
		return schedule;
	}

	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

	public BigDecimal getTotalPriece() {
		return totalPriece;
	}

	public void setTotalPriece(BigDecimal totalPriece) {
		this.totalPriece = totalPriece;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
