/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author NamAnh
 */
public class User {

    private String cmnd;
    private String matKhau;
    private String hoTen;
    private Date ngaySinh;
    private long soThangHopDongLaoDong;
    private long luong;
    private long thuong;
    private long dinhMucThuong;
    private long lamThem;
    private long dinhMucLamThem;
    private long phuCap1;
    private long phuCap2;
    private long phuCap3;
    private long dinhMucPhuCap3;
    private long phuCap4;
    private long dinhMucPhuCap4;
    private long soNguoiPhuThuoc;

    public User() {
    }

    public User(String cmnd, String matKhau) {
        this.cmnd = cmnd;
        this.matKhau = matKhau;
    }

    public User(String cmnd, String matKhau, String hoTen, Date ngaySinh, long soThangHopDongLaoDong, long luong, long thuong, long dinhMucThuong, long lamThem, long dinhMucLamThem, long phuCap1, long phuCap2, long phuCap3, long dinhMucPhuCap3, long phuCap4, long dinhMucPhuCap4, long soNguoiPhuThuoc) {
        this.cmnd = cmnd;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soThangHopDongLaoDong = soThangHopDongLaoDong;
        this.luong = luong;
        this.thuong = thuong;
        this.dinhMucThuong = dinhMucThuong;
        this.lamThem = lamThem;
        this.dinhMucLamThem = dinhMucLamThem;
        this.phuCap1 = phuCap1;
        this.phuCap2 = phuCap2;
        this.phuCap3 = phuCap3;
        this.dinhMucPhuCap3 = dinhMucPhuCap3;
        this.phuCap4 = phuCap4;
        this.dinhMucPhuCap4 = dinhMucPhuCap4;
        this.soNguoiPhuThuoc = soNguoiPhuThuoc;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public long getSoThangHopDongLaoDong() {
        return soThangHopDongLaoDong;
    }

    public void setSoThangHopDongLaoDong(long soThangHopDongLaoDong) {
        this.soThangHopDongLaoDong = soThangHopDongLaoDong;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public long getThuong() {
        return thuong;
    }

    public void setThuong(long thuong) {
        this.thuong = thuong;
    }

    public long getDinhMucThuong() {
        return dinhMucThuong;
    }

    public void setDinhMucThuong(long dinhMucThuong) {
        this.dinhMucThuong = dinhMucThuong;
    }

    public long getLamThem() {
        return lamThem;
    }

    public void setLamThem(long lamThem) {
        this.lamThem = lamThem;
    }

    public long getDinhMucLamThem() {
        return dinhMucLamThem;
    }

    public void setDinhMucLamThem(long dinhMucLamThem) {
        this.dinhMucLamThem = dinhMucLamThem;
    }

    public long getPhuCap1() {
        return phuCap1;
    }

    public void setPhuCap1(long phuCap1) {
        this.phuCap1 = phuCap1;
    }

    public long getPhuCap2() {
        return phuCap2;
    }

    public void setPhuCap2(long phuCap2) {
        this.phuCap2 = phuCap2;
    }

    public long getPhuCap3() {
        return phuCap3;
    }

    public void setPhuCap3(long phuCap3) {
        this.phuCap3 = phuCap3;
    }

    public long getDinhMucPhuCap3() {
        return dinhMucPhuCap3;
    }

    public void setDinhMucPhuCap3(long dinhMucPhuCap3) {
        this.dinhMucPhuCap3 = dinhMucPhuCap3;
    }

    public long getPhuCap4() {
        return phuCap4;
    }

    public void setPhuCap4(long phuCap4) {
        this.phuCap4 = phuCap4;
    }

    public long getDinhMucPhuCap4() {
        return dinhMucPhuCap4;
    }

    public void setDinhMucPhuCap4(long dinhMucPhuCap4) {
        this.dinhMucPhuCap4 = dinhMucPhuCap4;
    }

    public long getSoNguoiPhuThuoc() {
        return soNguoiPhuThuoc;
    }

    public void setSoNguoiPhuThuoc(long soNguoiPhuThuoc) {
        this.soNguoiPhuThuoc = soNguoiPhuThuoc;
    }

}
