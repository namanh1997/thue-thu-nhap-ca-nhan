/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
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
public class UserTest {
    
    public UserTest() {
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

    /**
     * Test of getCmnd method, of class User.
     */
    @Test
    public void testGetCmnd() {
        System.out.println("getCmnd");
        User instance = new User();
        String expResult = "";
        String result = instance.getCmnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCmnd method, of class User.
     */
    @Test
    public void testSetCmnd() {
        System.out.println("setCmnd");
        String cmnd = "";
        User instance = new User();
        instance.setCmnd(cmnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatKhau method, of class User.
     */
    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        User instance = new User();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatKhau method, of class User.
     */
    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String matKhau = "";
        User instance = new User();
        instance.setMatKhau(matKhau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoTen method, of class User.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        User instance = new User();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoTen method, of class User.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        User instance = new User();
        instance.setHoTen(hoTen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgaySinh method, of class User.
     */
    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        User instance = new User();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgaySinh method, of class User.
     */
    @Test
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date ngaySinh = null;
        User instance = new User();
        instance.setNgaySinh(ngaySinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoThangHopDongLaoDong method, of class User.
     */
    @Test
    public void testGetSoThangHopDongLaoDong() {
        System.out.println("getSoThangHopDongLaoDong");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getSoThangHopDongLaoDong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoThangHopDongLaoDong method, of class User.
     */
    @Test
    public void testSetSoThangHopDongLaoDong() {
        System.out.println("setSoThangHopDongLaoDong");
        long soThangHopDongLaoDong = 0L;
        User instance = new User();
        instance.setSoThangHopDongLaoDong(soThangHopDongLaoDong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLuong method, of class User.
     */
    @Test
    public void testGetLuong() {
        System.out.println("getLuong");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getLuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLuong method, of class User.
     */
    @Test
    public void testSetLuong() {
        System.out.println("setLuong");
        long luong = 0L;
        User instance = new User();
        instance.setLuong(luong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThuong method, of class User.
     */
    @Test
    public void testGetThuong() {
        System.out.println("getThuong");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getThuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThuong method, of class User.
     */
    @Test
    public void testSetThuong() {
        System.out.println("setThuong");
        long thuong = 0L;
        User instance = new User();
        instance.setThuong(thuong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDinhMucThuong method, of class User.
     */
    @Test
    public void testGetDinhMucThuong() {
        System.out.println("getDinhMucThuong");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getDinhMucThuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDinhMucThuong method, of class User.
     */
    @Test
    public void testSetDinhMucThuong() {
        System.out.println("setDinhMucThuong");
        long dinhMucThuong = 0L;
        User instance = new User();
        instance.setDinhMucThuong(dinhMucThuong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLamThem method, of class User.
     */
    @Test
    public void testGetLamThem() {
        System.out.println("getLamThem");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getLamThem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLamThem method, of class User.
     */
    @Test
    public void testSetLamThem() {
        System.out.println("setLamThem");
        long lamThem = 0L;
        User instance = new User();
        instance.setLamThem(lamThem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDinhMucLamThem method, of class User.
     */
    @Test
    public void testGetDinhMucLamThem() {
        System.out.println("getDinhMucLamThem");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getDinhMucLamThem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDinhMucLamThem method, of class User.
     */
    @Test
    public void testSetDinhMucLamThem() {
        System.out.println("setDinhMucLamThem");
        long dinhMucLamThem = 0L;
        User instance = new User();
        instance.setDinhMucLamThem(dinhMucLamThem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhuCap1 method, of class User.
     */
    @Test
    public void testGetPhuCap1() {
        System.out.println("getPhuCap1");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getPhuCap1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhuCap1 method, of class User.
     */
    @Test
    public void testSetPhuCap1() {
        System.out.println("setPhuCap1");
        long phuCap1 = 0L;
        User instance = new User();
        instance.setPhuCap1(phuCap1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhuCap2 method, of class User.
     */
    @Test
    public void testGetPhuCap2() {
        System.out.println("getPhuCap2");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getPhuCap2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhuCap2 method, of class User.
     */
    @Test
    public void testSetPhuCap2() {
        System.out.println("setPhuCap2");
        long phuCap2 = 0L;
        User instance = new User();
        instance.setPhuCap2(phuCap2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhuCap3 method, of class User.
     */
    @Test
    public void testGetPhuCap3() {
        System.out.println("getPhuCap3");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getPhuCap3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhuCap3 method, of class User.
     */
    @Test
    public void testSetPhuCap3() {
        System.out.println("setPhuCap3");
        long phuCap3 = 0L;
        User instance = new User();
        instance.setPhuCap3(phuCap3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDinhMucPhuCap3 method, of class User.
     */
    @Test
    public void testGetDinhMucPhuCap3() {
        System.out.println("getDinhMucPhuCap3");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getDinhMucPhuCap3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDinhMucPhuCap3 method, of class User.
     */
    @Test
    public void testSetDinhMucPhuCap3() {
        System.out.println("setDinhMucPhuCap3");
        long dinhMucPhuCap3 = 0L;
        User instance = new User();
        instance.setDinhMucPhuCap3(dinhMucPhuCap3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhuCap4 method, of class User.
     */
    @Test
    public void testGetPhuCap4() {
        System.out.println("getPhuCap4");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getPhuCap4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhuCap4 method, of class User.
     */
    @Test
    public void testSetPhuCap4() {
        System.out.println("setPhuCap4");
        long phuCap4 = 0L;
        User instance = new User();
        instance.setPhuCap4(phuCap4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDinhMucPhuCap4 method, of class User.
     */
    @Test
    public void testGetDinhMucPhuCap4() {
        System.out.println("getDinhMucPhuCap4");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getDinhMucPhuCap4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDinhMucPhuCap4 method, of class User.
     */
    @Test
    public void testSetDinhMucPhuCap4() {
        System.out.println("setDinhMucPhuCap4");
        long dinhMucPhuCap4 = 0L;
        User instance = new User();
        instance.setDinhMucPhuCap4(dinhMucPhuCap4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoNguoiPhuThuoc method, of class User.
     */
    @Test
    public void testGetSoNguoiPhuThuoc() {
        System.out.println("getSoNguoiPhuThuoc");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getSoNguoiPhuThuoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoNguoiPhuThuoc method, of class User.
     */
    @Test
    public void testSetSoNguoiPhuThuoc() {
        System.out.println("setSoNguoiPhuThuoc");
        long soNguoiPhuThuoc = 0L;
        User instance = new User();
        instance.setSoNguoiPhuThuoc(soNguoiPhuThuoc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
