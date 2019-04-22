
package br.com.cras.dao;

import br.com.cras.dominio.Evento;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Ronnie
 */
public class EventoDAO {
    
    public EntityManager getEM(){
        EntityManagerFactory  factory= Persistence.createEntityManagerFactory("CrasPU");
        return factory.createEntityManager();
    }
    
    
    public void adiciona(Evento evento) throws SQLException{
        EntityManager em=getEM();
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
        em.close();
       
      }
    
    
    public List<Evento> busca() throws SQLException {
        EntityManager em =getEM();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Evento.class));
        
        List<Evento> lista = em.createQuery(criteria).getResultList();
       
       
        return lista;
    }
}
