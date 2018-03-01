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
public class KhachHangDAO {

    Connection conn = null;
    PreparedStatement pre1, pre2, pre3, pre4;
    ConnectDB con = new ConnectDB();

    public int addKhachHang(KhachHang khachhang) {
        conn = new ConnectDB().getConnect();
        try {
            pre1 = conn.prepareStatement("INSERT INTO `tbkhachhang` (`MaKH`, `TenKH`, `DiaChi`, `Email`, `SoDienThoai`) VALUES (?, ?, ?, ?, ?);");
            pre1.setString(1, khachhang.getMaKH());
            pre1.setString(2, khachhang.getTenKH());
            pre1.setString(3, khachhang.getDiaChi());
            pre1.setString(4, khachhang.getEmail());
            pre1.setInt(5, khachhang.getSoDienThoai());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<KhachHang> getAllKhachHang() throws ParseException, SQLException {
        List<KhachHang> listsp = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM `tbkhachhang`");
            while (rs.next()) {
                KhachHang KH = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                listsp.add(KH);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listsp;
    }

    public Vector getKhachHang(String id) {
        Vector kq = new Vector();
        conn = con.getConnect();
        try {
            pre2 = conn.prepareStatement("SELECT * FROM `tbkhachhang` WHERE `MaKH`=?");
            pre2.setString(1, id);
            ResultSet rs = pre2.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
                kq.add(rs.getString(2));
                kq.add(rs.getString(3));
                kq.add(rs.getString(4));
                kq.add(rs.getInt(5));
            }
            rs.close();
            pre2.close();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateKhachHang(KhachHang KH) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `tbkhachhang` SET `TenKH` = ?, `DiaChi` = ?, `Email` = ?, `SoDienThoai` = ? WHERE `tbkhachhang`.`MaKH` = ?;");
            pre3.setString(1, KH.getTenKH());
            pre3.setString(2, KH.getDiaChi());
            pre3.setString(3, KH.getEmail());
            pre3.setInt(4, KH.getSoDienThoai());
            pre3.setString(5, KH.getMaKH());
            if (pre3.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delKhachHang(String MaKH) {
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("DELETE FROM `tbkhachhang` WHERE `tbkhachhang`.`MaKH` = ?");
            pre4.setString(1, MaKH);
            if (pre4.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
}
