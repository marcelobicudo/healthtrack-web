package com.web.models.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	private Connection conn;
	
	public Conexao() {
		//Indicar qual driver vai ser usado
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Disponibiliza a conexão para outras classes
		public Connection getConnection() {
			openConnection();
			return this.conn;
		}
		
		private void openConnection() {
			try {
				if(this.conn == null) {
					this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92031", "170284");
				}
				System.out.println("Conexão está aberta");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Fecha conexão
		private void closeConnection() {
			try {
				if(this.conn != null) {
				
					this.conn.close();
			    }
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			
		}
		// Executar comandos e exibir linhas afetadas no banco
		public int executeCommand(PreparedStatement stmt) {
			int j = 0;
			try {
				j = stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				closeConnection();
			}
			return j;
			
		}
		
		public ResultSet getData(PreparedStatement stmt) {
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
}
