package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.lang.*;
import java.sql.DriverManager;
import java.sql.Driver;
import java.util.logging.*;

public class Coding extends javax.swing.JFrame{
    
    ButtonGroup btngrp[]=new ButtonGroup[5];
    int i=1,j=0;    
    JRadioButton btn[]=new JRadioButton[21];
    int result=0;
    
    public Coding()
    {
           
             initComponents();
             setLocationRelativeTo(null);
             Connection mycon=null;
             Statement mystate=null;
             ResultSet myres=null;
             
             i=1;
             System.out.println(this.i);
             MyActionListener1 ml=new MyActionListener1(this);
             

       try
       { 
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","Quiz123@");
           mystate=mycon.createStatement();
           myres=mystate.executeQuery("select *from coding");
           System.out.println(mycon);
           txtarea.setFont(new Font("Tahona",Font.PLAIN,20));
           txtarea.append("CODING QUESTIONS \n\n");      
           int y=100;
            while(myres.next())
           {
               btngrp[j]=new ButtonGroup();
               txtarea.append(myres.getString(("ques") ));
               txtarea.append("\n\n");
               
               btn[i]=new  JRadioButton("A");
               btn[i].setBounds(10,y+20,20,10);
               btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                txtarea.append("        ");
                txtarea.append(myres.getString(("A") ));
               txtarea.append("\n\n");
                y=y+60;
                 btngrp[j].add(btn[i]);
                 i++;
                
               btn[i]=new  JRadioButton("B");
               btn[i].setBounds(10,y,20,10);
                btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       "); 
               txtarea.append(myres.getString(("B")));
               txtarea.append("\n\n");
               y=y+60;
                 btngrp[j].add(btn[i]);
                i++;
                
               
               
               btn[i]=new  JRadioButton("C");
               btn[i].setBounds(10,y,20,10);
                btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       "); 
               txtarea.append(myres.getString(("C") ));
               txtarea.append("\n\n");
                 y=y+60;
                 btngrp[j].add(btn[i]);
                 i++;
               
               
               btn[i]=new  JRadioButton("D");
                btn[i].setBounds(10,y,20,10);
                 btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                   btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       ");
                txtarea.append(myres.getString(("D") ));
                txtarea.append("\n\n");
                y=y+80;
                  btngrp[j].add(btn[i]);
                 i++;
               
                j++;
    
                 
                
    
           }
       }
       catch(SQLException e)
       {
           System.out.println("exception  = "+e);

       }
       catch(ClassNotFoundException ex)
       {
             System.out.println("exception  = "+ex);
           //Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE,null,ex);
       }
       
       finally
       {
          if(mycon!=null)
          {
              
          }
       }
        
        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnnext = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtarea.setBackground(new java.awt.Color(224, 238, 249));
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnnext.setBackground(new java.awt.Color(185, 218, 247));
        btnnext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnnext.setText("NEXT");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnback1.setBackground(new java.awt.Color(185, 218, 247));
        btnback1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback1.setText("BACK");
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnback1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
     
      System.out.println("reusult out of 5:"+result);
      Quiz.obj.commonFunction(result);
        
        new Verbal();
        dispose();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
         new Quiz();
         dispose();
    }//GEN-LAST:event_btnback1ActionPerformed

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
            java.util.logging.Logger.getLogger(Coding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnnext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
class MyActionListener1 implements ActionListener
{
    
    Coding c;
     MyActionListener1 (Coding d)
     {
         c=d;
     }
    @Override
      public void actionPerformed(ActionEvent e)
     {
       
     JRadioButton b=(JRadioButton)e.getSource();
       // System.out.println("\n i = "+a.i);
       int i=1;
        while(i<=20)
        {
                 
            if( b==c.btn[i])
            { 
               // System.out.println("btn no = "+i);
                break;
            }
            i++;
        }
        int k=0;
        if(i<=1*4)
        {
           k=1; 
        }
        else if(1*4<i&&i<=2*4)
        {
            k=2; 
        }
        else if(2*4<i&&i<=3*4)
        {
            k=3; 
        }
        else if(3*4<i&&i<=4*4)
        {
            k=4; 
        }
        else
        {
            k=5;
        }
       
        System.out.println("reusult  be4 anything : "+c.result);
        Connection mycon=null;
        Statement mystate=null;
        ResultSet myres=null;
        try
        {
             mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","Quiz123@");
             String query="select ans from coding where idcoding = '"+k+"'";
             mystate=mycon.createStatement();
             myres=mystate.executeQuery(query);
             //System.out.println(mycon);
                    if(myres.next())
                    {
                          String ans= myres.getString("ans");
                          System.out.println("ans for q = "+k+"  "+ans+" i = "+i);
                          if(ans.equals("a")&&(i==1||i==5||i==9||i==13||i==17))
                          {
                              System.out.println("result incremented for correct option a");
                              c.result++;
                              
                          }
                          else if(ans.equals("b")&&(i==2||i==6||i==10||i==14||i==18))
                          {
                               System.out.println("result incremented for correct option b");
                              c.result++;
                             
                          }
                          else if(ans.equals("c")&&(i==3||i==7||i==11||i==15||i==19))
                          {
                               System.out.println("result incremented for correct option c");
                              c.result++;
                              
                          }
                          else if(ans.equals("d")&&(i==4||i==8||i==12||i==16||i==20))
                          {
                               System.out.println("result incremented for correct option d");
                              c.result++;
                               
                          }
                          else
                          {
                                  
                           }
                          
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(c,"Result not found");
                    }
                    //a.result++;
        }
        catch(Exception exp)
        {
            System.out.println("exception caught"+exp);
        }
       
            
     }
}



