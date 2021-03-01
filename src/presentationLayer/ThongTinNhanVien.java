/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import businessLayer.*;
import dataTransferObject.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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


public class ThongTinNhanVien extends javax.swing.JDialog {

    public List<NhanVien> list;
    public DefaultTableModel model;
    public static String manv;
    String nameimage=null;
    byte[] image_person = null;
    
    public ThongTinNhanVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) tblNhanVien.getModel();
        TrangThaiNut(false);
        btn_Them.setEnabled(true);
    }
    
    public ThongTinNhanVien()
    {}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_TenHT = new javax.swing.JTextField();
        txt_TenNV = new javax.swing.JTextField();
        txt_Phai = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_DoiMK = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        txt_NgaySinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbx_ChucVu = new javax.swing.JComboBox<>();
        btn_Reset = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        btn_LamMoi = new javax.swing.JButton();
        lbl_HinhAnh = new javax.swing.JLabel();
        btn_DoiAnh = new javax.swing.JButton();
        btn_Tim = new javax.swing.JButton();
        txt_TimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Tên Hiển Thị:");

        jLabel5.setText("Tên NV:");

        jLabel6.setText("Chức Vụ:");

        jLabel7.setText("Phái:");

        jLabel8.setText("Ngày Sinh:");

        jLabel9.setText("Địa Chỉ:");

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

        btn_DoiMK.setText("Đổi Mật Khẩu");
        btn_DoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiMKActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        jLabel10.setText("Mật khẩu:");

        cbx_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Quản Lý" }));

        btn_Reset.setText("Xóa Trắng");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        lbl_HinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_DoiAnh.setText("Đổi Ảnh");
        btn_DoiAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Them)
                                .addGap(45, 45, 45)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_DoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_TenNV, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_ChucVu, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                                    .addComponent(txt_Phai, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_pass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NgaySinh, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(btn_DoiAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 20, Short.MAX_VALUE))))
                            .addComponent(txt_TenHT, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TenHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_Phai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DoiAnh))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DoiMK)
                    .addComponent(btn_LamMoi))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Them))
                .addGap(27, 27, 27))
        );

        btn_Tim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Tim.setText("Tìm");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Chức Vụ", "Phái", "Địa Chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");

        jLabel2.setText("Tìm Kiếm :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Tim))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        
        TrangThaiNut(true);           
        txt_TenHT.setEnabled(false);
        txt_pass.setEnabled(false);
        NhanVien nv = list.get(tblNhanVien.getSelectedRow());
        String manv = String.valueOf(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),0));     
        String tenht = nv.getsTenHT().toString();
        String tennv = String.valueOf(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),1));  
        String chucvu = String.valueOf(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),2));
        String phai = String.valueOf(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),3)); 
        String ngaysinh = nv.getdNgaySinh();
        String pass = nv.getPassWord().toString();
        String diachi = String.valueOf(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),4));
        byte[] hinhNV = nv.getsHinhAnh();
      
        txt_TenHT.setText(tenht);
        txt_TenNV.setText(tennv);
        cbx_ChucVu.setSelectedItem(chucvu);
        txt_Phai.setText(phai);
        txt_NgaySinh.setText(ngaysinh);    
        txt_pass.setText(pass);
        txt_DiaChi.setText(diachi);
        ImageIcon imageicon = new ImageIcon(hinhNV);
        imageicon.setImage(imageicon.getImage().getScaledInstance(lbl_HinhAnh.getWidth(), lbl_HinhAnh.getHeight(), Image.SCALE_DEFAULT));
        lbl_HinhAnh.setIcon(imageicon);   
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        if(txt_TenHT.getText().length()==0 || txt_TenNV.getText().length()==0 ||
                 txt_DiaChi.getText().length()==0 || cbx_ChucVu.getSelectedItem().toString().length()==0 
                 || txt_Phai.getText().length()==0 || txt_NgaySinh.getText().length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin bạn nhập chưa đủ!Xin nhập tiếp");
            return;
        }
        else
        {          
            int Question = JOptionPane.showConfirmDialog(rootPane,"Sẽ thêm nhân viên vào hệ thống cửa hàng của bạn! Bạn có chắc chắn?","Cảnh Báo",JOptionPane.YES_NO_OPTION);
            if(Question==0)
            {
                TrangThaiNut(false);
                btn_DoiMK.setEnabled(true);                                   
                String tenht = txt_TenHT.getText();
                String tennv = txt_TenNV.getText();
                String chucvu = cbx_ChucVu.getSelectedItem().toString();
                String phai = txt_Phai.getText();
                String pass = new String(txt_pass.getPassword());
                String ngaysinh = txt_NgaySinh.getText();           
                String diachi = txt_DiaChi.getText();
                byte[] hinhNV = image_person;

                //Mã hóa từ text mật khảu thành chuỗi mã hóa cho vào csdl 
                String passMD5 = "";
                 try {
                     passMD5 = MD5Encryptor.encrypt(pass);
                 } catch (NoSuchAlgorithmException ex) {
                     Logger.getLogger(ThongTinNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (UnsupportedEncodingException ex) {
                     Logger.getLogger(ThongTinNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                 }
                                              
                    NhanVien nv = new NhanVien(tenht, tennv, chucvu, phai, passMD5, ngaysinh, diachi,hinhNV);                       
                    NhanVienBL.ThemNhanVien(nv);   
                    ResetText();
                    txt_TenHT.setText("");
                    txt_pass.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Thêm nhân viên thành công !");
                    list.add(nv);    //Thêm nhân viên vào danh sách                              
            }
            else
                return;
        }
        showListNhanVien();
    }//GEN-LAST:event_btn_ThemActionPerformed

    public void TrangThaiNut(boolean b) {

        this.btn_Them.setEnabled(b);
        this.btn_Xoa.setEnabled(b);
        this.btn_Sua.setEnabled(b);
        this.btn_DoiMK.setEnabled(b);
    }
    
    public void showListNhanVien()
    {
        list = NhanVienBL.showData();
        model.setRowCount(0);
        for(NhanVien nv : list)
        {
            model.addRow(new Object[]{
                nv.getsMaNV(),nv.getsTenNV(),nv.getsChucVu(),nv.getsPhai(),nv.getsDiaChi()
            });            
        }
    }  
       
    
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int RemoveIndex = tblNhanVien.getSelectedRow();
        if(RemoveIndex == -1)
        {
            JOptionPane.showMessageDialog(rootPane,"Bạn chưa chọn nhân viên nào !");
        }
        else 
        {           
            int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa nhân viên: "+txt_TenNV.getText()+"?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(reply==0)
            {        
                NhanVien nv =list.get(RemoveIndex);               
                NhanVienBL.XoaNhanVien(nv.getsMaNV());                
                model.removeRow(RemoveIndex);
                JOptionPane.showMessageDialog(rootPane,"Đã xóa thành công!");
                ResetText();
                showListNhanVien();                               
            }
            else
                return;           
            
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        NhanVien nhanvien = list.get(tblNhanVien.getSelectedRow());
        String manv = nhanvien.getsMaNV();
        String tenht = txt_TenHT.getText();
        String tennv = txt_TenNV.getText();
        String chucvu = cbx_ChucVu.getSelectedItem().toString();
        String phai = txt_Phai.getText();
        String pass = txt_pass.getPassword().toString();
        String ngaysinh = txt_NgaySinh.getText();
        String diachi = txt_DiaChi.getText();
        byte[] hinhNV = image_person;
        
        NhanVien nv= new NhanVien(manv,tenht,tennv,chucvu,phai,pass,ngaysinh,diachi,hinhNV);
        NhanVienBL.CapNhatNhanVien(nv);
        JOptionPane.showMessageDialog(rootPane,"Cập nhật thành công!");
        showListNhanVien();             
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showListNhanVien();
        TrangThaiNut(true);       
        txt_TenHT.setEnabled(true);
        txt_TenNV.requestFocus();
        txt_pass.setEnabled(true);            
        
        TableColumnModel tblmo = tblNhanVien.getColumnModel();
        tblmo.getColumn(0).setPreferredWidth(80);
        tblmo.getColumn(1).setPreferredWidth(230);
        tblmo.getColumn(2).setPreferredWidth(120);
        tblmo.getColumn(3).setPreferredWidth(200);
        tblmo.getColumn(4).setPreferredWidth(190);
    }//GEN-LAST:event_formWindowOpened

    private void ResetText()
    {      
        txt_TenNV.setText("");
        txt_TenNV.requestFocus();
        cbx_ChucVu.setSelectedIndex(0);
        txt_Phai.setText("");
        txt_NgaySinh.setText("");
        txt_DiaChi.setText("");        
    }
    
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        ResetText();
        txt_TenHT.setText("");
        txt_pass.setText("");
        txt_TenHT.setEnabled(true);
        txt_pass.setEnabled(true);
        btn_Them.setEnabled(true);
    }//GEN-LAST:event_btn_ResetActionPerformed
    
    private void btn_DoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiMKActionPerformed
        NhanVien nhanvien = list.get(tblNhanVien.getSelectedRow());       
        manv = nhanvien.getsMaNV().toString().trim();
        DoiMatKhau dmk = new DoiMatKhau(null, rootPaneCheckingEnabled,manv);
        dmk.setVisible(true);           
    }//GEN-LAST:event_btn_DoiMKActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        resetTable();
        renderTable();       
    }//GEN-LAST:event_btn_TimActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
       showListNhanVien();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_DoiAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiAnhActionPerformed
        
        JFileChooser jfc = new JFileChooser("src/images/NhanVien");
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

    private void resetTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblNhanVien.getModel();
        dtm.setRowCount(0);
    }
    
    private void renderTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        NhanVienBL nvbl = new NhanVienBL();
        nvbl.search(txt_TimKiem.getText(), dtm);
    }
    
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
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinNhanVien dialog = new ThongTinNhanVien(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_DoiMK;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbx_ChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_HinhAnh;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JTextField txt_Phai;
    private javax.swing.JTextField txt_TenHT;
    private javax.swing.JTextField txt_TenNV;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
   
}
