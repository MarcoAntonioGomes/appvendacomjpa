package br.edu.infnet.orm.modelo.persistence;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class JPADAO<T> implements IDAO<T> {

    protected EntityManager em;
    private Class<T> entityClass;

    public JPADAO() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        this.em = JpaUtil.getEntityManager();
    }

    public void salvar(T t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    public void atualizar(T t) {
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
    }

    public void excluir(T t) {
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }

    @Override
    public T obter(Long codigo) {

        return em.find(entityClass, codigo);
    }

    @Override
    public List<T> listarTodos() {
        return em.createQuery("from " + entityClass ).getResultList();
    }
}
