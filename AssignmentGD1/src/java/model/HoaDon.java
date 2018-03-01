/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private String idHD;
    private String idKH;
    private String ngaylapHD;
    private int price;
    private String note;

    public HoaDon() {
    }

    public HoaDon(String idHD, String idKH, String ngaylapHD, int price, String note) {
        this.idHD = idHD;
        this.idKH = idKH;
        this.ngaylapHD = ngaylapHD;
        this.price = price;
        this.note = note;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getNgaylapHD() {
        return ngaylapHD;
    }

    public void setNgaylapHD(String ngaylapHD) {
        this.ngaylapHD = ngaylapHD;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
