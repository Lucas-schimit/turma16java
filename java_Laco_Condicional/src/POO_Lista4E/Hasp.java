package POO_Lista4E;

import java.util.*;

public class Hasp {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		
		HashMap<Integer, Estoque> estoque = new HashMap<Integer,Estoque>();
		
		
		estoque.put(1,new Estoque("Bolacha",5));
		
		hash_map.put(10, "Teste1");
		hash_map.put(11, "Teste2");
		hash_map.put(12, "Teste3");
		hash_map.put(13, "Teste4");
		hash_map.put(14, "Teste5");
		
		System.out.println("Não sei mais vamos descobrir: " +hash_map);
		
		String returned_value = (String)hash_map.remove(10); 
		
		 System.out.println("Returned value is: "+ returned_value);
		 
		 System.out.println("New map is: "+ hash_map);
	}

}
