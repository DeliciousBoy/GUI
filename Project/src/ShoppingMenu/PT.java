/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShoppingMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ShoppingMenu.Bill.*;
/**
 *
 * @author ASUS
 */
public class PT extends javax.swing.JFrame {

    /**
     * Creates new form PT
     */
    int item;
    public static double sum_price = 0;

    public PT() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        minus = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        add = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_sumprice = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        Names = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLael2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "Qty", "prices"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dog", "1"},
                {"fish", "2"},
                {"Secret Menu#3", "34"},
                {"Secret Menu#4", "4"},
                {"Secret Menu#5", "5"},
                {"Secret Menu#6", "7"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "item", "price"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        lb.setText("0");

        jScrollPane4.setViewportView(jTextPane1);

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        payButton.setText("pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Price : ");

        lb_sumprice.setText("0");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Names.setText("Null");

        jLabel3.setText("Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plus)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Names)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(payButton)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lb_sumprice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_sumprice))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Names)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minus)
                        .addComponent(plus)
                        .addComponent(lb)
                        .addComponent(payButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                             
    
    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        item++;
        lb.setText(Integer.toString(item));
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        if (item > 0) {
            item--;
            lb.setText(Integer.toString(item));
        }

    }//GEN-LAST:event_minusActionPerformed

    int selected;
    int sumPricePerItem;

    private int sumPrice() {
        sumPricePerItem = 0;
        sumPricePerItem = item * Integer.parseInt(jTable2.getValueAt(selected, 1).toString());
        return sumPricePerItem;

    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        // Display item 
        selected = jTable2.getSelectedRow();
        String s = String.valueOf(jTable2.getValueAt(selected, 0));
        jTextPane1.setText(s);

    }//GEN-LAST:event_jTable2MouseClicked

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        //Pay here
        //Pay here
        BillTest bill = new BillTest();
        bill.show();
        String totalPrice = lb_sumprice.getText();
        int NumRow2 = jTable1.getRowCount();
        bill.textArea.setText("                         XXX  XXX X XXX \n");

        bill.textArea.setText(bill.textArea.getText() + "----------------------------------------------------------------\n");
        bill.textArea.setText(bill.textArea.getText() + "   Item \tQty \tPrice \n");
        bill.textArea.setText(bill.textArea.getText() + "----------------------------------------------------------------\n");
        for (int i = 0; i < NumRow2; i++) {
            String item = String.valueOf(jTable1.getValueAt(i, 0).toString());
            String q = String.valueOf(jTable1.getValueAt(i, 1).toString());
            String p = String.valueOf(jTable1.getValueAt(i, 1).toString());
            bill.textArea.setText(bill.textArea.getText() +item+"\t"+q+"\t"+p + "\n");

//           
        }
        bill.textArea.setText(bill.textArea.getText() + "----------------------------------------------------------------\n");

        bill.textArea.setText(bill.textArea.getText() + "Total Price : " + totalPrice + "\n");

    }//GEN-LAST:event_payButtonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        // Add item to Cart here
//        String NameItem = jTextPane1.getText();
        int numRow = jTable1.getRowCount();

        if (item > 0) {

            DefaultTableModel delete = (DefaultTableModel) jTable1.getModel();

            int IsSameValue = 0;
            int get_i = 0;
            for (int i = 0; i < numRow; i++) {
                if (jTable2.getModel().getValueAt(selected, 0) == jTable1.getModel().getValueAt(i, 0)) {
                    IsSameValue++;
                    get_i = i;
                }
            }

            System.out.println("C : " + IsSameValue);
            if (IsSameValue == 0) {
                //System.out.println("C : " + c);

                AddRowToJTable(new Object[]{
                    jTable2.getModel().getValueAt(selected, 0),
                    lb.getText(),
                    sumPrice()

                }
                );
            } else if (IsSameValue > 0) {
                System.out.println("get_i : " + get_i);
                //for (int i = 0; i < get_i; i++) {
                System.out.println("loop get_i : " + get_i);
                if (jTable2.getModel().getValueAt(selected, 0) == jTable1.getModel().getValueAt(get_i, 0)) {
                    System.out.println("xxx");

                    //numJT2+ numJT1
                    //priceJT2+ priceJT!
                    int numJT2 = Integer.valueOf(lb.getText().toString());
                    int priceJT2 = Integer.valueOf(jTable2.getValueAt(selected, 1).toString());
                    int SpJT2 = numJT2 * priceJT2;
                    System.out.println("n2 : " + numJT2);
                    System.out.println("p2 : " + priceJT2);
                    System.out.println("SUMp2 = numJT2 *  priceJT2 : " + SpJT2);

                    System.out.println("-----------------------");

                    int numJT1 = Integer.valueOf(jTable1.getValueAt(get_i, 1).toString());
                    int priceJT1 = Integer.valueOf(jTable1.getValueAt(get_i, 2).toString());
                    //int SpJT2 = Integer.valueOf(jTable1.getValueAt(i, 2).toString());

                    System.out.println("numJT1 : " + numJT1);
                    System.out.println("priceJT1 : " + priceJT1);

                    System.out.println("-----------------------");

                    int dfQtyJT1 = numJT2 + numJT1;
                    int dfPriceJT1 = SpJT2 + priceJT1;

                    System.out.println("dfQtyJT1 : " + dfQtyJT1);
                    System.out.println("dfPriceJT1 : " + dfPriceJT1);

                    jTable1.setValueAt(jTable2.getModel().getValueAt(selected, 0), get_i, 0);
                    jTable1.setValueAt(dfQtyJT1, get_i, 1);
                    jTable1.setValueAt(dfPriceJT1, get_i, 2);
//                    numJT1 = 0;
//                    numJT2 = 0;
//                    SpJT2 = 0;
//                    priceJT1 = 0;
//                    priceJT2 = 0;
//                    dfPriceJT1 = 0;
//                    dfQtyJT1 = 0;

//                    
                }

            }

            JOptionPane.showMessageDialog(null, "Add successful !! ");

        } else {
            JOptionPane.showMessageDialog(null, "Choose item and Input value of item !! ");
        }

        item = 0;
        lb.setText("0");

//        JOptionPane.showMessageDialog(null, "Payment successful! ");
        //Show Total price on label
        int NumRow = jTable1.getRowCount();
        double Total = 0;
        for (int i = 0; i < NumRow; i++) {
            double Value = Double.valueOf(jTable1.getValueAt(i, 2).toString());
            Total += Value;
            lb_sumprice.setText(Double.toString(Total));
        }
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel delete = (DefaultTableModel) jTable1.getModel();
        //delete row
        if (jTable1.getSelectedRowCount() == 1) {
            delete.removeRow(jTable1.getSelectedRow());
            int NumRow = jTable1.getRowCount();
            if (jTable1.getRowCount() == 0) {
                lb_sumprice.setText("0");
            } else {
                double Total = 0;
                for (int i = 0; i < NumRow; i++) {
                    double Value = Double.valueOf(jTable1.getValueAt(i, 2).toString());
                    Total += Value;
                    lb_sumprice.setText(Double.toString(Total));
                }
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "It's empty !!  ");
            } else if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "select any row for delete !!");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed






    /**
     * @param args the comme { double Total = 0; for (int i = 0; i < NumRow;
     * i++) { double Value = Double.valueOf(jTable1.getValueAt(i,
     * 1).toString()); Total += Value;
     * lb_sumprice.setText(Double.toString(Total)); } } } else {
     * if(jTable1.getRowCount() == 0){ JOptionPane.showMessageDialog(this, "It's
     * empty !! "); else if (jTable1.getSelectedRowCount() == 0) {
     * JOptionPane.showMessageDialog(this, "select any row for delete !!"); } }
     * } } * /** @paand line arguments
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
            java.util.logging.Logger.getLogger(PT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PT().setVisible(true);
            }
        });
    }

    public static void AddRowToJTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(dataRow);
    }
//  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Names;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lb;
    public static javax.swing.JLabel lb_sumprice;
    private javax.swing.JButton minus;
    private javax.swing.JButton payButton;
    private javax.swing.JButton plus;
    // End of variables declaration//GEN-END:variables
}
