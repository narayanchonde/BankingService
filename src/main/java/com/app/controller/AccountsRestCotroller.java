package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDto;
import com.app.service.IAccountsService;

@RestController
@RequestMapping("/api/account/")
public class AccountsRestCotroller {

	@Autowired
	private IAccountsService serviceAcc;
	
	@GetMapping("/get")
	public String getString(){
		
		return "<h1>Happy Hacking</h1> ";
	}
	
	//create One account 
	@PostMapping("/create")
	public ResponseEntity<CustomerDto> createAccount(@RequestBody CustomerDto customerDto){
		
		ResponseEntity<CustomerDto > response=null;
		try {
			System.out.println("helloo");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return response;
	}

}
