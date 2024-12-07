
package login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;


public class tabless extends javax.swing.JFrame {

    
    public tabless() {
        initComponents();
        addtableHeader();
        clock();
        ImageIcon my = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("32360.png")));
        
        Image img1=my.getImage();
        Image image = img1.getScaledInstance(labelaa.getWidth(),labelaa.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image);
        
        labelaa.setIcon(i);
        
        ImageIcon myi = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("au.png")));
        
        Image img11=myi.getImage();
        Image imagee = img11.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(imagee);
        
        label.setIcon(ii);
        
        ImageIcon myii = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
        
        Image img111=myii.getImage();
        Image imageee = img111.getScaledInstance(labela.getWidth(),labela.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon iii = new ImageIcon(imageee);
        
        labela.setIcon(iii);
          
        
    }
 private void filter(String query)
    {
        TableRowSorter<DefaultTableModel> tr = new  TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
  public void clock(){
        Thread clock = new Thread()
        {
              public void run()
              {
                  try 
                  {      
                      for(;;){
                        Calendar cal = new GregorianCalendar();
                         int day = cal.get(Calendar.DAY_OF_MONTH);
                         int month = cal.get(Calendar.MONTH);
                          int year = cal.get(Calendar.YEAR);
                          
                   
                         int sec = cal.get(Calendar.SECOND);
                         int min = cal.get(Calendar.MINUTE);
                         int hour = cal.get(Calendar.HOUR_OF_DAY);
                        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss aa");
                        Date dat = cal.getTime();
                          String time = s.format(dat);
                          cluk.setText(time);
                        
                        cu.setText(month+"/"+day+"/"+year);
                        sleep(1000);
                      }
                  } catch (InterruptedException ex) {
                     ex.printStackTrace();
                  }
              }
        };
        clock.start();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        q = new javax.swing.JRadioButton();
        w = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        sb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        l = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        p = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        labela = new javax.swing.JLabel();
        labelaa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        filterTxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adr = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        section = new javax.swing.JComboBox();
        cluk = new javax.swing.JLabel();
        cu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        agee = new javax.swing.JComboBox();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Student Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Section: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Grade: ");

        name.setBackground(new java.awt.Color(0, 102, 204));
        name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        sn.setBackground(new java.awt.Color(0, 102, 204));
        sn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sn.setForeground(new java.awt.Color(255, 255, 255));
        sn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        sn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snKeyTyped(evt);
            }
        });

        q.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        q.setText("Grade 11");
        q.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        w.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        w.setText("Grade 12");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Strand: ");

        sb.setBackground(new java.awt.Color(255, 204, 0));
        sb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ICT", "STEM", "HUMSS", "ABM", "TG", "HE", "MRAC" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Gender: ");

        m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        m.setText("MALE");

        f.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        f.setText("FEMALE");

        l.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        l.setText("LGBTQ++");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Shift: ");

        a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        a.setText("AM Shift");

        p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p.setText("PM shift");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Student Photo:");

        labela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelaMouseClicked(evt);
            }
        });

        labelaa.setBackground(new java.awt.Color(51, 204, 255));
        labelaa.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        labelaa.setBorder(null);
        labelaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelaaActionPerformed(evt);
            }
        });

        jButton3.setText("Log Out >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("\"STUDENT LISTER\"");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel14.setText("For SENIOR HIGH SCHOOL");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SAVE");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.pink, java.awt.Color.orange, java.awt.Color.red));

        table.setBackground(new java.awt.Color(255, 153, 153));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel9.setText("Search Bar:");

        filterTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        filterTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTxtActionPerformed(evt);
            }
        });
        filterTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTxtKeyReleased(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterTxt)
                    .addComponent(jButton4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Currently Login As: ");

        ss.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Address:  (optional)");

        adr.setBackground(new java.awt.Color(0, 102, 204));
        adr.setColumns(20);
        adr.setForeground(new java.awt.Color(255, 255, 255));
        adr.setRows(5);
        adr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(adr);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Contact Number: ");

        num.setBackground(new java.awt.Color(0, 102, 204));
        num.setForeground(new java.awt.Color(255, 255, 255));
        num.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });

        section.setBackground(new java.awt.Color(204, 204, 0));
        section.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        section.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cluk.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cluk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        cu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));

        jLabel19.setText("Time:");

        jLabel20.setText("Date:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Age:");

        agee.setBackground(new java.awt.Color(255, 255, 0));
        agee.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        agee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        label.setBackground(new java.awt.Color(51, 255, 255));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(m)
                                                .addGap(10, 10, 10)
                                                .addComponent(f)
                                                .addGap(10, 10, 10)
                                                .addComponent(l))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a)
                                                .addGap(18, 18, 18)
                                                .addComponent(p))
                                            .addComponent(labela, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(q)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel13)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(w)
                                                    .addComponent(agee, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel14)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelaa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cu, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(cluk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cluk, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(agee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q)
                                .addComponent(w)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m)
                            .addComponent(f)
                            .addComponent(l)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(a)
                            .addComponent(p))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(112, 112, 112))
                            .addComponent(labela, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jButton1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelaa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel model;
  
    String Name = "";
    String Section = "";
    String Student = "";
    String Grade = "";
    String Strand = "";
    String gender= "";
    String shift = "";
    String selectedImagePath = "";
    String adres = "";
    String no = "";
    String agei = "";
   
    public void addtableHeader() {
        model = (DefaultTableModel) table.getModel();
       JTableHeader Theader = table.getTableHeader();
       Object[] newIdentifiers = new Object[]{"Name", "Section", "Student NO.", "Grade", "Strand","Gender","Shift","Photo","address","no","age"};
      
       model.setColumnIdentifiers(newIdentifiers);
        
        Theader.setForeground(Color.blue);
        Theader.setFont(new Font("Arial",Font.ITALIC,14));
        table.getColumn("Photo").setCellRenderer(new myTableCellRenderer());
       
     
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        table.setBackground(Color.yellow);
        table.setForeground(Color.black); 
        table.setFont(new Font("Arial",Font.BOLD,12));
        table.removeColumn(table.getColumnModel().getColumn(10));
        table.removeColumn(table.getColumnModel().getColumn(9));
        table.removeColumn(table.getColumnModel().getColumn(8));
        
     
        
    }
    class myTableCellRenderer implements TableCellRenderer {

  
   public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,int column) {
       
       table.setRowHeight(80);
       return (Component) value;
    
}
}
    private void labelaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelaaActionPerformed
        Name = name.getText();
        Section = section.getSelectedItem().toString();
        Student = sn.getText();
        adres = adr.getText();
        no = num.getText();
        agei = agee.getSelectedItem().toString();
        
        if (q.isSelected()) {
            Grade = "11";
        } else if (w.isSelected()) {
            Grade= "12";
        }
        Strand = sb.getSelectedItem().toString();
         if (m.isSelected()) {
            gender = "Male";
        } else if (f.isSelected()) {
            gender= "Female";
        }else if (l.isSelected()) {
            gender= "LGBTQ++";
        }
         if (a.isSelected()) {
            shift = "AM";
        } else if (p.isSelected()) {
            shift= "PM";
        }
        JLabel im = new JLabel();
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        Image mc = imageicon.getImage().getScaledInstance(100 , 80 , Image.SCALE_SMOOTH);
        im.setIcon( new ImageIcon(mc));
        
         
      
        if (Name.isEmpty() || Section.isEmpty() || shift.isEmpty() || Strand.isEmpty()||shift.isEmpty()) {
            JOptionPane.showMessageDialog(null, " ONE OR MORE ITEMS IS EMPTY");
        } else {
           model.addRow(new Object[]{Name, Section, Student, Grade,Strand,gender,shift,im,adres,no,agei});
           clearFields();
          
           
        }
        
    }//GEN-LAST:event_labelaaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JOptionPane.showMessageDialog(null,"Successfully Log Out !"+ "\n\n Thank You For Coming!");
       LOGIN p = new LOGIN();
       p.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void labelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelaMouseClicked
       JFileChooser browse = new JFileChooser();
        FileNameExtensionFilter fn = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browse.addChoosableFileFilter(fn);
        int showOpenDialogue = browse.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browse.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            
            ImageIcon i = new ImageIcon(selectedImagePath);
            Image image = i.getImage().getScaledInstance(labela.getWidth(),labela.getHeight(),Image.SCALE_SMOOTH);
            labela.setIcon(new ImageIcon(image));
            
       }
    }//GEN-LAST:event_labelaMouseClicked

    private void filterTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTxtKeyReleased
        String query = filterTxt.getText();
        filter(query);
    }//GEN-LAST:event_filterTxtKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int u = JOptionPane.showConfirmDialog(null, " Do Really Want to Delete?","DELETE",JOptionPane.YES_NO_OPTION);
        if ( u == 0 ){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int SelectedRowIndex = table.getSelectedRow();
        model.removeRow(table.convertRowIndexToModel(SelectedRowIndex));}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 name.setText("");
 section.setSelectedIndex(0);
 sn.setText("");
 a.setSelected(false);
 p.setSelected(false);
 q.setSelected(false);
 w.setSelected(false);
 m.setSelected(false);
 f.setSelected(false);
 l.setSelected(false);
 sb.setSelectedIndex(0);
 agee.setSelectedIndex(0);
 ImageIcon myii = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
        
        Image img111=myii.getImage();
        Image imageee = img111.getScaledInstance(labela.getWidth(),labela.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon iii = new ImageIcon(imageee);
        
        labela.setIcon(iii);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        students k = new students();
         
        
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int s = table.getSelectedRow();
        int r = table.convertRowIndexToModel(s);
        
       
         System.out.println("Selected"+ r);
         
        String namee = model.getValueAt(r,0).toString();
        String sne= model.getValueAt(r,1).toString();
        String sectione = model.getValueAt(r,2).toString();
        String grade = model.getValueAt(r,3).toString();
        String strand = model.getValueAt(r,4).toString();
        String gendere = model.getValueAt(r,5).toString();
        String shifte = model.getValueAt(r,6).toString();
        JLabel ko = (JLabel)model.getValueAt(r,7);
        ImageIcon II =(ImageIcon) ko.getIcon();
        Image image = II.getImage().getScaledInstance(students.pic.getWidth(),students.pic.getHeight(),Image.SCALE_SMOOTH);
        String adde = model.getValueAt(r,8).toString();
        String num = model.getValueAt(r,9).toString();
        String age = model.getValueAt(r,10).toString();
        
          
        
        
         students.namee.setText(namee);
         students.sec.setText(sectione);
         students.sn.setText(sne);
         students.grade.setText(grade);
         students.strand.setText(strand);
         students.gen.setText(gendere);
         students.shift.setText(shifte);
         students.pic.setIcon(new ImageIcon(image));
         students.add.setText(adde);
         students.number.setText(num);
         students.age.setText(age);
       
        
         
        
    }//GEN-LAST:event_tableMouseClicked

    private void filterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTxtActionPerformed
        
    }//GEN-LAST:event_filterTxtActionPerformed

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
        evt.consume();
        }
    }//GEN-LAST:event_numKeyTyped

    private void snKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
        evt.consume();
        }
    }//GEN-LAST:event_snKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
         
    }//GEN-LAST:event_nameKeyTyped

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
      char c = evt.getKeyChar();
      if (Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c)){
          name.setEditable(true);   
      }
      else{
         name.setEditable(false);
      }
    }//GEN-LAST:event_nameKeyPressed

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

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
            java.util.logging.Logger.getLogger(tabless.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabless.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabless.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabless.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabless().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    public static javax.swing.JTextArea adr;
    private javax.swing.JComboBox agee;
    private javax.swing.JLabel cluk;
    private javax.swing.JLabel cu;
    private javax.swing.JRadioButton f;
    private javax.swing.JTextField filterTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton l;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labela;
    private javax.swing.JButton labelaa;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField name;
    public static javax.swing.JTextField num;
    private javax.swing.JRadioButton p;
    private javax.swing.JRadioButton q;
    private javax.swing.JComboBox sb;
    private javax.swing.JComboBox section;
    private javax.swing.JTextField sn;
    public static javax.swing.JLabel ss;
    public static javax.swing.JTable table;
    private javax.swing.JRadioButton w;
    // End of variables declaration//GEN-END:variables

private void clearFields() {
   
 name.setText("");
 section.setSelectedIndex(0);
 sn.setText("");
 a.setSelected(false);
 p.setSelected(false);
 q.setSelected(false);
 w.setSelected(false);
 m.setSelected(false);
 f.setSelected(false);
 l.setSelected(false);
 sb.setSelectedIndex(0);
 agee.setSelectedIndex(0);
 selectedImagePath = null;
 
 

 
 ImageIcon myii = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
 Image img111=myii.getImage();
 Image imageee = img111.getScaledInstance(labela.getWidth(),labela.getHeight(),Image.SCALE_SMOOTH);
 ImageIcon iii = new ImageIcon(imageee);
 labela.setIcon(iii);
  
 adr.setText("");
 num.setText("");
 
 
 
}

}
