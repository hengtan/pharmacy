package heng.pharmacy.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import heng.pharmacy.dao.StateDAO;
import heng.pharmacy.domain.State;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class StatesBean implements Serializable {
	private State state;
	private List<State> states;

	public List<State> getStates() {
		return states;
	}

	public void setEstados(List<State> states) {
		this.states = states;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@PostConstruct
	public void listStates() {
		try {
			StateDAO stateDAO = new StateDAO();
			states = stateDAO.list();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar os estados");
			erro.printStackTrace();
		}
	}

	public void newState() {
		state = new State();
	}

	public void save() {
		try {
			StateDAO stateDAO = new StateDAO();
			stateDAO.save(state);
			Messages.addGlobalInfo(state.getName() + " successfully save!");
			newState();
		} catch (RuntimeException e) {
			Messages.addGlobalError("Can not save the state, try again");
			e.printStackTrace();
		}
	}

	public void delete(ActionEvent event) {
		state = (State) event.getComponent().getAttributes().get("selectedState");
		Messages.addGlobalInfo(state.getName() + " successfully delete!");
	}

}
