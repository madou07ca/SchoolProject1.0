package partieConsole;

public class Module {
	private int idModule;
	private String libeleModole;
	public Module(int idModule, String libeleModole) {
		super();
		this.idModule = idModule;
		this.libeleModole = libeleModole;
	}
	public Module() {
		// TODO Auto-generated constructor stub
	}
	public int getIdModule() {
		return idModule;
	}
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	public String getLibeleModole() {
		return libeleModole;
	}
	public void setLibeleModole(String libeleModole) {
		this.libeleModole = libeleModole;
	}
	@Override
	public String toString() {
		return "" + idModule;
	}
	
	

}
