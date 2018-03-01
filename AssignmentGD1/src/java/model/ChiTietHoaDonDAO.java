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
public class ChiTietHoaDonDAO {
        public static ChiTietHoaDon getChiTietHoaDon(String idHD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    PreparedStatement pre1, pre2, pre3, pre4;
    ConnectDB con = new ConnectDB();

    public int addChiTietHoaDon(ChiTietHoaDon cthd) {
        try {
            conn = new ConnectDB().getConnect();
            pre1 = conn.prepareStatement("INSERT INTO `tbchitiethoadon` (`idHD`, `id`, `DonGia`, `SoLuong`, `ThanhTien`, `GhiChu`) VALUES (?, ?, ?, ?, ?, ?);");
            pre1.setString(1, cthd.getIdHD());
            pre1.setString(2, cthd.getId());
            pre1.setInt(3, cthd.getDonGia());
            pre1.setInt(4, cthd.getSoLuong());
            pre1.setInt(5, cthd.getThanhTien());
            pre1.setString(6, cthd.getGhiChu());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<ChiTietHoaDon> getAllChiTietHoaDon() throws ParseException, SQLException {
        List<ChiTietHoaDon> listcthd = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM `tbchitiethoadon`");
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
                listcthd.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listcthd;
    }

    public Vector getChiTietHoaDonByID(String idHD) {
        Vector kq = new Vector();
        conn = con.getConnect();
        try {
            pre2 = conn.prepareStatement("SELECT * FROM `tbchitiethoadon` WHERE `idHD`=?");
            pre2.setString(1, idHD);
            ResultSet rs = pre2.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
                kq.add(rs.getString(2));
                kq.add(rs.getInt(3));
                kq.add(rs.getInt(4));
                kq.add(rs.getInt(5));
                kq.add(rs.getString(6));
            }
            rs.close();
            pre2.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateChiTietHoaDon(ChiTietHoaDon cthd) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `tbchitiethoadon` SET `id` = ?, `DonGia` = ?, `SoLuong` = ?, `ThanhTien` = ?, `GhiChu` = ? WHERE `tbchitiethoadon`.`idHD` = ?;");
            pre3.setString(1, cthd.getId());
            pre3.setInt(2, cthd.getDonGia());
            pre3.setInt(3, cthd.getSoLuong());
            pre3.setInt(4, cthd.getThanhTien());
            pre3.setString(5, cthd.getGhiChu());
            pre3.setString(6, cthd.getIdHD());
            if (pre3.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delChiTietHoaDon(String idHD) {
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("DELETE FROM `tbchitiethoadon` WHERE `idHD`=?");
            pre4.setString(1, idHD);
            if (pre4.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

//    public static void main(String[] args) {
//        ChiTietHoaDon hd = new ChiTietHoaDon("123", "123", "132", 2, 13, "dvdf");
//        ChiTietHoaDonDAO hdd = new ChiTietHoaDonDAO();
//        System.out.println(hdd.addChiTietHoaDon(hd));
//
//    }
}
