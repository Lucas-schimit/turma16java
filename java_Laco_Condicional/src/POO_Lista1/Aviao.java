package POO_Lista1;

public class Aviao {
	
	/*Crie uma classe avi�o e apresente os atributos e m�todos 
	 * referentes esta classe, em seguida crie um objeto avi�o, 
	 * defina as instancias deste objeto e apresente as informa��es 
	 * deste objeto no console.
	 * */
	
	public String Cor; 
	public String Modelo; 
	public double numeroDeSerie;
	
	
	public void MostrarAviao() {
		
		System.out.println("Segue as informa��es do aviao: ");
		System.out.println("Cor: "+Cor+ " Modelo: " +Modelo+ " Numero de Serie com 4 digitos: " + numeroDeSerie);
	}
	
	public double incerindoNumeroDeSerie(double numeroDeSerie) {
		return this.numeroDeSerie = numeroDeSerie;
	}

}
