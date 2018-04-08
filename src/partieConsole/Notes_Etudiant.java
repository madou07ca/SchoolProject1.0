package partieConsole;

public class Notes_Etudiant {
	private Etudiant etudiant;
	private Matiere matiere;
	private double note;
	public Notes_Etudiant(Etudiant etudiant, Matiere matiere, double note) {
		super();
		this.etudiant = etudiant;
		this.matiere = matiere;
		this.note = note;
	}
	public Notes_Etudiant() {
		// TODO Auto-generated constructor stub
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	
	

}
