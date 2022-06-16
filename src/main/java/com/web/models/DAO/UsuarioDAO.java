package com.web.models.DAO;

import com.web.models.classes.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
	private Connection conexao;
	
	public Usuario getUsuario(String email, String senha) {
		PreparedStatement stmt = null;
        Conexao con = new Conexao();
        ResultSet resultSet = null;
        Usuario usuario = new Usuario();

        try {
            conexao = con.getConnection();
            String sql = "SELECT * FROM T_USUARIO WHERE ds_email = ? AND sh_usuario = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            resultSet = con.getData(stmt);

            while (resultSet.next()) {
            	usuario.setId_usuario(resultSet.getInt("id_usuario"));
                usuario.setNm_usuario(resultSet.getString("nm_usuario"));
                usuario.setSn_usuario(resultSet.getString("sn_usuario"));
                usuario.setSh_usuario(resultSet.getString("sn_usuario"));
                usuario.setDt_usuario(resultSet.getDate("dt_usuario"));
                usuario.setDs_email(resultSet.getString("ds_email"));
                usuario.setVl_altura(resultSet.getDouble("vl_altura"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
	}
}
