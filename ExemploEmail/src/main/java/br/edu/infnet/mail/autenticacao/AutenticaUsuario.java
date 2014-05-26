package br.edu.infnet.mail.autenticacao;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class AutenticaUsuario extends Authenticator{
	
	private String usuario;
	private String senha;
	
	public AutenticaUsuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(this.usuario, this.senha);
	}
	
	
}
