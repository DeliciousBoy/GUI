/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShoppingMenu;

/**
 *
 * @author Gide
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form adminMenu
     */
    public menu() {
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

        jPanel2 = new javax.swing.JPanel();
        menuSelect = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        Shopping = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        Shopping1 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        Shopping2 = new javax.swing.JLabel();
        itemSelect = new javax.swing.JPanel();
        shoppingPanel = new javax.swing.JPanel();
        tab2Panel = new javax.swing.JPanel();
        tab3Panel = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(795, 425));

        menuSelect.setBackground(new java.awt.Color(0, 153, 51));

        tab1.setBackground(new java.awt.Color(102, 204, 0));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        Shopping.setText("Shopping");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Shopping)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Shopping)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tab2.setBackground(new java.awt.Color(51, 204, 0));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        Shopping1.setText("Tab 2");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Shopping1)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Shopping1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tab3.setBackground(new java.awt.Color(153, 255, 0));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        Shopping2.setText("Tab 3");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Shopping2)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Shopping2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuSelectLayout = new javax.swing.GroupLayout(menuSelect);
        menuSelect.setLayout(menuSelectLayout);
        menuSelectLayout.setHorizontalGroup(
            menuSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuSelectLayout.setVerticalGroup(
            menuSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSelectLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemSelect.setBackground(new java.awt.Color(102, 153, 0));
        itemSelect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shoppingPanel.setBackground(new java.awt.Color(255, 153, 153));
        shoppingPanel.setPreferredSize(new java.awt.Dimension(596, 425));
        shoppingPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout shoppingPanelLayout = new javax.swing.GroupLayout(shoppingPanel);
        shoppingPanel.setLayout(shoppingPanelLayout);
        shoppingPanelLayout.setHorizontalGroup(
            shoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shoppingPanelLayout.setVerticalGroup(
            shoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        itemSelect.add(shoppingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        tab2Panel.setBackground(new java.awt.Color(0, 153, 153));
        tab2Panel.setPreferredSize(new java.awt.Dimension(500, 425));

        javax.swing.GroupLayout tab2PanelLayout = new javax.swing.GroupLayout(tab2Panel);
        tab2Panel.setLayout(tab2PanelLayout);
        tab2PanelLayout.setHorizontalGroup(
            tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        tab2PanelLayout.setVerticalGroup(
            tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        itemSelect.add(tab2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 600, -1));

        tab3Panel.setBackground(new java.awt.Color(51, 51, 255));
        tab3Panel.setPreferredSize(new java.awt.Dimension(500, 425));

        javax.swing.GroupLayout tab3PanelLayout = new javax.swing.GroupLayout(tab3Panel);
        tab3Panel.setLayout(tab3PanelLayout);
        tab3PanelLayout.setHorizontalGroup(
            tab3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        tab3PanelLayout.setVerticalGroup(
            tab3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        itemSelect.add(tab3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(itemSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(itemSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        // TODO add your handling code here:
        shoppingPanel.setVisible(true);
        tab2Panel.setVisible(false);
        tab3Panel.setVisible(false);
        System.out.println("hi");
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        // TODO add your handling code here:
        shoppingPanel.setVisible(false);
        tab2Panel.setVisible(true);
        tab3Panel.setVisible(false);
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        shoppingPanel.setVisible(false);
        tab2Panel.setVisible(false);
        tab3Panel.setVisible(true);
    }//GEN-LAST:event_tab3MouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Shopping;
    private javax.swing.JLabel Shopping1;
    private javax.swing.JLabel Shopping2;
    private javax.swing.JPanel itemSelect;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menuSelect;
    private javax.swing.JPanel shoppingPanel;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab2Panel;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab3Panel;
    // End of variables declaration//GEN-END:variables
}
