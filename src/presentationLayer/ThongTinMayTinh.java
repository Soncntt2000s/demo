
package presentationLayer;

import businessLayer.*;
import dataTransferObject.*;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ThongTinMayTinh extends javax.swing.JDialog {

    private List<MayTinh> list;
    private DefaultTableModel model;
    String nameimage=null;
    byte[] image_person = null;
    
    public ThongTinMayTinh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) tbl_LinhKien.getModel();
        TrangThaiNut(false);
        btn_Them.setEnabled(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_LinhKien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_TenMT = new javax.swing.JTextField();
        txt_CauHinh = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        txt_SL = new javax.swing.JTextField();
        cbx_HangSX = new javax.swing.JComboBox<>();
        btn_XoaTrang = new javax.swing.JButton();
        lbl_HinhAnh = new javax.swing.JLabel();
        btn_DoiAnh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_MoTa = new javax.swing.JTextArea();
        txt_TimKiem = new javax.swing.JTextField();
        btn_Tim = new javax.swing.JButton();
        btn_MuaHang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl_LinhKien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã máy tính", "Tên máy tính", "Số Lượng", "Hãng SX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_LinhKien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_LinhKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_LinhKienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_LinhKien);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN MÁY TÍNH");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Tên máy tinh:");

        jLabel5.setText("Cấu hình :");

        jLabel7.setText("Hãng SX :");

        jLabel8.setText("Số Lượng :");

        jLabel9.setText("Mô Tả :");

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
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_XoaTrang.setText("Xóa Trắng");
        btn_XoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTrangActionPerformed(evt);
            }
        });

        lbl_HinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_DoiAnh.setText("Đổi Ảnh");
        btn_DoiAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiAnhActionPerformed(evt);
            }
        });

        txt_MoTa.setColumns(20);
        txt_MoTa.setRows(5);
        txt_MoTa.setMaximumSize(new java.awt.Dimension(200, 200));
        jScrollPane3.setViewportView(txt_MoTa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(cbx_HangSX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_XoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Them)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_SL)
                                    .addComponent(txt_CauHinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_TenMT, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_DoiAnh)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_TenMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_CauHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(btn_DoiAnh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_HangSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaTrang))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Thoat))
                .addContainerGap())
        );

        btn_Tim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Tim.setText("Tìm theo tên");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        btn_MuaHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_MuaHang.setForeground(new java.awt.Color(0, 204, 102));
        btn_MuaHang.setText("Mua Hàng");
        btn_MuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MuaHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_MuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btn_Tim)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_LinhKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_LinhKienMouseClicked

        MayTinh mt = list.get(tbl_LinhKien.getSelectedRow());
        
        String mamt = String.valueOf(tbl_LinhKien.getValueAt(tbl_LinhKien.getSelectedRow(),0));
        String tenmt = String.valueOf(tbl_LinhKien.getValueAt(tbl_LinhKien.getSelectedRow(),1));
        String cauhinh = mt.getsCauHinh();
        String soluong = String.valueOf(tbl_LinhKien.getValueAt(tbl_LinhKien.getSelectedRow(),2));
        String hangsx = String.valueOf(tbl_LinhKien.getValueAt(tbl_LinhKien.getSelectedRow(),3));
        String mota = mt.getsMoTa();
        byte[] hinhMT = mt.getsHinhAnh();

        TrangThaiNut(true);                
        txt_TenMT.setText(tenmt);
        txt_CauHinh.setText(cauhinh);
        txt_SL.setText(soluong);
        cbx_HangSX.setSelectedItem(hangsx);
        txt_MoTa.setText(mota);
        ImageIcon imageicon = new ImageIcon(hinhMT);
        imageicon.setImage(imageicon.getImage().getScaledInstance(lbl_HinhAnh.getWidth(), lbl_HinhAnh.getHeight(), Image.SCALE_DEFAULT));
        lbl_HinhAnh.setIcon(imageicon);   
    }//GEN-LAST:event_tbl_LinhKienMouseClicked

    private void ResetText()
    {      
        txt_TenMT.setText("");
        txt_TenMT.requestFocus();
        cbx_HangSX.setSelectedIndex(0);
        txt_CauHinh.setText("");
        txt_MoTa.setText("");
        txt_SL.setText("");        
    }
    
    private void showListMayTinh()
    {
        list = MayTinhBL.showData();
        model.setRowCount(0);
        for(MayTinh mt : list)
        {
            model.addRow(new Object[]{
                mt.getsMaMT(),mt.getsTENMT(),mt.getiSoLuong(),mt.getsHangSX()
            });            
        }
    } 
    
    public void TrangThaiNut(boolean b) {

        this.btn_Them.setEnabled(b);
        this.btn_Xoa.setEnabled(b);
        this.btn_Sua.setEnabled(b);
        this.btn_MuaHang.setEnabled(b);
    }
    
    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        resetTable();
        renderTable();
    }//GEN-LAST:event_btn_TimActionPerformed

    private void resetTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tbl_LinhKien.getModel();
        dtm.setRowCount(0);
    }
    
    private void renderTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tbl_LinhKien.getModel();
        MayTinhBL mtbl = new MayTinhBL();
        mtbl.search(txt_TimKiem.getText(), dtm);
    }
    
    private void loadHangSX()
    {
        ArrayList<String> list = MayTinhBL.LoadDataHangSX();
        for(String hangsx : list)
        {
            cbx_HangSX.addItem(hangsx.toString());            
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showListMayTinh();   
        loadHangSX();
    }//GEN-LAST:event_formWindowOpened

    private void btn_MuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MuaHangActionPerformed
        this.dispose();
        ThongTinPhieuBan ttpb = new ThongTinPhieuBan(null, rootPaneCheckingEnabled);
        ttpb.setVisible(true);      
    }//GEN-LAST:event_btn_MuaHangActionPerformed

    private void btn_XoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTrangActionPerformed
        ResetText();
    }//GEN-LAST:event_btn_XoaTrangActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
       
        MayTinh maytinh = list.get(tbl_LinhKien.getSelectedRow());     
        String mamt = maytinh.getsMaMT();
        String tenmt = txt_TenMT.getText();
        String cauhinh = txt_CauHinh.getText();
        String soluong = txt_SL.getText();
        String hangsx = cbx_HangSX.getSelectedItem().toString();
        byte[] hinhMT = image_person;
        String mota  = txt_MoTa.getText();        

        MayTinh mt = new MayTinh(mamt,tenmt, cauhinh, soluong, hangsx,hinhMT, mota);

        MayTinhBL.CapNhatMayTinh(mt);
        JOptionPane.showMessageDialog(rootPane,"Cập nhật thành công!");
        showListMayTinh();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int RemoveIndex = tbl_LinhKien.getSelectedRow();
        if(RemoveIndex == -1)
        {
            JOptionPane.showMessageDialog(rootPane,"Bạn chưa chọn máy tính nào !");
        }
        else
        {
            int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa máy tính: "+txt_TenMT.getText()+" ?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(reply==0)
            {
                MayTinh mt =list.get(RemoveIndex);
                MayTinhBL.XoaMayTinh(mt);
                model.removeRow(RemoveIndex);
                JOptionPane.showMessageDialog(rootPane,"Đã xóa thành công!");
                ResetText();
                showListMayTinh();
            }
            else
            return;

        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        if(txt_TenMT.getText().length()==0 || txt_CauHinh.getText().length()==0 ||
            txt_SL.getText().length()==0 || cbx_HangSX.getSelectedIndex()==-1
            || txt_MoTa.getText().length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin bạn nhập chưa đủ!Xin nhập tiếp");
            return;
        }
        else
        {   TrangThaiNut(true);            
            String tenmt = txt_TenMT.getText();
            String cauhinh = txt_CauHinh.getText();
            String soluong = txt_SL.getText();
            String hangsx = cbx_HangSX.getSelectedItem().toString();
            byte[] hinhMT = image_person;
            String mota = txt_MoTa.getText();
           
            MayTinh mt = new MayTinh(tenmt,cauhinh,soluong,hangsx,hinhMT,mota);
            MayTinhBL.ThemMayTinh(mt);
            ResetText();
            JOptionPane.showMessageDialog(rootPane, "Thêm máy tính mới thành công !");
            list.add(mt);    //Thêm máy tính vào danh sách                           
        }
        showListMayTinh();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_DoiAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiAnhActionPerformed
        JFileChooser jfc = new JFileChooser("src/images/MayTinh");
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
    }//GEN-LAST:event_btn_DoiAnhActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinMayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinMayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinMayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinMayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinMayTinh dialog = new ThongTinMayTinh(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_DoiAnh;
    private javax.swing.JButton btn_MuaHang;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_XoaTrang;
    private javax.swing.JComboBox<String> cbx_HangSX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_HinhAnh;
    private javax.swing.JTable tbl_LinhKien;
    private javax.swing.JTextField txt_CauHinh;
    private javax.swing.JTextArea txt_MoTa;
    private javax.swing.JTextField txt_SL;
    private javax.swing.JTextField txt_TenMT;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
