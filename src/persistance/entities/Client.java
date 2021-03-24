package persistance.entities;
// Generated 24 mars 2021 � 17:53:04 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name = "CLIENT", schema = "SYSTEM")
public class Client implements java.io.Serializable {

	private BigDecimal idclient;
	private Client client;
	private String loginclient;
	private String motpasseclient;
	private String nomclient;
	private String prenomclient;
	private String civiliteclient;
	private Date datenaissanceclient;
	private String numeroadrclient;
	private String rueadrclient;
	private String communeadrclient;
	private String villeadrclient;
	private String cpadrclient;
	private String telclient;
	private String faxclient;
	private String gsmclient;
	private String emailclient;
	private Set<Commande> commandes = new HashSet<Commande>(0);
	

	public Client() {
	}

	public Client(Client client) {
		this.client = client;
	}

	public Client(Client client, String loginclient, String motpasseclient, String nomclient, String prenomclient,
			String civiliteclient, Date datenaissanceclient, String numeroadrclient, String rueadrclient,
			String communeadrclient, String villeadrclient, String cpadrclient, String telclient, String faxclient,
			String gsmclient, String emailclient, Set<Commande> commandes) {
		this.client = client;
		this.loginclient = loginclient;
		this.motpasseclient = motpasseclient;
		this.nomclient = nomclient;
		this.prenomclient = prenomclient;
		this.civiliteclient = civiliteclient;
		this.datenaissanceclient = datenaissanceclient;
		this.numeroadrclient = numeroadrclient;
		this.rueadrclient = rueadrclient;
		this.communeadrclient = communeadrclient;
		this.villeadrclient = villeadrclient;
		this.cpadrclient = cpadrclient;
		this.telclient = telclient;
		this.faxclient = faxclient;
		this.gsmclient = gsmclient;
		this.emailclient = emailclient;
		this.commandes = commandes;
		this.client = client;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "client"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "IDCLIENT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdclient() {
		return this.idclient;
	}

	public void setIdclient(BigDecimal idclient) {
		this.idclient = idclient;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "LOGINCLIENT", length = 254)
	public String getLoginclient() {
		return this.loginclient;
	}

	public void setLoginclient(String loginclient) {
		this.loginclient = loginclient;
	}

	@Column(name = "MOTPASSECLIENT", length = 254)
	public String getMotpasseclient() {
		return this.motpasseclient;
	}

	public void setMotpasseclient(String motpasseclient) {
		this.motpasseclient = motpasseclient;
	}

	@Column(name = "NOMCLIENT", length = 254)
	public String getNomclient() {
		return this.nomclient;
	}

	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}

	@Column(name = "PRENOMCLIENT", length = 254)
	public String getPrenomclient() {
		return this.prenomclient;
	}

	public void setPrenomclient(String prenomclient) {
		this.prenomclient = prenomclient;
	}

	@Column(name = "CIVILITECLIENT", length = 254)
	public String getCiviliteclient() {
		return this.civiliteclient;
	}

	public void setCiviliteclient(String civiliteclient) {
		this.civiliteclient = civiliteclient;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATENAISSANCECLIENT", length = 7)
	public Date getDatenaissanceclient() {
		return this.datenaissanceclient;
	}

	public void setDatenaissanceclient(Date datenaissanceclient) {
		this.datenaissanceclient = datenaissanceclient;
	}

	@Column(name = "NUMEROADRCLIENT", length = 254)
	public String getNumeroadrclient() {
		return this.numeroadrclient;
	}

	public void setNumeroadrclient(String numeroadrclient) {
		this.numeroadrclient = numeroadrclient;
	}

	@Column(name = "RUEADRCLIENT", length = 254)
	public String getRueadrclient() {
		return this.rueadrclient;
	}

	public void setRueadrclient(String rueadrclient) {
		this.rueadrclient = rueadrclient;
	}

	@Column(name = "COMMUNEADRCLIENT", length = 254)
	public String getCommuneadrclient() {
		return this.communeadrclient;
	}

	public void setCommuneadrclient(String communeadrclient) {
		this.communeadrclient = communeadrclient;
	}

	@Column(name = "VILLEADRCLIENT", length = 254)
	public String getVilleadrclient() {
		return this.villeadrclient;
	}

	public void setVilleadrclient(String villeadrclient) {
		this.villeadrclient = villeadrclient;
	}

	@Column(name = "CPADRCLIENT", length = 254)
	public String getCpadrclient() {
		return this.cpadrclient;
	}

	public void setCpadrclient(String cpadrclient) {
		this.cpadrclient = cpadrclient;
	}

	@Column(name = "TELCLIENT", length = 20)
	public String getTelclient() {
		return this.telclient;
	}

	public void setTelclient(String telclient) {
		this.telclient = telclient;
	}

	@Column(name = "FAXCLIENT", length = 254)
	public String getFaxclient() {
		return this.faxclient;
	}

	public void setFaxclient(String faxclient) {
		this.faxclient = faxclient;
	}

	@Column(name = "GSMCLIENT", length = 254)
	public String getGsmclient() {
		return this.gsmclient;
	}

	public void setGsmclient(String gsmclient) {
		this.gsmclient = gsmclient;
	}

	@Column(name = "EMAILCLIENT", length = 254)
	public String getEmailclient() {
		return this.emailclient;
	}

	public void setEmailclient(String emailclient) {
		this.emailclient = emailclient;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}


}
