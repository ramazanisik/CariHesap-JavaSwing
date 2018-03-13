package Uygulama;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AnaForm extends javax.swing.JFrame implements Runnable {

    public AnaForm() {
        initComponents();

    }

    public AnaForm(String rol) {
        initComponents();
        kontrolll(rol);

    }
 validator vl=new validator();
  ArrayList<Integer> paneller=new ArrayList<Integer>();
    public void kontrolll(String rol) {
  int x=-1;
   for(int i=0;i<sekmeler.getComponentCount()-1;i++)
  {  boolean kontrol=false;
       
       for(char c:rol.toCharArray())
        {
             x=Character.getNumericValue(c);
          if(i==x)
          {
              kontrol=true;
              break;
              
          }
         }
    if(!(kontrol))
    {
    paneller.add(i);
    
    }
    
    }
    for(int k=0;k<paneller.size();k++)
    {
        sekmeler.remove(paneller.get(k));
        for(int z=0;z<paneller.size();z++)
            paneller.set(z, paneller.get(z)-1);
     
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sekmeler = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adi = new javax.swing.JTextField();
        soyadi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        mekle = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        sicil = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        musterilertablo = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        maraa = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        msil = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kategoriadi = new javax.swing.JTextField();
        kaciklama = new javax.swing.JTextField();
        kkaydet = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        kmarka = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        kategoritablo = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        karaa = new javax.swing.JTextField();
        ksil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uadi = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();
        ustok = new javax.swing.JTextField();
        kategoric = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ugfiyat = new javax.swing.JTextField();
        usfiyat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        uaciklama = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        urunlertablo = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        uaraa = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        markatablo = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        markaara = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        markaadi = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ugetir = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        stablo = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        cbox = new javax.swing.JCheckBox();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        surunn = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        sadedi = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        smusteri = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        raportablo = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jc1 = new com.toedter.calendar.JDateChooser();
        jc2 = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kullaniciad = new javax.swing.JTextField();
        sifree = new javax.swing.JTextField();
        ysifree = new javax.swing.JTextField();
        ysifreet = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        rolc = new javax.swing.JComboBox<>();
        yc = new javax.swing.JCheckBox();
        jButton34 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        kullantablo = new javax.swing.JTable();
        jButton35 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        kullaniciara = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        rr = new javax.swing.JTextField();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        jButton29 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        ral = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        rtablo = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 50));
        setResizable(false);

        sekmeler.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        sekmeler.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sekmelerStateChanged(evt);
            }
        });
        sekmeler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sekmelerMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel1.setText("Adı :");

        jLabel2.setText("Soyadı :");

        jLabel3.setText("Telefon :");

        jLabel4.setText("Adres :");

        adres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adresKeyPressed(evt);
            }
        });

        mekle.setText("Ekle");
        mekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mekleActionPerformed(evt);
            }
        });

        jLabel20.setText("Sicil No:");

        jButton6.setText("Temizle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton36.setText("Güncelle");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("(Tablodan bir kayıt seçin veya Sicil girin)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sicil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(soyadi, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(mekle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton36))
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mekle)
                            .addComponent(jButton36)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sicil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addGap(17, 17, 17)
                .addComponent(jLabel23))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteriler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        musterilertablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sicil", "Adı", "Soyadı", "Telefon", "Adres"
            }
        ));
        musterilertablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musterilertabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musterilertablo);

        jButton12.setText("Müşterileri Getir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton18.setText("Ara");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        maraa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maraaKeyPressed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("(Sicil veya Ad)");

        jButton21.setText("Temizle");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        msil.setText("Sil");
        msil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maraa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(208, 208, 208)
                .addComponent(msil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton21)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jLabel27)
                    .addComponent(jButton21)
                    .addComponent(jButton18)
                    .addComponent(maraa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Satış Defteri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri Adı", "Ürün Adı", "Adet Sayısı", "Toplam Fiyat", "Tarih"
            }
        ));
        jScrollPane9.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );

        sekmeler.addTab("Müşteriler", jPanel1);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kategoriler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel5.setText("Kategori Adı :");

        jLabel6.setText("Açıklama :");

        kkaydet.setText("Kaydet");
        kkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kkaydetActionPerformed(evt);
            }
        });

        jLabel21.setText("Marka :");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("(Tablodan bir kayıt seçin veya kategori adı  giriniz)");

        jButton7.setText("Temizle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton37.setText("Güncelle");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kaciklama)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(kkaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kategoriadi, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(kmarka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(35, 35, 35))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kategoriadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(kmarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kaciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kkaydet)
                    .addComponent(jButton37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kategorliler Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jButton10.setText("Kategorileri Getir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        kategoritablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adı", "Marka", "Açıklama"
            }
        ));
        kategoritablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoritabloMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(kategoritablo);

        jButton11.setText("Temizle");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton19.setText("Ara");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        karaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                karaaKeyPressed(evt);
            }
        });

        ksil.setText("Sil");
        ksil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ksilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(karaa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(ksil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton19)
                            .addComponent(karaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ksil)
                        .addComponent(jButton11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sekmeler.addTab("Kategori Yönetimi", jPanel2);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel7.setText("Ürün Adı :");

        jLabel8.setText("Kategori :");

        jLabel9.setText("Ürün ID :");

        jLabel10.setText("Stok Adedi :");

        kategoric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoricActionPerformed(evt);
            }
        });

        jLabel11.setText("Geliş Fiyatı :");

        jLabel12.setText("Satış Fiyatı :");

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Açıklama :");

        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("(Tablodan bir kayıt seçin veya ürün adı  giriniz)");

        jButton22.setText("Temizle");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton38.setText("Güncelle");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kategoric, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uadi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel14))))
                            .addComponent(ustok, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(uaciklama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(usfiyat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ugfiyat, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(uadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ugfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jButton22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(kategoric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(uaciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(usfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton38)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ustok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel25))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürünler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        urunlertablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Adı", "Kategori", "Ürün ID", "Stok Sayısı", "Geliş Fiyatı", "Satış Fiyatı", "Aciklama"
            }
        ));
        urunlertablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunlertabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(urunlertablo);

        jButton13.setText("Ürünleri Getir");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Temizle");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton20.setText("Ara");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        uaraa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uaraaKeyPressed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("(Ürün Adı veya Ürün ID !)");

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uaraa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton20)
                    .addComponent(uaraa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sekmeler.addTab("Ürün Yönetimi", jPanel3);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Markalar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        markatablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marka Adı"
            }
        ));
        markatablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markatabloMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(markatablo);

        jButton16.setText("Temizle");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Markaları Getir");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton9.setText("Ara");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        markaara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                markaaraKeyPressed(evt);
            }
        });

        jButton15.setText("Sil");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("(Tablodan bir kayıt seçin veya marka adı giriniz)");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(markaara, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(45, 45, 45))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton9)
                    .addComponent(markaara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addGap(3, 3, 3)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 153))); // NOI18N

        jLabel22.setText("Marka Adı :");

        jButton8.setText("Kaydet");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton39.setText("Güncelle");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(markaadi))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(473, 473, 473))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(markaadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton39))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sekmeler.addTab("Markalar", jPanel19);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "satış", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel13.setText("Ürün Adı veya ID :");

        ugetir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ugetirKeyPressed(evt);
            }
        });

        jButton3.setText("Ürün Getir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ugetir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ugetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürünler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        stablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Adı", "Kategori", "Ürün ID", "Stok Sayısı", "Geliş Fiyatı", "Satış Fiyatı", "Açıklama"
            }
        ));
        stablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stabloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(stablo);

        jButton23.setText("Ürünleri Getir");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("Temizle");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        cbox.setText("Stokta kalanlar");
        cbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxMouseClicked(evt);
            }
        });
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23)
                .addGap(8, 8, 8)
                .addComponent(cbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox)
                            .addComponent(jButton24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Satış Tamamla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel29.setText("Seçilen Ürün :");

        jLabel30.setText("Satış Adedi :");

        jLabel31.setText("Müşteri :");

        jButton25.setText("...");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("+");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Satış Tamamla");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton27)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(surunn)
                            .addComponent(sadedi)
                            .addComponent(smusteri, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surunn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(sadedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(smusteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton27)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sekmeler.addTab("Satış Yönetimi", jPanel4);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raporlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        raportablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(raportablo);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rapor Sorgulama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        r1.setText("Tarih");

        r2.setText("Ürünlere Göre");

        r3.setText("Kategorilere Göre");

        r4.setText("Müşterilere Göre");

        jc1.setDateFormatString("dd-MM-yyyy");

        jc2.setDateFormatString("dd-MM-yyyy");

        jLabel32.setText("Başlangıç Tarihi :");

        jLabel33.setText("Bitiş Tarihi :");

        jButton28.setText("Raporla");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel33)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3)
                        .addGap(18, 18, 18)
                        .addComponent(r4))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton28)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jc2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1)
                            .addComponent(r2)
                            .addComponent(r3)
                            .addComponent(r4))
                        .addGap(18, 18, 18)
                        .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sekmeler.addTab("Raporlar", jPanel5);

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcı Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel15.setText("Kullanıcı Adı :");

        jLabel16.setText("Rol :");

        jLabel17.setText("Eski Şifre :");

        jLabel18.setText("Yeni Şifre :");

        jLabel19.setText("Yeni Şifre Tekrar :");

        jButton4.setText("Kaydet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        yc.setText("Yeni Kullanıcı");
        yc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ycMouseClicked(evt);
            }
        });

        jButton34.setText("Kullanıcıları Getir");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        kullantablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Adı", "Rol"
            }
        ));
        kullantablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullantabloMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(kullantablo);

        jButton35.setText("Temizle");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton41.setText("Ara");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        kullaniciara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kullaniciaraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(yc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ysifreet, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullaniciad, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(sifree, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(rolc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(ysifree, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciara, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton35)))
                .addContainerGap())
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(yc)
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(kullaniciad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ysifree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(ysifreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rolc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jButton4))
                .addGap(59, 59, 59)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34)
                    .addComponent(jButton5)
                    .addComponent(jButton35)
                    .addComponent(jButton41)
                    .addComponent(kullaniciara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sekmeler.addTab("Kullanıcı Ayarları", jPanel6);

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rol Kaydet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel25.setForeground(new java.awt.Color(240, 240, 240));

        jLabel34.setText("Rol Adı :");

        jLabel35.setText("Yetkiler :");

        c1.setText("Müşteriler");

        c2.setText("Kategori Yönetimi");

        c3.setText("Ürün Yönetimi");

        c4.setText("Markalar");

        c5.setText("Satış Yönetimi");

        c6.setText("Raporlar");

        c7.setText("Kullanıcı Ayarları");

        c8.setText("Rol Yönetimi");

        jButton29.setText("Kaydet");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29)
                    .addComponent(rr, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c3)
                                        .addComponent(c4))
                                    .addGap(53, 53, 53))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(c2)
                                    .addGap(35, 35, 35)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(c1)
                                .addGap(71, 71, 71)))
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c5)
                            .addComponent(c6)
                            .addComponent(c8)
                            .addComponent(c7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(rr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(c1)
                    .addComponent(c5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2)
                    .addComponent(c6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3)
                    .addComponent(c7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4)
                    .addComponent(c8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));

        jButton30.setText("Rolleri Getir");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("Ara");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        ral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ralKeyPressed(evt);
            }
        });

        rtablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rol Adı"
            }
        ));
        rtablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rtabloMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(rtablo);

        jButton32.setText("Temizle");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("Sil");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton40.setText("Güncelle");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ral, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton32)
                .addContainerGap())
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton31)
                    .addComponent(ral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32)
                    .addComponent(jButton33)
                    .addComponent(jButton40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sekmeler.addTab("Rol Yönetimi", jPanel24);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );

        sekmeler.addTab("Çıkış", jPanel27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sekmeler)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sekmeler, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kategoricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoricActionPerformed
        validator vld=new validator();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ugetir.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen ürün Adı Giriniz !");
        } else {
            String urungetir = "select * from urunler where uadi='" + ugetir.getText().trim() + "' or urunid='" + ugetir.getText().trim() + "'";
            try {
                ResultSet ur = dbb.baglan().executeQuery(urungetir);
                DefaultTableModel urn = new DefaultTableModel();
                urn.addColumn("Ürün Adı");
                urn.addColumn("Kategori");
                urn.addColumn("Ürün ID");
                urn.addColumn("Stok Sayısı");
                urn.addColumn("Geliş Fiyatı");
                urn.addColumn("Satış Fiyatı");
                urn.addColumn("Açıklama");

                while (ur.next()) {

                    urn.addRow(new String[]{ur.getString("uadi"), ur.getString("ukategori"), ur.getString("urunid"), ur.getString("stok"), ur.getString("gfiyat"), ur.getString("sfiyat"), ur.getString("uaciklama")});
                }
                stablo.setModel(urn);
                uadi.setText("");
            } catch (SQLException ex) {
                System.out.println("ürün getirme hatası :" + ex);
            } finally {
                dbb.kapat();
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed
    DB.db dbb = new DB.db();
    private void mekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mekleActionPerformed
 
        if (adi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adı giriniz");
        } else if (soyadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen soyadı giriniz");
        } else if (telefon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen telefonu giriniz");
        } else if (adres.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adres giriniz");
        } else if (sicil.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Sicil Giriniz");
        } else { 
                 if(!(vl.harfkontrol(adi.getText())))
                     JOptionPane.showMessageDialog(rootPane, "Adınız sadece harf içermelidir !");
                 else if(!(vl.harfkontrol(soyadi.getText())))
                     JOptionPane.showMessageDialog(rootPane, "soyadınız sadece harf içermelidir !");
                 else if(!(vl.rakamkontrol(telefon.getText())))
                     JOptionPane.showMessageDialog(rootPane, "Telefon numarası sadece rakam içermelidir");
                 else if(!(vl.rakamkontrol(sicil.getText())))
                     JOptionPane.showMessageDialog(rootPane, "Sicil Sadece rakam içermelidir");
                 else{
            String oku = "select *from musteriler";

            try {
                boolean kontrol = false;
                ResultSet rs = dbb.baglan().executeQuery(oku);
                while (rs.next()) {
                    if (sicil.getText().trim().equals(rs.getString("msicil"))) {
                        kontrol = true;
                        JOptionPane.showMessageDialog(rootPane, "Daha önce bu Sicil ile müşteri oluşturulmuştur.");
                        break;

                    }
                }
                dbb.kapat();
                if (!kontrol) {
                    String yazQuery = "insert into musteriler values(null, '" + adi.getText() + "', '" + soyadi.getText() + "', '" + telefon.getText() + "', '" + adres.getText() + "','" + sicil.getText() + "' ) ";
                    dbb.kapat();
                    dbb.baglan().executeUpdate(yazQuery);
                    datagetir();
                    adi.setText("");
                    soyadi.setText("");
                    telefon.setText("");
                    adres.setText("");
                    sicil.setText("");
                }

            } catch (SQLException ex) {
                System.out.println("Müşteri bağlantı hatası : " + ex);
            } finally {
                dbb.kapat();
            }
        }
        }

    }//GEN-LAST:event_mekleActionPerformed
    int deger = -1;
    private void musterilertabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musterilertabloMouseClicked

        deger = musterilertablo.getSelectedRow();
        if (deger > -1) {
            adi.setText(musterilertablo.getValueAt(deger, 1).toString());
            soyadi.setText(musterilertablo.getValueAt(deger, 2).toString());
            telefon.setText(musterilertablo.getValueAt(deger, 3).toString());
            adres.setText(musterilertablo.getValueAt(deger, 4).toString());
            sicil.setText(musterilertablo.getValueAt(deger, 0).toString());

        
        DefaultTableModel dtm=new DefaultTableModel();
        String sorgu="select musteriler.madi,urunler.uadi,satis.adetsayisi,satis.toplamfiyat,satis.tarih from\n" +
"satis inner join musteriler on satis.mid=musteriler.msicil inner join urunler on satis.uid=urunler.urunid where msicil='"+musterilertablo.getValueAt(musterilertablo.getSelectedRow(), 0)+"'";
        System.out.println(sorgu);
      dtm.addColumn("Müşteri Adı");
      dtm.addColumn("Ürün Adı");
      dtm.addColumn("Adet Sayısı");
      dtm.addColumn("Toplam Fiyat");
      dtm.addColumn("Tarih");
      
           try {
               ResultSet rs=dbb.baglan().executeQuery(sorgu);
               while(rs.next())
               {
               
               dtm.addRow(new String[]{rs.getString("madi"),rs.getString("uadi"),rs.getString("adetsayisi"),rs.getString("toplamfiyat"),rs.getString("tarih")});
               
               
               }
               jTable1.setModel(dtm);
           } catch (SQLException ex) {
             
           }
    finally{}dbb.kapat();
        
        }
    }//GEN-LAST:event_musterilertabloMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        adi.setText("");
        soyadi.setText("");
        telefon.setText("");
        adres.setText("");
        sicil.setText("");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void msilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msilActionPerformed
        deger =musterilertablo.getSelectedRow();
        if (deger != -1) {
         
                String sil = musterilertablo.getValueAt(deger, 0).toString();
                String query = "delete from musteriler where msicil='" + sil + "'";
                try {
                    int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Silme İşlemini onaylıyor musunuz?");
                     if (kontrolll == 0) {
                    dbb.baglan().executeUpdate(query);
                    adi.setText("");
                    soyadi.setText("");
                    telefon.setText("");
                    adres.setText("");
                    sicil.setText("");
                    datagetir();
            }
                } catch (SQLException ex) {
                    System.out.println("silme işleminde hata : " + ex);
                } finally {
                    dbb.kapat();
    }

        } else if (deger == -1 && !(sicil.getText().equals(""))) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Silme işlemini onyalıyor musunuz?");
            if (kontrolll == 0) {
                String sil = sicil.getText();
                String query = "delete from musteriler where msicil='" + sil + "'";
                try {
                    dbb.baglan().executeUpdate(query);
                    adi.setText("");
                    soyadi.setText("");
                    telefon.setText("");
                    adres.setText("");
                    sicil.setText("");
                    datagetir();

                } catch (SQLException ex) {
                    System.out.println("silme işleminde hata : " + ex);
                } finally {
                    dbb.kapat();
                }

            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Silincek kaydı seçin veya Sicil numarası girin !");

    }//GEN-LAST:event_msilActionPerformed

    private void kkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kkaydetActionPerformed

        if (kategoriadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen kategori adını giriniz !");
        } else if (kmarka.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Marka değeri Seçiniz");
        } else if (kaciklama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen açıklama giriniz !");
        } else {
            if(!(vl.harfkontrol(kategoriadi.getText())))
                JOptionPane.showMessageDialog(rootPane, "Kategori Adı sadece harf içermeli !");
            else{
            String kategori = "select * from kategori";
            try {
                ResultSet rs = dbb.baglan().executeQuery(kategori);
                boolean kontrol = false;
                while (rs.next()) {
                    if (kategoriadi.getText().trim().toLowerCase().equals(rs.getString("kadi").toLowerCase())) {
                        JOptionPane.showMessageDialog(rootPane, "Daha önce bu kategori eklenmiştir.");
                        kontrol = true;
                        break;

                    }

                }
                if (!kontrol) {

                    String kategoriyaz = "insert into kategori values(null,'" + kategoriadi.getText() + "','" + kaciklama.getText() + "','" + kmarka.getSelectedItem().toString() + "')";
                    dbb.baglan().executeUpdate(kategoriyaz);
                    kategoriadi.setText("");
                    kaciklama.setText("");
                    kmarka.setSelectedIndex(0);
//            jButton10ActionPerformed(null);

                }

            } catch (SQLException ex) {
                System.out.println("kategori bağlantı hatası :" + ex);
            } finally {
                dbb.kapat();
            }
        }
        }
    }//GEN-LAST:event_kkaydetActionPerformed

    private void sekmelerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sekmelerStateChanged

        if (sekmeler.getSelectedIndex() == 5) {
            ButtonGroup grup = new ButtonGroup();
            grup.add(r1);
            grup.add(r2);
            grup.add(r3);
            grup.add(r4);

        }

        int sekmeler2 = sekmeler.getSelectedIndex();
