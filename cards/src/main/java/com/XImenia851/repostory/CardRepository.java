package com.XImenia851.repostory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.smartcardio.Card;
import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    List<Card> findByCustomerId(int customerId);
}
