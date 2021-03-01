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
public class KhachHang {
    
    private String sMakH;
    private String sTenKH;
    private String sPhai;
    private String sDiaChi;
    private String sSDT;
    private byte[] sHinhAnh;

    public KhachHang() {
    }

    public KhachHang(String sTenKH, String sPhai, String sDiaChi, String sSDT, byte[] sHinhAnh) {
        this.sTenKH = sTenKH;
        this.sPhai = sPhai;
        this.sDiaChi = sDiaChi;
        this.sSDT = sSDT;
        this.sHinhAnh = sHinhAnh;
    }

    public KhachHang(String sMakH, String sTenKH, String sPhai, String sDiaChi, String sSDT, byte[] sHinhAnh) {
        this.sMakH = sMakH;
        this.sTenKH = sTenKH;
        this.sPhai = sPhai;
        this.sDiaChi = sDiaChi;
        this.sSDT = sSDT;
        this.sHinhAnh = sHinhAnh;
    }

    public String getsMakH() {
        return sMakH;
    }

    public void setsMakH(String sMakH) {
        this.sMakH = sMakH;
    }

    public String getsTenKH() {
        return sTenKH;
    }

    public void setsTenKH(String sTenKH) {
        this.sTenKH = sTenKH;
    }

    public String getsPhai() {
        return sPhai;
    }

    public void setsPhai(String sPhai) {
        this.sPhai = sPhai;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public byte[] getsHinhAnh() {
        return sHinhAnh;
    }

    public void setsHinhAnh(byte[] sHinhAnh) {
        this.sHinhAnh = sHinhAnh;
    }

    

    
}
