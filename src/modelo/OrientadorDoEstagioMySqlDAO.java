/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Alunos
 */
public class OrientadorDoEstagioMySqlDAO {
private Connection connection;
    
    private PreparedStatement stmt;

    public OrientadorDoEstagioMySqlDAO() {
        
        this.connection = ConnectionFactory.getConnection();
    }
    
    
    /*public boolean verificarOrientador(String nome) {
        // Mudar dados!!!!
        String sql = "select count(Cod) from curso where curNome = ?;";
        int cod = 0;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cod = rs.getInt(1);
            }
            if (cod > 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/

    public boolean cadastrar(OrientadorDoEstagioBEAN o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
