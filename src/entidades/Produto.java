package entidades;

import java.io.Serializable;

public class Produto implements Serializable {

	private int idProduto;
	private String produto;
	private double preco;
	public Produto(int idProduto, String produto, double preco) {
		super();
		this.idProduto = idProduto;
		this.produto = produto;
		this.preco = preco;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", produto=" + produto + ", preco=" + preco + "]";
	}
	
	
	
	}
	
	

	

