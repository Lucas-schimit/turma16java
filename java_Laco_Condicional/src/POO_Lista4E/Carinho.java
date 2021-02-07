package POO_Lista4E;

import java.util.HashMap;
import java.util.*;

public class Carinho {
	
	private double quantidade; 
	private int idproduto;
	private double valor = 0.00;
	
	Estoque est = new Estoque();
	Produto pro = new Produto();
	HashMap<Integer, Produto> prod = new HashMap<Integer, Produto>(); 
	HashMap<Integer, Estoque> Est = new HashMap<Integer, Estoque>(); 

	
	public Carinho() {
		
	}
	
	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

  
	
	public double valorTotal(double valor) {
		this.valor = valor;
      return valor+=valor;
		
	}


	
}
