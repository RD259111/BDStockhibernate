package persistance.DAO;

import java.util.List;

import persistance.entities.Categorie;

public interface CategorieDAO {

	void add(Categorie categorie);

	List<Categorie> findAll();

	void delete(Categorie categorie);

	void update(Categorie categorie);

	Categorie findById(int idcateg);

}
