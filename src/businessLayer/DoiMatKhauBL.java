/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import dataTransferObject.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import presentationLayer.*;

/**
 *
 * @author Mamon
 */
public class DoiMatKhauBL {
    
    
    public NhanVien showDuLieu(String manv ) throws Exception,ClassNotFoundException
   {
        NhanVien nv = null;
        try (Connection con = CSDL.getConnect())
        {
            nv = new NhanVien();
            java.sql.Statement st = con.createStatement();
            String sql = "SELECT * FROM  NHANVIEN WHERE MANV = '"+manv+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                nv = new NhanVien();             
                nv.setsMaNV(rs.getString("MANV"));
                nv.setsTenHT(rs.getString("TENHT"));
                nv.setsTenNV(rs.getString("TENNV"));
                nv.setsChucVu(rs.getString("CHUCVU"));
                nv.setsPhai(rs.getString("PHAI"));   
                nv.setPassWord(rs.getString("PassWord"));
                nv.setdNgaySinh(rs.getString("NGAYSINH"));
                nv.setsDiaChi(rs.getString("DIACHI"));
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lỗi "+e.getMessage());
        }
        return nv;
   }
    
    
    public static void CapNhatMatKhau(NhanVien nv)
    {
        
        try(Connection ketnoi = CSDL.getConnect()) 
        {
            String sql = "UPDATE NHANVIEN set TENHT = ? ,PassWord = ? WHERE MANV = ?";                    
            PreparedStatement pst = ketnoi.prepareStatement(sql);
            pst.setString(1,nv.getsTenHT());
            pst.setString(2,nv.getPassWord());
            pst.setString(3,nv.getsMaNV());
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
            System.out.println("Bi Loi "+e.getMessage());
        }                 
    }
    
}
