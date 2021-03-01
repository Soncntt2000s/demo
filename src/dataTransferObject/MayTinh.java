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
public class MayTinh {
    
    private String sMaMT;
    private String sTENMT;
    private String sCauHinh;
    private String iSoLuong;
    private String sHangSX;
    private byte[] sHinhAnh;
    private String sMoTa;

    public MayTinh() {
    }

    public MayTinh(String sTENMT, String sCauHinh, String iSoLuong, String sHangSX, byte[] sHinhAnh, String sMoTa) {
        this.sTENMT = sTENMT;
        this.sCauHinh = sCauHinh;
        this.iSoLuong = iSoLuong;
        this.sHangSX = sHangSX;
        this.sHinhAnh = sHinhAnh;
        this.sMoTa = sMoTa;
    }

    public MayTinh(String sMaMT, String sTENMT, String sCauHinh, String iSoLuong, String sHangSX, byte[] sHinhAnh, String sMoTa) {
        this.sMaMT = sMaMT;
        this.sTENMT = sTENMT;
        this.sCauHinh = sCauHinh;
        this.iSoLuong = iSoLuong;
        this.sHangSX = sHangSX;
        this.sHinhAnh = sHinhAnh;
        this.sMoTa = sMoTa;
    }

    public String getsMaMT() {
        return sMaMT;
    }

    public void setsMaMT(String sMaMT) {
        this.sMaMT = sMaMT;
    }

    public String getsTENMT() {
        return sTENMT;
    }

    public void setsTENMT(String sTENMT) {
        this.sTENMT = sTENMT;
    }

    public String getsCauHinh() {
        return sCauHinh;
    }

    public void setsCauHinh(String sCauHinh) {
        this.sCauHinh = sCauHinh;
    }

    public String getiSoLuong() {
        return iSoLuong;
    }

    public void setiSoLuong(String iSoLuong) {
        this.iSoLuong = iSoLuong;
    }

    public String getsHangSX() {
        return sHangSX;
    }

    public void setsHangSX(String sHangSX) {
        this.sHangSX = sHangSX;
    }

    public byte[] getsHinhAnh() {
        return sHinhAnh;
    }

    public void setsHinhAnh(byte[] sHinhAnh) {
        this.sHinhAnh = sHinhAnh;
    }

    public String getsMoTa() {
        return sMoTa;
    }

    public void setsMoTa(String sMoTa) {
        this.sMoTa = sMoTa;
    }

       
}
