
package presentationLayer;
import dataTransferObject.KhachHang;
import businessLayer.KhachHangBL;
import businessLayer.MD5Encryptor;
import businessLayer.NhanVienBL;
import dataTransferObject.NhanVien;
import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Mamon
 */
public class ThongTinKhachHang extends javax.swing.JDialog {

    private List<KhachHang> list;
    private DefaultTableModel model;    
    String nameimage=null;
    byte[] image_person = null;
    
    public ThongTinKhachHang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);             
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) tbl_KhachHang.getModel();        
        btn_Them.setEnabled(true);
        btn_Xoa.setEnabled(true);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_GioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        txt_Search = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_KhachHang = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        cbx_GioiTinh = new javax.swing.JComboBox<>();
        btn_ChonAnh = new javax.swing.JButton();
        lbl_HinhAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN KHÁCH HÀNG");

        jLabel8.setText("Tên KH:");

        jLabel10.setText("Địa Chỉ:");

        jLabel9.setText("Giới Tính :");

        jLabel11.setText("Số ĐT:");

        tbl_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Phái", "Địa Chỉ", "Số ĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_KhachHang);

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SuaMouseClicked(evt);
            }
        });
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Reset.setText("Xóa Hết");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Search.setText("Tìm kiếm theo tên");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.setActionCommand("");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_ChonAnh.setText("Chọn ảnh");
        btn_ChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonAnhActionPerformed(evt);
            }
        });

        lbl_HinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_DiaChi))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_Search))
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbx_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(191, 191, 191)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KhachHangMouseClicked
          
        TrangThaiNut(true);       
        KhachHang kh = list.get(tbl_KhachHang.getSelectedRow());
        String makh = String.valueOf(tbl_KhachHang.getValueAt(tbl_KhachHang.getSelectedRow(),0));
        String tenkh = String.valueOf(tbl_KhachHang.getValueAt(tbl_KhachHang.getSelectedRow(),1));
        String phai = String.valueOf(tbl_KhachHang.getValueAt(tbl_KhachHang.getSelectedRow(),2));
        String diachi = String.valueOf(tbl_KhachHang.getValueAt(tbl_KhachHang.getSelectedRow(),3));
        String sdt = String.valueOf(tbl_KhachHang.getValueAt(tbl_KhachHang.getSelectedRow(),4));
        byte[] hinhKH = kh.getsHinhAnh();        
                 
        txt_TenKH.setText(tenkh);
        cbx_GioiTinh.setSelectedItem(phai);        
        txt_DiaChi.setText(diachi);
        txt_SDT.setText(sdt);   
        ImageIcon imageicon = new ImageIcon(hinhKH);
        imageicon.setImage(imageicon.getImage().getScaledInstance(lbl_HinhAnh.getWidth(), lbl_HinhAnh.getHeight(), Image.SCALE_DEFAULT));
        lbl_HinhAnh.setIcon(imageicon);          
    }//GEN-LAST:event_tbl_KhachHangMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed

        if( txt_TenKH.getText().length()==0 || txt_DiaChi.getText().length()==0 
                || txt_SDT.getText().length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin bạn nhập chưa đủ!Xin nhập tiếp");
            return;
        }
        else
        {                    
            String tenkh = txt_TenKH.getText();
            String phai = cbx_GioiTinh.getSelectedItem().toString();
            String diachi = txt_DiaChi.getText();
            String sdt = txt_SDT.getText();      
            byte[] hinhKH = image_person;
            btn_Reset.setEnabled(true);  
                                    
            KhachHang kh = new KhachHang(tenkh, phai, diachi, sdt,hinhKH);
            KhachHangBL.ThemKhachhang(kh);         
            JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thành công !");
            ResetText();
            btn_Them.setEnabled(true);          
            list.add(kh);    //Thêm khách hàng vào danh sách                                         
                                  
        }
        showListKhachHang();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed

        int RemoveIndex = tbl_KhachHang.getSelectedRow();
        if(RemoveIndex>=0)
        {
            int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa khách hàng: "+txt_TenKH.getText()+"?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(reply==0)
            {
                KhachHang kh = list.get(RemoveIndex);
                KhachHangBL.XoaKhachhang(kh);

                model.removeRow(RemoveIndex); 
                JOptionPane.showMessageDialog(rootPane,"Đã xóa thành công!");                 
                showListKhachHang();
                ResetText();
            }   
            else
            {
                return;
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Bạn chưa chọn khách hàng cần xóa !");
        }
        
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_SuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SuaMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
            
        KhachHang khachhang = list.get(tbl_KhachHang.getSelectedRow());     
        String makh = khachhang.getsMakH();
        String tenkh = txt_TenKH.getText();
        String phai = cbx_GioiTinh.getSelectedItem().toString();
        String diachi = txt_DiaChi.getText();
        String sdt = txt_SDT.getText();
        byte[] hinhKH = image_person;      
        
        KhachHang kh = new KhachHang(makh,tenkh,phai,diachi,sdt,hinhKH);
        KhachHangBL.CapNhatKhachhang(kh);
        JOptionPane.showMessageDialog(rootPane,"Cập Nhật Thành Công");    
        showListKhachHang();       
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void showListKhachHang()
    {
        list = KhachHangBL.showData();
        model.setRowCount(0);
        for(KhachHang kh : list)
        {
            model.addRow(new Object[]{
                kh.getsMakH(),kh.getsTenKH(),kh.getsPhai(),kh.getsDiaChi(),kh.getsSDT()
            });            
        }
    }
           
    
    private void showResult()
    {
        tbl_KhachHang.removeAll();       
        list = KhachHangBL.showData();
        KhachHang k = list.get(list.size()-1);
        model.addRow(new Object[]{
            k.getsMakH(),k.getsTenKH(),k.getsPhai(),k.getsDiaChi(),k.getsSDT()
        });
        tbl_KhachHang.setModel(model);
    }
    
    private void showUpdate()
    {
        tbl_KhachHang.removeAll();       
        list = KhachHangBL.showData();
        KhachHang k = list.get(list.size()-1);
        model.addRow(new Object[]{
            k.getsMakH(),k.getsTenKH(),k.getsPhai(),k.getsDiaChi(),k.getsSDT()
        });
        tbl_KhachHang.setModel(model);
    }
    
    private void showDelete()
    {
        tbl_KhachHang.removeAll();       
        list = KhachHangBL.showData();
        KhachHang k = list.get(list.size()-1);
        model.addRow(new Object[]{
            k.getsMakH(),k.getsTenKH(),k.getsPhai(),k.getsDiaChi(),k.getsSDT()
        });
        tbl_KhachHang.setModel(model);
    }
    
    private void ResetText()
    {
        txt_DiaChi.setText("");
        txt_SDT.setText("");
        txt_TenKH.setText("");
        cbx_GioiTinh.setSelectedIndex(0);
        txt_TenKH.requestFocus();
    }
    
    public void TrangThaiNut(boolean b) {

        this.btn_Them.setEnabled(b);
        this.btn_Xoa.setEnabled(b);
        this.btn_Sua.setEnabled(b);
        this.btn_Reset.setEnabled(b);
    }
    
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed

        btn_Them.setEnabled(true);
        ResetText();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showListKhachHang();
        loadGioiTinh();
        TrangThaiNut(false);
        btn_Them.setEnabled(true);          
        
        TableColumnModel tblmo = tbl_KhachHang.getColumnModel();
        tblmo.getColumn(0).setPreferredWidth(80);
        tblmo.getColumn(1).setPreferredWidth(188);
        tblmo.getColumn(2).setPreferredWidth(70);
        tblmo.getColumn(3).setPreferredWidth(290);
        tblmo.getColumn(4).setPreferredWidth(150);
    }//GEN-LAST:event_formWindowOpened

    private void loadGioiTinh()
    {
        ArrayList<String> list = KhachHangBL.LoadDataGioiTinh();
        for(String gioitinh : list)
        {
            cbx_GioiTinh.addItem(gioitinh.toString());            
        }
    }
    
    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
             
        resetTable();
        renderTable();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_ChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonAnhActionPerformed
        
        JFileChooser jfc = new JFileChooser("src/images/KhachHang");
        jfc.setFileFilter(new FileNameExtensionFilter("Các loại file *.jpg", "jpg"));
        int returnValue = jfc.showOpenDialog(rootPane);
        if(returnValue==JFileChooser.APPROVE_OPTION)
        {                   
            nameimage = jfc.getSelectedFile().getAbsolutePath();                       
            ImageIcon imageicon = new ImageIcon(nameimage);
            imageicon.setImage(imageicon.getImage().getScaledInstance(lbl_HinhAnh.getWidth(), lbl_HinhAnh.getHeight(), Image.SCALE_DEFAULT));
            lbl_HinhAnh.setIcon(imageicon);   
            try {
                File image = new File(nameimage);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for(int readNum;(readNum=fis.read(buf))!=-1;)
                {
                    bos.write(buf,0,readNum);                   
                }
                image_person=bos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,e);
            }
        }            
    }//GEN-LAST:event_btn_ChonAnhActionPerformed
   
    private void resetTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tbl_KhachHang.getModel();
        dtm.setRowCount(0);
    }
    
    private void renderTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tbl_KhachHang.getModel();
        KhachHangBL khbl = new KhachHangBL();
        khbl.search(txt_Search.getText(), dtm);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinKhachHang dialog = new ThongTinKhachHang(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChonAnh;
    private javax.swing.ButtonGroup btn_GioiTinh;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbx_GioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_HinhAnh;
    private javax.swing.JTable tbl_KhachHang;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_Search;
    private javax.swing.JTextField txt_TenKH;
    // End of variables declaration//GEN-END:variables
}
