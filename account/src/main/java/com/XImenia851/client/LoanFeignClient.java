package com.XImenia851.client;

import com.XImenia851.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("loans")
public interface LoanFeignClient {

    @GetMapping("/myLoan/{customerId}")
    List<LoanDto> getLoanDetails(@PathVariable Long customerId);
}