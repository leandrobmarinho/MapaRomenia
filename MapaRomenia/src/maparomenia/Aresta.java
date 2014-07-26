package maparomenia;


public class Aresta {

	private Estado destino;
	private double custo;	
	
	public Aresta(Estado destino, double custo){
		this.destino = destino;
		this.custo = custo;
	}

	public Estado getDestino() {
		return destino;
	}

	public void setDestino(Estado destino) {
		this.destino = destino;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	@Override
	public String toString(){
		return destino+" - "+custo;
	}
}
