package com.XImenia851.repository;

import com.XImenia851.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    AccountRepository findByCustomerId(int customerId);
}
