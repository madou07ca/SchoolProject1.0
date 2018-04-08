/**
 * 
 */
package partieConsole;

import java.sql.Date;

/**
 * @author Mamadou bobo
 *
 */
public abstract class Individu {
	private int idIndividu;
	private String nomIndividu;
	private String prenomIndividu;
	private String genreIndividu;
	private Date dateNaissIndividu;
	private String LieuNaissIndividu;
	private String niveauIndividu;
	private String domEtudeIndividu;
	private String profilIndividu;
	private String domCompetenceIndividu;
	private String langMaternelleIndividu;
	private String langParleIndividu;
	private String numTel;
	private String mail;
	private String adresseIndividu;
	/*private String photoIndividu;
	private String rectoPIDIndividu;
	private String versoPIDIndividu;*/
	
	//Contructeur par defaut
	public Individu() {
		
	}
	public Individu(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu,
			Date dateNaissIndividu, String lieuNaissIndividu, String niveauIndividu, String domEtudeIndividu,
			String profilIndividu, String domCompetenceIndividu, String langMaternelleIndividu,
			String langParleIndividu, String numTel, String mail, String adresseIndividu) {
		super();
		this.idIndividu = idIndividu;
		this.nomIndividu = nomIndividu;
		this.prenomIndividu = prenomIndividu;
		this.genreIndividu = genreIndividu;
		this.dateNaissIndividu = dateNaissIndividu;
		this.LieuNaissIndividu = lieuNaissIndividu;
		this.niveauIndividu = niveauIndividu;
		this.domEtudeIndividu = domEtudeIndividu;
		this.profilIndividu = profilIndividu;
		this.domCompetenceIndividu = domCompetenceIndividu;
		this.langMaternelleIndividu = langMaternelleIndividu;
		this.langParleIndividu = langParleIndividu;
		this.numTel = numTel;
		this.mail = mail;
		this.adresseIndividu = adresseIndividu;
	}
	public int getIdIndividu() {
		return idIndividu;
	}
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
	public String getNomIndividu() {
		return nomIndividu;
	}
	public void setNomIndividu(String nomIndividu) {
		this.nomIndividu = nomIndividu;
	}
	public String getPrenomIndividu() {
		return prenomIndividu;
	}
	public void setPrenomIndividu(String prenomIndividu) {
		this.prenomIndividu = prenomIndividu;
	}
	public String getGenreIndividu() {
		return genreIndividu;
	}
	public void setGenreIndividu(String genreIndividu) {
		this.genreIndividu = genreIndividu;
	}
	public Date getDateNaissIndividu() {
		return dateNaissIndividu;
	}
	public void setDateNaissIndividu(Date dateNaissIndividu) {
		this.dateNaissIndividu = dateNaissIndividu;
	}
	public String getLieuNaissIndividu() {
		return LieuNaissIndividu;
	}
	public void setLieuNaissIndividu(String lieuNaissIndividu) {
		LieuNaissIndividu = lieuNaissIndividu;
	}
	public String getNiveauIndividu() {
		return niveauIndividu;
	}
	public void setNiveauIndividu(String niveauIndividu) {
		this.niveauIndividu = niveauIndividu;
	}
	public String getDomEtudeIndividu() {
		return domEtudeIndividu;
	}
	public void setDomEtudeIndividu(String domEtudeIndividu) {
		this.domEtudeIndividu = domEtudeIndividu;
	}
	public String getProfilIndividu() {
		return profilIndividu;
	}
	public void setProfilIndividu(String profilIndividu) {
		this.profilIndividu = profilIndividu;
	}
	public String getDomCompetenceIndividu() {
		return domCompetenceIndividu;
	}
	public void setDomCompetenceIndividu(String domCompetenceIndividu) {
		this.domCompetenceIndividu = domCompetenceIndividu;
	}
	public String getLangMaternelleIndividu() {
		return langMaternelleIndividu;
	}
	public void setLangMaternelleIndividu(String langMaternelleIndividu) {
		this.langMaternelleIndividu = langMaternelleIndividu;
	}
	public String getLangParleIndividu() {
		return langParleIndividu;
	}
	public void setLangParleIndividu(String langParleIndividu) {
		this.langParleIndividu = langParleIndividu;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresseIndividu() {
		return adresseIndividu;
	}
	public void setAdresseIndividu(String adresseIndividu) {
		this.adresseIndividu = adresseIndividu;
	}
	@Override
	public String toString() {
		return "Individu [idIndividu=" + idIndividu + ", nomIndividu=" + nomIndividu + ", prenomIndividu="
				+ prenomIndividu + ", genreIndividu=" + genreIndividu + ", dateNaissIndividu=" + dateNaissIndividu
				+ ", LieuNaissIndividu=" + LieuNaissIndividu + ", niveauIndividu=" + niveauIndividu
				+ ", domEtudeIndividu=" + domEtudeIndividu + ", profilIndividu=" + profilIndividu
				+ ", domCompetenceIndividu=" + domCompetenceIndividu + ", langMaternelleIndividu="
				+ langMaternelleIndividu + ", langParleIndividu=" + langParleIndividu + ", numTel=" + numTel + ", mail="
				+ mail + ", adresseIndividu=" + adresseIndividu + "]";
	}
	
	
	
	
	
}