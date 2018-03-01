/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.HoaDon;
import model.HoaDonDAO;
import model.User;
import model.UserDAO;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "HoaDonServlet", urlPatterns = {"/HoaDonServlet"})
public class HoaDonServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    HoaDonDAO hdDAO = new HoaDonDAO();
    UserDAO acDAO = new UserDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String idHD = request.getParameter("idHD");
            String idKH = request.getParameter("idKH");
            String ngaylapHD = request.getParameter("ngaylapHD");
            String price = request.getParameter("price");
            String note = request.getParameter("note");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String action = request.getParameter("action");
            if (action.equalsIgnoreCase("login")) {
                if (acDAO.login(user, pass) != null) {
                    if (acDAO.login(user, pass).getChucVu().equals("admin")) {
                        HttpSession session = request.getSession();
                        session.setAttribute("USERNAME", user);
                        request.getRequestDispatcher("admin.jsp").forward(request, response);
                    } else {
                        HttpSession session = request.getSession();
                        session.setAttribute("USERNAME", user);
                        request.getRequestDispatcher("menu1.jsp").forward(request, response);
                    }
                } else {
                    response.sendRedirect("login.jsp");
                }
            }

            switch (action) {

                case "add":
                    HttpSession ss = request.getSession();
                    if (ss.getAttribute("USERNAME") != null) {
                        HoaDon hd = new HoaDon(idHD, idKH, ngaylapHD, Integer.parseInt(price), note);
                        hdDAO.addHoaDon(hd);
                        request.setAttribute("LIST_HOADON", hdDAO.getAllHoaDon());
                        request.getRequestDispatcher("hoadon.jsp").forward(request, response);
                        break;
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }

                case "edit":
                    HttpSession ss1 = request.getSession();
                    if (ss1.getAttribute("USERNAME") != null) {
                        request.setAttribute("LIST_HOADON", hdDAO.getAllHoaDon());
                        Vector a = hdDAO.getHoaDonByID(idHD);
                        request.setAttribute("HOADON", a);
                        request.getRequestDispatcher("hoadon.jsp").forward(request, response);
                        break;
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                case "update":
                    HttpSession ss2 = request.getSession();
                    if (ss2.getAttribute("USERNAME") != null) {
                        HoaDon hd1 = new HoaDon(idHD, idKH, ngaylapHD, Integer.parseInt(price), note);
                        if (hdDAO.updateHoaDon(hd1) == 1) {
                            request.setAttribute("LIST_HOADON", hdDAO.getAllHoaDon());
                            request.getRequestDispatcher("hoadon.jsp").forward(request, response);
                        }
                        break;
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                case "del":
                    HttpSession ss3 = request.getSession();
                    if (ss3.getAttribute("USERNAME") != null) {
                        if (hdDAO.delHoaDon(idHD) == 1) {
                            request.setAttribute("LIST_HOADON", hdDAO.getAllHoaDon());
                            request.getRequestDispatcher("hoadon.jsp").forward(request, response);
                        }
                        break;
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }

                case "hienthi":
                    HttpSession ss4 = request.getSession();
                    if (ss4.getAttribute("USERNAME") != null) {
                        request.setAttribute("LIST_HOADON", hdDAO.getAllHoaDon());
                        request.getRequestDispatcher("hoadon.jsp").forward(request, response);
                        break;
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
