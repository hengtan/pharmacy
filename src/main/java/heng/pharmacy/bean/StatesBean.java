package heng.pharmacy.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import heng.pharmacy.domain.State;

@ManagedBean
@ViewScoped
public class StatesBean {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void newState() {
		state = new State();
	}

	public void save() {

		Messages.addGlobalInfo(state.getName() + " successfully save!");

	}

}
