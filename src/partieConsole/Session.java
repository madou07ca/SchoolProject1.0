/**
 * 
 */
package partieConsole;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @author Mamadou bobo
 *
 */
public class Session {
	private int idSession;
	private int anneeSession;
	private String nomSession;
	private Date dateDebutSession;
	private Date dateFinSession;
	public Session(int idSession, int anneeSession, String nomSession, Date dateDebutSession, Date dateFinSession) {
		super();
		this.idSession = idSession;
		this.anneeSession = anneeSession;
		this.nomSession = nomSession;
		this.dateDebutSession = dateDebutSession;
		this.dateFinSession = dateFinSession;
	}
	public Session() {
		// TODO Auto-generated constructor stub
	}
	public Session(int id, int anne, String text, LocalDate value, LocalDate value2) {
		// TODO Auto-generated constructor stub
	}
	public int getIdSession() {
		return idSession;
	}
	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}
	public int getAnneeSession() {
		return anneeSession;
	}
	public void setAnneeSession(int anneeSession) {
		this.anneeSession = anneeSession;
	}
	public String getNomSession() {
		return nomSession;
	}
	public void setNomSession(String nomSession) {
		this.nomSession = nomSession;
	}
	public Date getDateDebutSession() {
		return dateDebutSession;
	}
	public void setDateDebutSession(Date dateDebutSession) {
		this.dateDebutSession = dateDebutSession;
	}
	public Date getDateFinSession() {
		return dateFinSession;
	}
	public void setDateFinSession(Date dateFinSession) {
		this.dateFinSession = dateFinSession;
	}
	@Override
	public String toString() {
		return "Session [idSession=" + idSession + ", anneeSession=" + anneeSession + ", nomSession=" + nomSession
				+ ", dateDebutSession=" + dateDebutSession + ", dateFinSession=" + dateFinSession + "]";
	}
	
	

}
