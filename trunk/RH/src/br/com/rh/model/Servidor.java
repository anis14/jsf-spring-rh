package br.com.rh.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(schema="rh", name="servidor")
public class Servidor {
	
	@Id
	@GeneratedValue
	@Column(name="codservidor")
	private int codServidor;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="dataingresso")
	private Date dataIngresso;

	public void Servidor() {
		codServidor = 1;
		dataIngresso = new Date("2000-01-01");
		matricula = "6329";
		nome = "Anderson Barbosa";
		
	}
	
	public int getCodServidor() {
		return codServidor;
	}

	public void setCodServidor(int codServidor) {
		this.codServidor = codServidor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	
	
}
