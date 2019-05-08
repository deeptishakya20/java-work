package com.capgemini.bank.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import com.capgemini.bank.exception.BankAccountNotFoundException;
import com.capgemini.bank.model.BankAccount;

public interface BankAccountDao {

	public double getBalance(long accountId);

	public boolean updateBalance(long accountId, double newBalance) throws SQLException,BankAccountNotFoundException;

	public boolean deleteBankAccount(long accountId);

	public boolean addNewBankAccount(BankAccount account);

	public List<BankAccount> findAllBankAccount();

	public List<BankAccount> searchBankAccount(long accountId);

	public boolean updateDetails(long accountId, String accountHolderName, String accountType);

}
