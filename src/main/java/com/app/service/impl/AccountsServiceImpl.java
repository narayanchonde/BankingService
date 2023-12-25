package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.AccountsRepository;
import com.app.repository.CustomerRepository;
import com.app.service.IAccountsService;

@Service
public class AccountsServiceImpl implements IAccountsService {
	
	@Autowired
	private AccountsRepository accRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	

}
