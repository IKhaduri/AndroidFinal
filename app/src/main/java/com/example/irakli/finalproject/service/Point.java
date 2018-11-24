package com.example.irakli.finalproject.service;

public class Point {
     String  Id;
     String ProductName;
     Integer  OrderNo;
     Double Amount;
     String ProdType;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(Integer orderNo) {
        OrderNo = orderNo;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getProdType() {
        return ProdType;
    }

    public void setProdType(String prodType) {
        ProdType = prodType;
    }
}
