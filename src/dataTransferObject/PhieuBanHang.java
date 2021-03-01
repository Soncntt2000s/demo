/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

/**
 *
 * @author Mamon
 */
public class PhieuBanHang {
    private String MaHD;
    private String TenNV;
    private String TenKH;
    private String TenMT;
    private String SoLuong;
    private String DonGia;
    private String NgayLapHD;
    private String NgayGiao;

    public PhieuBanHang() {
    }

    public PhieuBanHang(String MaHD, String TenNV, String TenKH, String TenMT, String SoLuong, String DonGia, String NgayLapHD, String NgayGiao) {
        this.MaHD = MaHD;
        this.TenNV = TenNV;
        this.TenKH = TenKH;
        this.TenMT = TenMT;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.NgayLapHD = NgayLapHD;
        this.NgayGiao = NgayGiao;
    }

    public PhieuBanHang(String TenNV, String TenKH, String TenMT, String SoLuong, String DonGia, String NgayLapHD, String NgayGiao) {       
        this.TenNV = TenNV;
        this.TenKH = TenKH;
        this.TenMT = TenMT;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.NgayLapHD = NgayLapHD;
        this.NgayGiao = NgayGiao;
    }
    
    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getTenMT() {
        return TenMT;
    }

    public void setTenMT(String TenMT) {
        this.TenMT = TenMT;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public String getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(String NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public String getNgayGiao() {
        return NgayGiao;
    }

    public void setNgayGiao(String NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    
    
}
