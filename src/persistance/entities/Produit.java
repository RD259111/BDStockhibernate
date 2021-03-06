package persistance.entities;
// Generated 24 mars 2021 ? 17:53:04 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Produit generated by hbm2java
 */
@Entity
@Table(name = "PRODUIT", schema = "SYSTEM")
public class Produit implements java.io.Serializable {

	private BigDecimal idproduit;
	private BigDecimal idcategorie;
	private String designproduit;
	private String puproduit;
	private BigDecimal qteproduit;
	private String configproduit;
	private String marqueproduit;
	private String modeleproduit;
	private Set<Commande> commandes = new HashSet<Commande>(0);
	private Categorie categorie;

	public Produit() {
	}

	public Produit(BigDecimal idproduit) {
		this.idproduit = idproduit;
	}

	public Produit(BigDecimal idproduit, BigDecimal idcategorie, String designproduit, String puproduit,
			BigDecimal qteproduit, String configproduit, String marqueproduit, String modeleproduit,
			Set<Commande> commandes, Categorie categorie) {
		this.idproduit = idproduit;
		this.idcategorie = idcategorie;
		this.designproduit = designproduit;
		this.puproduit = puproduit;
		this.qteproduit = qteproduit;
		this.configproduit = configproduit;
		this.marqueproduit = marqueproduit;
		this.modeleproduit = modeleproduit;
		this.commandes = commandes;
		this.categorie = categorie;
	}

	@Id

	@Column(name = "IDPRODUIT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdproduit() {
		return this.idproduit;
	}

	public void setIdproduit(BigDecimal idproduit) {
		this.idproduit = idproduit;
	}

	@Column(name = "IDCATEGORIE", precision = 22, scale = 0)
	public BigDecimal getIdcategorie() {
		return this.idcategorie;
	}

	public void setIdcategorie(BigDecimal idcategorie) {
		this.idcategorie = idcategorie;
	}

	@Column(name = "DESIGNPRODUIT", length = 254)
	public String getDesignproduit() {
		return this.designproduit;
	}

	public void setDesignproduit(String designproduit) {
		this.designproduit = designproduit;
	}

	@Column(name = "PUPRODUIT", length = 254)
	public String getPuproduit() {
		return this.puproduit;
	}

	public void setPuproduit(String puproduit) {
		this.puproduit = puproduit;
	}

	@Column(name = "QTEPRODUIT", precision = 22, scale = 0)
	public BigDecimal getQteproduit() {
		return this.qteproduit;
	}

	public void setQteproduit(BigDecimal qteproduit) {
		this.qteproduit = qteproduit;
	}

	@Column(name = "CONFIGPRODUIT", length = 254)
	public String getConfigproduit() {
		return this.configproduit;
	}

	public void setConfigproduit(String configproduit) {
		this.configproduit = configproduit;
	}

	@Column(name = "MARQUEPRODUIT", length = 254)
	public String getMarqueproduit() {
		return this.marqueproduit;
	}

	public void setMarqueproduit(String marqueproduit) {
		this.marqueproduit = marqueproduit;
	}

	@Column(name = "MODELEPRODUIT", length = 254)
	public String getModeleproduit() {
		return this.modeleproduit;
	}

	public void setModeleproduit(String modeleproduit) {
		this.modeleproduit = modeleproduit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "produit")
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
