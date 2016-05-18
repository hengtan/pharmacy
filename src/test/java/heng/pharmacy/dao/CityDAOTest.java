package heng.pharmacy.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.City;
import heng.pharmacy.domain.State;

public class CityDAOTest {
	
	@Test
	@Ignore
	public void save() {
		
		Long stateCode = 1L;
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.search(stateCode);

		State state = stateDAO.search(stateCode);

		City city = new City();
		city.setName("Rio de Janeiro");
		city.setState(state);

		CityDAO cityDAO = new CityDAO();
		cityDAO.save(city);
	}

	@Test
	@Ignore
	public void list() {
		CityDAO cityDAO = new CityDAO();
		List<City> result = cityDAO.list();
		System.out.println("Find: " + result.size());
		for (City city : result) {
			System.out.println("City code: " + city.getCode());
			System.out.println("City name: " + city.getName());
			System.out.println("State abreviation: " + city.getState().getSigla());
			System.out.println("State name: " + city.getState().getName());
		}
	}

	@Test
	@Ignore
	public void search() {
		Long code = 1L;
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		if (city == null) {
			System.out.println("NULL ");
		} else {
			System.out.println("City code: " + city.getCode());
			System.out.println("City name: " + city.getName());
			System.out.println("State abreviation: " + city.getState().getSigla());
			System.out.println("State name: " + city.getState().getName());
		}
	}

	@Test
	@Ignore
	public void delete() {
		Long code = 1L;
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		cityDAO.delete(city);
	}

	@Test
	@Ignore
	public void update() {
		Long code = 1L;
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		city.setName("Rio Grande do Norte");
		cityDAO.update(city);
	}
}
