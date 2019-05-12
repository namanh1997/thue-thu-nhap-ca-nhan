/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controller.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author NamAnh
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String cmnd = request.getParameter("cmnd");
        String hoTen = request.getParameter("hoTen");
        String ngaySinh = request.getParameter("ngaySinh");
        String matKhau = request.getParameter("matKhau");
        String nhapLaiMatKhau = request.getParameter("nhapLaiMatKhau");

        if (!matKhau.equals(nhapLaiMatKhau)) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Mật khẩu nhập lại không trùng');");
            out.println("</script>");
            request.getRequestDispatcher("/dang-ky.jsp").include(request, response);
            return;
        }

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

        User user = new User(cmnd, matKhau, hoTen, Date.valueOf(ngaySinh),
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        UserDAO userDAO = new UserDAO();

        if (userDAO.findUser(user) != null) { //tài khoản đã tồn tại
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Tài khoản đã tồn tại');");
            out.println("</script>");
            request.getRequestDispatcher("/dang-ky.jsp").include(request, response);

        } else {    //đăng ký thành công
            userDAO.addUser(user);
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Đăng ký thành công');");
            out.println("window.location= \"dang-nhap.jsp\";");
            out.println("</script>");
        }
    }

}
