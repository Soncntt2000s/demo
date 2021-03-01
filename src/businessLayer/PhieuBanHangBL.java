/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PhieuBanHangBL {
    
    public static List<PhieuBanHang> showData() 
    {
        
        List<PhieuBanHang> bh = null;
        try(Connection ketnoi = CSDL.getConnect())
        {
            bh=new ArrayList<>();
            java.sql.Statement st = ketnoi.createStatement();
            String sql = "select HD.MAHD,KH.TENKH,NV.TENNV,MT.TENMT,CTHD.SOLUONG,CTHD.DONGIABAN,HD.NGAYLAPHD,HD.NGAYGIAO FROM HOADON HD ,KHACHHANG KH,NHANVIEN NV ,CTHOADON CTHD,MAYTINH MT\n" +
"WHERE HD.MAKH=KH.MAKH AND HD.MANV=NV.MANV AND CTHD.MAHD=HD.MAHD AND CTHD.MAMT=MT.MAMT";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                PhieuBanHang pbh = new PhieuBanHang();                
                
                pbh.setMaHD(rs.getString("MAHD"));
                pbh.setTenNV(rs.getString("TENNV"));
                pbh.setTenKH(rs.getString("TENKH"));
                pbh.setTenMT(rs.getString("TENMT"));
                pbh.setSoLuong(rs.getString("SOLUONG"));   
                pbh.setDonGia(rs.getString("DONGIABAN"));    
                pbh.setNgayLapHD(rs.getString("NGAYLAPHD"));
                pbh.setNgayGiao(rs.getString("NGAYGIAO"));
                
                bh.add(pbh);
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi "+e);
        }
        return bh;
    }
    
    public static void ThemHoaDon(PhieuBanHang pbh)
    {
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "INSERT INTO HOADON(MAHD,NGAYLAPHD,NGAYGIAO) "
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,pbh.getMaHD());
            pst.setString(2,pbh.getTenNV());
            pst.setString(3,pbh.getTenKH());
            pst.setString(4,pbh.getTenMT());
            pst.setString(5,pbh.getSoLuong());
            pst.setString(6,pbh.getDonGia());   
            pst.setString(7,pbh.getNgayLapHD());  
            pst.setString(8,pbh.getNgayGiao());  
            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }            
    }
    
    public static void ThanhToanHoaDon(String MaHD)
    {       
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "DELETE FROM HOADON where MAHD= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,MaHD);            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }           
    }
    
//    public static void SuaHoaDon(PhieuBanHang pbh)
//    {
//        try(Connection ketnoi = CSDL.getConnect()) 
//        {
//            String sql = "UPDATE NHANVIEN set TENNV=?,CHUCVU=?,PHAI=?,NGAYSINH=?,DIACHI=? WHERE MANV=?";                    
//            PreparedStatement pst = ketnoi.prepareStatement(sql);
//            pst.setString(1,nv.getsTenNV());
//            pst.setString(2,nv.getsChucVu());
//            pst.setString(3,nv.getsPhai());
//            pst.setString(4,nv.getdNgaySinh());
//            pst.setString(5,nv.getsDiaChi());
//            pst.setString(6,nv.getsMaNV());
//            pst.executeUpdate();
//            
//        } 
//        catch (Exception e)
//        {
//            System.out.println("Bi Loi "+e.getMessage());
//        }                 
//    }
    
    public void search(String TenHD, DefaultTableModel dtm) 
    {       
        try(Connection conn = CSDL.getConnect()) {
            Statement stm = conn.createStatement();
            
            String sql = "SELECT HD.MAHD,KH.TENKH,NV.TENNV,MT.TENMT,CTHD.SOLUONG,CTHD.DONGIABAN,HD.NGAYLAPHD,HD.NGAYGIAO "
                    + "FROM HOADON HD ,KHACHHANG KH,NHANVIEN NV ,CTHOADON CTHD,MAYTINH MT\n" +
"WHERE HD.MAKH=KH.MAKH AND HD.MANV=NV.MANV AND CTHD.MAHD=HD.MAHD AND CTHD.MAMT=MT.MAMT AND NV.TENNV like '%"+TenHD+"%'";           
            ResultSet rs = stm.executeQuery(sql);           
            String mahd, tenmt,tennv,tenkh, soluong ,dongiaban ;
            int thanhtien;
            while(rs.next()) {                             
                mahd = rs.getString("MAHD");
                tennv= rs.getString("TENNV");
                tenkh = rs.getString("TENKH");
                tenmt = rs.getString("TENMT");
                soluong = rs.getString("SOLUONG");   
                dongiaban = rs.getString("DONGIABAN");  
                thanhtien = Integer.parseInt(soluong)*Integer.parseInt(dongiaban);
                
                dtm.addRow(new String[] {mahd,tennv,tenkh,tenmt,soluong,dongiaban,String.valueOf(thanhtien)});                 
            }           
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<String> LoadDataNhanVien()
    {
        ArrayList<String> nhanvien = new ArrayList<String>();
        Connection con = CSDL.getConnect(); 
        String sql = "SELECT TENNV FROM NHANVIEN GROUP BY TENNV";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                    nhanvien.add(rs.getString("TENNV"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Loi "+e);
        }
        return nhanvien;
    }
    
    public static ArrayList<String> LoadDataKhachHang()
    {
        ArrayList<String> khachhang = new ArrayList<String>();
        Connection con = CSDL.getConnect(); 
        String sql = "SELECT TENKH FROM KHACHHANG GROUP BY TENKH";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                khachhang.add(rs.getString("TENKH"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Loi "+e);
        }
        return khachhang;
    }
    
    public static ArrayList<String> LoadDataMayTinh()
    {
        ArrayList<String> maytinh = new ArrayList<String>();
        Connection con = CSDL.getConnect(); 
        String sql = "SELECT TENMT FROM MAYTINH GROUP BY TENMT";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                maytinh.add(rs.getString("TENMT"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Loi "+e);
        }
        return maytinh;
    }
    
 public PhieuBanHang XuatPhieuBan(String MaHD ) //throws Exception,ClassNotFoundException
   {
        PhieuBanHang pbh = null;
        try (Connection con = CSDL.getConnect())
        {
            pbh = new PhieuBanHang();
            java.sql.Statement st = con.createStatement();
            String sql = " SELECT HD.MAHD,NV.TENNV,KH.TENKH,MT.TENMT,CTHD.SOLUONG,CTHD.DONGIABAN,HD.NGAYLAPHD,HD.NGAYGIAO "
                    + "FROM HOADON HD ,KHACHHANG KH,NHANVIEN NV ,CTHOADON CTHD,MAYTINH MT " +
"WHERE HD.MAKH=KH.MAKH AND HD.MANV=NV.MANV AND CTHD.MAHD=HD.MAHD AND CTHD.MAMT=MT.MAMT AND HD.MAHD='"+MaHD+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                pbh = new PhieuBanHang();             
                pbh.setMaHD(rs.getString("MAHD"));
                pbh.setTenNV(rs.getString("TENNV"));
                pbh.setTenKH(rs.getString("TENKH"));
                pbh.setTenMT(rs.getString("TENMT"));
                pbh.setSoLuong(rs.getString("SOLUONG"));
                pbh.setDonGia(rs.getString("DONGIABAN"));   
                pbh.setNgayLapHD(rs.getString("NGAYLAPHD"));
                pbh.setNgayGiao(rs.getString("NGAYGIAO"));                
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lỗi "+e.getMessage());
        }
        return pbh;
   }
}
