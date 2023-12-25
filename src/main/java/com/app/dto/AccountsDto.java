package com.app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountsDto {

	@NotEmpty(message = "AccountNumber can not be a null or empty")
	private Long accountsNumber;
	
	
	 @NotEmpty(message = "AccountType can not be a null or empty")
	private String accountType;
	
	@NotEmpty(message = "BranchAddress can not be a null or empty")
	private String branchAddress;
	

}
