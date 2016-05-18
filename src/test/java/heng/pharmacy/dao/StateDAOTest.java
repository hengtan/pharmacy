package heng.pharmacy.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.State;

public class StateDAOTest {
	@Test
	@Ignore
	public void save() {
		State state = new State();
		state.setName("Rio de Janeiro");
		state.setSigla("RJ");

		StateDAO stateDAO = new StateDAO();
		stateDAO.Save(state);
	}

	@Ignore
	@Test
	public void list() {
		StateDAO stateDAO = new StateDAO();
		List<State> result = stateDAO.list();
		System.out.println("Find: " + result.size());
		for (State state : result) {
			System.out.println(state.getSigla() + " - " + state.getName());
		}
	}

	@Test
	@Ignore
	public void search() {
		Long code = 1L;
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(code);
		if (state == null) {
			System.out.println("NULL ");
		} else {
			System.out.println("State: " + state.getSigla());
			System.out.println("Name: " + state.getName());
		}
	}

	@Test
	@Ignore
	public void delete() {
		Long code = 1L;
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(code);
		stateDAO.delete(state);
	}

	@Test
	public void update() {
		Long code = 1L;
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(code);
		state.setName("Rio Grande do Norte");
		state.setSigla("RN");
		stateDAO.update(state);
	}

}