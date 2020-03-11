package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
//metodo responsavel por estabelecer conexao com banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha a baixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";

        // as linhas abaixo armazena informacoes do banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo conexao
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio pra saber onde esta o erro
            //System.out.println(e);
            return null;
        }
    }
}
