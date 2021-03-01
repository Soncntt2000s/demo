/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

import java.sql.Date;

/**
 *
 * @author Mamon
 */
public class NhanVien {
    
    private String sMaNV;
    private String sTenHT;
    private String sTenNV;
    private String sChucVu;
    private String sPhai;
    private String passWord;
    private String dNgaySinh;
    private String sDiaChi;
    private byte[] sHinhAnh;

    public NhanVien() {
    }

    public NhanVien(String sTenHT, String sTenNV, String sChucVu, String sPhai, String passWord, String dNgaySinh, String sDiaChi, byte[] sHinhAnh) {
        this.sTenHT = sTenHT;
        this.sTenNV = sTenNV;
        this.sChucVu = sChucVu;
        this.sPhai = sPhai;
        this.passWord = passWord;
        this.dNgaySinh = dNgaySinh;
        this.sDiaChi = sDiaChi;
        this.sHinhAnh = sHinhAnh;
    }

    public NhanVien(String sMaNV, String sTenHT, String sTenNV, String sChucVu, String sPhai, String passWord, String dNgaySinh, String sDiaChi, byte[] sHinhAnh) {
        this.sMaNV = sMaNV;
        this.sTenHT = sTenHT;
        this.sTenNV = sTenNV;
        this.sChucVu = sChucVu;
        this.sPhai = sPhai;
        this.passWord = passWord;
        this.dNgaySinh = dNgaySinh;
        this.sDiaChi = sDiaChi;
        this.sHinhAnh = sHinhAnh;
    }

    public String getsMaNV() {
        return sMaNV;
    }

    public void setsMaNV(String sMaNV) {
        this.sMaNV = sMaNV;
    }

    public String getsTenHT() {
        return sTenHT;
    }

    public void setsTenHT(String sTenHT) {
        this.sTenHT = sTenHT;
    }

    public String getsTenNV() {
        return sTenNV;
    }

    public void setsTenNV(String sTenNV) {
        this.sTenNV = sTenNV;
    }

    public String getsChucVu() {
        return sChucVu;
    }

    public void setsChucVu(String sChucVu) {
        this.sChucVu = sChucVu;
    }

    public String getsPhai() {
        return sPhai;
    }

    public void setsPhai(String sPhai) {
        this.sPhai = sPhai;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getdNgaySinh() {
        return dNgaySinh;
    }

    public void setdNgaySinh(String dNgaySinh) {
        this.dNgaySinh = dNgaySinh;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public byte[] getsHinhAnh() {
        return sHinhAnh;
    }

    public void setsHinhAnh(byte[] sHinhAnh) {
        this.sHinhAnh = sHinhAnh;
    }

    
}
