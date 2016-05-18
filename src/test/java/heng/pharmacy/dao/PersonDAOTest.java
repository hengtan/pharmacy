package heng.pharmacy.dao;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.City;
import heng.pharmacy.domain.Person;

public class PersonDAOTest {
	
	@Test
	@Ignore
	public void save() {
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(1L);

		Person person = new Person();
		
		person.setName("Joao da Silva");
		person.setEmail("joaodasilva@gmail.com");
		person.setCity(city);
		person.setBairro("Alphaville");
		person.setCellphone("1197747");
		person.setCpf("2121241512441");
		person.setStreet("Rua: Estados Unidos");
		person.setZipcode("123458");
		person.setNumber((short) 2);
		person.setRg("147857");
		person.setComplement("123");
		person.setPhone("12348");

		PersonDAO personDAO = new PersonDAO();
		personDAO.save(person);

	}
}
