package com.XImenia851.controller;

import com.XImenia851.model.Cards;
import com.XImenia851.model.Customer;
import com.XImenia851.repostory.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardRepository cardRepository;

    @PostMapping("/myCard")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> card = cardRepository.findByCustomerId(customer.getCustomerId());
        if (card != null) {
            return card;
        } else {
            return null;
        }
    }
}
