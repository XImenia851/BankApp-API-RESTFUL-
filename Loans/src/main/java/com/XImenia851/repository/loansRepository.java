package com.XImenia851.repository;

import com.XImenia851.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface loansRepository extends CrudRepository<Loans, Long> {

    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
