/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;

/**
 *
 * @author NamAnh
 */
public class TaxCalculation {

    public static final long DINH_MUC_TIEN_AN = 730000;
    public static final long DINH_MUC_TIEN_TRANG_PHUC = 416667;
    public static final long GIAM_TRU_BAN_THAN = 9000000;
    public static final long GIAM_TRU_NGUOI_PHU_THUOC = 3600000;

    public static final double THUE_SUAT_BAC_1 = 0.05;  //Thu nhập đến 5tr
    public static final double THUE_SUAT_BAC_2 = 0.1;   //Thu nhập trên 5tr đến 10tr
    public static final double THUE_SUAT_BAC_3 = 0.15;  //Thu nhập trên 10tr đến 18tr
    public static final double THUE_SUAT_BAC_4 = 0.2;   //Thu nhập trên 18tr đến 32tr
    public static final double THUE_SUAT_BAC_5 = 0.25;  //Thu nhập trên 32tr đến 52tr
    public static final double THUE_SUAT_BAC_6 = 0.3;   //Thu nhập trên 52tr đến 80tr
    public static final double THUE_SUAT_BAC_7 = 0.35;  //Thu nhập trên 80tr

    public static final double THUE_SUAT_HDLD_DUOI_3_THANG_HOAC_KHONG_HDLD = 0.1;

    public static long tinhTongThuNhap(User u) {
        return u.getLuong() + u.getThuong() + u.getLamThem()
                + u.getPhuCap1() + u.getPhuCap2()
                + u.getPhuCap3() + u.getPhuCap4();
    }
    
    public static long tinhThuePhaiNop(User u) {
        if (u.getSoThangHopDongLaoDong() >= 3) {
            long thuNhapTinhThue = tinhThuNhapTinhThue(u);

            if (thuNhapTinhThue > 80000000) {           //Trên 80tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_7 - 9850000);
            } else if (thuNhapTinhThue > 52000000) {    //Trên 52 đến 80tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_6 - 5850000);
            } else if (thuNhapTinhThue > 32000000) {    //Trên 32 đến 52tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_5 - 3250000);
            } else if (thuNhapTinhThue > 18000000) {    //Trên 18 đến 32tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_4 - 1650000);
            } else if (thuNhapTinhThue > 10000000) {    //Trên 10 đến 18tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_3 - 750000);
            } else if (thuNhapTinhThue > 5000000) {     //Trên 5 đến 10tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_2 - 250000);
            } else {                                    //Đến 5tr
                return (long) (thuNhapTinhThue * THUE_SUAT_BAC_1);
            }
        } else {
            return (long) (tinhThuNhapTinhThue(u) * THUE_SUAT_HDLD_DUOI_3_THANG_HOAC_KHONG_HDLD);
        }
    }

    public static long tinhThuNhapTinhThue(User u) {
        return tinhThuNhapChiuThue(u) - tinhCacKhoanGiamTru(u);
    }
    
    public static long tinhThuNhapChiuThue(User u){
        long tinhThue = 0 + u.getLuong();

        if (u.getPhuCap1() > DINH_MUC_TIEN_AN) {
            tinhThue += u.getPhuCap1() - DINH_MUC_TIEN_AN;
        }

        if (u.getPhuCap2() > DINH_MUC_TIEN_TRANG_PHUC) {
            tinhThue += u.getPhuCap2() - DINH_MUC_TIEN_TRANG_PHUC;
        }

        if (u.getPhuCap3() > u.getDinhMucPhuCap3()) {
            tinhThue += u.getPhuCap3() - u.getDinhMucPhuCap3();
        }

        if (u.getPhuCap4() > u.getDinhMucPhuCap4()) {
            tinhThue += u.getPhuCap4() - u.getDinhMucPhuCap4();
        }
        
        return tinhThue;
    }

    public static long tinhThuNhapMienThue(User u) {
        long mienThue = 0 + u.getThuong();

        if (u.getPhuCap1() > DINH_MUC_TIEN_AN) {
            mienThue += DINH_MUC_TIEN_AN;
        } else {
            mienThue += u.getPhuCap1();
        }

        if (u.getPhuCap2() > DINH_MUC_TIEN_TRANG_PHUC) {
            mienThue += DINH_MUC_TIEN_TRANG_PHUC;
        } else {
            mienThue += u.getPhuCap2();
        }

        if (u.getPhuCap3() > u.getDinhMucPhuCap3()) {
            mienThue += u.getDinhMucPhuCap3();
        } else {
            mienThue += u.getPhuCap3();
        }

        if (u.getPhuCap4() > u.getDinhMucPhuCap4()) {
            mienThue += u.getDinhMucPhuCap4();
        } else {
            mienThue += u.getPhuCap4();
        }

        return mienThue;
    }

    public static long tinhCacKhoanGiamTru(User u) {
        return GIAM_TRU_BAN_THAN + u.getSoNguoiPhuThuoc() * GIAM_TRU_NGUOI_PHU_THUOC;
    }
}
