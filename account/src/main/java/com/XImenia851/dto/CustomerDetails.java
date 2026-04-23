package com.XImenia851.dto;

import com.XImenia851.model.Account;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDetails {
    private Account accounts;
    private List<LoanDto> loans;
    private List<CardDto> cards;
}
