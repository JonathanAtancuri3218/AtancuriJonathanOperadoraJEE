package ec.ups.edu.g1.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operadora implements Serializable{
	
	@Id
	private String numero;
	private String operadora;
	private double valor;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Operadora [numero=" + numero + ", operadora=" + operadora + ", valor=" + valor + "]";
	}
	
	

}
