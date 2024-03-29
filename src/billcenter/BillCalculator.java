/*
 * BillCalculator.java
 *
 * Created on 12 October, 2009, 9:37 PM
 */

package billcenter;
import ctracker.*;
import java.sql.*;

/**
 *
 * @author  Vidhoon
 */
public class BillCalculator extends javax.swing.JFrame {

    /** Creates new form BillCalculator */
    public BillCalculator() {
        initComponents();
        
      detailspanel.setVisible(false);
      
             connector ob=new connector();
            
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select appid from  appinfo");
           
           if(rs.next())
           {
               applist.addItem(rs.getString("appid"));
           }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qtext = new javax.swing.JTextField();
        applist = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        detailspanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        na = new javax.swing.JTextField();
        tatext = new javax.swing.JTextField();
        bill = new javax.swing.JButton();
        addcus = new javax.swing.JButton();
        close = new javax.swing.JButton();
        sales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose APPID");

        jLabel2.setText("Enter quantity");

        qtext.setColumns(10);

        jLabel3.setText("Total Amount");

        jLabel4.setText("Details");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("Tax");

        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });

        jLabel6.setText("VAT");

        jLabel7.setText("Net Amount");

        javax.swing.GroupLayout detailspanelLayout = new javax.swing.GroupLayout(detailspanel);
        detailspanel.setLayout(detailspanelLayout);
        detailspanelLayout.setHorizontalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(detailspanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailspanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(vat)))
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        detailspanelLayout.setVerticalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tatext.setColumns(10);

        bill.setText("Bill");
        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billMouseClicked(evt);
            }
        });
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        addcus.setText("Add Customer");
        addcus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcusMouseClicked(evt);
            }
        });

        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        sales.setText("Record sales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sales)
                            .addComponent(addcus))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close)
                            .addComponent(applist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bill)
                                .addComponent(qtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(detailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(applist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bill))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(detailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sales)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcus)
                    .addComponent(close))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_billActionPerformed

private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
// TODO add your handling code here:
//GEN-LAST:event_taxActionPerformed
}

private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
// TODO add your handling code here:
    if(detailspanel.isVisible())
    detailspanel.setVisible(false);
    else
    detailspanel.setVisible(true);
    
}//GEN-LAST:event_jLabel4MouseClicked

private void billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseClicked
// TODO add your handling code here:
    int q=Integer.parseInt(qtext.getText());
    
    String aid=(String)applist.getSelectedItem();
    int a=Integer.parseInt(aid);
    int tcost;
          connector ob=new connector();
            
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select appcost from  appinfo where appid="+a);
           
           if(rs.next())
           {
              int cost=rs.getInt("appcost");
              vatv=(cost*q*12)/100;
              taxv=(cost*q*5)/100;
               
              tcost=cost*q+vatv+taxv;
              cost=cost*q;
              
              tatext.setText(""+tcost);
              na.setText(""+cost);
              vat.setText(""+vatv);
              tax.setText(""+taxv);
           }
           
           
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
}//GEN-LAST:event_billMouseClicked

private void addcusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcusMouseClicked
// TODO add your handling code here:
    AddCustomer ob=new AddCustomer();
    
    ob.setVisible(true);
    
    
}//GEN-LAST:event_addcusMouseClicked

private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
// TODO add your handling code here:
    
    this.setVisible(false);
}//GEN-LAST:event_closeMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillCalculator().setVisible(true);
            }
        });
    }
int vatv,taxv;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcus;
    private javax.swing.JComboBox applist;
    private javax.swing.JButton bill;
    private javax.swing.JButton close;
    private javax.swing.JPanel detailspanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField na;
    private javax.swing.JTextField qtext;
    private javax.swing.JButton sales;
    private javax.swing.JTextField tatext;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables

}
