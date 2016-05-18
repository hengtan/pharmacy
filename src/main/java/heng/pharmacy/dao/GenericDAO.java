package heng.pharmacy.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import heng.pharmacy.util.HibernateUtil;

public class GenericDAO<Entity> {

	// REFLACTION
	private Class<Entity> _class;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this._class = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

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

	@SuppressWarnings("unchecked")
	public List<Entity> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria consult = session.createCriteria(_class);
			List<Entity> result = consult.list();
			return result;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public Entity search(Long code) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria consult = session.createCriteria(_class);
			consult.add(Restrictions.idEq(code));
			Entity result = (Entity) consult.uniqueResult();
			return result;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public void delete(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(entity);
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

	public void update(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(entity);
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
