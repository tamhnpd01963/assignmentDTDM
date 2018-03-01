/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Item {
    private SanPham product;
    private int quantity;

    public Item() {
    }

    public Item(SanPham product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SanPham getProduct() {
        return product;
    }

    public void setProduct(SanPham product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
