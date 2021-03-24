package persistance.DAO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.entities.Client;
import persistance.entities.Commande;
import persistance.entities.CommandeId;

public class DAOCommande implements CommandeDAO {

	@Override
	public void add(Commande command) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(command);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Commande command) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction(); 
		s.delete(command);
		tx.commit();
		s.close();
		
	}

	@Override
	public void update(Commande command) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction(); 
		s.update(command);
		tx.commit();
		s.close();
	}

	@Override
	public List<Commande> findAll() {
		List<Commande> listeCommande = new ArrayList<Commande>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		listeCommande = s.createQuery("from Commande").list();
		s.close();
		return listeCommande;
	}

	@Override
	public Commande findById(CommandeId commande) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Commande cmd = s.get(Commande.class, commande);
		s.close();
		return cmd;
	}

}