/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.GioHang;
import model.Item;
import model.SanPham;
import model.SanPhamDAO;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "GioHangServlet", urlPatterns = {"/GioHangServlet"})
public class GioHangServlet extends HttpServlet {

    private final SanPhamDAO spDAO = new SanPhamDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String id = request.getParameter("id");
        GioHang cart = (GioHang) session.getAttribute("giohang");
        
        try {
            Long idProduct = Long.parseLong(id);
            SanPham sp = SanPhamDAO.getSanPham(id);
            switch (command) {
                case "plus":
                    if (cart.getCartItems().containsKey(idProduct)) {
                        cart.plusToCart(idProduct, new Item(sp,
                                cart.getCartItems().get(id).getQuantity()));
                    } else {
                        cart.plusToCart(idProduct, new Item(sp, 1));
                    }
                    break;
                case "remove":
                    cart.removeToCart(idProduct);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/web/index.jsp");
        }
        session.setAttribute("cart", cart);
        response.sendRedirect("/web/index.jsp");
    }

}
