package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.AccountDao;
import ph.com.alliance.entity.Account;
import ph.com.alliance.service.AtesService;

@Service("atesService")
public class AtesServiceImpl implements AtesService {
	
	@Autowired
	private JpaTransactionManager transactionManager;
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public List<Account> getAllAccounts() {
		EntityManager em = transactionManager.getEntityManagerFactory().createEntityManager();
		List<Account> accList = null;
		
		
		try {
			accList = accountDao.getAllAccounts(em);
		} catch (Exception e) {
			System.out.println(e);
			
		} 
		
		return accList;
	}

	@Override
	public List<Account> getAllParticipants() {
		EntityManager em = transactionManager.getEntityManagerFactory().createEntityManager();
		List<Account> accList = null;
		
		
		try {
			accList = accountDao.getAllParticipants(em);
		} catch (Exception e) {
			System.out.println(e);
			
		} 
		
		return accList;
	}

	@Override
	public List<Account> getAllFacilitators() {
		EntityManager em = transactionManager.getEntityManagerFactory().createEntityManager();
		List<Account> accList = null;
		
		
		try {
			accList = accountDao.getAllFacilitators(em);
		} catch (Exception e) {
			System.out.println(e);
			
		} 
		
		return accList;
	}
	
}
