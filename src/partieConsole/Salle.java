/**
 * 
 */
package partieConsole;

/**
 * @author Mamadou bobo
 *
 */
public class Salle {
	private int idSalle;
	private String nomSalle;
	private int capaciteSalle;
	private String disponibiliteSalle;

	public Salle(int idSalle, String nomSalle, int capaciteSalle, String disponibiliteSalle) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
		this.capaciteSalle = capaciteSalle;
		this.disponibiliteSalle = disponibiliteSalle;
	}

	
	public Salle() {
		// TODO Auto-generated constructor stub
	}


	public int getIdSalle() {
		return idSalle;
	}


	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}


	public String getNomSalle() {
		return nomSalle;
	}


	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}


	public int getCapaciteSalle() {
		return capaciteSalle;
	}


	public void setCapaciteSalle(int capaciteSalle) {
		this.capaciteSalle = capaciteSalle;
	}


	public String getDisponibiliteSalle() {
		return disponibiliteSalle;
	}


	public void setDisponibiliteSalle(String disponibiliteSalle) {
		this.disponibiliteSalle = disponibiliteSalle;
	}


	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", capaciteSalle=" + capaciteSalle
				+ ", disponibiliteSalle=" + disponibiliteSalle + "]";
	}
	
	

}
