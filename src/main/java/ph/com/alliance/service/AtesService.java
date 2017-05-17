package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.Account;

public interface AtesService {
	public List<Account> getAllAccounts();
	public List<Account> getAllParticipants();
	public List<Account> getAllFacilitators();
}
