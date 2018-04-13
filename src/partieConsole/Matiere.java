/**
 * 
 */
package partieConsole;

/**
 * @author DIALLO Thierno Souleymane
 *
 */
public class Matiere {
	private int idMatiere;
	private String nomMatiere;
	private String libelleMatiere;
	private String langLibelleMatiere;
	private String nivMatiere;
	private String nbreHeures;
	private Module module;
	public Matiere(int idMatiere, String nomMatiere, String libelleMatiere, String langLibelleMatiere,
			String nivMatiere, String nbreHeures, Module module) {
		super();
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
		this.libelleMatiere = libelleMatiere;
		this.langLibelleMatiere = langLibelleMatiere;
		this.nivMatiere = nivMatiere;
		this.nbreHeures = nbreHeures;
		this.module = module;
	}
	public Matiere(int idMatiere, String nomMatiere, String libelleMatiere, String langLibelleMatiere,
			String nivMatiere, String nbreHeures) {
		super();
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
		this.libelleMatiere = libelleMatiere;
		this.langLibelleMatiere = langLibelleMatiere;
		this.nivMatiere = nivMatiere;
		this.nbreHeures = nbreHeures;
		
	}
	public Matiere() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	public String getLibelleMatiere() {
		return libelleMatiere;
	}
	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}
	public String getLangLibelleMatiere() {
		return langLibelleMatiere;
	}
	public void setLangLibelleMatiere(String langLibelleMatiere) {
		this.langLibelleMatiere = langLibelleMatiere;
	}
	public String getNivMatiere() {
		return nivMatiere;
	}
	public void setNivMatiere(String nivMatiere) {
		this.nivMatiere = nivMatiere;
	}
	public String getNbreHeures() {
		return nbreHeures;
	}
	public void setNbreHeures(String nbreHeures) {
		this.nbreHeures = nbreHeures;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", nomMatiere=" + nomMatiere + ", libelleMatiere=" + libelleMatiere
				+ ", langLibelleMatiere=" + langLibelleMatiere + ", nivMatiere=" + nivMatiere + ", nbreHeures="
				+ nbreHeures + ", module=" + module + "]";
	}

	
	

}
