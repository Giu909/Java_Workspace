package listaOrdinata;

import java.util.StringTokenizer;

public class ProvaLista {

	
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		StringTokenizer st = new StringTokenizer("1 4 1 1 1 2 3 ");
		while (st.hasMoreTokens()){
			lista.insert((st.nextToken()));
		}
		
		System.out.println(lista);
		
		lista.delete("4");
		System.out.println(lista);
		lista.delete("1");
		System.out.println(lista);
		lista.delete("2");
		System.out.println(lista);
		lista.delete("1");
		System.out.println(lista);
		lista.delete("1");
		System.out.println(lista);
		lista.delete("1");
		System.out.println(lista);
		lista.delete("3");
		System.out.println(lista);
		lista.delete("3");
		System.out.println(lista);
		
		Lista lista2 = new Lista();
		
		StringTokenizer st2 = new StringTokenizer("2 3 4  1  ");
		while (st2.hasMoreTokens()){
			lista2.insert((st2.nextToken()));
		}
		
		System.out.println(lista2);
		
		System.out.println(lista.isSubList(lista2));
		
		
		
	}

}
