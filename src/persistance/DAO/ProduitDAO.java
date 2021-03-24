package persistance.DAO;

import java.util.List;

import persistance.entities.Produit;

public interface ProduitDAO {

	void add(Produit produit);

	List<Produit> findAll();

	void delete(Produit produit);

	void update(Produit produit);

	Produit findById(int idproduit);

}
