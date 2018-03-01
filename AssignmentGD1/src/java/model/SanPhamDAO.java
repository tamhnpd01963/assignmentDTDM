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
public class SanPhamDAO {

    public static SanPham getSanPham(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    PreparedStatement pre1, pre2, pre3, pre4;
    ConnectDB con = new ConnectDB();

    public int addSanPham(SanPham sanpham) {
        try {
            conn = new ConnectDB().getConnect();
            pre1 = conn.prepareStatement("INSERT INTO `tbsanpham` (`id`, `name`, `idM`, `quantity`, `price`, `note`) VALUES (?, ?, ?, ?, ?, ?);");
            pre1.setString(1, sanpham.getId());
            pre1.setString(2, sanpham.getName());
            pre1.setString(3, sanpham.getIdM());
            pre1.setInt(4, sanpham.getQuatity());
            pre1.setInt(5, sanpham.getPrice());
            pre1.setString(6, sanpham.getNote());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<SanPham> getAllSanPham() throws ParseException, SQLException {
        List<SanPham> listsp = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM `tbsanpham`");
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
                listsp.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listsp;
    }

    public Vector getSanPhamByID(String id) {
        Vector kq = new Vector();
        conn = con.getConnect();
        try {
            pre2 = conn.prepareStatement("SELECT * FROM `tbsanpham` WHERE `id`=?");
            pre2.setString(1, id);
            ResultSet rs = pre2.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
                kq.add(rs.getString(2));
                kq.add(rs.getString(3));
                kq.add(rs.getInt(4));
                kq.add(rs.getInt(5));
                kq.add(rs.getString(6));
            }
            rs.close();
            pre2.close();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateSanPham(SanPham sanpham) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `tbsanpham` SET `name` = ?, `idM` = ?, `quantity` = ?, `price` = ?, `note` = ? WHERE `tbsanpham`.`id` = ?;");
            pre3.setString(1, sanpham.getName());
            pre3.setString(2, sanpham.getIdM());
            pre3.setInt(3, sanpham.getQuatity());
            pre3.setInt(4, sanpham.getPrice());
            pre3.setString(5, sanpham.getNote());
            pre3.setString(6, sanpham.getId());
            if (pre3.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delSanPham(String id) {
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("DELETE FROM `tbsanpham` WHERE `id`=?");
            pre4.setString(1, id);
            if (pre4.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
    public static void main(String[] args) {
        SanPham sp =new SanPham("123", "123", "132", 2, 13, "dvdf");
        SanPhamDAO spd=new SanPhamDAO();
        System.out.println(spd.addSanPham(sp));
        
    }
}
