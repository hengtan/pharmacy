package heng.pharmacy.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.Manufacturer;

public class ManufactureDAOTest {

	@Test
	@Ignore
	public void save() {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setDescription("Aché");

		ManufacturerDAO manufactureDAO = new ManufacturerDAO();
		manufactureDAO.save(manufacturer);
	}

	@Test
	@Ignore
	public void listar() {
		ManufacturerDAO manufactureDAO = new ManufacturerDAO();
		List<Manufacturer> result = manufactureDAO.list();

		System.out.println("Total de Registros Encontrados: " + result.size());

		for (Manufacturer manufacturer : result) {
			System.out.println(manufacturer.getCode() + " - " + manufacturer.getDescription());
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 3L;
		
		ManufacturerDAO manufacturerDao = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDao.search(codigo);
		
		if(manufacturer == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(manufacturer.getCode() + " - " + manufacturer.getDescription());
		}
	}

	@Test
	public void merge() {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setDescription("Company Eurofarma");

		ManufacturerDAO manufactureDAO = new ManufacturerDAO();
		manufactureDAO.merge(manufacturer);
	}
}
