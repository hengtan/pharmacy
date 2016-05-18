package heng.pharmacy.dao;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

import heng.pharmacy.domain.Manufacturer;
import heng.pharmacy.domain.Product;

public class ProductDAOTest {
	@Test
	@Ignore
	public void save() {

		ManufacturerDAO manufacturerDao = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDao.search(new Long("1"));

		Product product = new Product();
		product.setDescription("Cataflan 50mg com 20 Comprimidos");
		product.setManufacturer(manufacturer);
		product.setPriece(new BigDecimal("13.70"));
		product.setQuantity(new Short("7"));

		ProductDAO produtoDAO = new ProductDAO();
		produtoDAO.save(product);

		System.out.println("Produto salvo com sucesso");
	}
}
