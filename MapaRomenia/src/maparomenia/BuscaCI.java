package maparomenia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class BuscaCI {

	private Problema problema;
	private HashSet<Estado> visitados;
	private DistanciaLR informacao;

	public BuscaCI(Problema problema, DistanciaLR informacao) {
		this.problema = problema;
		this.informacao = informacao;
	}

	public Stack<No> gulosa() {
		this.visitados = new HashSet<>();
		Stack<No> borda = new Stack<>();

		No no = new No();
		no.setEstado(problema.getEstadoInicial());
		borda.push(no);

		while (!borda.isEmpty()) {

			no = borda.pop();

			if (problema.isObjetivo(no.getEstado())) {
				return solucao(no);
			}

			borda.addAll(expandirGulosa(no));
		}

		return null;
	}

	public Stack<No> A_Asterico() {
		this.visitados = new HashSet<>();
		List<No> borda = new ArrayList<>();

		No no = new No();
		no.setEstado(problema.getEstadoInicial());
		borda.add(no);

		while (!borda.isEmpty()) {

			no = borda.remove(0);

			if (problema.isObjetivo(no.getEstado())) {
				return solucao(no);
			}

			borda.addAll(expandirAsterico(no));
			Collections.sort(borda);
		}

		return null;
	}

	private Stack<No> solucao(No no) {
		Stack<No> caminho = new Stack<>();
		caminho.add(no);

		No pai = no.getPai();
		while (pai != null) {
			caminho.push(pai);
			pai = pai.getPai();
		}

		return caminho;
	}

	private List<No> expandirGulosa(No no) {
		List<No> sucessores = new ArrayList<>();

		// imprimirArvore(no);

		this.visitados.add(no.getEstado());

		for (Aresta aresta : problema.getMapa().get(no.getEstado())) {

			if (!this.visitados.contains(aresta.getDestino())) {
				No novo = new No();
				novo.setEstado(aresta.getDestino());
				novo.setPai(no);
				novo.setProfundidade((no.getProfundidade() + 1));
				double distanciaLR = informacao.getDistancia(
						aresta.getDestino(), problema.getEstadoFinal());
				
                                // usado para ordenar
                                novo.setComparador(distanciaLR); 
				sucessores.add(novo);                                
			}
		}

		Collections.sort(sucessores, Collections.reverseOrder());

		return sucessores;
	}

	private List<No> expandirAsterico(No no) {
		List<No> sucessores = new ArrayList<>();

		this.visitados.add(no.getEstado());

		for (Aresta aresta : problema.getMapa().get(no.getEstado())) {

			if (!this.visitados.contains(aresta.getDestino())) {

				No novo = new No();
				novo.setEstado(aresta.getDestino());
				novo.setPai(no);
				novo.setProfundidade((no.getProfundidade() + 1));
				double distanciaLR = informacao.getDistancia(
						aresta.getDestino(), problema.getEstadoFinal());
				novo.setCusto(aresta.getCusto() + no.getCusto());

				// usado para ordenar
				novo.setComparador((aresta.getCusto() + no.getCusto()) + distanciaLR);

				/*
				 System.out .println((aresta.getCusto() + no.getCusto() +
				 distanciaLR) + " = " + (aresta.getCusto() + no.getCusto()) +
				 " + " + distanciaLR + " -- " + novo.getEstado());
                                        */
				
				sucessores.add(novo);
			}
		}

		return sucessores;
	}

	private void imprimirArvore(No no) {
		String str = "";
		for (int i = 0; i < no.getProfundidade(); i++) {
			str += "\t";
		}
		System.out.println(str + "<<" + no + ">>");
	}

}
