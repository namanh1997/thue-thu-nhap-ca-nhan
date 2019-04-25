/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controller.UserDAO;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author NamAnh
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String cmnd = request.getParameter("cmnd");
        String matKhau = request.getParameter("mat-khau");
        
        //mã hóa md5
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(matKhau.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));//chuyển hệ 10 sang hệ 16
            }
            matKhau = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        User user = new User(cmnd, matKhau);
        UserDAO userDAO = new UserDAO();

        if (userDAO.findUser(user) == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            user = userDAO.findUser(user);
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("/declare.jsp").forward(request, response);
        }
        
    }

}
