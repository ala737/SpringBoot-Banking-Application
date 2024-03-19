package com.alanouri.bankingapp.service;

import com.alanouri.bankingapp.dto.AccountDto;
import com.alanouri.bankingapp.entity.Account;

import java.util.List;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountByID(Long id);
    List<AccountDto> getAllAcounts();

    AccountDto deposit(Long id,double amount);

    AccountDto withdraw(Long id,double amount);
    void deleteAccount(Long id);
}
