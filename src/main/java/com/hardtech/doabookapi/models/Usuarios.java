package com.hardtech.doabookapi.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O campo NOME é obrigatório")
	@Size(min = 2, max = 100, message = "O campo NOME deve ter entre 2 e 100 caracteres")
	private String nome;

	@NotNull(message = "O campo EMAIL é obrigatório")
	@Size(min = 2, max = 100, message = "O campo EMAIL deve ter entre 2 e 100 caracteres")
	private String email;

	@NotNull(message = "O campo SENHA é obrigatório")
	@Size(min = 5, max = 255, message = "O campo SENHA deve ter entre 5 e 100 caracteres")
	private String senha;

	@URL(message = "O campo ÍCONE precisa ser uma URL")
	private String imagemUrl;
	
	
	private String tipoUsuario = "normal";

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("postagens")
	private List<Postagens> postagens;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public List<Postagens> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagens> postagens) {
		this.postagens = postagens;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
