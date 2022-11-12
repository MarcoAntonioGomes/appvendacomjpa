package br.edu.infnet.orm;


import br.edu.infnet.orm.modelo.persistence.ClienteDAO;
import br.edu.infnet.orm.modelo.persistence.JpaUtil;


public class appvenda {


    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO(JpaUtil.getEntityManager());
        dao.listarTodos();

    }

}
