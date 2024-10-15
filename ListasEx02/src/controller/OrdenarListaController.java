package controller;

import model.Lista;
import cassio.sorters.SorterControllers;

public class OrdenarListaController<T> {

	public OrdenarListaController() {
		super();
	}
	
	SorterControllers sorter = new SorterControllers();
	
	public void ordenaLista(Lista<Integer> lista) {
		int tamanho = lista.size();
		int[] vetor = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			try {
				vetor[i] = (int) lista.get(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		sorter.quickSort(vetor, 0, (tamanho-1));
		lista.clean();
		for (int a : vetor) {
			Integer b = Integer.valueOf(a);
			lista.addLast(b);
		}
	}
}
