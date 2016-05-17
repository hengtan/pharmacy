package heng.pharmacy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import heng.pharmacy.util.HibernateUtil;

public class GenericDAO<Entity> {
	public void Save(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (RuntimeException erro) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw erro;
		} finally {
			session.close();
		}
	}
}
