
package Uygulama;

import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
  DB.db dbb=new DB.db();
    
    public Login() {
        initComponents();
        jLabel1.setSize(300,300);
        kontrol();
      
             
    }
    StringBuilder sb = new StringBuilder();
    InetAddress ip;
    public void kontrol()
    {           
      try {
         ip = InetAddress.getLocalHost();
         NetworkInterface network = NetworkInterface.getByInetAddress(ip);
         byte[] mac = network.getHardwareAddress();
         
         for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
         }
         System.out.println("MAC address : "+sb.toString());
 
      } catch (Exception e) {
          System.out.println("hata mac adresi");
      } 
      String sorgu="select*from sifrehatirla where mac='"+sb.toString()+"'";
         
        try {
            ResultSet tr=dbb.baglan().executeQuery(sorgu);
            if(tr.next())
            {
            if(Integer.valueOf(tr.getString("flag"))==1)
            {
              String getir="select*from login where kadi='"+tr.getString("kadi")+"'";
              dbb.kapat();
              ResultSet rs=dbb.baglan().executeQuery(getir);
              if(rs.next())
              {
              kullaniciadi.setText(rs.getString("kadi"));
              sifre.setText(rs.getString("ksifre"));
              hatirla.setText("Beni Unut");
              
              }
            
            
            }
          }
        } catch (SQLException ex) {
            System.out.println("beni hatırla sorgusu hatası :"+ex);
        }
        finally{dbb.kapat();}
    
    }
   public String kontrol2(String adii) 
   { String sonuc="";
   if(hatirla.getText().equals("Beni Hatırla"))
   { sb.setLength(0);
         try {
         ip = InetAddress.getLocalHost();
         NetworkInterface network = NetworkInterface.getByInetAddress(ip);
         byte[] mac = network.getHardwareAddress();
         
         for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
         }
         System.out.println("MAC address : "+sb.toString());
 
      } catch (Exception e) {
             System.out.println("kontrol 2 hatası :"+e);
      } 
    String flagyaz="insert into sifrehatirla values(null,'"+adii+"','"+sb.toString()+"','1')";
       System.out.println(flagyaz);
       sonuc=flagyaz;
       
      
   }
   else
   {
   
   sonuc="delete from sifrehatirla where mac='"+sb.toString()+"'";
  }
   
   return sonuc;
   
   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kullaniciadi = new javax.swing.JTextField();
        giris = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        hatirla = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(400, 150));
        setPreferredSize(new java.awt.Dimension(300, 380));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(kullaniciadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 170, 30));

        giris.setText("Giriş");
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });
        jPanel1.add(giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 240, 200));

        jLabel2.setText("Kullanıcı Adı:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 20));

        jLabel3.setText("Şifre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 30));

        sifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sifreKeyPressed(evt);
            }
        });
        jPanel1.add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 170, 30));

        hatirla.setText("Beni Hatırla");
        jPanel1.add(hatirla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  String degerler="";
    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed
        
        if(kullaniciadi.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı Giriniz");
        else if(sifre.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Şifreyi Giriniz");
        else{
            
        char[] cdizi = sifre.getPassword();
        String login="select *from login where kadi = '"+kullaniciadi.getText().trim()+"' and ksifre = '"+String.valueOf(cdizi)+"'";
      
         boolean kontrol=false;
         
            try {
                ResultSet rs=dbb.baglan().executeQuery(login);
               if (rs.next()) {
                   if (rs.getString("rol") != null) {
                        
                    String tt=rs.getString("kadi");
                    String sorgu="select *from roller where rad='"+rs.getString("rol")+"'";
                    dbb.kapat();
                    ResultSet tr=dbb.baglan().executeQuery(sorgu);
                    
                    if(tr.next())
                    {
                     degerler=tr.getString("rseviye");
                    kontrol=true;
                        }
                     if(hatirla.isSelected()&&kontrol==true)
                        {
                       dbb.kapat();
                       dbb.baglan().executeUpdate(kontrol2(tt));
                     
                  
                 
                        }
                    
                    }
               }else {
                   JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bilgileri Yanlış");
                     sifre.setText("");
               }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Login Olma Hatası : "+ex);
            }
        finally{dbb.kapat();}
            
         if(kontrol)
         {
           AnaForm af=new AnaForm(degerler);
           af.setVisible(true);
            dispose();
         }
        
        }
       
    }//GEN-LAST:event_girisActionPerformed

    private void sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            girisActionPerformed(null);
   }
      
    }//GEN-LAST:event_sifreKeyPressed

   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris;
    private javax.swing.JCheckBox hatirla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kullaniciadi;
    private javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
}
