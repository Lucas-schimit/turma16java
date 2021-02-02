package POO_Lista1;

public class Aviao {
	
	/*Crie uma classe avião e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto avião, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.
	 * */
	
	public String Cor; 
	public String Modelo; 
	public double numeroDeSerie;
	
	
	public void MostrarAviao() {
		
		System.out.println("Segue as informações do aviao: ");
		System.out.println("Cor: "+Cor+ " Modelo: " +Modelo+ " Numero de Serie com 4 digitos: " + numeroDeSerie);
	}
	
	public double incerindoNumeroDeSerie(double numeroDeSerie) {
		return this.numeroDeSerie = numeroDeSerie;
	}

}
