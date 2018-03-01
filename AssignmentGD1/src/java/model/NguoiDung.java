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
public class NguoiDung {
    private String idNguoiDung;
    private String username;
    private String password;

    public NguoiDung() {
    }

    public NguoiDung(String idNguoiDung, String username, String password) {
        this.idNguoiDung = idNguoiDung;
        this.username = username;
        this.password = password;
    }

    public String getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(String idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "idNguoiDung=" + idNguoiDung + ", username=" + username + ", password=" + password + '}';
    }
    
}
