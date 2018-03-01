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
public class HoaDonDAO {


    public static HoaDon getHoaDon(String idHD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    PreparedStatement pre1, pre2, pre3, pre4;
    ConnectDB con = new ConnectDB();

    public int addHoaDon(HoaDon hoadon) {
        try {
            conn = new ConnectDB().getConnect();
            pre1 = conn.prepareStatement("INSERT INTO `tbhoadon` (`idHD`, `idKH`, `ngaylapHD`, `Price`, `Note`) VALUES (?, ?, ?, ?, ?);");
            pre1.setString(1, hoadon.getIdHD());
            pre1.setString(2, hoadon.getIdKH());
            pre1.setString(3, hoadon.getNgaylapHD());
            pre1.setInt(4, hoadon.getPrice());
            pre1.setString(5, hoadon.getNote());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<HoaDon> getAllHoaDon() throws ParseException, SQLException {
        List<HoaDon> listhd = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM `tbhoadon`");
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
                listhd.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listhd;
    }

    public Vector getHoaDonByID(String idHD) {
        Vector kq = new Vector();
        conn = con.getConnect();
        try {
            pre2 = conn.prepareStatement("SELECT * FROM `tbhoadon` WHERE `idHD`=?");
            pre2.setString(1, idHD);
            ResultSet rs = pre2.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
                kq.add(rs.getString(2));
                kq.add(rs.getString(3));
                kq.add(rs.getInt(4));
                kq.add(rs.getString(5));
            }
            rs.close();
            pre2.close();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateHoaDon(HoaDon hoadon) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `tbhoadon` SET `idKH` = ?, `ngaylapHD` = ?, `price` = ?, `note` = ? WHERE `tbhoadon`.`idHD` = ?;");
            pre3.setString(1, hoadon.getIdKH());
            pre3.setString(2, hoadon.getNgaylapHD());
            pre3.setInt(3, hoadon.getPrice());
            pre3.setString(4, hoadon.getNote());
            pre3.setString(5, hoadon.getIdHD());
            if (pre3.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delHoaDon(String idHD) {
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("DELETE FROM `tbhoadon` WHERE `idHD`=?");
            pre4.setString(1, idHD);
            if (pre4.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

//    public static void main(String[] args) {
//        HoaDon hd = new HoaDon("123", "123", "132", 2, 13, "dvdf");
//        HoaDonDAO hdd = new HoaDonDAO();
//        System.out.println(hdd.addHoaDon(hd));
//
//    }
}
