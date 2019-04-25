/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author NamAnh
 */
public class UserDAO {

    public static Connection connection;

    public UserDAO() {
        
        String url = "jdbc:mysql://localhost:3306/thue";
        String userDatabase = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userDatabase, password);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User findUser(User user) {
        String sql = "SELECT * FROM tbl_user WHERE cmnd = ? AND mat_khau = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getCmnd());
            ps.setString(2, user.getMatKhau());
            ResultSet rs = ps.executeQuery();
            while (rs.first()) {
                user.setHoTen(rs.getString("ho_ten"));
                user.setSoThangHopDongLaoDong(rs.getInt("so_thang_hop_dong_lao_dong"));
                user.setLuong(rs.getLong("luong"));
                user.setThuong(rs.getLong("thuong"));
                user.setPhuCap1(rs.getLong("phu_cap_1"));
                user.setPhuCap2(rs.getLong("phu_cap_2"));
                user.setPhuCap3(rs.getLong("phu_cap_3"));
                user.setDinhMucPhuCap3(rs.getLong("dinh_muc_phu_cap_3"));
                user.setPhuCap4(rs.getLong("phu_cap_4"));
                user.setDinhMucPhuCap4(rs.getLong("dinh_muc_phu_cap_4"));
                user.setSoNguoiPhuThuoc(rs.getInt("so_nguoi_phu_thuoc"));
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void addUser(User user) {
        String sql = "INSERT INTO tbl_user (cmnd, mat_khau, ho_ten, ngay_sinh,"
                + "so_thang_hop_dong_lao_dong, luong, thuong, dinh_muc_thuong, "
                + "lam_them, dinh_muc_lam_them, phu_cap_1, phu_cap_2, phu_cap_3,"
                + " dinh_muc_phu_cap_3, phu_cap_4, dinh_muc_phu_cap_4, "
                + "so_nguoi_phu_thuoc) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getCmnd());
            ps.setString(2, user.getMatKhau());
            ps.setString(3, user.getHoTen());
            ps.setDate(4, user.getNgaySinh());
            ps.setString(5, String.valueOf(user.getSoThangHopDongLaoDong()));
            ps.setString(6, String.valueOf(user.getLuong()));
            ps.setString(7, String.valueOf(user.getThuong()));
            ps.setString(8, String.valueOf(user.getDinhMucThuong()));
            ps.setString(9, String.valueOf(user.getLamThem()));
            ps.setString(10, String.valueOf(user.getDinhMucLamThem()));
            ps.setString(11, String.valueOf(user.getPhuCap1()));
            ps.setString(12, String.valueOf(user.getPhuCap2()));
            ps.setString(13, String.valueOf(user.getPhuCap3()));
            ps.setString(14, String.valueOf(user.getDinhMucPhuCap3()));
            ps.setString(15, String.valueOf(user.getPhuCap4()));
            ps.setString(16, String.valueOf(user.getDinhMucPhuCap4()));
            ps.setString(17, String.valueOf(user.getSoNguoiPhuThuoc()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE tbl_user SET so_thang_hop_dong_lao_dong = ?, luong = ? ,"
                + "thuong = ?, dinh_muc_thuong = ?, lam_them = ?, dinh_muc_lam_them = ?,"
                + "phu_cap_1 = ?, phu_cap_2 = ?, phu_cap_3 = ?, dinh_muc_phu_cap_3 = ?,"
                + "phu_cap_4 = ?, dinh_muc_phu_cap_4 = ?, so_nguoi_phu_thuoc = ?"
                + "WHERE cmnd = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, String.valueOf(user.getSoThangHopDongLaoDong()));
            ps.setString(2, String.valueOf(user.getLuong()));
            ps.setString(3, String.valueOf(user.getThuong()));
            ps.setString(4, String.valueOf(user.getDinhMucThuong()));
            ps.setString(5, String.valueOf(user.getLamThem()));
            ps.setString(6, String.valueOf(user.getDinhMucLamThem()));
            ps.setString(7, String.valueOf(user.getPhuCap1()));
            ps.setString(8, String.valueOf(user.getPhuCap2()));
            ps.setString(9, String.valueOf(user.getPhuCap3()));
            ps.setString(10, String.valueOf(user.getDinhMucPhuCap3()));
            ps.setString(11, String.valueOf(user.getPhuCap4()));
            ps.setString(12, String.valueOf(user.getDinhMucPhuCap4()));
            ps.setString(13, String.valueOf(user.getSoNguoiPhuThuoc()));
            ps.setString(14, user.getCmnd());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
