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
public class LoaiSanPham {
    private String idM;
    private String TenLSP;
    private String MoTa;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String idM, String TenLSP, String MoTa) {
        this.idM = idM;
        this.TenLSP = TenLSP;
        this.MoTa = MoTa;
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM;
    }

    public String getTenLSP() {
        return TenLSP;
    }

    public void setTenLSP(String TenLSP) {
        this.TenLSP = TenLSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
}
