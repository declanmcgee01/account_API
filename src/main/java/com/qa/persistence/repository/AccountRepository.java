package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;

public interface AccountRepository {

	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(Long id);
	Account getAccount(int key);

}