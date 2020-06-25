package blundo_giuseppe;

import java.time.LocalDate;

public class EKey {
	private static int contatore;
	private int CodeKey;
	private String Cliente;
	private LocalDate Attivazione;
	private long Durata;
	private int PostoCorrente;
	private int Parcheggio;
	
	
	public int getParcheggio() {
		return Parcheggio;
	}
	public void setParcheggio(int parcheggio) {
		Parcheggio = parcheggio;
	}
	public static int getContatore() {
		return contatore;
	}
	public static void setContatore(int contatore) {
		EKey.contatore = contatore;
	}
	public int getCodeKey() {
		return CodeKey;
	}
	public void setCodeKey(int codeKey) {
		CodeKey = codeKey;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public LocalDate getAttivazione() {
		return Attivazione;
	}
	public void setAttivazione(LocalDate attivazione) {
		Attivazione = attivazione;
	}
	public long getDurata() {
		return Durata;
	}
	public void setDurata(long durata) {
		Durata = durata;
	}
	public int getPostoCorrente() {
		return PostoCorrente;
	}
	public void setPostoCorrente(int postoCorrente) {
		PostoCorrente = postoCorrente;
	}
	public EKey(String cliente, long durata) {
		super();
		this.CodeKey=contatore++;
		Cliente = cliente;
		Attivazione = LocalDate.now();
		Durata = durata;
		PostoCorrente=-1;
		Parcheggio=-1;
	}
	public EKey (EKey l) {
		this.CodeKey=l.getCodeKey();
		this.Cliente=l.getCliente();
		this.Attivazione=l.getAttivazione();
		this.Durata=l.getDurata();
		this.PostoCorrente=l.getPostoCorrente();
	}
	@Override
	public String toString() {
		return "EKey [CodeKey=" + CodeKey + ", Cliente=" + Cliente + ", Attivazione=" + Attivazione + ", Durata="
				+ Durata + ", PostoCorrente=" + PostoCorrente + "]";
	}
	public boolean attiva() {
		LocalDate now = LocalDate.now();
		LocalDate att = this.getAttivazione().plusDays(this.getDurata());
		if(now.isAfter(att))return true;
		else return false;
	}
	
}
