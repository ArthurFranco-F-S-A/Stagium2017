/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.OrientadorDoEstagioBEAN;
import modelo.OrientadorDoEstagioMySqlDAO;

/**
 *
 * @author Alunos
 */
public class OrientadorControle {

    private OrientadorDoEstagioMySqlDAO oriDAO = new OrientadorDoEstagioMySqlDAO();
    
    public boolean cadastrar(OrientadorDoEstagioBEAN o) {
       
        /*boolean v = oriDAO.verificarOrientador(o.getNome());
         
        if (v == true) {
            return oriDAO.cadastrar(o);
        } 
        return false;*/
        return false;
    }
   
}
