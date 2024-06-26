/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Recibo extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form Recibo
     */
    public Recibo() {
        initComponents();
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
        p_btnimp = new javax.swing.JPanel();
        l_imp = new javax.swing.JLabel();
        img_format = new javax.swing.JLabel();
        img_left = new javax.swing.JLabel();
        P_superiorbar = new javax.swing.JPanel();
        P_exit = new javax.swing.JPanel();
        l_exit = new javax.swing.JLabel();
        P_cuad = new javax.swing.JPanel();
        l_cuad = new javax.swing.JLabel();
        p_min = new javax.swing.JPanel();
        l_min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(850, 500));
        setMinimumSize(new java.awt.Dimension(850, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_btnimp.setBackground(new java.awt.Color(255, 255, 255));
        p_btnimp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        l_imp.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        l_imp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_imp.setText("Imprimir recibo");
        l_imp.setPreferredSize(new java.awt.Dimension(180, 40));
        l_imp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_impMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_impMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_impMouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_btnimpLayout = new javax.swing.GroupLayout(p_btnimp);
        p_btnimp.setLayout(p_btnimpLayout);
        p_btnimpLayout.setHorizontalGroup(
            p_btnimpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_btnimpLayout.createSequentialGroup()
                .addComponent(l_imp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        p_btnimpLayout.setVerticalGroup(
            p_btnimpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_btnimpLayout.createSequentialGroup()
                .addComponent(l_imp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(p_btnimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 180, 40));

        img_format.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recibo_parq.png"))); // NOI18N
        jPanel1.add(img_format, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 30, -1, -1));

        img_left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yellow_bar.png"))); // NOI18N
        jPanel1.add(img_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 500));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void l_impMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_impMouseEntered
        p_btnimp.setBackground(new Color(255, 222, 89));
    }//GEN-LAST:event_l_impMouseEntered

    private void l_impMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_impMouseExited
        p_btnimp.setBackground(Color.WHITE);
    }//GEN-LAST:event_l_impMouseExited

    private void l_impMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_impMouseClicked
        HomeEmpleado newframe = new HomeEmpleado();
        
        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_l_impMouseClicked

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
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_cuad;
    private javax.swing.JPanel P_exit;
    private javax.swing.JPanel P_superiorbar;
    private javax.swing.JLabel img_format;
    private javax.swing.JLabel img_left;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_cuad;
    private javax.swing.JLabel l_exit;
    private javax.swing.JLabel l_imp;
    private javax.swing.JLabel l_min;
    private javax.swing.JPanel p_btnimp;
    private javax.swing.JPanel p_min;
    // End of variables declaration//GEN-END:variables
}
