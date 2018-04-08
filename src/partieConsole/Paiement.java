/**
 * 
 */
package partieConsole;

import java.io.File;
import java.util.Date;

/**
 * @author Mamadou bobo
 *
 */
public class Paiement {
	private int idpaiement;
	private double tarifs;
	private Inscription inscription;
	private Etudiant etudiant;
	private double montTotalHT;
	private double montTotalTTC;
	private double restantdu;
	private Date dateEch1;
	private Date dateEch2;
	private Date dateEch3;
	private File recuEch1;
	private File recuEch2;
	private File recuEch3;
	private String commentaire;
	public Paiement(int idpaiement, double tarifs, Inscription inscription, Etudiant etudiant, double montTotalHT,
			double montTotalTTC, double restantdu, Date dateEch1, Date dateEch2, Date dateEch3, File recuEch1,
			File recuEch2, File recuEch3, String commentaire) {
		super();
		this.idpaiement = idpaiement;
		this.tarifs = tarifs;
		this.inscription = inscription;
		this.etudiant = etudiant;
		this.montTotalHT = montTotalHT;
		this.montTotalTTC = montTotalTTC;
		this.restantdu = restantdu;
		this.dateEch1 = dateEch1;
		this.dateEch2 = dateEch2;
		this.dateEch3 = dateEch3;
		this.recuEch1 = recuEch1;
		this.recuEch2 = recuEch2;
		this.recuEch3 = recuEch3;
		this.commentaire = commentaire;
	}
	public Paiement() {
		// TODO Auto-generated constructor stub
	}
	public int getIdpaiement() {
		return idpaiement;
	}
	public void setIdpaiement(int idpaiement) {
		this.idpaiement = idpaiement;
	}
	public double getTarifs() {
		return tarifs;
	}
	public void setTarifs(double tarifs) {
		this.tarifs = tarifs;
	}
	public Inscription getInscription() {
		return inscription;
	}
	public void setInscription(Inscription inscription) {
		this.inscription = inscription;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public double getMontTotalHT() {
		return montTotalHT;
	}
	public void setMontTotalHT(double montTotalHT) {
		this.montTotalHT = montTotalHT;
	}
	public double getMontTotalTTC() {
		return montTotalTTC;
	}
	public void setMontTotalTTC(double montTotalTTC) {
		this.montTotalTTC = montTotalTTC;
	}
	public double getRestantdu() {
		return restantdu;
	}
	public void setRestantdu(double restantdu) {
		this.restantdu = restantdu;
	}
	public Date getDateEch1() {
		return dateEch1;
	}
	public void setDateEch1(Date dateEch1) {
		this.dateEch1 = dateEch1;
	}
	public Date getDateEch2() {
		return dateEch2;
	}
	public void setDateEch2(Date dateEch2) {
		this.dateEch2 = dateEch2;
	}
	public Date getDateEch3() {
		return dateEch3;
	}
	public void setDateEch3(Date dateEch3) {
		this.dateEch3 = dateEch3;
	}
	public File getRecuEch1() {
		return recuEch1;
	}
	public void setRecuEch1(File recuEch1) {
		this.recuEch1 = recuEch1;
	}
	public File getRecuEch2() {
		return recuEch2;
	}
	public void setRecuEch2(File recuEch2) {
		this.recuEch2 = recuEch2;
	}
	public File getRecuEch3() {
		return recuEch3;
	}
	public void setRecuEch3(File recuEch3) {
		this.recuEch3 = recuEch3;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	@Override
	public String toString() {
		return "Paiement [idpaiement=" + idpaiement + ", tarifs=" + tarifs + ", inscription=" + inscription
				+ ", etudiant=" + etudiant + ", montTotalHT=" + montTotalHT + ", montTotalTTC=" + montTotalTTC
				+ ", restantdu=" + restantdu + ", dateEch1=" + dateEch1 + ", dateEch2=" + dateEch2 + ", dateEch3="
				+ dateEch3 + ", recuEch1=" + recuEch1 + ", re�uEch2=" + recuEch2 + ", re�uEch3=" + recuEch3
				+ ", commentaire=" + commentaire + "]";
	}
	
	
	
	

}
