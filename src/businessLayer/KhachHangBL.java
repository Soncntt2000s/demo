
package businessLayer;

import dataTransferObject.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Đây là cách xây dựng kiểu CRUD(insert , update , delete...)
public class KhachHangBL{
    
    public static List<KhachHang> showData() 
    {
        
        List<KhachHang> ls = null;
        try(Connection ketnoi = CSDL.getConnect())
        {
            ls=new ArrayList<>();
            java.sql.Statement st = ketnoi.createStatement();
            String sql = "SELECT * FROM KHACHHANG";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                
                KhachHang kh = new KhachHang();
                kh.setsMakH(rs.getString("MAKH"));
                kh.setsTenKH(rs.getString("TENKH"));
                kh.setsPhai(rs.getString("PHAI"));                
                kh.setsDiaChi(rs.getString("DIACHI"));
                kh.setsSDT(rs.getString("SDT"));
                kh.setsHinhAnh(rs.getBytes("HinhAnh"));
                
                ls.add(kh);
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi "+e);
        }
        return ls;
    } 
         
    
    public static void ThemKhachhang(KhachHang kh)
    {
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "INSERT INTO KHACHHANG(TENKH,PHAI,DIACHI,SDT,HinhAnh) values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,kh.getsTenKH());
            pst.setString(2,kh.getsPhai());
            pst.setString(3,kh.getsDiaChi());
            pst.setString(4,kh.getsSDT());
            pst.setBytes(5,kh.getsHinhAnh());
            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }            
    }
    
    public static void XoaKhachhang(KhachHang kh)
    {       
        try(Connection con = CSDL.getConnect()) 
        {
            String sql = "DELETE FROM KHACHHANG where MAKH= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,kh.getsMakH());            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }           
    }
          
    
    public void search(String TenKH, DefaultTableModel dtm) {
        
        try(Connection conn = CSDL.getConnect()) {
            Statement stm = conn.createStatement();
            
            String sql = "select * from KHACHHANG where TENKH like '%"+ TenKH +"%'";           
            ResultSet rs = stm.executeQuery(sql);
            String makh, tenkh,phai,diachi,sdt;
            
            while(rs.next()) {
                makh = rs.getString("MAKH");
                tenkh = rs.getString("TENKH");              
                phai = rs.getString("PHAI");
                diachi = rs.getString("DIACHI");    
                sdt = rs.getString("SDT");
                dtm.addRow(new String[] {makh,tenkh,phai,diachi,sdt});        
            }
            
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void CapNhatKhachhang(KhachHang kh)
    {
        // kiểu dl kiểu nvarchar insert, update phải có N'' đằng trc
        try(Connection ketnoi = CSDL.getConnect()) 
        {
            String sql = "UPDATE KHACHHANG set TENKH=?,PHAI=?,DIACHI=?,SDT=?,HinhAnh=? WHERE MAKH=? ";
            PreparedStatement pst = ketnoi.prepareStatement(sql);
            pst.setString(1,kh.getsTenKH());
            pst.setString(2,kh.getsPhai());
            pst.setString(3,kh.getsDiaChi());
            pst.setString(4,kh.getsSDT());
            pst.setBytes(5,kh.getsHinhAnh());
            pst.setString(6,kh.getsMakH());
           
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
            System.out.println("Bi Loi "+e.getMessage());
        }                 
    }
        
    public static ArrayList<String> LoadDataGioiTinh()
    {
        ArrayList<String> gioitinh = new ArrayList<String>();
        Connection con = CSDL.getConnect(); 
        String sql = "SELECT PHAI FROM KHACHHANG GROUP BY PHAI";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                    gioitinh.add(rs.getString("PHAI"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Loi "+e);
        }
        return gioitinh;
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
