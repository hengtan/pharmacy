package heng.pharmacy.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.Client;
import heng.pharmacy.domain.Person;

public class ClientDAOTest {
	@Test
	@Ignore
	public void save() throws ParseException {
		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.search(1L);				

		Client client = new Client();
		client.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2015"));
		client.setLiberado(false);
		client.setPerson(person);

		ClientDAO clientDAO = new ClientDAO();
		clientDAO.save(client);

		System.out.println("The client has been save");
	}
}
