package ihm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import persistance.DAO.CommandeDaoImpl;
import persistance.DAO.DAOCategorie;
import persistance.DAO.DAOClient;
import persistance.DAO.DAOCommande;
import persistance.DAO.DAOProduit;
import persistance.entities.Categorie;
import persistance.entities.Client;
import persistance.entities.Commande;
import persistance.entities.CommandeId;
import persistance.entities.Produit;

public class Main {

	public static void main(String[] args) {
		Categorie categorie = new Categorie(new Produit(), "AAA", "BBB");

		Produit produit = new Produit(new BigDecimal(111), new BigDecimal(5.2), "categorie", "eau", new BigDecimal(4),
				"bouteille", "cristaline", "bouteille eau", new HashSet<>(), categorie);

		Client client = new Client(new Client(), null, null, "Nicolas", null, null, null, null, null, null, null, null,
				"00.00.00.00.00", null, null, "test@test.com", new HashSet<>());

		CommandeId cmdId = new CommandeId(produit.getIdproduit(), client.getIdclient(), new BigDecimal(21), new Date(),
				new BigDecimal(23));

		Commande cmd = new Commande(cmdId);

		DAOCategorie daocate = new DAOCategorie();
		daocate.add(categorie);

		DAOProduit daoprod = new DAOProduit();
		daoprod.add(produit);

		DAOClient daocli = new DAOClient();
		daocli.add(client);

		CommandeDaoImpl daocmd = new CommandeDaoImpl();
		daocmd.add(cmd);

		List<Commande> list = daocmd.findAll();
		for (Commande cc : list) {
			CommandeId cid = cc.getId();
			System.out.println("idclient = " + cid.getIdclient() + " idproduit = " + cid.getIdproduit());
		}
	}

}