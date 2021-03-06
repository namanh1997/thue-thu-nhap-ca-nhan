/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controller.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author NamAnh
 */
public class DeclareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("user");

        if (request.getParameter("hopDong").equals("tu3Thang")) {
            user.setSoThangHopDongLaoDong(1);
        } else if (request.getParameter("hopDong").equals("duoi3Thang")) {
            user.setSoThangHopDongLaoDong(0);
        }
        user.setLuong(Long.parseLong(request.getParameter("luong").replaceAll(",", "")));
        user.setThuong(Long.parseLong(request.getParameter("thuong").replaceAll(",", "")));
        user.setDinhMucThuong(Long.parseLong(request.getParameter("dinhMucThuong").replaceAll(",", "")));
        user.setLamThem(Long.parseLong(request.getParameter("tienLamThemGio").replaceAll(",", "")));
        user.setDinhMucLamThem(Long.parseLong(request.getParameter("dinhMucTienLamThemGio").replaceAll(",", "")));
        user.setPhuCap1(Long.parseLong(request.getParameter("phuCapTienAn").replaceAll(",", "")));
        user.setPhuCap2(Long.parseLong(request.getParameter("phuCapTrangPhuc").replaceAll(",", "")));
        user.setPhuCap3(Long.parseLong(request.getParameter("phuCapDiLai").replaceAll(",", "")));
        user.setDinhMucPhuCap3(Long.parseLong(request.getParameter("dinhMucPhuCapDiLai").replaceAll(",", "")));
        user.setPhuCap4(Long.parseLong(request.getParameter("phuCapKhac").replaceAll(",", "")));
        user.setDinhMucPhuCap4(Long.parseLong(request.getParameter("dinhMucPhuCapKhac").replaceAll(",", "")));
        user.setSoNguoiPhuThuoc(Integer.parseInt(request.getParameter("soNguoiPhuThuoc").replaceAll(",", "")));
        UserDAO userDAO = new UserDAO();
        userDAO.updateUser(user);
        
        request.getSession().setAttribute("user", user);
        request.getRequestDispatcher("/tinh-thue.jsp").forward(request, response);
    }

}
