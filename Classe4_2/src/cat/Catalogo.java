package cat;



public class Catalogo {
	private Nodo headStradali;
	private Nodo headScooter;
	private Nodo headEnduro;
	private Nodo[] n = {headStradali, headScooter, headEnduro};
	
	public Catalogo() {
		super();
		this.headStradali = null;
		this.headEnduro = null;
		this.headScooter = null;
	}
	
	public void add (Moto p, int a) {
		this.add(new Nodo(p), a);
	}
	
	public void add (Nodo p, int a) {
		if(n[a]==null) {
			this.n[0].setLink(p);
			return;
		}
		Nodo t = n[a];
		while(true) {
			if(t.getLink().getLink()==null) 
				t.getLink().setLink(p);
			t.setLink(t.getLink());
		}
	}
	
	public void delete (Moto p, int a) {
		this.delete(new Nodo(p), a);
	}

	public void delete (Nodo p, int a) {
		Nodo t = n[a].getLink();
		Nodo tprec = n[a];
		while(true) {
			if(t.getLink().compareTo(p)) {
				tprec.getLink().setLink(t.getLink().getLink());
				return;
			}
			tprec.setLink(t.getLink());
			t.setLink(t.getLink().getLink());
		}
	}
	
	@SuppressWarnings("null")
	private Nodo list (int a) {
		Nodo toRet = null;
		Nodo head = n[a];
		for(int i = 0; i < 3; i++) 
			while(head.getLink()==null) {
				if(head.getInfo().getMotorizzazione()==i)toRet.add(head);
				head.setLink(head.getLink());
			}
		return toRet;
	}
	
	public void list() {
		Nodo[] toStamp = {list(0), list(1), list(2)};
		for(int i = 0; i < 3; i++) {
			Nodo head=toStamp[i];
			while(true) {
				System.out.print(head+" Sconto: "+head.getInfo().calcolaSconto()+" ");
				head=head.getLink();
			}
		}
	}
}
