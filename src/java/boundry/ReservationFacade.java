/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundry;

import entities.Member;
import entities.Reservation;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Merca Skole
 */
@Stateless
public class ReservationFacade extends AbstractFacade<Reservation> {
    @PersistenceContext(unitName = "CarShareWSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservationFacade() {
        super(Reservation.class);
        
    }   
    
   

    public List<Reservation> findByMember(Member member) {
        StringBuilder sb = new StringBuilder();
        sb.append("select r from Reservation r ");
        sb.append("where r.member_id = :memberid ");       
        
        Query q = em.createQuery(sb.toString());
        q.setParameter("memberid", member);
        List<Reservation> res = q.getResultList();
        return res;
    }    
    
    
    
}
