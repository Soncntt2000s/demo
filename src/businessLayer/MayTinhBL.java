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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mamon
 */
public class MayTinhBL {
    public static void ThemMayTinh(MayTinh mt)
    {
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "INSERT INTO MAYTINH(TENMT,CAUHINH,SOLUONG,HANGSX,HinhAnh,MOTA) "
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,mt.getsTENMT());
            pst.setString(2,mt.getsCauHinh());
            pst.setString(3,mt.getiSoLuong());
            pst.setString(4,mt.getsHangSX());
            pst.setBytes(5,mt.getsHinhAnh());
            pst.setString(6,mt.getsMoTa());          
            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }            
    }
    
    public static void XoaMayTinh(MayTinh mt)
    {       
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "DELETE FROM MAYTINH where MAMT= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,mt.getsMaMT());            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }           
    }

    public static List<MayTinh> showData() 
    {
        
        List<MayTinh> ls = null;
        try(Connection ketnoi = CSDL.getConnect())
        {
            ls=new ArrayList<>();
            java.sql.Statement st = ketnoi.createStatement();
            String sql = "SELECT * FROM MAYTINH";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                MayTinh mt = new MayTinh();
                mt.setsMaMT(rs.getString("MAMT"));
                mt.setsTENMT(rs.getString("TENMT"));
                mt.setsCauHinh(rs.getString("CAUHINH"));
                mt.setiSoLuong(rs.getString("SOLUONG"));
                mt.setsHangSX(rs.getString("HANGSX"));
                mt.setsHinhAnh(rs.getBytes("HinhAnh"));
                mt.setsMoTa(rs.getString("MOTA"));
                
                ls.add(mt);
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi "+e);
        }
        return ls;
    }
    
    public static ArrayList<String> LoadDataHangSX()
    {
        ArrayList<String> hangsx = new ArrayList<String>();
        Connection con = CSDL.getConnect(); 
        String sql = "SELECT HANGSX FROM MAYTINH GROUP BY HANGSX";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                hangsx.add(rs.getString("HANGSX"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Loi "+e);
        }
        return hangsx;
    }
     
    public void search(String TenMT, DefaultTableModel dtm) 
    {       
        try(Connection conn = CSDL.getConnect()) {
            Statement stm = conn.createStatement();
            
            String sql = "select * from MAYTINH where TENMT like '%"+ TenMT +"%'";           
            ResultSet rs = stm.executeQuery(sql);           
            String mamt, tenmt, soluong ,hangsx;
            byte[] hinhMT;
            while(rs.next()) {                             
                mamt = rs.getString("MAMT");
                tenmt =  rs.getString("TENMT");
                soluong =  rs.getString("SOLUONG");
                hangsx =  rs.getString("HANGSX");
                hinhMT = rs.getBytes("HinhAnh");
                
                dtm.addRow(new String[] {mamt,tenmt,soluong,hangsx });                 
            }           
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void CapNhatMayTinh(MayTinh mt)
    {
        // kiểu dl kiểu nvarchar insert, update phải có N'' đằng trc
        try(Connection ketnoi = CSDL.getConnect()) 
        {
            String sql = "UPDATE MAYTINH set TENMT=?,CAUHINH=?,SOLUONG=?,HANGSX=?,HinhAnh=?,MOTA=? WHERE MAMT=? ";                    
            PreparedStatement pst = ketnoi.prepareStatement(sql);
            pst.setString(1,mt.getsTENMT());
            pst.setString(2,mt.getsCauHinh());
            pst.setString(3,mt.getiSoLuong());
            pst.setString(4,mt.getsHangSX());
            pst.setBytes(5,mt.getsHinhAnh());
            pst.setString(6,mt.getsMoTa());
            pst.setString(7,mt.getsMaMT());
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
            System.out.println("Bi Loi "+e.getMessage());
        }                 
    }
    
    
    public void Close() throws SQLException
    {
        Connection con = CSDL.getConnect();
        if(con!=null)
        {
            JOptionPane.showMessageDialog(null,"Kết Nối Database bị lỗi");
        }
    }

}
