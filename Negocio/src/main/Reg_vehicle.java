/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Negocio.Vehiculo;
import Negocio.elquemanejaelparqueadero;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.PYException;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Reg_vehicle extends javax.swing.JFrame {

    int xMouse, yMouse;
    private String vehicleType;
    private  elquemanejaelparqueadero manager;
    
    
    /**
     * Creates new form Reg_vehicle
     */
    public Reg_vehicle(String vehicleType) {
        this.manager = manager;
        this.vehicleType = vehicleType;
       
        initComponents();
        Tipo_Vehiculo.setText(vehicleType);
        manager = new elquemanejaelparqueadero();
    }
     public elquemanejaelparqueadero getManager() {
        return manager;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        f_placa = new javax.swing.JTextField();
        imgplaca = new javax.swing.JLabel();
        Tipo_Vehiculo = new javax.swing.JLabel();
        p_horayfechaing = new javax.swing.JPanel();
        fecha_actual = new javax.swing.JLabel();
        btn_horayfechaing = new javax.swing.JPanel();
        l_horayfechaing = new javax.swing.JLabel();
        img_fechahoraing = new javax.swing.JLabel();
        imgVehicletp = new javax.swing.JLabel();
        p_regis = new javax.swing.JPanel();
        l_regis = new javax.swing.JLabel();
        p_message = new javax.swing.JPanel();
        imgbtnatras = new javax.swing.JLabel();
        P_superiorbar = new javax.swing.JPanel();
        P_exit = new javax.swing.JPanel();
        l_exit = new javax.swing.JLabel();
        P_cuad = new javax.swing.JPanel();
        l_cuad = new javax.swing.JLabel();
        p_min = new javax.swing.JPanel();
        l_min = new javax.swing.JLabel();
        img_right = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(850, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_placa.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        f_placa.setForeground(new java.awt.Color(204, 204, 204));
        f_placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f_placa.setText("AAA000");
        f_placa.setBorder(null);
        f_placa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        f_placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f_placaMousePressed(evt);
            }
        });
        f_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_placaActionPerformed(evt);
            }
        });
        jPanel1.add(f_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        imgplaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box_Placa.png"))); // NOI18N
        jPanel1.add(imgplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Tipo_Vehiculo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Tipo_Vehiculo.setText("jLabel1");
        jPanel1.add(Tipo_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, 90));

        p_horayfechaing.setBackground(new java.awt.Color(255, 255, 255));
        p_horayfechaing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fecha_actual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha_actual.setText("jLabel1");

        javax.swing.GroupLayout p_horayfechaingLayout = new javax.swing.GroupLayout(p_horayfechaing);
        p_horayfechaing.setLayout(p_horayfechaingLayout);
        p_horayfechaingLayout.setHorizontalGroup(
            p_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_horayfechaingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        p_horayfechaingLayout.setVerticalGroup(
            p_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_horayfechaingLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(p_horayfechaing, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 350, 80));

        btn_horayfechaing.setBackground(new java.awt.Color(255, 255, 255));
        btn_horayfechaing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        l_horayfechaing.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        l_horayfechaing.setText("Fecha y Hora Actual");
        l_horayfechaing.setPreferredSize(new java.awt.Dimension(220, 40));
        l_horayfechaing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_horayfechaingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_horayfechaingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_horayfechaingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_horayfechaingLayout = new javax.swing.GroupLayout(btn_horayfechaing);
        btn_horayfechaing.setLayout(btn_horayfechaingLayout);
        btn_horayfechaingLayout.setHorizontalGroup(
            btn_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(btn_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_horayfechaingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l_horayfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_horayfechaingLayout.setVerticalGroup(
            btn_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btn_horayfechaingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_horayfechaingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l_horayfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btn_horayfechaing, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 220, 40));

        img_fechahoraing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fehcayhoraing.png"))); // NOI18N
        jPanel1.add(img_fechahoraing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        imgVehicletp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro_tpv.png"))); // NOI18N
        jPanel1.add(imgVehicletp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        p_regis.setBackground(new java.awt.Color(255, 255, 255));
        p_regis.setPreferredSize(new java.awt.Dimension(180, 40));

        l_regis.setBackground(new java.awt.Color(255, 255, 255));
        l_regis.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        l_regis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_regis.setText("Registrar");
        l_regis.setMaximumSize(new java.awt.Dimension(200, 40));
        l_regis.setMinimumSize(new java.awt.Dimension(200, 40));
        l_regis.setPreferredSize(new java.awt.Dimension(200, 40));
        l_regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_regisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_regisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_regisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_regisLayout = new javax.swing.GroupLayout(p_regis);
        p_regis.setLayout(p_regisLayout);
        p_regisLayout.setHorizontalGroup(
            p_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(p_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_regisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        p_regisLayout.setVerticalGroup(
            p_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(p_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_regisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l_regis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(p_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 180, 40));

        p_message.setBackground(new java.awt.Color(255, 255, 255));
        p_message.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout p_messageLayout = new javax.swing.GroupLayout(p_message);
        p_message.setLayout(p_messageLayout);
        p_messageLayout.setHorizontalGroup(
            p_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p_messageLayout.setVerticalGroup(
            p_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(p_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 370, 100));

        imgbtnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atrasyellow.png"))); // NOI18N
        imgbtnatras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgbtnatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgbtnatrasMouseClicked(evt);
            }
        });
        jPanel1.add(imgbtnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        P_superiorbar.setBackground(new java.awt.Color(255, 255, 255));
        P_superiorbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_superiorbarMouseDragged(evt);
            }
        });
        P_superiorbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_superiorbarMousePressed(evt);
            }
        });
        P_superiorbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_exit.setBackground(new java.awt.Color(255, 255, 255));
        P_exit.setMaximumSize(new java.awt.Dimension(30, 30));
        P_exit.setMinimumSize(new java.awt.Dimension(30, 30));

        l_exit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        l_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_exit.setText("X");
        l_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l_exit.setMaximumSize(new java.awt.Dimension(30, 30));
        l_exit.setMinimumSize(new java.awt.Dimension(30, 30));
        l_exit.setPreferredSize(new java.awt.Dimension(30, 30));
        l_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout P_exitLayout = new javax.swing.GroupLayout(P_exit);
        P_exit.setLayout(P_exitLayout);
        P_exitLayout.setHorizontalGroup(
            P_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_exitLayout.createSequentialGroup()
                .addComponent(l_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P_exitLayout.setVerticalGroup(
            P_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        P_superiorbar.add(P_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        P_cuad.setBackground(new java.awt.Color(255, 255, 255));
        P_cuad.setMaximumSize(new java.awt.Dimension(30, 30));
        P_cuad.setMinimumSize(new java.awt.Dimension(30, 30));

        l_cuad.setBackground(new java.awt.Color(255, 255, 255));
        l_cuad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_cuad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l_cuad.setMaximumSize(new java.awt.Dimension(11, 22));
        l_cuad.setMinimumSize(new java.awt.Dimension(11, 22));
        l_cuad.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout P_cuadLayout = new javax.swing.GroupLayout(P_cuad);
        P_cuad.setLayout(P_cuadLayout);
        P_cuadLayout.setHorizontalGroup(
            P_cuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_cuadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_cuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_cuadLayout.setVerticalGroup(
            P_cuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_cuadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_cuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        P_superiorbar.add(P_cuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        p_min.setBackground(new java.awt.Color(255, 255, 255));
        p_min.setMaximumSize(new java.awt.Dimension(30, 30));
        p_min.setMinimumSize(new java.awt.Dimension(30, 30));

        l_min.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        l_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_min.setText("-");
        l_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l_min.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout p_minLayout = new javax.swing.GroupLayout(p_min);
        p_min.setLayout(p_minLayout);
        p_minLayout.setHorizontalGroup(
            p_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_minLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_minLayout.setVerticalGroup(
            p_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_minLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        P_superiorbar.add(p_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanel1.add(P_superiorbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        img_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegistroRight.png"))); // NOI18N
        jPanel1.add(img_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void l_regisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_regisMouseEntered
        p_regis.setBackground(new Color(255, 222, 89));
    }//GEN-LAST:event_l_regisMouseEntered

    private void l_regisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_regisMouseExited
        p_regis.setBackground(Color.WHITE);
    }//GEN-LAST:event_l_regisMouseExited

    private void l_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_l_exitMouseClicked

    private void l_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseEntered
        P_exit.setBackground(Color.RED);
    }//GEN-LAST:event_l_exitMouseEntered

    private void l_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseExited
        P_exit.setBackground(Color.white);
    }//GEN-LAST:event_l_exitMouseExited

    private void P_superiorbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_superiorbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_P_superiorbarMouseDragged

    private void P_superiorbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_superiorbarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_P_superiorbarMousePressed

    private void f_placaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_placaMousePressed
        if (f_placa.getText().equals("AAA000")){
        f_placa.setText("");
        f_placa.setForeground(Color.black);
       }
    }//GEN-LAST:event_f_placaMousePressed

    private void imgbtnatrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgbtnatrasMouseClicked
        TipoVehiculo newframe = new TipoVehiculo();
        
        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_imgbtnatrasMouseClicked

    private void l_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_regisMouseClicked
        HomeEmpleado newframe = new HomeEmpleado();
        try {
        	  
              
               manager.incluirVehiculo(f_placa.getText(), Tipo_Vehiculo.getText());
              JOptionPane.showMessageDialog(null,  "Registro Incluido Exitosamente", null, JOptionPane.INFORMATION_MESSAGE);
          } catch (PYException f) {
              JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);
              
          }
        
        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_l_regisMouseClicked

    private void f_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_placaActionPerformed

    private void l_horayfechaingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_horayfechaingMouseEntered
        btn_horayfechaing.setBackground(new Color(255, 222, 89));
    }//GEN-LAST:event_l_horayfechaingMouseEntered

    private void l_horayfechaingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_horayfechaingMouseExited
        btn_horayfechaing.setBackground(Color.white);
    }//GEN-LAST:event_l_horayfechaingMouseExited

    private void l_horayfechaingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_horayfechaingMouseClicked
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Establecer la fecha y hora actual en el JLabel `fecha_actual`
        fecha_actual.setText(formattedDateTime);
    
    }//GEN-LAST:event_l_horayfechaingMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_cuad;
    private javax.swing.JPanel P_exit;
    private javax.swing.JPanel P_superiorbar;
    private javax.swing.JLabel Tipo_Vehiculo;
    private javax.swing.JPanel btn_horayfechaing;
    private javax.swing.JTextField f_placa;
    private javax.swing.JLabel fecha_actual;
    private javax.swing.JLabel imgVehicletp;
    private javax.swing.JLabel img_fechahoraing;
    private javax.swing.JLabel img_right;
    private javax.swing.JLabel imgbtnatras;
    private javax.swing.JLabel imgplaca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_cuad;
    private javax.swing.JLabel l_exit;
    private javax.swing.JLabel l_horayfechaing;
    private javax.swing.JLabel l_min;
    private javax.swing.JLabel l_regis;
    private javax.swing.JPanel p_horayfechaing;
    private javax.swing.JPanel p_message;
    private javax.swing.JPanel p_min;
    private javax.swing.JPanel p_regis;
    // End of variables declaration//GEN-END:variables
}
