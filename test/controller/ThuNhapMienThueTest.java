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
public class ThuNhapMienThueTest {

    public static final long DINH_MUC_TIEN_AN = 730000;
    public static final long DINH_MUC_TIEN_TRANG_PHUC = 416667;

    public ThuNhapMienThueTest() {
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
    public void testAllTrue(){
        User user = new User();
        user.setLuong(10000000);
        user.setThuong(1000000);
        user.setDinhMucThuong(0);
        user.setLamThem(1000000);
        user.setDinhMucLamThem(0);
        user.setPhuCap1(8000000);
        user.setPhuCap2(5000000);
        user.setPhuCap3(100000);
        user.setDinhMucPhuCap3(0);
        user.setPhuCap4(100000);
        user.setDinhMucPhuCap4(0);
        
        long expResult = DINH_MUC_TIEN_AN + DINH_MUC_TIEN_TRANG_PHUC 
                + user.getDinhMucPhuCap3() + user.getDinhMucPhuCap4() 
                + user.getDinhMucLamThem() + user.getDinhMucThuong();
        long result = TaxCalculation.tinhThuNhapMienThue(user);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAllFalse() {
        User user = new User();
        user.setLuong(10000000);
        user.setThuong(1000);
        user.setDinhMucThuong(1000000);
        user.setLamThem(1000);
        user.setDinhMucLamThem(1000000);
        user.setPhuCap1(8000);
        user.setPhuCap2(5000);
        user.setPhuCap3(100000);
        user.setDinhMucPhuCap3(1000000);
        user.setPhuCap4(100000);
        user.setDinhMucPhuCap4(1000000);

        long expResult = user.getPhuCap1() + user.getPhuCap2()
                + user.getPhuCap3() + user.getPhuCap4()
                + user.getLamThem() + user.getThuong();
        long result = TaxCalculation.tinhThuNhapMienThue(user);
        assertEquals(expResult, result);
    }
}
