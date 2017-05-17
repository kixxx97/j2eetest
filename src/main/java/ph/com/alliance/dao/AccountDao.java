package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Account;

public interface AccountDao {
	public List<Account> getAllAccounts(EntityManager em);
	public List<Account> getAllParticipants(EntityManager em);
	public List<Account> getAllFacilitators(EntityManager em);
}
