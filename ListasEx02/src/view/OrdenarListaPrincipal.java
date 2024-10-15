package view;

import controller.OrdenarListaController;
import model.Lista;

public class OrdenarListaPrincipal {

	public static void main (String[] args) {
		Lista<Integer> lista = new Lista<>();
		OrdenarListaController<Integer> listCon = new OrdenarListaController<>();
		
		lista.addFirst(10);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(1);
		lista.addLast(9);
		lista.addLast(2);
		lista.addLast(4);
		lista.addLast(7);
		lista.addLast(3);
		lista.addLast(6);
		
		listCon.ordenaLista(lista);
		
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
