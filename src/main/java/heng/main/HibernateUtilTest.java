package heng.main;

import org.hibernate.Session;

import heng.pharmacy.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
		//Start Session connection
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		//Close Session connection
		HibernateUtil.getSessionFactory().close();
		session.close();
	}
}
