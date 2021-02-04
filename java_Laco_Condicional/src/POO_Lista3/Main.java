package POO_Lista3;

public class Main {

	public static void main(String[] args) {

		Animal Ca1 = new Cachorro("Bobe", 20, "AuAuauauauauauauauauauauauauauau");

		Animal Ca11 = new Cavalo("Bartolomeu", 20, "Huhuhuhuhuhuhuhuh");

		Animal Ca12 = new Preguica("Dale", 50, "Tem preguiça para emitir som");

		System.out.println(((Cachorro) Ca1).getPoli());
		System.out.println(((Cavalo) Ca11).getPoli());
		System.out.println(((Preguica) Ca12).getPoli());

	}

}
