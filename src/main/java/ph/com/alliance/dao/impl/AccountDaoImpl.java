package ph.com.alliance.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.AccountDao;
import ph.com.alliance.entity.Account;
import ph.com.alliance.entity.User;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{

	@Override
	public List<Account> getAllAccounts(EntityManager em) {
		List<Account> accList = null;
		Query q= null;
		try{
			q = em.createQuery("FROM Account account");
			accList = q.getResultList();
		}catch(Exception e){
			System.out.println("FAILURE2");
		}
		
		return accList;
	}

	@Override
	public List<Account> getAllParticipants(EntityManager em) {
		List<Account> accList = null;
		Query q= null;
		try{
			q = em.createQuery("");  //FROM Account acc, Attendee att, Training t WHERE att.account_id=acc.account_id AND att.training_id = t.training_id AND att.role="Participants"
			accList = q.getResultList();
		}catch(Exception e){
			System.out.println("FAILURE2");
		}
		
		return accList;
	}

	@Override
	public List<Account> getAllFacilitators(EntityManager em) {
		List<Account> accList = null;
		Query q= null;
		try{
			q = em.createQuery("");  //FROM Account acc, Attendee att, Training t WHERE att.account_id=acc.account_id AND att.training_id = t.training_id AND att.role="Facilitators"
			accList = q.getResultList();
		}catch(Exception e){
			System.out.println("FAILURE2");
		}
		
		return accList;
	}
}
