/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class TaxCalculationTest {

    static User user;
    static UserDAO userdao;

    public TaxCalculationTest() {
        user = new User();
        userdao = new UserDAO();
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() throws SQLException {
        user.setCmnd("");
        user.setMatKhau("");
        user.setHoTen("");
        user.setNgaySinh(Date.valueOf(""));
        user.setSoThangHopDongLaoDong(0);
        user.setLuong(0);
        user.setThuong(0);
        user.setDinhMucThuong(0);
        user.setLamThem(0);
        user.setDinhMucLamThem(0);
        user.setPhuCap1(0);
        user.setPhuCap2(0);
        user.setPhuCap3(0);
        user.setDinhMucPhuCap3(0);
        user.setPhuCap4(0);
        user.setDinhMucPhuCap4(0);
        user.setSoNguoiPhuThuoc(0);

        userdao.addUser(user);

        String sql = "SELECT FROM tbl_user WHERE cmnd = ?";
        PreparedStatement ps = userdao.connection.prepareStatement(sql);
        ps.setString(1, user.getCmnd());
        assertEquals(ps.executeUpdate(), 1);
    }

    @After
    public void tearDown() throws SQLException {
        String sql = "DELETE FROM tbl_user WHERE cmnd = ?";
        PreparedStatement ps = userdao.connection.prepareStatement(sql);
        ps.setString(1, user.getCmnd());
        ps.executeUpdate();
    }

    /**
     * Test of tinhTongThuNhap method, of class TaxCalculation.
     */
    @Test
    public void testTinhTongThuNhap() {
        System.out.println("tinhTongThuNhap");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhTongThuNhap(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tinhThuePhaiNop method, of class TaxCalculation.
     */
    @Test
    public void testTinhThuePhaiNop() {
        System.out.println("tinhThuePhaiNop");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhThuePhaiNop(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tinhThuNhapTinhThue method, of class TaxCalculation.
     */
    @Test
    public void testTinhThuNhapTinhThue() {
        System.out.println("tinhThuNhapTinhThue");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhThuNhapTinhThue(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tinhThuNhapChiuThue method, of class TaxCalculation.
     */
    @Test
    public void testTinhThuNhapChiuThue() {
        System.out.println("tinhThuNhapChiuThue");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhThuNhapChiuThue(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tinhThuNhapMienThue method, of class TaxCalculation.
     */
    @Test
    public void testTinhThuNhapMienThue() {
        System.out.println("tinhThuNhapMienThue");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhThuNhapMienThue(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tinhCacKhoanGiamTru method, of class TaxCalculation.
     */
    @Test
    public void testTinhCacKhoanGiamTru() {
        System.out.println("tinhCacKhoanGiamTru");
        User u = null;
        long expResult = 0L;
        long result = TaxCalculation.tinhCacKhoanGiamTru(u);
        assertEquals(expResult, result);
    }

}
