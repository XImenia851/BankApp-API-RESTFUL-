package com.XImenia851.controller;

import com.XImenia851.model.Customer;
import com.XImenia851.model.Loans;
import com.XImenia851.repository.loansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class loansController {

    @Autowired
    private loansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer) {
        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
        if (loans != null) {
            return  loans;
        } else {
            return null;
        }
    }
}
