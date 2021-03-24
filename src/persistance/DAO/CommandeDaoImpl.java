package persistance.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.entities.Commande;
import persistance.entities.CommandeId;

public class CommandeDaoImpl implements CommandeDAO {

	@Override
	public void add(Commande commande) {
		// TODO Auto-generated method stub
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction tx = session.beginTransaction();
			session.save(commande);
			tx.commit();
		}
	}

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		List<Commande> listCommandes = new ArrayList<Commande>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			listCommandes = session.createQuery("from Commande").list();
		}
		return listCommandes;

	}

	@Override
	public void delete(Commande commande) {
		// TODO Auto-generated method stub
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction tx = session.beginTransaction();
			session.delete(commande);
			tx.commit();
		}
	}

	@Override
	public void update(Commande commande) {
		// TODO Auto-generated method stub
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction tx = session.beginTransaction();
			session.update(commande);
			tx.commit();
		}
	}

	@Override
	public Commande findById(CommandeId c) {
		// TODO Auto-generated method stub
		Commande commande = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			commande = session.get(Commande.class, c);
		}
		return commande;

	}

}
