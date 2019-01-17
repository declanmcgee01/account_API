package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;

public class AccountMap {
	
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	public Map<Integer, Account> getAllAccounts() {
		return accountMap;
	}
}
