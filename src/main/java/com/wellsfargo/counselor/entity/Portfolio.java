package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne //1:1 relationship with client 
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
 

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
