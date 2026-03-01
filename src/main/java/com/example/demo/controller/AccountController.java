package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/account")


public class AccountController {
	private AccountService accountService;

	public AccountController(AccountService accountService) {
	    this.accountService = accountService;
	}
	
	
	@PostMapping("/create")
	public Account createAccount(@RequestParam String accountNumber,
	                             @RequestParam Long userId) {
	    return accountService.createAccount(accountNumber, userId);
	}

	@PutMapping("/deposit")
	public Account depositMoney(@RequestParam Long accountId,
	                            @RequestParam BigDecimal amount) {
	    return accountService.deposit(accountId, amount);
	}

	    @PostMapping("/withdraw")
	    public Account withdraw(@RequestParam String accountNumber,
	                            @RequestParam BigDecimal amount) {
	        return accountService.withdraw(accountNumber, amount);
	    }

	    @PostMapping("/transfer")
	    public String transfer(@RequestParam String fromAcc,
	                           @RequestParam String toAcc,
	                           @RequestParam BigDecimal amount) {
	        return accountService.transfer(fromAcc, toAcc, amount);
	    }

}
