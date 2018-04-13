/**
 * 
 */
package partieConsole;

import java.util.Date;

/**
 * @author Mamadou bobo
 *
 */
public class Inscription {
	//private static int compteur=0;
	private int idInscription;
	private Date dateInscription;
	private Etudiant etudiant;
	private Groupe groupe;
	private Paiement paiement;
	private Session session;
	/*public Inscription( Date dateInscription, int etudiant, int groupe, int paiement,
			int session) {
		super();
		compteur++;
		this.idInscription = compteur;
		this.dateInscription = dateInscription;
		this.etudiant = etudiant;
		this.groupe = groupe;
		this.paiement = paiement;
		this.session = session;
	}
   */
	public Inscription(int idInscription, Date dateInscription, int etudiant, int groupe, int paiement,
			int session) {
		super();
		this.idInscription = idInscription;
		this.dateInscription = dateInscription;
		/*this.etudiant = etudiant;
		this.groupe = groupe;
		this.paiement = paiement;
		this.session = session;*/
	}
	public Inscription() {
		// TODO Auto-generated constructor stub
	}
	/*public static int getCompteur() {
		return compteur;
	}
	public static void setCompteur(int compteur) {
		Inscription.compteur = compteur;
	}*/
	public int getIdInscription() {
		return idInscription;
	}
	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public Paiement getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Inscription [idInscription=" + idInscription + ", dateInscription=" + dateInscription + ", etudiant="
				+ etudiant + ", groupe=" + groupe + ", paiement=" + paiement + ", session=" + session + "]";
	}
	
	
	
	
	

}
