package partieConsole;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Groupe {
	private int idGroupe;
	private String nomGroupe;
	private Date dateExamen;
	private Salle salle;
	private Session session;
	private Module module;
	private Horaire horaire;
	private List<Etudiant> listEtudiant;
	public Groupe(int idGroupe, String nomGroupe, Date dateExamen, Salle salle, Session session, Module module,
			Horaire horaire, List<Etudiant> listEtudiant) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.dateExamen = dateExamen;
		this.salle = salle;
		this.session = session;
		this.module = module;
		this.horaire = horaire;
		this.listEtudiant = listEtudiant;
	}
	public Groupe() {
		// TODO Auto-generated constructor stub
	}
	public Groupe(int id, String text, LocalDate value) {
		// TODO Auto-generated constructor stub
	}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Date getDateExamen() {
		return dateExamen;
	}
	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	@Override
	public String toString() {
		return "Groupe [idGroupe=" + idGroupe + ", nomGroupe=" + nomGroupe + ", dateExamen=" + dateExamen + ", salle="
				+ salle + ", session=" + session + ", module=" + module + ", horaire=" + horaire + ", listEtudiant="
				+ listEtudiant + "]";
	}

	
	
	

}
