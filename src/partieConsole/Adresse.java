/**
 * 
 */
package partieConsole;

/**
 * @author Mamadou bobo
 *
 */
public class Adresse {
	
	private int idAdresse;
	private Individu individu ;
	private String batAdresse ;
	private int numeroAdresse ;
	private String rueAdresse ;
	private int codePostal ;
	private String ville ;
	private String pays ;
	public Adresse(int idAdresse, Individu individu, String batAdresse, int numeroAdresse, String rueAdresse,
			int codePostal, String ville, String pays) {
		super();
		this.idAdresse = idAdresse;
		this.individu = individu;
		this.batAdresse = batAdresse;
		this.numeroAdresse = numeroAdresse;
		this.rueAdresse = rueAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	public String getBatAdresse() {
		return batAdresse;
	}
	public void setBatAdresse(String batAdresse) {
		this.batAdresse = batAdresse;
	}
	public int getNumeroAdresse() {
		return numeroAdresse;
	}
	public void setNumeroAdresse(int numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}
	public String getRueAdresse() {
		return rueAdresse;
	}
	public void setRueAdresse(String rueAdresse) {
		this.rueAdresse = rueAdresse;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", individu=" + individu + ", batAdresse=" + batAdresse
				+ ", numeroAdresse=" + numeroAdresse + ", rueAdresse=" + rueAdresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", pays=" + pays + "]";
	}
	
	

}
