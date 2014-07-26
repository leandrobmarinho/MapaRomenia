package controller;

import java.util.Stack;
import javax.swing.DefaultListModel;
import maparomenia.BuscaCI;
import maparomenia.DistanciaLR;
import maparomenia.Estado;
import maparomenia.No;
import maparomenia.Problema;
import view.MapaJFrame;

/**
 *
 * @author leandro
 */
public class MainBO {

    public MapaJFrame view;
    public Problema problema;
    public BuscaCI busca;
    public Stack<No> solucao;

    public MainBO(MapaJFrame view) {
        this.view = view;
        this.problema = new Problema();
        this.problema = new Problema();
        this.busca = new BuscaCI(problema, new DistanciaLR());
    }

    public void resolve(String busca) {
        this.problema.setEstadoInicial(Estado.valueOf(this.view.inicio));
        this.problema.setEstadoFinal(Estado.valueOf(this.view.fim));

        long ti = 0, tf = 0;
        solucao = null;
        if ("Gulosa".equals(busca)) {
            ti = System.currentTimeMillis();
            solucao = this.busca.gulosa();
            tf = System.currentTimeMillis();
        } else if ("A*".equals(busca)) {
            ti = System.currentTimeMillis();
            solucao = this.busca.A_Asterico();
            tf = System.currentTimeMillis();
        }

        imprimeCaminho(solucao);
    }
    
    public void imprimeCaminho(Stack<No> caminho) {
        DefaultListModel lista = new DefaultListModel();
        if (caminho == null) {
            lista.addElement("Caminho não encontrado");
            view.getLista().setModel(lista);
            return;
        }

        No no;
        do {
            no = caminho.pop();
            lista.addElement(no.toString());

        } while (!caminho.isEmpty());
        view.getLista().setModel(lista);
    }
}