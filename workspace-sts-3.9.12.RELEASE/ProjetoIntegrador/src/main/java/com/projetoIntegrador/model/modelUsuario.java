package com.projetoIntegrador.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_usuario")
public class modelUsuario {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY) //Faz com que o ID seja auto increment, e tambÃ©m jÃ¡ indica que Ã© uma chave primaria (PRIMARY KEY).
		private Long idUsuario;
		
		
		@NotNull
		private String nomeCompleto;
		
		@NotNull
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date dataNascimento;
		
		@NotNull
		private String enderecoUsuario;
		
		
		
		private String telefoneUsuario;
		
		@NotNull
		private String celularUsuario;
		
		@NotNull
		private String rgUsuario;
		
		@NotNull
		private String cpfUsuario;
		
		@NotNull
		private String sexoUsuario;
		
		@NotNull
		private String loginUsuario;
		
		@NotNull
		private String senhaUsuario;
		
		
		//Getters and Setters
		
		public Long getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}
		
		public String getNome() {
			return nomeCompleto;
		}
		public void setNome(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getEnderecoUsuario() {
			return enderecoUsuario;
		}
		public void setEnderecoUsuario(String enderecoUsuario) {
			this.enderecoUsuario = enderecoUsuario;
		}
		public String getTelefoneUsuario() {
			return telefoneUsuario;
		}
		public void setTelefoneUsuario(String telefoneUsuario) {
			this.telefoneUsuario = telefoneUsuario;
		}
		public String getCelularUsuario() {
			return celularUsuario;
		}
		public void setCelularUsuario(String celularUsuario) {
			this.celularUsuario = celularUsuario;
		}
		public String getRgUsuario() {
			return rgUsuario;
		}
		public void setRgUsuario(String rgUsuario) {
			this.rgUsuario = rgUsuario;
		}
		public String getCpfUsuario() {
			return cpfUsuario;
		}
		public void setCpfUsuario(String cpfUsuario) {
			this.cpfUsuario = cpfUsuario;
		}
		public String getSexoUsuario() {
			return sexoUsuario;
		}
		public void setSexoUsuario(String sexoUsuario) {
			this.sexoUsuario = sexoUsuario;
		}
		public String getLoginUsuario() {
			return loginUsuario;
		}
		public void setLoginUsuario(String loginUsuario) {
			this.loginUsuario = loginUsuario;
		}
		
		public String getSenhaUsuario() {
			return senhaUsuario;
		}
		public void setSenhaUsuario(String senhaUsuario) {
			this.senhaUsuario = senhaUsuario;
		}
		
}
