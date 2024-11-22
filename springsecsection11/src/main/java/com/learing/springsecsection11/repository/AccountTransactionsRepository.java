package com.learing.springsecsection11.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learing.springsecsection11.model.AccountTransactions;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, String> {
	
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId);

}
