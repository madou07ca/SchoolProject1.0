/**
 * 
 */
package partieConsole;

import java.util.List;

/**
 * @author Mamadou bobo
 *
 */
public class suiviPedagogique {
	
	private int idSuivi;
	private Etudiant etudiant;
	private Inscription inscription;
	private List<Session> listSession;
	private List <Matiere> listmatiereValide;
	private List <Etudiant> listAbsence;
	public suiviPedagogique(int idSuivi, Etudiant etudiant, Inscription inscription, List<Session> listSession,
			List<Matiere> listmatiereValide, List<Etudiant> listAbsence) {
		super();
		this.idSuivi = idSuivi;
		this.etudiant = etudiant;
		this.inscription = inscription;
		this.listSession = listSession;
		this.listmatiereValide = listmatiereValide;
		this.listAbsence = listAbsence;
	}
	public int getIdSuivi() {
		return idSuivi;
	}
	public void setIdSuivi(int idSuivi) {
		this.idSuivi = idSuivi;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Inscription getInscription() {
		return inscription;
	}
	public void setInscription(Inscription inscription) {
		this.inscription = inscription;
	}
	public List<Session> getListSession() {
		return listSession;
	}
	public void setListSession(List<Session> listSession) {
		this.listSession = listSession;
	}
	public List<Matiere> getListmatiereValide() {
		return listmatiereValide;
	}
	public void setListmatiereValide(List<Matiere> listmatiereValide) {
		this.listmatiereValide = listmatiereValide;
	}
	public List<Etudiant> getListAbsence() {
		return listAbsence;
	}
	public void setListAbsence(List<Etudiant> listAbsence) {
		this.listAbsence = listAbsence;
	}
	@Override
	public String toString() {
		return "suiviPedagogique [idSuivi=" + idSuivi + ", etudiant=" + etudiant + ", inscription=" + inscription
				+ ", listSession=" + listSession + ", listmatiereValide=" + listmatiereValide + ", listAbsence="
				+ listAbsence + "]";
	}
	
	
	

}
