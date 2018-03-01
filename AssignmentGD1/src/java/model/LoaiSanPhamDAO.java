/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class LoaiSanPhamDAO {

    public static LoaiSanPham getLoaiSanPham(String idM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    PreparedStatement pre1, pre2, pre3, pre4;
    ConnectDB con = new ConnectDB();

    public int addLoaiSanPham(LoaiSanPham loaisanpham) {
        try {
            conn = new ConnectDB().getConnect();
            pre1 = conn.prepareStatement("INSERT INTO `tbloaisanpham` (`idM`, `TenLSP`, `MoTa`) VALUES (?, ?, ?);");
            pre1.setString(1, loaisanpham.getIdM());
            pre1.setString(2, loaisanpham.getTenLSP());
            pre1.setString(3, loaisanpham.getMoTa());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<LoaiSanPham> getAllLoaiSanPham() throws ParseException, SQLException {
        List<LoaiSanPham> listlsp = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM `tbloaisanpham`");
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                listlsp.add(lsp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listlsp;
    }

    public Vector getLoaiSanPhamByID(String idM) {
        Vector kq = new Vector();
        conn = con.getConnect();
        try {
            pre2 = conn.prepareStatement("SELECT * FROM `tbloaisanpham` WHERE `idM`=?");
            pre2.setString(1, idM);
            ResultSet rs = pre2.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
                kq.add(rs.getString(2));
                kq.add(rs.getString(3));
            }
            rs.close();
            pre2.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateLoaiSanPham(LoaiSanPham loaisanpham) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `tbloaisanpham` SET `TenLSP` = ?, `MoTa` = ? WHERE `tbloaisanpham`.`idM` = ?;");
            pre3.setString(1, loaisanpham.getTenLSP());
            pre3.setString(2, loaisanpham.getMoTa());
            pre3.setString(3, loaisanpham.getIdM());
            if (pre3.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delLoaiSanPham(String idM) {
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("DELETE FROM `tbloaisanpham` WHERE `idM`=?");
            pre4.setString(1, idM);
            if (pre4.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

//    public static void main(String[] args) {
//        SanPham sp = new SanPham("123", "123", "132", 2, 13, "dvdf");
//        SanPhamDAO spd = new SanPhamDAO();
//        System.out.println(spd.addSanPham(sp));
//
//    }
}
