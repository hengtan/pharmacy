package heng.pharmacy.dao;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.Person;
import heng.pharmacy.domain.User;

public class UserDAOTest {

	@Test
	
	public void save() {

		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.search(1L);

		System.out.println("Find Person");
		System.out.println("Name: " + person.getName());
		System.out.println("CPF: " + person.getCpf());

		User user = new User();
		user.setActive(true);
		user.setPerson(person);
		user.setPassword("q1w2e3r4");
		user.setType('A');

		UserDAO userDAO = new UserDAO();
		userDAO.save(user);

		System.out.println("The user has been save.");

	}
}
