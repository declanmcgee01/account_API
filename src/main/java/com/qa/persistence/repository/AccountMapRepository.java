package com.qa.persistence.repository;

import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Alternative
public class AccountMapRepository implements AccountRepository {
	
	int counter = 0;
	
	@Inject
	private AccountMap repo;
	private JSONUtil json = new JSONUtil();
	
	public String getAllAccounts() {
		return json.getJSONForObject(repo.getAllAccounts().values());
	}
	@Override
	public String createAccount(String account)
	{
		Account acc = json.getObjectForJSON(account, Account.class);
		repo.getAllAccounts().put(counter, acc);
		return "{\"message\": \"account has been sucessfullt added\"}";
	}
	@Override
	public Account getAccount(int key)
	{
		return repo.accountMap.get(key);
	}
	@Override
	public String deleteAccount(Long key)
	{
		repo.accountMap.remove(key);
		return "{\"message\": \"account has been sucessfully deleted\"}";
	}

}
