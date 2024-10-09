package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }

    private BigDecimal cardLimit;
}
