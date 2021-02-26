package com.hardtech.doabookapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

@Entity
@Table(name = "tb_temas")
public class Temas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O campo NOME é obrigatório")
	@Size(min = 2, max = 50, message = "O campo NOME deve ter entre 2 e 50 caracteres")
	private String nome;
	
	@NotNull(message = "O campo DESCRIÇÃO é obrigatório")
	@Size(min = 4, max = 255, message = "O campo DESCRIÇÃO deve ter entre 4 e 255 caracteres")
	private String descricao;
	
	@NotNull(message = "O campo ÍCONE é obrigatório")
	@URL(message = "O campo ÍCONE precisa ser uma URL")
	private String icone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}
	
	

}
