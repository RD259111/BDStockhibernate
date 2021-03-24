package persistance.DAO;

import java.util.List;

import persistance.entities.Client;

public interface ClientDAO {

	void add(Client client);

	List<Client> findAll();

	void delete(Client client);

	void update(Client client);

	Client findById(int idclient);

}