//        if(sekmeler2==0)
//            musterilerr();
        if (sekmeler2 == 1) {
            kategorilerr();
        } else if (sekmeler2 == 2) {
            urunlerr();
        } else if (sekmeler2 == 6) {
            jPanel6MouseClicked(null);
        }
    }//GEN-LAST:event_sekmelerStateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ktg = -1;
        String kategorigetir = "select *from kategori";
        try {
            ResultSet kg = dbb.baglan().executeQuery(kategorigetir);
            DefaultTableModel kgm = new DefaultTableModel();
            kgm.addColumn("Adı");
            kgm.addColumn("Marka");
            kgm.addColumn("Açıklama");

            while (kg.next()) {

                kgm.addRow(new String[]{kg.getString("kadi"), kg.getString("kmarka"), kg.getString("kaciklama")});
            }
            kategoritablo.setModel(kgm);
        } catch (SQLException ex) {
            System.out.println("kategori getirme hatası : " + ex);
        } finally {
            dbb.kapat();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        kategoritablo.setModel(new DefaultTableModel(new String[]{"Adı", "Marka", "Açıklama"}, 0));
        kategoriadi.setText("");
        kaciklama.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed
    int ktg = -1;
    private void kategoritabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoritabloMouseClicked

        ktg = kategoritablo.getSelectedRow();

        //      kmarka.setSelectedIndex(ktg+1);
        if(ktg>-1)
        {
        kategoriadi.setText(kategoritablo.getValueAt(ktg, 0).toString());
        kaciklama.setText(kategoritablo.getValueAt(ktg, 2).toString());
        }

    }//GEN-LAST:event_kategoritabloMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        datagetir();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (uadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen ürün adını giriniz !");
        } else if (kategoric.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen kategori değeri Seçiniz");
        } else if (uid.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ürün ID'sini giriniz !");
        } else if (ustok.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen stok adedini adını giriniz !");
        } else if (ugfiyat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen geliş fiyatını değeri Seçiniz");
        } else if (usfiyat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen satış fiyatını giriniz !");
        } else {
            if(!(vl.harfkontrol(uadi.getText())))
                JOptionPane.showMessageDialog(rootPane, "Ürün adı sadece harf içermeli !");
            else if(!(vl.rakamkontrol(uid.getText())))
                JOptionPane.showMessageDialog(rootPane, "Ürün ID sadece rakam içermeli");
            else if(!(vl.rakamkontrol(ustok.getText())))
                JOptionPane.showMessageDialog(rootPane, "Stok adedi sadece rakam içermeli !");
            else if(!(vl.rakamkontrol(ugfiyat.getText())))
                JOptionPane.showMessageDialog(rootPane, "Geliş Fiyatı sadece rakam içermeli");
            else if(!(vl.rakamkontrol(usfiyat.getText())))
                JOptionPane.showMessageDialog(rootPane, "Satış Fiyatı sadece rakam içermeli");
            else{
            String urunyaz = "insert into urunler values(null,'" + uadi.getText() + "','" + kategoric.getSelectedItem().toString().trim() + "','" + uaciklama.getText() + "','" + uid.getText() + "','" + ustok.getText() + "','" + ugfiyat.getText() + "','" + usfiyat.getText() + "')";
            try {
                dbb.baglan().executeUpdate(urunyaz);
                uadi.setText("");
                kategoric.setSelectedIndex(0);
                uid.setText("");
                ustok.setText("");
                ugfiyat.setText("");
                usfiyat.setText("");
                uaciklama.setText("");
                jButton13ActionPerformed(null);
            } catch (SQLException ex) {
                System.out.println("Ürün yazma hatası :" + ex);
            } finally {
                dbb.kapat();
            }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        urunsil = -1;
        String urungetir = "select * from urunler";
        try {
            ResultSet ur = dbb.baglan().executeQuery(urungetir);
            DefaultTableModel urn = new DefaultTableModel();
            urn.addColumn("Ürün Adı");
            urn.addColumn("Kategori");
            urn.addColumn("Ürün ID");
            urn.addColumn("Stok Sayısı");
            urn.addColumn("Geliş Fiyatı");
            urn.addColumn("Satış Fiyatı");
            urn.addColumn("Açıklama");

            while (ur.next()) {

                urn.addRow(new String[]{ur.getString("uadi"), ur.getString("ukategori"), ur.getString("urunid"), ur.getString("stok"), ur.getString("gfiyat"), ur.getString("sfiyat"), ur.getString("uaciklama")});
            }
            urunlertablo.setModel(urn);
        } catch (SQLException ex) {
            System.out.println("ürün getirme hatası :" + ex);
        } finally {
            dbb.kapat();
        }

    }//GEN-LAST:event_jButton13ActionPerformed
    int urunsil = -1;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
urunsil=urunlertablo.getSelectedRow();
        if (!(urunsil == -1)) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Silme işlemini onaylıyor musunuz?");
            if (kontrolll == 0) {
                String sil = "delete from urunler where uadi='" + urunlertablo.getValueAt(urunsil, 0).toString() + "'";

                try {
                    dbb.baglan().executeUpdate(sil);
                    uadi.setText("");
                    kategoric.setSelectedIndex(0);
                    uid.setText("");
                    ustok.setText("");
                    ugfiyat.setText("");
                    usfiyat.setText("");
                    uaciklama.setText("");

                    jButton13ActionPerformed(null);
                } catch (SQLException ex) {
                    System.out.println("Ürün Silme Hatası :" + ex);
                } finally {
                    dbb.kapat();
                }
            }
        } else if (urunsil==-1&&!(uadi.getText().trim().equalsIgnoreCase(""))) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?");
            if (kontrolll == 0) {
                String sil = "delete from urunler where uadi='" + uadi.getText().trim() + "'";

                try {
                    dbb.baglan().executeUpdate(sil);
                    uadi.setText("");
                    kategoric.setSelectedIndex(0);
                    uid.setText("");
                    ustok.setText("");
                    ugfiyat.setText("");
                    usfiyat.setText("");
                    uaciklama.setText("");
                    jButton13ActionPerformed(null);

                } catch (SQLException ex) {
                    System.out.println("Ürün Silme Hatası :" + ex);
                } finally {
                    dbb.kapat();

                }

            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "silinecek kaydı seçin veya ürün adı giriniz");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        urunlertablo.setModel(new DefaultTableModel(new String[]{"Adı", "Kategori", "Ürün ID", "Stok Sayısı", "Geliş Fiyatı", "Satış Fiyatı", "Açıklama"}, 0));
        uadi.setText("");
        kategoric.setSelectedIndex(0);
        uid.setText("");
        ustok.setText("");
        ugfiyat.setText("");
        usfiyat.setText("");
        uaciklama.setText("");

    }//GEN-LAST:event_jButton14ActionPerformed

    private void urunlertabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunlertabloMouseClicked
        urunsil = urunlertablo.getSelectedRow();
        if (!(urunsil == -1)) {
            uadi.setText(urunlertablo.getValueAt(urunsil, 0).toString());
            //     kategoric.setSelectedIndex(urunsil+1);
            uid.setText(urunlertablo.getValueAt(urunsil, 2).toString());
            ustok.setText(urunlertablo.getValueAt(urunsil, 3).toString());
            ugfiyat.setText(urunlertablo.getValueAt(urunsil, 4).toString());
            usfiyat.setText(urunlertablo.getValueAt(urunsil, 5).toString());
            uaciklama.setText(urunlertablo.getValueAt(urunsil, 6).toString());
        }

    }//GEN-LAST:event_urunlertabloMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    if(markaadi.getText().trim().equals(""))
        JOptionPane.showMessageDialog(rootPane, "Lütfen Marka Adını Giriniz");
    else
    {  if(!(vl.harfkontrol(markaadi.getText())))
        JOptionPane.showConfirmDialog(rootPane, "Marka Sadece harf içermeli");
    else
    {
        String markagetir = "select *from markalar";
        try {
            boolean kontrol = false;
            ResultSet ok = dbb.baglan().executeQuery(markagetir);
            while (ok.next()) {
                if (markaadi.getText().trim().equals(ok.getString("markadi"))) {
                    JOptionPane.showMessageDialog(rootPane, "Daha önce bu marka eklenmiştir");
                    kontrol = true;
                    break;

                }
            }
            if (!kontrol) {
                String markayaz = "insert into markalar values(null,'" + markaadi.getText() + "')";
                dbb.baglan().executeUpdate(markayaz);
                markaadi.setText("");
                jButton17ActionPerformed(null);
            }

        } catch (SQLException ex) {
            System.out.println("marka okuma hatası :" + ex);
        }
    }
    }
    }//GEN-LAST:event_jButton8ActionPerformed
    int markasil = -1;
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        markasil = -1;
        String markaoku = "Select*from markalar";
        try {
            ResultSet mrk = dbb.baglan().executeQuery(markaoku);
            DefaultTableModel markalar = new DefaultTableModel();
            markalar.addColumn("ID");
            markalar.addColumn("Marka Adı");

            while (mrk.next()) {
                markalar.addRow(new String[]{mrk.getString("markaid"), mrk.getString("markadi")});

            }

            markatablo.setModel(markalar);
        } catch (SQLException ex) {
            System.out.println("marka okuma hatası :" + ex);
        } finally {
            dbb.kapat();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
markasil=markatablo.getSelectedRow();
        if (markasil > -1) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Silme İşlemini onaylıyor musunuz?");
            if (kontrolll == 0) {
                String markasill = "delete from markalar where markadi='" + markatablo.getValueAt(markasil, 1).toString() + "'";
                try {
                    dbb.baglan().executeUpdate(markasill);
                    jButton17ActionPerformed(null);
                    markaadi.setText("");
                } catch (SQLException ex) {
                    System.out.println("marka silme hatası :" + ex);
                } finally {
                    dbb.kapat();
                }

            }

        } else if (markasil==-1&&!(markaadi.getText().trim().equals(""))) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?");
            if (kontrolll == 0) {
                String markasill = "delete from markalar where markadi='" + markaadi.getText().trim() + "'";
                try {
                    dbb.baglan().executeUpdate(markasill);
                    jButton17ActionPerformed(null);
                    markaadi.setText("");
                } catch (SQLException ex) {
                    System.out.println("marka silme hatası :" + ex);
                } finally {
                    dbb.kapat();
                }

            }

        }
     else
            JOptionPane.showMessageDialog(rootPane, "Lütfen marka seçiniz ya da marka adı giriniz");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        markatablo.setModel(new DefaultTableModel(new String[]{"ID", "Marka Adı"}, 0));
        markaadi.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void markatabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markatabloMouseClicked

        markasil = markatablo.getSelectedRow();
        if (markasil > -1) {
            markaadi.setText(markatablo.getValueAt(markasil, 1).toString());

        }
    }//GEN-LAST:event_markatabloMouseClicked

    private void ksilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ksilActionPerformed
   ktg=kategoritablo.getSelectedRow();
        if (ktg > -1) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Silme İşlemini onaylıyor musunuz?");
            if (kontrolll == 0) {
                String ksil = "delete from kategori where kadi='" + kategoritablo.getValueAt(ktg, 0) + "'";
                try {
                    dbb.baglan().executeUpdate(ksil);
                    kategoriadi.setText("");
                    kaciklama.setText("");
                    kmarka.setSelectedIndex(0);
                    jButton10ActionPerformed(null);

                } catch (SQLException ex) {
                    System.out.println("kategori silme hatası :" + ex);
                } finally {
                    dbb.kapat();
                }

            }
        } else if (ktg==-1&&!(kategoriadi.getText().trim().equals(""))) {
            int kontrolll = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?");
            if (kontrolll == 0) {
                String ksil = "delete from kategori where kadi='" + kategoriadi.getText().trim() + "'";
                try {
                    dbb.baglan().executeUpdate(ksil);
                    kategoriadi.setText("");
                    kaciklama.setText("");
                    kmarka.setSelectedIndex(0);
                    jButton10ActionPerformed(null);

                } catch (SQLException ex) {
                    System.out.println("kategori silme hatası :" + ex);
                } finally {
                    dbb.kapat();
                }

            }

        }
        else
            JOptionPane.showMessageDialog(rootPane, "Bir kayıt seçiniiiz yada kategroi adı giriniz !");

    }//GEN-LAST:event_ksilActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (maraa.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Lütfen Aranacak Kaydı Giriniz ");
        else {
            String oku2 = "select *from musteriler where msicil='" + maraa.getText().trim() + "' or madi='" + maraa.getText().trim() + "'";
            try {
                dbb.kapat();
                ResultSet rs = dbb.baglan().executeQuery(oku2);
                DefaultTableModel dtm = new DefaultTableModel();
                dtm.addColumn("Sicil");
                dtm.addColumn("Adı");
                dtm.addColumn("Soyadı");
                dtm.addColumn("Telefon");
                dtm.addColumn("Adres");

                while (rs.next()) {

                    dtm.addRow(new String[]{rs.getString("msicil"), rs.getString("madi"), rs.getString("msoyadi"), rs.getString("mtelefon"), rs.getString("madres")});

                }
                maraa.setText("");
                musterilertablo.setModel(dtm);

            } catch (SQLException ex) {
                System.out.println("data getirme hatası : " + ex);
            } finally {
                dbb.kapat();
            }
    }//GEN-LAST:event_jButton18ActionPerformed
    }
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (karaa.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Lütfen Aranacak Kaydı Giriniz");
        else {
            String kategorigetir = "select *from kategori where kadi='" + karaa.getText().trim() + "'";
            try {
                ResultSet kg = dbb.baglan().executeQuery(kategorigetir);
                DefaultTableModel kgm = new DefaultTableModel();
                kgm.addColumn("Adı");
                kgm.addColumn("Marka");
                kgm.addColumn("Açıklama");
                while (kg.next()) {
                    kgm.addRow(new String[]{kg.getString("kadi"), kg.getString("kmarka"), kg.getString("kaciklama")});
                }
                kategoritablo.setModel(kgm);
                karaa.setText("");
            } catch (SQLException ex) {
                System.out.println("kategori getirme hatası : " + ex);
            } finally {
                dbb.kapat();
            }
    }//GEN-LAST:event_jButton19ActionPerformed
    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (uaraa.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Lütfen Aranacak Kaydı Giriniz");
        else {
            String urungetir = "select * from urunler where uadi='" + uaraa.getText().trim() + "' or urunid='" + uaraa.getText().trim() + "'";
            try {
                ResultSet ur = dbb.baglan().executeQuery(urungetir);
                DefaultTableModel urn = new DefaultTableModel();
                urn.addColumn("Ürün Adı");
                urn.addColumn("Kategori");
                urn.addColumn("Ürün ID");
                urn.addColumn("Stok Sayısı");
                urn.addColumn("Geliş Fiyatı");
                urn.addColumn("Satış Fiyatı");
                urn.addColumn("Açıklama");

                while (ur.next()) {

                    urn.addRow(new String[]{ur.getString("uadi"), ur.getString("ukategori"), ur.getString("urunid"), ur.getString("stok"), ur.getString("gfiyat"), ur.getString("sfiyat"), ur.getString("uaciklama")});
                }
                uaraa.setText("");
                urunlertablo.setModel(urn);
            } catch (SQLException ex) {
                System.out.println("ürün getirme hatası :" + ex);
            } finally {
                dbb.kapat();
            }
    }//GEN-LAST:event_jButton20ActionPerformed
    }
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        musterilertablo.setModel(new DefaultTableModel(new String[]{"Sicil", "Adı", "Soyadı", "Telefon", "Adres"}, 0));
        jTable1.setModel(new DefaultTableModel(new String[]{"Müşteri Adı","Ürün Adı","Adet Sayısı","Toplam Fiyat","Tarih"},0));
        adi.setText("");
        soyadi.setText("");
        telefon.setText("");
        adres.setText("");
        sicil.setText("");

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        kategoriadi.setText("");
        kaciklama.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        uadi.setText("");
        kategoric.setSelectedIndex(0);
        uid.setText("");
        ustok.setText("");
        ugfiyat.setText("");
        usfiyat.setText("");
        uaciklama.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (markaara.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Lütfen Aranacak Kaydı Giriniz");
        else {
            String markaoku = "Select*from markalar where markadi='" + markaara.getText().trim() + "'";
            try {
                ResultSet mrk = dbb.baglan().executeQuery(markaoku);
                DefaultTableModel markalar = new DefaultTableModel();
                markalar.addColumn("ID");
                markalar.addColumn("Marka Adı");

                while (mrk.next()) {
                    markalar.addRow(new String[]{mrk.getString("markaid"), mrk.getString("markadi")});

                }
                markaara.setText("");
                markatablo.setModel(markalar);
            } catch (SQLException ex) {
                System.out.println("marka okuma hatası :" + ex);
            } finally {
                dbb.kapat();
            }
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void adresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            mekleActionPerformed(null);
        }
    }//GEN-LAST:event_adresKeyPressed

    private void maraaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maraaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton18ActionPerformed(null);
        }
    }//GEN-LAST:event_maraaKeyPressed

    private void karaaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_karaaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton19ActionPerformed(null);
        }
    }//GEN-LAST:event_karaaKeyPressed

    private void uaraaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uaraaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton20ActionPerformed(null);
        }
    }//GEN-LAST:event_uaraaKeyPressed

    private void markaaraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markaaraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton9ActionPerformed(null);
        }
    }//GEN-LAST:event_markaaraKeyPressed

    private void ugetirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugetirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton3ActionPerformed(null);
        }
    }//GEN-LAST:event_ugetirKeyPressed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (cbox.isSelected()) {
            String urungetir = "select * from urunler where stok>0";
            try {
                ResultSet ur = dbb.baglan().executeQuery(urungetir);
                DefaultTableModel urn = new DefaultTableModel();
                urn.addColumn("Ürün Adı");
                urn.addColumn("Kategori");
                urn.addColumn("Ürün ID");
                urn.addColumn("Stok Sayısı");
                urn.addColumn("Geliş Fiyatı");
                urn.addColumn("Satış Fiyatı");
                urn.addColumn("Açıklama");

                while (ur.next()) {

                    urn.addRow(new String[]{ur.getString("uadi"), ur.getString("ukategori"), ur.getString("urunid"), ur.getString("stok"), ur.getString("gfiyat"), ur.getString("sfiyat"), ur.getString("uaciklama")});
                }
                stablo.setModel(urn);
            } catch (SQLException ex) {
                System.out.println("ürün getirme hatası :" + ex);
            } finally {
                dbb.kapat();
            }
        } else {
            String urungetir = "select * from urunler";
            try {
                ResultSet ur = dbb.baglan().executeQuery(urungetir);
                DefaultTableModel urn = new DefaultTableModel();
                urn.addColumn("Ürün Adı");
                urn.addColumn("Kategori");
                urn.addColumn("Ürün ID");
                urn.addColumn("Stok Sayısı");
                urn.addColumn("Geliş Fiyatı");
                urn.addColumn("Satış Fiyatı");
                urn.addColumn("Açıklama");

                while (ur.next()) {

                    urn.addRow(new String[]{ur.getString("uadi"), ur.getString("ukategori"), ur.getString("urunid"), ur.getString("stok"), ur.getString("gfiyat"), ur.getString("sfiyat"), ur.getString("uaciklama")});
                }
                stablo.setModel(urn);
            } catch (SQLException ex) {
                System.out.println("ürün getirme hatası :" + ex);
            } finally {
                dbb.kapat();
            }
    }//GEN-LAST:event_jButton23ActionPerformed

    }
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        stablo.setModel(new DefaultTableModel(new String[]{"Adı", "Kategori", "Ürün ID", "Stok Sayısı", "Geliş Fiyatı", "Satış Fiyatı", "Açıklama"}, 1));
    }//GEN-LAST:event_jButton24ActionPerformed
    public static int xx = -1;
    public static String musteria = "";
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        Musteriler mrt = new Musteriler();
        mrt.setVisible(true);


    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        File f = new File("gecici.txt");
        if(f.exists())
        {
        try {
            Scanner oku = new Scanner(f);
            String[] dizi = oku.nextLine().split(" ");
            smusteri.setText(dizi[0]);
            oku.close();
            f.delete();
        } catch (FileNotFoundException ex) {
            System.out.println("dosya okuma hatası");
        }
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void stabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stabloMouseClicked
        int yy = stablo.getSelectedRow();
        if(yy>-1)
        surunn.setText(stablo.getValueAt(yy, 0).toString());

    }//GEN-LAST:event_stabloMouseClicked

    private void cboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxMouseClicked
   jButton23ActionPerformed(null);
    }//GEN-LAST:event_cboxMouseClicked

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if (surunn.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ürün Seçiniz");
        } else if (sadedi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Adet Sayısını Giriniz");
        } else if (smusteri.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Müşteri Seçiniz");
        } else {
            String sorgu = "select * from urunler where uadi='" + surunn.getText().trim() + "' and stok>0";

            try {
                ResultSet rs = dbb.baglan().executeQuery(sorgu);
                if (rs.next()) {
                    if (Integer.valueOf(rs.getString("stok")) < Integer.valueOf(sadedi.getText().trim())) {
            
                        JOptionPane.showMessageDialog(rootPane, "Stokta " + rs.getString("stok") + " Adet ürün Bulunmaktadır !");
                    } else {

                        int fiyat = Integer.valueOf(stablo.getValueAt(stablo.getSelectedRow(), 5).toString());
                        int toplam = Integer.valueOf(sadedi.getText()) * fiyat;
                        String goster = "";
                        goster = goster + toplam;
                        int kar = toplam - (Integer.valueOf(stablo.getValueAt(stablo.getSelectedRow(), 4).toString()) * Integer.valueOf(sadedi.getText()));

                        SimpleDateFormat bicim3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                        GregorianCalendar gcalender = new GregorianCalendar();
                        String[] tarih = bicim3.format(gcalender.getTime()).split(" ");
                        System.out.println("tarih : " + tarih[0]);
                        System.out.println(" saat : " + tarih[1]);
                        int ok = JOptionPane.showOptionDialog(rootPane, "Toplam Tutar : " + goster + " onaylıyor musunuz?", "Satış Tamamla", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Evet", "Hayır", "İptal"}, null);

                        if (ok == 0) {
                            dbb.kapat();
                            String islem = "insert into satis values(null,'" + smusteri.getText() + "','" + stablo.getValueAt(stablo.getSelectedRow(), 2).toString() + "','" + sadedi.getText() + "','" + stablo.getValueAt(stablo.getSelectedRow(), 5).toString() + "','" + goster + "','" + kar + "','" + tarih[0].trim() + "','" + tarih[1].trim() + "')";
                            System.out.println(islem);
                            dbb.baglan().executeUpdate(islem);
                            dbb.kapat();
                            int a = (Integer.valueOf(stablo.getValueAt(stablo.getSelectedRow(), 3).toString()));
                            int b = Integer.valueOf(sadedi.getText().trim());
                            int sonuc = a - b;
                            String stokdusur = "UPDATE urunler set stok='" + sonuc + "' where urunid='" + stablo.getValueAt(stablo.getSelectedRow(), 2).toString() + "'";
                            dbb.baglan().executeUpdate(stokdusur);
                            JOptionPane.showMessageDialog(rootPane, "Satış Başarıyla Gerçekleşmiştir.");
                            jButton23ActionPerformed(null);
                            surunn.setText("");
                            sadedi.setText("");
                            smusteri.setText("");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ürün Stokta Bulunmamaktadır !");
                }

            } catch (SQLException ex) {
                System.out.println("Ürün okuma hatası :" + ex);
            } finally {
                dbb.kapat();
            }
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       DefaultTableModel dtm=new DefaultTableModel();
        
        String sorgu="";
    if(r1.isSelected())
    {
        
        sorgu="select musteriler.madi,urunler.uadi,satis.adetsayisi,satis.toplamfiyat,satis.tarih from \n" +
"satis inner join musteriler on satis.mid=musteriler.msicil inner join urunler on satis.uid=urunler.urunid where satis.tarih between '"+new SimpleDateFormat("dd-MM-yyyy").format(jc1.getDate())+"' and '"+new SimpleDateFormat("dd-MM-yyyy").format(jc2.getDate())+"'";
        System.out.println(sorgu);
      dtm.addColumn("Müşteri Adı");
      dtm.addColumn("Ürün Adı");
      dtm.addColumn("Adet Sayısı");
      dtm.addColumn("Toplam Fiyat");
      dtm.addColumn("Tarih");
      
           try {
               ResultSet rs=dbb.baglan().executeQuery(sorgu);
               while(rs.next())
               {
                 
               
               dtm.addRow(new String[]{rs.getString("madi"),rs.getString("uadi"),rs.getString("adetsayisi"),rs.getString("toplamfiyat"),rs.getString("tarih")});
               
               
               }
               raportablo.setModel(dtm);
           } catch (SQLException ex) {
             
           }
    finally{}dbb.kapat();
    
    }
      if(r2.isSelected())
      {
              sorgu="select urunler.uadi,urunler.ukategori,satis.adetsayisi,satis.toplamfiyat,satis.tarih from \n" +
" satis inner join urunler on satis.uid=urunler.urunid ";
                      
      dtm.addColumn("ürün Adı");
      dtm.addColumn("Ürün Kategorisi");
      dtm.addColumn("Adet Sayısı");
      dtm.addColumn("Toplam Fiyat");
      dtm.addColumn("Tarih");
      
           try {
               ResultSet rs=dbb.baglan().executeQuery(sorgu);
               while(rs.next())
               {
               
               dtm.addRow(new String[]{rs.getString("uadi"),rs.getString("ukategori"),rs.getString("adetsayisi"),rs.getString("toplamfiyat"),rs.getString("tarih")});
                   
               
               }
               raportablo.setModel(dtm);
           } catch (SQLException ex) {
             
           }
    finally{}dbb.kapat();
      
      
      }
      if(r3.isSelected())
      {
      
      
      sorgu="select kategori.kadi,markalar.markadi,urunler.uadi,satis.tarih from satis inner join urunler on satis.uid=urunler.urunid inner\n" +
"join kategori on kategori.kadi=urunler.ukategori inner join markalar on markalar.markadi=kategori.kmarka";
        
      dtm.addColumn("Kategori Adı");
      dtm.addColumn("Marka Adı");
      dtm.addColumn("Ürün ADI");
      dtm.addColumn("Tarih");
           try {
               ResultSet rs=dbb.baglan().executeQuery(sorgu);
               while(rs.next())
               {
               
               dtm.addRow(new String[]{rs.getString("kadi"),rs.getString("markadi"),rs.getString("uadi"),rs.getString("tarih")});
               }
               raportablo.setModel(dtm);
           } catch (SQLException ex) {
               System.out.println("kategori rapor hatası: "+ex);
           }
      finally{dbb.kapat();}
      
      
      }
      if(r4.isSelected())
      {sorgu="select musteriler.madi,urunler.uadi,satis.adetsayisi,satis.toplamfiyat,satis.tarih from \n" +
"satis inner join musteriler on satis.mid=musteriler.msicil inner join urunler on satis.uid=urunler.urunid";
        System.out.println(sorgu);
      dtm.addColumn("Müşteri Adı");
      dtm.addColumn("Ürün Adı");
      dtm.addColumn("Adet Sayısı");
      dtm.addColumn("Toplam Fiyat");
      dtm.addColumn("Tarih");
      
           try {
               ResultSet rs=dbb.baglan().executeQuery(sorgu);
               while(rs.next())
               {
               
               dtm.addRow(new String[]{rs.getString("madi"),rs.getString("uadi"),rs.getString("adetsayisi"),rs.getString("toplamfiyat"),rs.getString("tarih")});
               
               
               }
               raportablo.setModel(dtm);
           } catch (SQLException ex) {
             
           }
    finally{}dbb.kapat();
      
      
      
      
      
      
      }

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        String rol = "select * from roller where rad='" + rr.getText().trim() + "'";
        try {
            ResultSet rs = dbb.baglan().executeQuery(rol);
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Daha önce bu rol kaydedilmiştir");
            } else {
                String roll = "";
                if (c1.isSelected()) {
                    roll = roll + "0";
                }
                if (c2.isSelected()) {
                    roll = roll + "1";
                }
                if (c3.isSelected()) {
                    roll = roll + "2";
                }
               if (c4.isSelected()) {
                    roll = roll + "3";
                }
               if (c5.isSelected()) {
                    roll = roll + "4";
                }
               if (c6.isSelected()) {
                    roll = roll + "5";
                }
                if (c7.isSelected()) {
                    roll = roll + "6";
                }
                if (c8.isSelected()) {
                    roll = roll + "7";
                }
               
                dbb.kapat();
                String rkayit = "insert into roller values(null,'" + rr.getText().trim() + "','" + roll + "')";
                dbb.baglan().executeUpdate(rkayit);
                JOptionPane.showMessageDialog(rootPane, "Rol başarıyla Kaydedilmiştir.");
              jButton30ActionPerformed(null);
            }

        } catch (SQLException ex) {
            System.out.println("rol okuma hatası : " + ex);
        } finally {
            dbb.kapat();
        }

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        if (rtablo.getSelectedRow() > -1) {
            String rolsil = "delete from roller where rad='" + rtablo.getValueAt(rtablo.getSelectedRow(), 1).toString() + "'";

            try {
                int x=JOptionPane.showConfirmDialog(rootPane, "Silmeyi Onaylıyor musunuz?");
                if(x==0)
                {
                dbb.baglan().executeUpdate(rolsil);
                jButton30ActionPerformed(null);
                JOptionPane.showMessageDialog(rootPane, "Rol Silindi");
                }
            } catch (SQLException ex) {
                System.out.println("rol silme hatası :" + ex);
            }
            finally{dbb.kapat();}
        } else {
            JOptionPane.showMessageDialog(rootPane, "Kayıt seçiniz !");
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        String rolgetir = "select * from roller";
        try {
            ResultSet rs = dbb.baglan().executeQuery(rolgetir);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Rol Adı:");
            while (rs.next()) {

                dtm.addRow(new String[]{rs.getString("rid"), rs.getString("rad")});

            }
            rtablo.setModel(dtm);
        } catch (SQLException ex) {
            System.out.println("rol getirme hatası :" + ex);
        } finally {
            dbb.kapat();
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        String rrr = "select * from roller";
        rolc.removeAllItems();
        try {
            ResultSet rs = dbb.baglan().executeQuery(rrr);
            while (rs.next()) {
                rolc.addItem(rs.getString("rad"));

            }

        } catch (SQLException ex) {
            System.out.println("rol getirme hatası :" + ex);
        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!(yc.isSelected())) {
            if (kullaniciad.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı Giriniz");
            } else if (rolc.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Rol seçiniz");
            } else if (sifree.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen eski şifrenizi giriniz");
            } else if (ysifree.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen yeni şifrenizi giriniz");
            } else if (ysifreet.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen yeni şifrenizi tekrar giriniz");
            } else {
                String ksorgula = "select * from login where kadi='" + kullaniciad.getText().trim() + "'and ksifre='" + sifree.getText().trim() + "'";
                try {
                    ResultSet rs = dbb.baglan().executeQuery(ksorgula);
                    if (rs.next()) {
                        if (!ysifree.getText().trim().equals(ysifreet.getText().trim())) {
                            JOptionPane.showMessageDialog(rootPane, "\"Yeni Şifre\" ile Yeni \"Şifre Tekrar \" Uyuşmamaktadır");
                        } else {
                            String kkaydet = "Update login set ksifre='" + ysifree.getText().trim() + "'where kadi='" + kullaniciad.getText().trim() + "'";
                            dbb.kapat();
                            dbb.baglan().executeUpdate(kkaydet);
                            JOptionPane.showMessageDialog(rootPane, "Şifre başarıyla değiştirildi.");

                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Bilgileriniz yanlış girdiniz !");
                    }

                } catch (SQLException ex) {
                    System.out.println("kullanıcı sorgulama hatası :" + ex);
                } finally {
                    dbb.kapat();
                }
            }

        } else {
            if (kullaniciad.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı Giriniz");
            } else if (rolc.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Rol seçiniz");
            } else if (ysifreet.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen yeni şifrenizi tekrar giriniz");
            } else {
                String ksorgula = "select * from login where kadi='" + kullaniciad.getText().trim() + "'";
                try {
                    ResultSet rs = dbb.baglan().executeQuery(ksorgula);

                    if (!ysifree.getText().trim().equals(ysifreet.getText().trim())) {
                        JOptionPane.showMessageDialog(rootPane, "\"Yeni Şifre\" ile Yeni \"Şifre Tekrar \"Uyuşmamaktadır");
                    } else {
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(rootPane, "Daha önce bu kullanıcı oluşturulmuştur");
                        } else {
                            String kkaydet = "insert into login values(null,'" + kullaniciad.getText().trim() + "','" + ysifree.getText().trim() + "','" + rolc.getSelectedItem().toString() + "')";
                            dbb.kapat();
                            dbb.baglan().executeUpdate(kkaydet);
                            JOptionPane.showMessageDialog(rootPane, "Kullanıcı başarıyla oluşturuldu.");
                        }
                    }

                } catch (SQLException ex) {
                    System.out.println("kullanıcı sorgulama hatası :" + ex);
                } finally {
                    dbb.kapat();
                }
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ycMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ycMouseClicked
        if (yc.isSelected()) {
            sifree.setVisible(false);
            jLabel17.setVisible(false);
        } else {
            sifree.setVisible(true);
            jLabel17.setVisible(true);
        }
    }//GEN-LAST:event_ycMouseClicked

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

        String kullanicigetir = "select * from login";
        DefaultTableModel dtm = new DefaultTableModel();
        try {
            ResultSet rs = dbb.baglan().executeQuery(kullanicigetir);
            dtm.addColumn("Kullanıcı Adı");
            dtm.addColumn("Rol");
            while (rs.next()) {

                dtm.addRow(new String[]{rs.getString("kadi"), rs.getString("rol")});

            }
            kullantablo.setModel(dtm);
        } catch (SQLException ex) {
            System.out.println("kullanıcı getirme hatası :" + ex);
        }
        finally{dbb.kapat();}
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
       String sorgu="select * from login where kadi='"+kullantablo.getValueAt(kullantablo.getSelectedRow(), 0)+"'";
       
        try {
            ResultSet rs=dbb.baglan().executeQuery(sorgu);
            if(rs.next())
            {
            String sorgu2="delete from login where kadi='"+kullantablo.getValueAt(kullantablo.getSelectedRow(), 0).toString()+"'";
            dbb.kapat();
            int x=JOptionPane.showConfirmDialog(rootPane, "Silme işlemini onaylıyor musunuz?");
            if(x==0)
            {
            dbb.baglan().executeUpdate(sorgu2);
            dbb.kapat();
            jButton34ActionPerformed(null);
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı başarıyla silindi");
            }
            }
        } catch (SQLException ex) {
            System.out.println("hata :"+ex);
        }
        finally{dbb.kapat();}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void kullantabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullantabloMouseClicked

        int kullanicisil=kullantablo.getSelectedRow();
        
    }//GEN-LAST:event_kullantabloMouseClicked

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
       kullantablo.setModel(new DefaultTableModel(new String[]{"Kullanıcı Adı","Rol"},0));
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (adi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adı giriniz");
        } else if (soyadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen soyadı giriniz");
        } else if (telefon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen telefonu giriniz");
        } else if (adres.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adres giriniz");
        } else if (sicil.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Sicil Giriniz");
        } else {
        
        
        
        if(!(vl.harfkontrol(adi.getText())))
            JOptionPane.showMessageDialog(rootPane, "Adınız sadece harf içermelidir !");
        else if(!(vl.harfkontrol(soyadi.getText())))
            JOptionPane.showMessageDialog(rootPane, "soyadınız sadece harf içermelidir !");
        else if(!(vl.rakamkontrol(telefon.getText())))
            JOptionPane.showMessageDialog(rootPane, "Telefon numarası sadece rakam içermelidir");
        else{
        
        String yazQuery = "UPDATE musteriler set madi='" + adi.getText() + "',msoyadi='" + soyadi.getText() + "',mtelefon= '" + telefon.getText() + "',madres= '" + adres.getText() + "',msicil='" + sicil.getText() + "' where msicil='"+sicil.getText().trim()+"'";
               
        try {
      int x= dbb.baglan().executeUpdate(yazQuery);
            if(x!=-1)
            {
             datagetir();
                    adi.setText("");
                    soyadi.setText("");
                    telefon.setText("");
                    adres.setText("");
                    sicil.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Güncelleme Başarıyla Yapıldı");
            }
           
          
        } catch (SQLException ex) {
            System.out.println("güncelleme hatası :"+ex);
        }
        }            
    }//GEN-LAST:event_jButton36ActionPerformed
    }
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
  if (kategoriadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen kategori adını giriniz !");
        } else if (kmarka.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Marka değeri Seçiniz");
        } else if (kaciklama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen açıklama giriniz !");
        } else {
        if(!(vl.harfkontrol(kategoriadi.getText())))
           JOptionPane.showMessageDialog(rootPane, "Kategori adı sadece harf içermelidir");
       else{
        String kategoriyaz = "UPDATE kategori set kadi='" + kategoriadi.getText() + "',kaciklama='" + kaciklama.getText() + "',kmarka='" + kmarka.getSelectedItem().toString() + "'where kadi='" + kategoritablo.getValueAt(kategoritablo.getSelectedRow(), 0).toString() + "'";
        try {
            dbb.baglan().executeUpdate(kategoriyaz);
            jButton10ActionPerformed(null);
             kategoriadi.setText("");
             kaciklama.setText("");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        finally{dbb.kapat();}     
        
       }      
    }//GEN-LAST:event_jButton37ActionPerformed
    }
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
  if (uadi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen ürün adını giriniz !");
        } else if (kategoric.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen kategori değeri Seçiniz");
        } else if (uid.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ürün ID'sini giriniz !");
        } else if (ustok.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen stok adedini adını giriniz !");
        } else if (ugfiyat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen geliş fiyatını değeri Seçiniz");
        } else if (usfiyat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen satış fiyatını giriniz !");
        } else {
        if(!(vl.harfkontrol(uadi.getText())))
                JOptionPane.showMessageDialog(rootPane, "Ürün adı sadece harf içermeli !");
            else if(!(vl.rakamkontrol(ustok.getText())))
                JOptionPane.showMessageDialog(rootPane, "Stok adedi sadece rakam içermeli !");
            else if(!(vl.rakamkontrol(ugfiyat.getText())))
                JOptionPane.showMessageDialog(rootPane, "Geliş Fiyatı sadece rakam içermeli");
            else if(!(vl.rakamkontrol(usfiyat.getText())))
                JOptionPane.showMessageDialog(rootPane, "Satış Fiyatı sadece rakam içermeli");
            else
            {
              String urunyaz = "UPDATE urunler set uadi='" + uadi.getText() + "',ukategori='" + kategoric.getSelectedItem().toString().trim() + "',uaciklama='" + uaciklama.getText() + "',stok='" + ustok.getText() + "',gfiyat='" + ugfiyat.getText() + "',sfiyat='" + usfiyat.getText() + "'where urunid='"+uid.getText().trim()+"'";
            try {
                dbb.baglan().executeUpdate(urunyaz);
                uadi.setText("");
                kategoric.setSelectedIndex(0);
                uid.setText("");
                ustok.setText("");
                ugfiyat.setText("");
                usfiyat.setText("");
                uaciklama.setText("");
                jButton13ActionPerformed(null);
            } catch (SQLException ex) {
                System.out.println("Ürün yazma hatası :" + ex);
            } finally {
                dbb.kapat();
            }
            }
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed

          if(markaadi.getText().trim().equals(""))
        JOptionPane.showMessageDialog(rootPane, "Lütfen Marka Adını Giriniz");
    else
    {  if(!(vl.harfkontrol(markaadi.getText())))
        JOptionPane.showConfirmDialog(rootPane, "Marka Sadece harf içermeli");
    else
    {
      if(markatablo.getSelectedRow()==-1) 
          JOptionPane.showMessageDialog(rootPane, "Lütfen bir kayıt seçiniz");
      else
      {
      String soru="UPDATE markalar set markadi='"+markaadi.getText().trim()+"'where markadi='"+markatablo.getValueAt(markatablo.getSelectedRow(), 1).toString()+"'";
          try {
              dbb.baglan().executeUpdate(soru);
              jButton17ActionPerformed(null);
              markaadi.setText("");
          } catch (SQLException ex) {
              System.out.println("marka güncelleme hatası ");
          }
      finally{dbb.kapat();}
      
      }
    }   
    }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
   if(ral.getText().trim().equals(""))
       JOptionPane.showMessageDialog(rootPane, "Lütfen aranılacak deger giriniz !");
       else
   {
     String rolara="select * from roller where rad='"+ral.getText().trim()+"'";
       try {
           ResultSet tr=dbb.baglan().executeQuery(rolara);
           if(tr.next())
           {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Rol Adı:");
            dtm.addRow(new String[]{tr.getString("rid"), tr.getString("rad")});
            rtablo.setModel(dtm);
            
           }
       } catch (SQLException ex) {
           System.out.println("rol arama hatası :"+ex);
       }
   finally{dbb.kapat();}
   
   
   
   
   }
      
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

        rtablo.setModel(new DefaultTableModel(new String[]{"ID","Rol Adı"},0));
         c1.setSelected(false);
         c2.setSelected(false);
         c3.setSelected(false);
         c4.setSelected(false);
         c5.setSelected(false);
         c6.setSelected(false);
         c7.setSelected(false);
         c8.setSelected(false);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if(rtablo.getSelectedRow()<0)
            JOptionPane.showMessageDialog(rootPane, "Lütfen bir kayıt seçiniz !");
        else{
         String roll = "";
                if (c1.isSelected()) {
                    roll = roll + "0";
                }
                if (c2.isSelected()) {
                    roll = roll + "1";
                }
                if (c3.isSelected()) {
                    roll = roll + "2";
                }
               if (c4.isSelected()) {
                    roll = roll + "3";
                }
               if (c5.isSelected()) {
                    roll = roll + "4";
                }
               if (c6.isSelected()) {
                    roll = roll + "5";
                }
                if (c7.isSelected()) {
                    roll = roll + "6";
                }
                if (c8.isSelected()) {
                    roll = roll + "7";
                }
                if(rr.getText().equals(""))
                    JOptionPane.showMessageDialog(rootPane, "Rol Adı Giriniz");
                else{
        String guncelle="UPDATE roller set rad='"+rr.getText().trim()+"',rseviye='"+roll+"'where rad='"+rtablo.getValueAt(rtablo.getSelectedRow(), 1).toString()+"'";
             try {
                 dbb.baglan().executeUpdate(guncelle);
                 JOptionPane.showMessageDialog(rootPane, "Rol başarıyla güncellenmiştir");
                 jButton30ActionPerformed(null);
                 
             } catch (SQLException ex) {
                 System.out.println("rol güncelleme hatası :"+ex);
             }
        finally{dbb.kapat();}
        
                }
        
        
        
        
        
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void rtabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rtabloMouseClicked
         if(rtablo.getSelectedRow()>-1)
         {
         
         rr.setText(rtablo.getValueAt(rtablo.getSelectedRow(), 1).toString());
         c1.setSelected(false);
         c2.setSelected(false);
         c3.setSelected(false);
         c4.setSelected(false);
         c5.setSelected(false);
         c6.setSelected(false);
         c7.setSelected(false);
         c8.setSelected(false);
         
         String roku="select *from roller where rad='"+rtablo.getValueAt(rtablo.getSelectedRow(), 1).toString()+"'";
         
             try {
                 ResultSet tr=dbb.baglan().executeQuery(roku);
                 if(tr.next())
                 {
                 String roller=tr.getString("rseviye");
                 int x=0;
                 for(char c:roller.toCharArray())
                 {
                 x=Character.getNumericValue(c);
                 
                 if(x==0)
                     c1.setSelected(true);
                 
                  if(x==1)
                     c2.setSelected(true);
                  if(x==2)
                     c3.setSelected(true);
                  if(x==3)
                     c4.setSelected(true);
                  if(x==4)
                     c5.setSelected(true);
                   if(x==5)
                     c6.setSelected(true);
                    if(x==6)
                     c7.setSelected(true);
                     if(x==7)
                     c8.setSelected(true);
                     
                 }
                }
             } catch (SQLException ex) {
                 System.out.println("rol seçme hatası :"+ex);
             }
         finally{dbb.kapat();}
         
         
         }
    }//GEN-LAST:event_rtabloMouseClicked

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed

        if(kullaniciara.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Lütfen aranacak deger giriniz");
        else{
        String ara="select * from login where kadi='"+kullaniciara.getText().trim()+"'";
        
            try {
                ResultSet tr=dbb.baglan().executeQuery(ara);
                if(tr.next())
                {
                  DefaultTableModel dtm = new DefaultTableModel();
                 dtm.addColumn("Kullanıcı Adı");
                 dtm.addColumn("Rol");
                 dtm.addRow(new String[]{tr.getString("kadi"), tr.getString("rol")});
                 kullantablo.setModel(dtm);
                
                
                }
            } catch (SQLException ex) {
                System.out.println("kullanıcı arama hatası :"+ex);
            }
        
        finally{dbb.kapat();}
        
        
        
        
        }
       
    }//GEN-LAST:event_jButton41ActionPerformed

    private void kullaniciaraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciaraKeyPressed

         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton41ActionPerformed(null);
        }
    }//GEN-LAST:event_kullaniciaraKeyPressed

    private void ralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ralKeyPressed

          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton31ActionPerformed(null);
        }
    }//GEN-LAST:event_ralKeyPressed

    private void sekmelerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sekmelerMouseClicked
if(sekmeler.getSelectedIndex()==8)
   dispose();       
    }//GEN-LAST:event_sekmelerMouseClicked
    public void musterirapor() {

    }

    public void urunrapor() {

    }

    public void kategorirapor() {

    }

    public void tarihrapor() {

    }

    public void musterilerr() {
        deger = -1;
        String oku2 = "select *from musteriler";
        try {
            dbb.kapat();
            ResultSet rs = dbb.baglan().executeQuery(oku2);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Sicil");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("msicil"), rs.getString("madi"), rs.getString("msoyadi"), rs.getString("mtelefon"), rs.getString("madres")});

            }

            musterilertablo.setModel(dtm);

        } catch (SQLException ex) {
            System.out.println("data getirme hatası : " + ex);
        } finally {
            dbb.kapat();
        }

    }

    public void kategorilerr() {
        kmarka.removeAllItems();
        kmarka.addItem("");
        String marka = "select *from markalar";
        try {
            ResultSet mr = dbb.baglan().executeQuery(marka);
            while (mr.next()) {
                kmarka.addItem(mr.getString("markadi"));

            }

        } catch (SQLException ex) {
            System.out.println("marka okuma hatası :" + ex);
        } finally {
            dbb.kapat();
        }

    }

    public void urunlerr() {
        kategoric.removeAllItems();
        kategoric.addItem("");
        String kate = "select *from kategori";
        try {
            ResultSet mr = dbb.baglan().executeQuery(kate);
            while (mr.next()) {
                kategoric.addItem(mr.getString("kadi"));

            }

        } catch (SQLException ex) {
            System.out.println("kategori okuma hatası :" + ex);
        } finally {
            dbb.kapat();
        }

    }

    public void datagetir() {
        deger = -1;
        String oku2 = "select *from musteriler";
        try {
            dbb.kapat();
            ResultSet rs = dbb.baglan().executeQuery(oku2);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Sicil");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("msicil"), rs.getString("madi"), rs.getString("msoyadi"), rs.getString("mtelefon"), rs.getString("madres")});

            }

            musterilertablo.setModel(dtm);

        } catch (SQLException ex) {
            System.out.println("data getirme hatası : " + ex);
        } finally {
            dbb.kapat();
        }

    }

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
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adi;
    private javax.swing.JTextField adres;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox cbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jc1;
    private com.toedter.calendar.JDateChooser jc2;
    private javax.swing.JTextField kaciklama;
    private javax.swing.JTextField karaa;
    private javax.swing.JTextField kategoriadi;
    private javax.swing.JComboBox<String> kategoric;
    private javax.swing.JTable kategoritablo;
    private javax.swing.JButton kkaydet;
    private javax.swing.JComboBox<String> kmarka;
    private javax.swing.JButton ksil;
    private javax.swing.JTextField kullaniciad;
    private javax.swing.JTextField kullaniciara;
    private javax.swing.JTable kullantablo;
    private javax.swing.JTextField maraa;
    private javax.swing.JTextField markaadi;
    private javax.swing.JTextField markaara;
    private javax.swing.JTable markatablo;
    private javax.swing.JButton mekle;
    private javax.swing.JButton msil;
    private javax.swing.JTable musterilertablo;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField ral;
    private javax.swing.JTable raportablo;
    private javax.swing.JComboBox<String> rolc;
    private javax.swing.JTextField rr;
    private javax.swing.JTable rtablo;
    private javax.swing.JTextField sadedi;
    private javax.swing.JTabbedPane sekmeler;
    private javax.swing.JTextField sicil;
    private javax.swing.JTextField sifree;
    public static javax.swing.JTextField smusteri;
    private javax.swing.JTextField soyadi;
    private javax.swing.JTable stablo;
    private javax.swing.JTextField surunn;
    private javax.swing.JTextField telefon;
    private javax.swing.JTextField uaciklama;
    private javax.swing.JTextField uadi;
    private javax.swing.JTextField uaraa;
    private javax.swing.JTextField ugetir;
    private javax.swing.JTextField ugfiyat;
    private javax.swing.JTextField uid;
    private javax.swing.JTable urunlertablo;
    private javax.swing.JTextField usfiyat;
    private javax.swing.JTextField ustok;
    private javax.swing.JCheckBox yc;
    private javax.swing.JTextField ysifree;
    private javax.swing.JTextField ysifreet;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            if (xx == 0) {
                smusteri.setText(musteria);
                break;
            }
        }
    }
}
