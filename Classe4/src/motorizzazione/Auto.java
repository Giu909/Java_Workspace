package motorizzazione;

public class Auto {
	private String model;
	private String targa;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public Auto(String model, String targa) {
		super();
		this.model = model;
		this.targa = targa;
	}
	
	@Override
	public String toString() {
		return "Persona [model=" + model + ", targa=" + targa + "]";
	}
}
