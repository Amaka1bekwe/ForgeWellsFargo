package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long portId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private double riskFactor;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private int purchaseDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="portfolioID")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String type, int quantity, double price, double total, int purchaseDate) {
        this.String = type;
        this.int = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }

    public Long getPortId() {
        return portId;
    }

    public String getType() {
        return type;
    }

    public void setType(String firstName) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDate() {
        return purchaseDate;
    }

    public void setDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void getPorfolio(){
        return client; 
    }

    public void setCPortfolio(Client client){
        this.Client = client; 
    }
}
