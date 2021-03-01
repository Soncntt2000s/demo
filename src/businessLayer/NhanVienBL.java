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

/**
 *
 * @author Mamon
 */
public class NhanVienBL {   
    
    public static List<NhanVien> showData() 
    {
        
        List<NhanVien> ls = null;
        try(Connection ketnoi = CSDL.getConnect())
        {
            ls=new ArrayList<>();
            java.sql.Statement st = ketnoi.createStatement();
            String sql = "SELECT * FROM NHANVIEN";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                NhanVien nv = new NhanVien();
                nv.setsMaNV(rs.getString("MANV"));
                nv.setsTenHT(rs.getString("TENHT"));
                nv.setsTenNV(rs.getString("TENNV"));
                nv.setsChucVu(rs.getString("CHUCVU"));
                nv.setsPhai(rs.getString("PHAI"));   
                nv.setPassWord(rs.getString("PassWord"));
                nv.setdNgaySinh(rs.getString("NGAYSINH"));
                nv.setsDiaChi(rs.getString("DIACHI"));
                nv.setsHinhAnh(rs.getBytes("HinhAnh"));
                ls.add(nv);
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi "+e);
        }
        return ls;
    }
   
    
    public static void CapNhatNhanVien(NhanVien nv)
    {
        // kiểu dl kiểu nvarchar insert, update phải có N'' đằng trc
        try(Connection ketnoi = CSDL.getConnect()) 
        {
            String sql = "UPDATE NHANVIEN set TENNV=?,CHUCVU=?,PHAI=?,NGAYSINH=?,DIACHI=?,HinhAnh=? WHERE MANV=?";                    
            PreparedStatement pst = ketnoi.prepareStatement(sql);
            pst.setString(1,nv.getsTenNV());
            pst.setString(2,nv.getsChucVu());
            pst.setString(3,nv.getsPhai());
            pst.setString(4,nv.getdNgaySinh());
            pst.setString(5,nv.getsDiaChi());
            pst.setBytes(6,nv.getsHinhAnh());
            pst.setString(7,nv.getsMaNV());
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
            System.out.println("Bi Loi "+e.getMessage());
        }                 
    }
    
    public static void XoaNhanVien(String MaNV)
    {       
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "DELETE FROM NHANVIEN where MANV= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,MaNV);            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }           
    }
    
    
    
    public static void ThemNhanVien(NhanVien nv)
    {
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "INSERT INTO NHANVIEN(TENHT,TENNV,CHUCVU,PHAI,PassWord,NGAYSINH,DIACHI,HinhAnh) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,nv.getsTenHT());
            pst.setString(2,nv.getsTenNV());
            pst.setString(3,nv.getsChucVu());
            pst.setString(4,nv.getsPhai());
            pst.setString(5, nv.getPassWord());
            pst.setString(6, nv.getdNgaySinh());
            pst.setString(7,nv.getsDiaChi());
            pst.setBytes(8,nv.getsHinhAnh());
            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }            
    }
    
    public void search(String TenNV, DefaultTableModel dtm) {
        
        try(Connection conn = CSDL.getConnect()) {
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM  NHANVIEN  where TENNV like '%"+ TenNV +"%'";           
            ResultSet rs = stm.executeQuery(sql);
            String manv, tenht,tennv, chucvu ,phai,matkhau,ngaysinh,diachi;
            byte[] hinhNV;
            
            while(rs.next()) {               
                manv = rs.getString("MANV");
                tenht = rs.getString("TENHT");
                tennv = rs.getString("TENNV");
                chucvu = rs.getString("CHUCVU");
                phai = rs.getString("PHAI");
                matkhau = rs.getString("PassWord");
                ngaysinh = rs.getString("NGAYSINH");
                diachi = rs.getString("DIACHI");   
                hinhNV = rs.getBytes("HinhAnh");
                dtm.addRow(new String[] {manv,tennv,chucvu,phai,diachi});        
            }
            
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }   
}
