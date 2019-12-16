package com.example.myapplication;

import java.util.List;

public class RestProductsResponse {

    private List<Products> produits;

    public List<Products> getProduits() {
        return produits;
    }

    public void setProduits(List<Products> produits) {
        this.produits = produits;
    }
}
