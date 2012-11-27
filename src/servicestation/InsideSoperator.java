/*
 * InsideSoperator.java
 *
 * Created on 11 October, 2009, 3:26 PM
 */

package servicestation;
import ctracker.*;
import java.sql.*;
/**
 *
 * @author  Vidhoon
 */
public class InsideSoperator extends javax.swing.JFrame {

    /** Creates new form InsideSoperator */
    public InsideSoperator() {
        initComponents();
        ncdisp=0;
        statuslist.removeAllItems();
        statuslist.addItem("pending");
        statuslist.addItem("processing");
        statuslist.addItem("fixed");
        statuslist.addItem("dispatched");
        
          connector ob=new connector();
            
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select * from comp");
           
           String cpinf,cpdesc,cpdate,cprem;
           if(rs.next())
           {
               ncdisp++;
                    curr_cpid=rs.getInt("cpid");
           cpdesc="Desc: "+rs.getString("cpdesc");
           cpdate="Date :"+rs.getString("cpdate");
           cprem="Remarks: "+rs.getString("cpremark");
           
           cpinf=cpdesc+"\n"+cpdate+"\n"+cprem+"\n\n";
           
           cpdet.append(cpinf);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cpdet = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statuslist = new javax.swing.JComboBox();
        nextcomp = new javax.swing.JButton();
        ends = new javax.swing.JButton();
        update = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome");

        cpdet.setColumns(20);
        cpdet.setRows(5);
        jScrollPane1.setViewportView(cpdet);

        jLabel2.setText("COMPLAINT BOX");

        jLabel3.setText("Update Status");

        statuslist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statuslist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statuslistActionPerformed(evt);
            }
        });

        nextcomp.setText("Next");
        nextcomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextcompMouseClicked(evt);
            }
        });
        nextcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextcompActionPerformed(evt);
            }
        });

        ends.setText("End Session");
        ends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endsMouseClicked(evt);
            }
        });

        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ends)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(statuslist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(nextcomp))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(statuslist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextcomp)
                    .addComponent(ends))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void statuslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statuslistActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_statuslistActionPerformed

private void nextcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextcompActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nextcompActionPerformed

private void nextcompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextcompMouseClicked
// TODO add your handling code here:
    int flag=1;
    cpdet.setText("");
     connector ob=new connector();
            
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select * from comp");
           rs.next();
           int c=0;
           String cpinf,cpdesc,cpdate,cprem;
           while(c!=ncdisp)
           {
               c++;
               if(rs.next())
                   flag=1;
               else
                   flag=0;
           }
           if(flag==1)
           {
               ncdisp++;
               curr_cpid=rs.getInt("cpid");
           cpdesc="Desc: "+rs.getString("cpdesc");
           cpdate="Date :"+rs.getString("cpdate");
           cprem="Remarks: "+rs.getString("cpremark");
           
           cpinf=cpdesc+"\n"+cpdate+"\n"+cprem+"\n\n";
           
           cpdet.append(cpinf);
           }
           else
           {
            cpdet.append("End of List");
           }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
}//GEN-LAST:event_nextcompMouseClicked

private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
// TODO add your handling code here:
      connector ob=new connector();
      String stat=(String)statuslist.getSelectedItem();
      try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
            s.executeUpdate("update comp set cpremark='"+stat+"' where cpid="+curr_cpid);
      }
      catch(Exception e)
      {
          
      }
}//GEN-LAST:event_updateMouseClicked

private void endsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endsMouseClicked
// TODO add your handling code here:
    
    this.setVisible(false);
}//GEN-LAST:event_endsMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsideSoperator().setVisible(true);
            }
        });
    }
private int ncdisp,curr_cpid;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cpdet;
    private javax.swing.JButton ends;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextcomp;
    private javax.swing.JComboBox statuslist;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}