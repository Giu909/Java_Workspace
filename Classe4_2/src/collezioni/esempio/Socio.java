package collezioni.esempio;

public class Socio {
	private String CF;
	private String etc;
	
	public Socio(String cF, String etc) {
		super();
		CF = cF;
		this.etc = etc;
	}
	public Socio(Socio o) {
		super();
		CF = o.CF;
		this.etc = o.etc;
	}
	
	
	
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	@Override
	public String toString() {
		return "Socio [CF=" + CF + ", etc=" + etc + "]";
	}
	
}
