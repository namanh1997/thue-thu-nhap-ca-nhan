/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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

    public UserDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/thue";
        String userDatabase = "root";
        String password = "1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, userDatabase, password);
        connection.setAutoCommit(false);
    }

    @After
    public void tearDown() throws SQLException {
        connection.rollback();
        connection.close();
    }

    /**
     * Test of findUser method, of class UserDAO.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        User user = new User("123456789", Md5.encrypt("123456"));
        UserDAO instance = new UserDAO();
        User expResult = user;
        User result = instance.findUser(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of addUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() throws SQLException {
        System.out.println("addUser");

        User user = new User();
        user.setCmnd("444444444");
        user.setMatKhau("654321");
        user.setHoTen("Test");
        user.setNgaySinh(Date.valueOf("1997-01-20"));
        user.setSoThangHopDongLaoDong(4);
        user.setLuong(10000000);
        user.setThuong(0);
        user.setDinhMucThuong(1000);
        user.setLamThem(0);
        user.setDinhMucLamThem(0);
        user.setPhuCap1(730000);
        user.setPhuCap2(400000);
        user.setPhuCap3(0);
        user.setDinhMucPhuCap3(0);
        user.setPhuCap4(0);
        user.setDinhMucPhuCap4(0);
        user.setSoNguoiPhuThuoc(0);
        
        UserDAO instance = new UserDAO(connection);
        instance.addUser(user);
        
        assertEquals(user, instance.findUser(user));
    }

    /**
     * Test of updateUser method, of class UserDAO.
     */
    @Test
    public void testUpdateUser() throws SQLException {
        System.out.println("updateUser");
        
        User user = new User();
        user.setCmnd("987654321");
        user.setMatKhau("654321");
        user.setSoThangHopDongLaoDong(4);
        user.setLuong(100000000);
        user.setThuong(0);
        user.setDinhMucThuong(1000);
        user.setLamThem(0);
        user.setDinhMucLamThem(0);
        user.setPhuCap1(730000);
        user.setPhuCap2(400000);
        user.setPhuCap3(0);
        user.setDinhMucPhuCap3(0);
        user.setPhuCap4(0);
        user.setDinhMucPhuCap4(0);
        user.setSoNguoiPhuThuoc(0);
        
        UserDAO instance = new UserDAO(connection);
        instance.updateUser(user);
        
        assertEquals(user, instance.findUser(user));
    }

}
