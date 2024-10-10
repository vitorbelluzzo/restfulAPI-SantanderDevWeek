package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private  String number;
    @Column(precision = 13, scale = 2)
    private BigDecimal cardLimit;

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

}
