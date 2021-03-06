package maparomenia;

import java.util.HashMap;

public class DistanciaLR {
	
	public HashMap<Estado, double[]> coordenadas;
	
	public DistanciaLR(){		
		coordenadas = new HashMap<>();
		double[] coordenada;
		
		coordenada = new double[2];
		coordenada[0] = 21.302490234375;
		coordenada[1] = 46.164614496897094;
		coordenadas.put(Estado.Arad, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 26.103515625;
		coordenada[1] = 44.42593442145313;
		coordenadas.put(Estado.Bucareste, coordenada);		
		
		coordenada = new double[2];
		coordenada[0] = 23.807373046875;
		coordenada[1] = 44.32384807250689;
		coordenadas.put(Estado.Craiova, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 22.65380859375;
		coordenada[1] = 44.645208223744035;
		coordenadas.put(Estado.Dobreta, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 28.63311767578125;
		coordenada[1] = 44.06686692869627;
		coordenadas.put(Estado.Eforie, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 24.9774169921875;
		coordenada[1] = 45.84267279853418;
		coordenadas.put(Estado.Fagaras, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 25.982666015625;
		coordenada[1] = 43.82660134505382;
		coordenadas.put(Estado.Giurgiu, coordenada);		

		coordenada = new double[2];
		coordenada[0] = 27.953338623046875;
		coordenada[1] = 44.685253763150634;
		coordenadas.put(Estado.Hirsova, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 27.5921630859375;
		coordenada[1] = 47.16357498846737;
		coordenadas.put(Estado.Iasi, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 21.895751953125;
		coordenada[1] = 45.69083283645816;
		coordenadas.put(Estado.Lugoj, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 22.360782623291016;
		coordenada[1] = 44.90683345867428;
		coordenadas.put(Estado.Mehadia, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 26.3726806640625;
		coordenada[1] = 46.93150988336929;
		coordenadas.put(Estado.Neamt, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 21.92150115966797;
		coordenada[1] = 47.071758665266444;
		coordenadas.put(Estado.Oradea, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 24.884033203125;
		coordenada[1] = 44.859762688042736;
		coordenadas.put(Estado.Pitesti, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 24.3731689453125;
		coordenada[1] = 45.092913646051144;
		coordenadas.put(Estado.RimnieuVilcea, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 24.136962890625;
		coordenada[1] = 45.786679041363726;
		coordenadas.put(Estado.Sibiu, coordenada);

		coordenada = new double[2];
		coordenada[0] = 21.2310791015625;
		coordenada[1] = 45.75219336063106;
		coordenadas.put(Estado.Timisoara, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 26.6363525390625;
		coordenada[1] = 44.72332018895824;
		coordenadas.put(Estado.Urziceni, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 27.7294921875;
		coordenada[1] = 46.638122462379656;
		coordenadas.put(Estado.Vaslui, coordenada);
		
		coordenada = new double[2];
		coordenada[0] = 21.513290405273438;
		coordenada[1] = 46.62303384721474;
		coordenadas.put(Estado.Zerind, coordenada);

	}

	/** 
     * @param a Estado
     * @param b Estado
     * @return distanciaLR double
     */
	public double getDistancia(Estado a, Estado b){
		double[] pontoA = coordenadas.get(a);
		double[] pontoB = coordenadas.get(b);
		
		return Math.sqrt( Math.pow((pontoB[0]-pontoA[0]), 2) + Math.pow((pontoB[1]-pontoA[1]), 2) )*100;
	}
}
