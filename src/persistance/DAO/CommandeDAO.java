package persistance.DAO;

import java.util.List;

import persistance.entities.Commande;
import persistance.entities.CommandeId;

public interface CommandeDAO {

	void add(Commande commande);

	List<Commande> findAll();

	void delete(Commande commande);

	void update(Commande commande);

	Commande findById(CommandeId commande);

}
