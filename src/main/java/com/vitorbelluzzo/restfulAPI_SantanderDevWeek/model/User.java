package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model;

import jakarta.persistence.*;

@Entity(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne
    private Account account;
    @OneToOne
    private  Card card;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Feature feature;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private News news;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
