package DesafioEd;

public class Produto {

	// Atributo

	public String codigo;
	public String descricao;
	public double valorUnitario;

	public Produto() {
		
	}
	
	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Produto(String codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Produto(String codigo, String descricao, double valorUnitario) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public String Codigo(String codigo) {
		return this.codigo = codigo;
	}

	public void CodigoDescicao(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public void CodigoDescricaoValorUnitario(String codigo, String descricao, double valorUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
