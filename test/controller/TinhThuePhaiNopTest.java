/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class TinhThuePhaiNopTest {

    public static final double THUE_SUAT_BAC_1 = 0.05;  //Thu nhập đến 5tr
    public static final double THUE_SUAT_BAC_2 = 0.1;   //Thu nhập trên 5tr đến 10tr
    public static final double THUE_SUAT_BAC_3 = 0.15;  //Thu nhập trên 10tr đến 18tr
    public static final double THUE_SUAT_BAC_4 = 0.2;   //Thu nhập trên 18tr đến 32tr
    public static final double THUE_SUAT_BAC_5 = 0.25;  //Thu nhập trên 32tr đến 52tr
    public static final double THUE_SUAT_BAC_6 = 0.3;   //Thu nhập trên 52tr đến 80tr
    public static final double THUE_SUAT_BAC_7 = 0.35;  //Thu nhập trên 80tr

    public TinhThuePhaiNopTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testThueSuatBac7() {
        User user = new User();
        user.setLuong(9000000 + 80001000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 18150350;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac6() {
        User user = new User();
        user.setLuong(9000000 + 80000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 18150000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac5() {
        User user = new User();
        user.setLuong(9000000 + 52000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 9750000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac4() {
        User user = new User();
        user.setLuong(9000000 + 32000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 4750000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac3() {
        User user = new User();
        user.setLuong(9000000 + 18000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 1950000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac2() {
        User user = new User();
        user.setLuong(9000000 + 10000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 750000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThueSuatBac1() {
        User user = new User();
        user.setLuong(9000000 + 5000000);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 250000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThuNhapTinhThueBang0CoHDLD() {
        User user = new User();
        user.setLuong(0);
        user.setSoThangHopDongLaoDong(1);
        long expResult = 0;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testKhongCoHDLD() {
        User user = new User();
        user.setLuong(9000000 + 1000000);
        user.setSoThangHopDongLaoDong(0);
        long expResult = 100000;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }

    @Test
    public void testThuNhapTinhThueBang0KhongCoHDLD() {
        User user = new User();
        user.setLuong(0);
        user.setSoThangHopDongLaoDong(0);
        long expResult = 0;
        long result = TaxCalculation.tinhThuePhaiNop(user);
        assertEquals(expResult, result);
    }
}
