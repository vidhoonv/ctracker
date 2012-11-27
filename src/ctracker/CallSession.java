/*
 * CallSession.java
 *
 * Created on 10 October, 2009, 1:50 AM
 */

package ctracker;
import java.sql.*;
/**
 *
 * @author  Vidhoon
 */
public class CallSession extends javax.swing.JFrame {

    /** Creates new form CallSession */
     public CallSession() {
        initComponents();
        searchtext.setText("");
     //   jLabel1.setText(capid);
     }
     public void setcpid(int c)
     {
         cp_id=c;
         setcptext();
     }
    private void sethtext()
     {
        setcmd("Greet The Customer!!");
        //to generate hi text
        String htext=null;
        String cname = null,cappid=null;
        connector ob=new connector();
           
        
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select * from cinfo where cid="+cus_id);

           int count=0;
           if(rs.next())
           {
               if(count==0)
               {
               cname=rs.getString("cname");
                 cappid=rs.getString("cappid")+"\n";
               count++;
               }
               else
               {
               cappid+=rs.getString("cappid")+"\n";
               count++;
               }
           }
           
        htext="Hi "+cname+"!!"+"This is XYZ Customer care....\n";
        
        htext+="You are enjoying with the following apps from our company:\n ";
        
        htext+=cappid;
                
        htext+="Which one can I help you with?";
        
        hitext.append(htext);
        cmdtext.append("\n Listen to Customer Appliance ID/ Complaint ID");
        }
     catch(Exception e)
     {
         System.out.println(e);
     }
        
    }
    public void setcmd(String c)
    {
        cmdtext.setText(c);
    }
    private void setcptext()
    {
        comptext.setText("");
        String ctext=null,cpdesc=null,cpdate=null,cpremark=null;
        
          connector ob=new connector();
         
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select * from comp where cpid="+cp_id);
           
            if(rs.next())
           {
                cpdesc=rs.getString("cpdesc");
                cpdate=rs.getString("cpdate");
                cpremark=rs.getString("cpremark");
            }
           
           ctext="\nDear customer! your complaint details are as follows:\n";
           ctext+="\nComplaint Description:\n"+cpdesc;
           ctext+="\n\nThe complaint was made on:\n"+cpdate;
           ctext+="\n\nThe complaint status is "+cpremark+"\n\nThank you <Addresse>";
           
           comptext.append(ctext);
           
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
    private void setptext()
    {
      setcmd("Give customer his product/complaint details! \n And get his query \n Type in FAQ search box!");
       prodtext.setText("");
        String ptext=null,p_pur_text=null,p_gen_text=null;//product text,productpurchase text,product general text
        String dop=null,mp=null,wp=null,apid=null;//cus app info
        
        String apname=null,apcost=null,apdesc=null,apen=null,appow=null;
        System.out.println(capp_id);
         connector ob=new connector();
         
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          
           ResultSet rs = s.executeQuery("select * from capp where cappid="+capp_id);
           
           if(rs.next())
           {
               dop=rs.getString("dop");
               mp=rs.getString("mop");
               wp=rs.getString("wp");
               apid=rs.getString("appid");
            
               
           }
           int appid=Integer.parseInt(apid);
           rs = s.executeQuery("select * from appinfo where appid="+appid);
           app_id=appid;
           if(rs.next())
           {
               apname=rs.getString("appname");
               apcost=rs.getString("appcost");
               apdesc=rs.getString("appdesc");
               apen=rs.getString("appen");
               appow=rs.getString("apppow");
            
              
           }
             //System.out.println(apname);
           p_gen_text="GENERAL INFO:\n\n(Addresse),\n"+"The product is a "+apname+"\n The applicance is a :\n"+apdesc;
           
           p_gen_text+="\n\nYou were given the following enhancements with the appliance:\n"+apen;
           
           p_gen_text+="\n\nThe power constraint for appliance usage is "+appow+" volts";

           p_gen_text+="\n\nYou had bought the appliance for the best deal of RS."+apcost+"\n\n";
           
           prodtext.append(p_gen_text);
           
           p_pur_text="PURCHASE INFO:\n\nYou had the bought the product on "+dop;
           
           p_pur_text+="\n\nYou chose "+mp+" mode of payment";
           
           p_pur_text+="\n\nThe product has a warranty peroid of "+wp+" years\n";
           
          
           prodtext.append(p_pur_text+"\n\nThank you <Addresse>\n");
          
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

        jScrollPane1 = new javax.swing.JScrollPane();
        hitext = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        prodtext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        faqtext = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        endcall = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        comptext = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cmdtext = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hitext.setColumns(20);
        hitext.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        hitext.setForeground(new java.awt.Color(0, 153, 0));
        hitext.setLineWrap(true);
        hitext.setRows(5);
        jScrollPane1.setViewportView(hitext);

        prodtext.setColumns(20);
        prodtext.setFont(new java.awt.Font("Times New Roman", 0, 13));
        prodtext.setLineWrap(true);
        prodtext.setRows(5);
        jScrollPane2.setViewportView(prodtext);

        faqtext.setColumns(20);
        faqtext.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        faqtext.setLineWrap(true);
        faqtext.setRows(5);
        jScrollPane3.setViewportView(faqtext);

        jLabel1.setText("HI text");

        jLabel2.setText("PRODUCT text");

        searchtext.setText("searchtext");
        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextKeyReleased(evt);
            }
        });

        jLabel3.setText("FAQ search");

        endcall.setText("End Call");
        endcall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endcallMouseClicked(evt);
            }
        });
        endcall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endcallActionPerformed(evt);
            }
        });

        comptext.setColumns(20);
        comptext.setRows(5);
        jScrollPane4.setViewportView(comptext);

        jLabel4.setText("COMPLAINT text");

        cmdtext.setColumns(20);
        cmdtext.setForeground(new java.awt.Color(204, 0, 0));
        cmdtext.setRows(5);
        jScrollPane5.setViewportView(cmdtext);

        jLabel5.setText("SEE THIS FOR INSTRUCTRUCTIONS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(endcall, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(82, 82, 82)
                                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(endcall)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setcid(int c)
{
    cus_id=c;
    this.sethtext();
}
public void setcapid(int a)
{
    capp_id=a;
    this.setptext();
}
private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_searchtextActionPerformed

private void endcallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endcallActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_endcallActionPerformed

private void searchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyPressed
// TODO add your handling code here:
    setcmd("Click 'End call' to close");
    System.out.println("here");
    faqtext.setText("");
    String stext=searchtext.getText();
        System.out.println(stext);
    if(stext.equals(""))
    {
        
    }
    else
    {
    stext+="%";
    
         connector ob=new connector();
         
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          String querytext="select question,answer from faq where appid="+app_id+" and question like '"+stext+"'";
          System.out.print(querytext);
           ResultSet rs = s.executeQuery(querytext);
          
           
           String q,a;
           while(rs.next())
           {
            q=rs.getString("question");
            a=rs.getString("answer");
            
            faqtext.append("\n"+q+"\n\n"+a+"\n");
           }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    
    }
}//GEN-LAST:event_searchtextKeyPressed

