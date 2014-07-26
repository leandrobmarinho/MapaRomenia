package maparomenia;


public class No implements Comparable<No>{
	private Estado estado;
	private No pai = null;
	private int profundidade = 0;
	private double custo = 0.0;
	private double comparador = 0.0;
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public No getPai() {
		return pai;
	}
	public void setPai(No pai) {
		this.pai = pai;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
        @Override
	public String toString(){
		return estado.toString();
		
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getComparador() {
		return comparador;
	}
	public void setComparador(double g) {
		this.comparador = g;
	}
	
	@Override
	public int compareTo(No o) {
		if (this.comparador < o.getComparador()){
			return -1;
		}else{
			return 1;
		}		
	}

}
