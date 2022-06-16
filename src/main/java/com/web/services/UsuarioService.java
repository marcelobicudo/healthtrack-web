package com.web.services;

import com.web.models.DAO.UsuarioDAO;
import com.web.models.classes.Usuario;

public class UsuarioService {
	
	public boolean Login(String email, String senha) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Usuario usuario = usuarioDAO.getUsuario(email, senha);
		return usuario.getNm_usuario() != null;
		
	}

}
