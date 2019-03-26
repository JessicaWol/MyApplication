package com.example.myapplication;

import java.util.List;

public class RestProductsResponse {

    private List<products> produits;

    public List<products> getProduits() {
        return produits;
    }

    public void setProduits(List<products> produits) {
        this.produits = produits;
    }
}