private void searchtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyReleased
// TODO add your handling code here:
     System.out.println("here");
    faqtext.setText("");
    String stext=searchtext.getText();
        System.out.println(stext);
    if(stext.equals(""))
    {
        
    }
    else
    {
    stext+="%";
    
         connector ob=new connector();
         
     try
        {
           Connection my=ob.connect();
        
        
           Statement s=my.createStatement();
          String querytext="select question,answer from faq where appid="+app_id+" and question like '"+stext+"'";
          System.out.print(querytext);
           ResultSet rs = s.executeQuery(querytext);
          
           
           String q,a;
           while(rs.next())
           {
            q=rs.getString("question");
            a=rs.getString("answer");
            
            faqtext.append("\n"+q+"\n\n"+a+"\n");
           }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    
    }
}//GEN-LAST:event_searchtextKeyReleased

private void endcallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endcallMouseClicked
// TODO add your handling code here:
    
    this.setVisible(false);
}//GEN-LAST:event_endcallMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CallSession().setVisible(true);
            }
        });
    }

    private int cus_id,capp_id,app_id,cp_id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cmdtext;
    private javax.swing.JTextArea comptext;
    private javax.swing.JButton endcall;
    private javax.swing.JTextArea faqtext;
    private javax.swing.JTextArea hitext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea prodtext;
    private javax.swing.JTextField searchtext;
    // End of variables declaration//GEN-END:variables

}
