package maparomenia;

import java.util.ArrayList;
import java.util.HashMap;

public class Problema {

    private HashMap<Estado, ArrayList<Aresta>> mapa;
    private Estado estadoInicial;
    private Estado estadoFinal;

    public Problema() {
        ArrayList<Aresta> estados;
        mapa = new HashMap<>();

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Zerind, 75));
        estados.add(new Aresta(Estado.Timisoara, 118));
        estados.add(new Aresta(Estado.Sibiu, 140));
        mapa.put(Estado.Arad, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Arad, 118));
        estados.add(new Aresta(Estado.Lugoj, 111));
        mapa.put(Estado.Timisoara, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Arad, 75));
        estados.add(new Aresta(Estado.Oradea, 71));
        mapa.put(Estado.Zerind, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Arad, 140));
        estados.add(new Aresta(Estado.Oradea, 151));
        estados.add(new Aresta(Estado.RimnieuVilcea, 80));
        estados.add(new Aresta(Estado.Fagaras, 99));
        mapa.put(Estado.Sibiu, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Zerind, 71));
        estados.add(new Aresta(Estado.Sibiu, 151));
        mapa.put(Estado.Oradea, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Timisoara, 111));
        estados.add(new Aresta(Estado.Mehadia, 70));
        mapa.put(Estado.Lugoj, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Lugoj, 70));
        estados.add(new Aresta(Estado.Dobreta, 75));
        mapa.put(Estado.Mehadia, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Mehadia, 75));
        estados.add(new Aresta(Estado.Craiova, 120));
        mapa.put(Estado.Dobreta, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Dobreta, 120));
        estados.add(new Aresta(Estado.RimnieuVilcea, 146));
        estados.add(new Aresta(Estado.Pitesti, 138));
        mapa.put(Estado.Craiova, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Sibiu, 80));
        estados.add(new Aresta(Estado.Craiova, 146));
        estados.add(new Aresta(Estado.Pitesti, 97));
        mapa.put(Estado.RimnieuVilcea, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Sibiu, 99));
        estados.add(new Aresta(Estado.Bucareste, 211));
        mapa.put(Estado.Fagaras, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.RimnieuVilcea, 97));
        estados.add(new Aresta(Estado.Craiova, 138));
        estados.add(new Aresta(Estado.Bucareste, 101));
        mapa.put(Estado.Pitesti, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Fagaras, 211));
        estados.add(new Aresta(Estado.Pitesti, 101));
        estados.add(new Aresta(Estado.Giurgiu, 90));
        estados.add(new Aresta(Estado.Urziceni, 85));
        mapa.put(Estado.Bucareste, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Bucareste, 90));
        mapa.put(Estado.Giurgiu, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Bucareste, 85));
        estados.add(new Aresta(Estado.Hirsova, 98));
        estados.add(new Aresta(Estado.Vaslui, 142));
        mapa.put(Estado.Urziceni, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Hirsova, 86));
        mapa.put(Estado.Eforie, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Urziceni, 96));
        estados.add(new Aresta(Estado.Eforie, 86));
        mapa.put(Estado.Hirsova, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Iasi, 92));
        estados.add(new Aresta(Estado.Urziceni, 142));
        mapa.put(Estado.Vaslui, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Neamt, 87));
        estados.add(new Aresta(Estado.Vaslui, 92));
        mapa.put(Estado.Iasi, estados);

        estados = new ArrayList<>();
        estados.add(new Aresta(Estado.Iasi, 87));
        mapa.put(Estado.Neamt, estados);
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public HashMap<Estado, ArrayList<Aresta>> getMapa() {
        return mapa;
    }

    public void setMapa(HashMap<Estado, ArrayList<Aresta>> mapa) {
        this.mapa = mapa;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(Estado estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public boolean isObjetivo(Estado estado) {
        return (estado.equals(getEstadoFinal()));
    }

}
