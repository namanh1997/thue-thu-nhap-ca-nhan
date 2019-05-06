/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.UserDAO.connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NamAnh
 */
public class UserDAOTest {
    
    Connection connection;

    public UserDAOTest() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/thue";
        String userDatabase = "root";
        String password = "1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, userDatabase, password);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tbl_user (cmnd, mat_khau, ho_ten, ngay_sinh,"
                + "so_thang_hop_dong_lao_dong, luong, thuong, dinh_muc_thuong, "
                + "lam_them, dinh_muc_lam_them, phu_cap_1, phu_cap_2, phu_cap_3,"
                + " dinh_muc_phu_cap_3, phu_cap_4, dinh_muc_phu_cap_4, "
                + "so_nguoi_phu_thuoc) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "");
        ps.setString(2, "");
        ps.setString(3, "");
        ps.setDate(4, Date.valueOf(""));
        ps.setString(5, String.valueOf(0));
        ps.setString(6, String.valueOf(0));
        ps.setString(7, String.valueOf(0));
        ps.setString(8, String.valueOf(0));
        ps.setString(9, String.valueOf(0));
        ps.setString(10, String.valueOf(0));
        ps.setString(11, String.valueOf(0));
        ps.setString(12, String.valueOf(0));
        ps.setString(13, String.valueOf(0));
        ps.setString(14, String.valueOf(0));
        ps.setString(15, String.valueOf(0));
        ps.setString(16, String.valueOf(0));
        ps.setString(17, String.valueOf(0));
        ps.executeUpdate();
    }

    @After
    public void tearDown() throws SQLException {
        String sql = "DELETE FROM tbl_user WHERE cmnd = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "");
        ps.executeUpdate();
    }

    /**
     * Test of findUser method, of class UserDAO.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        User user = null;
        UserDAO instance = new UserDAO();
        User expResult = null;
        User result = instance.findUser(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of addUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        UserDAO instance = new UserDAO();
        instance.addUser(user);
        assertEquals(instance.findUser(user), user);
    }

    /**
     * Test of updateUser method, of class UserDAO.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserDAO instance = new UserDAO();
        instance.updateUser(user);
        assertEquals(instance.findUser(user), user);
    }

}
