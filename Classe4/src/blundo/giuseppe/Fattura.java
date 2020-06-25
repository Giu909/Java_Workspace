package blundo.giuseppe;

import java.time.LocalDate;
@SuppressWarnings("unused")
public class Fattura {
	private static int id=0;
	private int idd;
	private LocalDate data;
	private String nome;
	private Riga[] riga=new Riga[20];
	
	
	public boolean remove (Prodotto p){//TODO Errore se null
		for(int i = 0; i < riga.length; i++)
			if(riga[i].getProdotto().getCodiceAlfanumerico().equals(p.getCodiceAlfanumerico()))
				{riga[i]=null;return true;}
			return false;
	}
	public boolean add (Prodotto a,int qt){
		for(int i=0;i<riga.length;i++)
			if(riga[i]==null){riga[i]=new Riga(a,qt);return true;}
		return false;
	}
	
	public int imponibile () {
		int toRet = 0;
		for(int i = 0; i<this.riga.length;i++)
			if(riga[i]!=null)
			toRet += this.riga[i].getProdotto().getPrezzoVendita()*riga[i].getQt();
		return toRet;
	}
	public int qtiva () {
		int toRet = 0;
		for(int i = 0 ; i<riga.length;i++)
			if(riga[i]!=null)
			toRet+=this.riga[i].getProdotto().getPrezzoVendita()*this.riga[i].getProdotto().getIva()/100;
			
		return toRet;
	}
	public int tot () {
		int toRet = this.imponibile() + this.qtiva();
		return toRet;
	}
	public void list () {
		for(int i = 0 ; i < riga.length; i++)
			if(riga[i]!=null)
				System.out.println("Nome prodotto: "+riga[i].getProdotto().getBreveDescrizione()+"; Quantità: "+riga[i].getQt());
			//else System.out.println("Null");
	}
	
	public Fattura(LocalDate data, String nome) {
		super();
		this.data = data;
		this.nome = nome;
		id++;
		this.idd=id;
	}
}
