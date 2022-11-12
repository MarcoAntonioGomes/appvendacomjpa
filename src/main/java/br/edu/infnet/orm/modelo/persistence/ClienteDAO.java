package br.edu.infnet.orm.modelo.persistence;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ClienteDAO extends JPADAO {


    public ClienteDAO(EntityManager em) {
        super();
    }

}
