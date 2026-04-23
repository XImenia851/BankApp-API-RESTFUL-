package com.XImenia851.client;

import com.XImenia851.dto.CardDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("cards")
public interface CardFeignClient {

    @GetMapping("/myCard/{customerId}")
    List<CardDto> getCardDetails(@PathVariable Long customerId);
}