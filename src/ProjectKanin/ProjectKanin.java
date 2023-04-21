package ProjectKanin;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Component;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class ProjectKanin extends javax.swing.JFrame {
double firstnum;
        double secondnum;
        double result;
        String operations;
        double[] i = new double[40];
         private Component frame;

    public ProjectKanin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnReset1 = new javax.swing.JButton();
        jBtnReset2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnSub = new javax.swing.JButton();
        jbTNmULT = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        JbTNdIV = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnEquals = new javax.swing.JButton();
        jBtnPlusSub = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDrink = new javax.swing.JList<>();
        jtxtBCDrink = new javax.swing.JTextField();
        jUseDrink = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCDelivery = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCmbMenuthanlen = new javax.swing.JComboBox();
        jtxtBCThanlen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jBtnReceipt = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jBtnReset = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jBtnExit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jTextเงินลูกค้า = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jCChicTomyumkung = new javax.swing.JCheckBox();
        jCChicPikkaithod = new javax.swing.JCheckBox();
        jCBCPlathabthim3lod = new javax.swing.JCheckBox();
        jCBCPlathabthimthodnampa = new javax.swing.JCheckBox();
        jtxtTomyumkung = new javax.swing.JTextField();
        jtxtChicPikkaithod = new javax.swing.JTextField();
        jtxtBCPlathabthim3lod = new javax.swing.JTextField();
        jtxtBCPlathabthimthodnampa = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jCChicPadkhanahmookrob = new javax.swing.JCheckBox();
        jCCKaiPhatMetMamuang = new javax.swing.JCheckBox();
        jCBYamThalRuam = new javax.swing.JCheckBox();
        jCBCPuPhatPhongKraRi = new javax.swing.JCheckBox();
        jtxtPadkhanahmookrob = new javax.swing.JTextField();
        jtxtKaiPhatMetMamuang = new javax.swing.JTextField();
        jtxtBCYamThalRuam = new javax.swing.JTextField();
        jtxtBCPuPhatPhongKraRi = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jCChickhamoopalor = new javax.swing.JCheckBox();
        jCChicmookrob = new javax.swing.JCheckBox();
        jCBCPorpiakungsod = new javax.swing.JCheckBox();
        jCBCKaengChuet = new javax.swing.JCheckBox();
        jtxtkhamoopalor = new javax.swing.JTextField();
        jtxtChicmookrob = new javax.swing.JTextField();
        jtxtBCPorpiakungsod = new javax.swing.JTextField();
        jtxtBCKaengChuet = new javax.swing.JTextField();
        jCChicSatekMu = new javax.swing.JCheckBox();
        jtxtSatekMu = new javax.swing.JTextField();
        jCCSatekThBon = new javax.swing.JCheckBox();
        jtxtSatekThBon = new javax.swing.JTextField();
        jCBCPhokChop = new javax.swing.JCheckBox();
        jtxtPhokChop = new javax.swing.JTextField();
        jCBCSatekPla = new javax.swing.JCheckBox();
        jtxtBCSatekPla = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jCCSalatKungThot = new javax.swing.JCheckBox();
        jtxtSalatKungThot = new javax.swing.JTextField();
        jCSalatPhak = new javax.swing.JCheckBox();
        jtxtSalatPhak = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jtxtKhaophat = new javax.swing.JTextField();
        jCKhao1Tho = new javax.swing.JCheckBox();
        jtxtKhao1Tho = new javax.swing.JTextField();
        jCCKhaophat = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblCostOfMeal = new javax.swing.JLabel();
        jlblCostOfThanlen = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblCostOfDrinks = new javax.swing.JLabel();
        jlblCostOfDelivery = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtxtBCAlltotalprice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtเงินทอน = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        jBtnReset1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReset1.setText("Reset");
        jBtnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReset1ActionPerformed(evt);
            }
        });

        jBtnReset2.setBackground(new java.awt.Color(153, 153, 153));
        jBtnReset2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnReset2.setText("Reset");
        jBtnReset2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnReset2MousePressed(evt);
            }
        });
        jBtnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReset2ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมจัดการร้านอาหาร");
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1020, 770));
        setPreferredSize(new java.awt.Dimension(1020, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 85, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 102));

        jPanel8.setBackground(new java.awt.Color(249, 0, 234));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ใบเสร็จ", jPanel8);

        jPanel7.setBackground(new java.awt.Color(119, 225, 116));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSub.setText("-");
        jBtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubActionPerformed(evt);
            }
        });

        jbTNmULT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbTNmULT.setText("*");
        jbTNmULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTNmULTActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        JbTNdIV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbTNdIV.setText("/");
        JbTNdIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbTNdIVActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Wingdings", 1, 18)); // NOI18N
        jButton14.setText("");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnEquals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnEquals.setText("=");
        jBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualsActionPerformed(evt);
            }
        });

        jBtnPlusSub.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jBtnPlusSub.setText("+/-");
        jBtnPlusSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusSubActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbTNmULT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JbTNdIV, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(42, 42, 42))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbTNmULT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JbTNdIV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("เครื่องคิดเลข", jPanel7);

        jList1.setBackground(new java.awt.Color(102, 102, 102));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ราคาอาหารและค่าบริการต่างๆ ", "________________________________", "ค่าบริการจัดส่ง 60 บาท", "================================", "รายการอาหาร", "\tต้มยำกุ้งน้ำข้น >>>>> 60 บาท", "\tปีกไก่ทอดเกลือ >>>>>90 บาท", "\tปลาทับทิมสามรส >>>>>280 บาท", "\tปลาทับทิมทอดน้ำปลา >>>>> 270 บาท", "\tผัดคะน้าหมูกรอบ >>>>> 120 บาท", "\tไก่ผัดเม็ดมะม่วง >>>>> 180 บาท", "\tยำทะเล >>>>> 170 บาท", "\tปูผัดผงกระหรี่ >>>>> 150 บาท", "\tขาหมูพะโล้ >>>>> 180 บาท", "\tหมูกรอบน้ำแดง\t >>>>> 120 บาท", "\tปอเปี๊ยะกุ้งสด >>>>> 125 บาท ", "\tแกงจืดเต้าหูหมูสับ >>>>> 110 บาท", "\tสเต็กหมู BBQ >>>>> 218 บาท", "\tสเต็กเนื้อทีโบน\t >>>>> 248 บาท", "\tพอร์คช้อป >>>>> 178 บาท", "\tสเต็กปลา >>>>> 128 บาท", "\tข้าว 1 โถ >>>>> 90 บาท", "\tข้าวผัดจานใหญ่\t>>>>> 140 บาท", "\tสลัดผัก >>>>> 78 บาท", "\tสลัดกุ้งกอบ >>>>> 138 บาท", "================================", "ของทานเล่น", "\tเกี๊ยวซ่า >>>>>  25 บาท", "\tลูกชิ้นปิ้งไม้ละ >>>>>  5 บาท", "\tไก่ทอด >>>>>  20 บาท", "\tขนมปังปิ้ง >>>>>  10 บาท", "================================", "เครื่องดื่ม", "\tน้ำแอปเปิ้ล  >>>>> 20 บาท", "\tน้ำชา  >>>>> 10 บาท", "\tเป๊ปซี่  >>>>> 20 บาท", "\tโค้ก  >>>>> 20 บาท ", "\tกาแฟร้อน  >>>>> 20 บาท", "\tชานมเย็น  >>>>> 25 บาท", "\tกาแฟเย็น  >>>>> 35 บาท", "\tน้ำส้ม  >>>>> 30 บาท", "________________________________", "ขอบคุณที่ใช้บริการทุกท่านนน" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jTabbedPane1.addTab("รายการอาหาร", jScrollPane3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 400, 440));

        jPanel1.setBackground(new java.awt.Color(150, 130, 130));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel10.setBackground(new java.awt.Color(129, 159, 169));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("เครื่องดื่ม");

        jListDrink.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "เลือก : น้ำแอปเปิ้ล", "เลือก : ชา", "เลือก : เป๊ปซี่", "เลือก : โค้ก", "เลือก : กาแฟร้อน", "เลือก : ชานมเย็น", "เลือก : กาแฟเย็น", "เลือก : น้ำส้ม", "เลือก : น้ำเปล่า " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListDrink.setDragEnabled(true);
        jScrollPane2.setViewportView(jListDrink);

        jtxtBCDrink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCDrink.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCDrink.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCDrink.setText("0");
        jtxtBCDrink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCDrink.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCDrinkFocusGained(evt);
            }
        });
        jtxtBCDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCDrinkActionPerformed(evt);
            }
        });

        jUseDrink.setText("เลือกเครื่องดื่ม");
        jUseDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUseDrinkActionPerformed(evt);
            }
        });

        jCDelivery.setBackground(new java.awt.Color(255, 255, 255));
        jCDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCDelivery.setText("จัดส่งที่บ้าน");
        jCDelivery.setActionCommand("Home Delivery  ");
        jCDelivery.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCDeliveryMouseClicked(evt);
            }
        });
        jCDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCDelivery)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jUseDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtBCDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtBCDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUseDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(217, 188, 95));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ของทานเล่น");

        jCmbMenuthanlen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCmbMenuthanlen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "เลือกเมนูทานเล่น...", "เกี๊ยวซ่า", "ลูกชิ้นปิ้ง", "ไก่ทอด", "ขนมปังปิ้ง" }));
        jCmbMenuthanlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbsnacks1ActionPerformed(evt);
            }
        });

        jtxtBCThanlen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCThanlen.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCThanlen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCThanlen.setText("0");
        jtxtBCThanlen.setToolTipText("");
        jtxtBCThanlen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCThanlen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCThanlenFocusGained(evt);
            }
        });
        jtxtBCThanlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCThanlenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtBCThanlen)
                    .addComponent(jCmbMenuthanlen, 0, 158, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCmbMenuthanlen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtBCThanlen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(225, 140, 69));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Clear ใบเสร็จ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setBackground(new java.awt.Color(153, 255, 153));
        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnTotal.setText("รวมทั้งหมด");
        jBtnTotal.setMaximumSize(new java.awt.Dimension(79, 25));
        jBtnTotal.setMinimumSize(new java.awt.Dimension(79, 25));
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnReceipt.setBackground(new java.awt.Color(0, 153, 204));
        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnReceipt.setText("ใบเสร็จ");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(102, 102, 102));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnReset.setBackground(new java.awt.Color(153, 153, 153));
        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnResetMousePressed(evt);
            }
        });
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnExit.setBackground(new java.awt.Color(255, 51, 51));
        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextเงินลูกค้า.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextเงินลูกค้า.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextเงินลูกค้า.setText("0");
        jTextเงินลูกค้า.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel26.setBackground(new java.awt.Color(102, 102, 102));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("คำนวณเงินทอน >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextเงินลูกค้า)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextเงินลูกค้า))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 740, 380));

        jPanel15.setBackground(new java.awt.Color(43, 101, 236));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("เมนูอาหาร");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 150));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel16.setBackground(new java.awt.Color(40, 55, 71));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 193, 0), 4, true));

        jCChicTomyumkung.setBackground(new java.awt.Color(40, 55, 71));
        jCChicTomyumkung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChicTomyumkung.setForeground(new java.awt.Color(255, 255, 255));
        jCChicTomyumkung.setText("ต้มยำกุ้งน้ำข้น");
        jCChicTomyumkung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicTomyumkungMouseClicked(evt);
            }
        });
        jCChicTomyumkung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicTomyumkungActionPerformed(evt);
            }
        });

        jCChicPikkaithod.setBackground(new java.awt.Color(40, 55, 71));
        jCChicPikkaithod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChicPikkaithod.setForeground(new java.awt.Color(255, 255, 255));
        jCChicPikkaithod.setText("ปีกไก่ทอดเกลือ");
        jCChicPikkaithod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicPikkaithodMouseClicked(evt);
            }
        });
        jCChicPikkaithod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicPikkaithodActionPerformed(evt);
            }
        });

        jCBCPlathabthim3lod.setBackground(new java.awt.Color(40, 55, 71));
        jCBCPlathabthim3lod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCPlathabthim3lod.setForeground(new java.awt.Color(255, 255, 255));
        jCBCPlathabthim3lod.setText("ปลาทับทิมสามรส");
        jCBCPlathabthim3lod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCPlathabthim3lodMouseClicked(evt);
            }
        });
        jCBCPlathabthim3lod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCPlathabthim3lodActionPerformed(evt);
            }
        });

        jCBCPlathabthimthodnampa.setBackground(new java.awt.Color(40, 55, 71));
        jCBCPlathabthimthodnampa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCPlathabthimthodnampa.setForeground(new java.awt.Color(255, 255, 255));
        jCBCPlathabthimthodnampa.setText("ปลาทับทิมทอดน้ำปลา");
        jCBCPlathabthimthodnampa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCPlathabthimthodnampaMouseClicked(evt);
            }
        });
        jCBCPlathabthimthodnampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCPlathabthimthodnampaActionPerformed(evt);
            }
        });

        jtxtTomyumkung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtTomyumkung.setForeground(new java.awt.Color(250, 249, 249));
        jtxtTomyumkung.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtTomyumkung.setText("0");
        jtxtTomyumkung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtTomyumkung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtTomyumkungFocusGained(evt);
            }
        });
        jtxtTomyumkung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTomyumkungActionPerformed(evt);
            }
        });

        jtxtChicPikkaithod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicPikkaithod.setForeground(new java.awt.Color(250, 249, 249));
        jtxtChicPikkaithod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtChicPikkaithod.setText("0");
        jtxtChicPikkaithod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtChicPikkaithod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtChicPikkaithodFocusGained(evt);
            }
        });
        jtxtChicPikkaithod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChicPikkaithodActionPerformed(evt);
            }
        });

        jtxtBCPlathabthim3lod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCPlathabthim3lod.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCPlathabthim3lod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCPlathabthim3lod.setText("0");
        jtxtBCPlathabthim3lod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCPlathabthim3lod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCPlathabthim3lodFocusGained(evt);
            }
        });
        jtxtBCPlathabthim3lod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCPlathabthim3lodActionPerformed(evt);
            }
        });

        jtxtBCPlathabthimthodnampa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCPlathabthimthodnampa.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCPlathabthimthodnampa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCPlathabthimthodnampa.setText("0");
        jtxtBCPlathabthimthodnampa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCPlathabthimthodnampa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCPlathabthimthodnampaFocusGained(evt);
            }
        });
        jtxtBCPlathabthimthodnampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCPlathabthimthodnampaActionPerformed(evt);
            }
        });

        jCChicPadkhanahmookrob.setBackground(new java.awt.Color(40, 55, 71));
        jCChicPadkhanahmookrob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChicPadkhanahmookrob.setForeground(new java.awt.Color(255, 255, 255));
        jCChicPadkhanahmookrob.setText("ผัดคะน้าหมูกรอบ");
        jCChicPadkhanahmookrob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicPadkhanahmookrobMouseClicked(evt);
            }
        });
        jCChicPadkhanahmookrob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicPadkhanahmookrobActionPerformed(evt);
            }
        });

        jCCKaiPhatMetMamuang.setBackground(new java.awt.Color(40, 55, 71));
        jCCKaiPhatMetMamuang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCCKaiPhatMetMamuang.setForeground(new java.awt.Color(255, 255, 255));
        jCCKaiPhatMetMamuang.setText("ไก่ผัดเผ็ดเม็ดมะม่วง");
        jCCKaiPhatMetMamuang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCCKaiPhatMetMamuangMouseClicked(evt);
            }
        });
        jCCKaiPhatMetMamuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCKaiPhatMetMamuangActionPerformed(evt);
            }
        });

        jCBYamThalRuam.setBackground(new java.awt.Color(40, 55, 71));
        jCBYamThalRuam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBYamThalRuam.setForeground(new java.awt.Color(255, 255, 255));
        jCBYamThalRuam.setText("ยำทะเลรวม");
        jCBYamThalRuam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBYamThalRuamMouseClicked(evt);
            }
        });
        jCBYamThalRuam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBYamThalRuamActionPerformed(evt);
            }
        });

        jCBCPuPhatPhongKraRi.setBackground(new java.awt.Color(40, 55, 71));
        jCBCPuPhatPhongKraRi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCPuPhatPhongKraRi.setForeground(new java.awt.Color(255, 255, 255));
        jCBCPuPhatPhongKraRi.setText("ปูผัดผงกระหรี่");
        jCBCPuPhatPhongKraRi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCPuPhatPhongKraRiMouseClicked(evt);
            }
        });
        jCBCPuPhatPhongKraRi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCPuPhatPhongKraRiActionPerformed(evt);
            }
        });

        jtxtPadkhanahmookrob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtPadkhanahmookrob.setForeground(new java.awt.Color(250, 249, 249));
        jtxtPadkhanahmookrob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtPadkhanahmookrob.setText("0");
        jtxtPadkhanahmookrob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtPadkhanahmookrob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtPadkhanahmookrobFocusGained(evt);
            }
        });
        jtxtPadkhanahmookrob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPadkhanahmookrobActionPerformed(evt);
            }
        });

        jtxtKaiPhatMetMamuang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtKaiPhatMetMamuang.setForeground(new java.awt.Color(250, 249, 249));
        jtxtKaiPhatMetMamuang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtKaiPhatMetMamuang.setText("0");
        jtxtKaiPhatMetMamuang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtKaiPhatMetMamuang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtKaiPhatMetMamuangFocusGained(evt);
            }
        });
        jtxtKaiPhatMetMamuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtKaiPhatMetMamuangActionPerformed(evt);
            }
        });

        jtxtBCYamThalRuam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCYamThalRuam.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCYamThalRuam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCYamThalRuam.setText("0");
        jtxtBCYamThalRuam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCYamThalRuam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCYamThalRuamFocusGained(evt);
            }
        });
        jtxtBCYamThalRuam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCYamThalRuamActionPerformed(evt);
            }
        });

        jtxtBCPuPhatPhongKraRi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCPuPhatPhongKraRi.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCPuPhatPhongKraRi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCPuPhatPhongKraRi.setText("0");
        jtxtBCPuPhatPhongKraRi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCPuPhatPhongKraRi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCPuPhatPhongKraRiFocusGained(evt);
            }
        });
        jtxtBCPuPhatPhongKraRi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCPuPhatPhongKraRiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jCChicPadkhanahmookrob)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtPadkhanahmookrob, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jCBCPuPhatPhongKraRi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtBCPuPhatPhongKraRi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCCKaiPhatMetMamuang)
                                    .addComponent(jCBYamThalRuam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtBCYamThalRuam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtKaiPhatMetMamuang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jCChicTomyumkung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtTomyumkung, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCChicPikkaithod)
                                    .addComponent(jCBCPlathabthim3lod)
                                    .addComponent(jCBCPlathabthimthodnampa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtBCPlathabthim3lod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtBCPlathabthimthodnampa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtChicPikkaithod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTomyumkung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCChicTomyumkung))
                .addGap(3, 3, 3)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtChicPikkaithod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCChicPikkaithod))
                .addGap(3, 3, 3)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBCPlathabthim3lod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCPlathabthim3lod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBCPlathabthimthodnampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCPlathabthimthodnampa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCChicPadkhanahmookrob)
                    .addComponent(jtxtPadkhanahmookrob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCKaiPhatMetMamuang)
                    .addComponent(jtxtKaiPhatMetMamuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBCYamThalRuam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBYamThalRuam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCPuPhatPhongKraRi)
                    .addComponent(jtxtBCPuPhatPhongKraRi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, 330));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel18.setBackground(new java.awt.Color(40, 55, 71));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 193, 0), 4, true));

        jCChickhamoopalor.setBackground(new java.awt.Color(40, 55, 71));
        jCChickhamoopalor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChickhamoopalor.setForeground(new java.awt.Color(255, 255, 255));
        jCChickhamoopalor.setText("ขาหมูพะโล้");
        jCChickhamoopalor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChickhamoopalorMouseClicked(evt);
            }
        });
        jCChickhamoopalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChickhamoopalorActionPerformed(evt);
            }
        });

        jCChicmookrob.setBackground(new java.awt.Color(40, 55, 71));
        jCChicmookrob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChicmookrob.setForeground(new java.awt.Color(255, 255, 255));
        jCChicmookrob.setText("หมูกรอบทอดน้ำแดง");
        jCChicmookrob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicmookrobMouseClicked(evt);
            }
        });
        jCChicmookrob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicmookrobActionPerformed(evt);
            }
        });

        jCBCPorpiakungsod.setBackground(new java.awt.Color(40, 55, 71));
        jCBCPorpiakungsod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCPorpiakungsod.setForeground(new java.awt.Color(255, 255, 255));
        jCBCPorpiakungsod.setText("ปอเปี๊ยะกุ้งสด");
        jCBCPorpiakungsod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCPorpiakungsodMouseClicked(evt);
            }
        });
        jCBCPorpiakungsod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCPorpiakungsodActionPerformed(evt);
            }
        });

        jCBCKaengChuet.setBackground(new java.awt.Color(40, 55, 71));
        jCBCKaengChuet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCKaengChuet.setForeground(new java.awt.Color(255, 255, 255));
        jCBCKaengChuet.setText("แกงจืดเต้าหู้หมูสับ");
        jCBCKaengChuet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCKaengChuetMouseClicked(evt);
            }
        });
        jCBCKaengChuet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCKaengChuetActionPerformed(evt);
            }
        });

        jtxtkhamoopalor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtkhamoopalor.setForeground(new java.awt.Color(250, 249, 249));
        jtxtkhamoopalor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtkhamoopalor.setText("0");
        jtxtkhamoopalor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtkhamoopalor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkhamoopalorFocusGained(evt);
            }
        });
        jtxtkhamoopalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtkhamoopalorActionPerformed(evt);
            }
        });

        jtxtChicmookrob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicmookrob.setForeground(new java.awt.Color(250, 249, 249));
        jtxtChicmookrob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtChicmookrob.setText("0");
        jtxtChicmookrob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtChicmookrob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtChicmookrobFocusGained(evt);
            }
        });
        jtxtChicmookrob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChicmookrobActionPerformed(evt);
            }
        });

        jtxtBCPorpiakungsod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCPorpiakungsod.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCPorpiakungsod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCPorpiakungsod.setText("0");
        jtxtBCPorpiakungsod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCPorpiakungsod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCPorpiakungsodFocusGained(evt);
            }
        });
        jtxtBCPorpiakungsod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCPorpiakungsodActionPerformed(evt);
            }
        });

        jtxtBCKaengChuet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCKaengChuet.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCKaengChuet.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCKaengChuet.setText("0");
        jtxtBCKaengChuet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCKaengChuet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCKaengChuetFocusGained(evt);
            }
        });
        jtxtBCKaengChuet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCKaengChuetActionPerformed(evt);
            }
        });

        jCChicSatekMu.setBackground(new java.awt.Color(40, 55, 71));
        jCChicSatekMu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCChicSatekMu.setForeground(new java.awt.Color(255, 255, 255));
        jCChicSatekMu.setText("สเต็กหมู BBQ");
        jCChicSatekMu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicSatekMuMouseClicked(evt);
            }
        });
        jCChicSatekMu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicSatekMuActionPerformed(evt);
            }
        });

        jtxtSatekMu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtSatekMu.setForeground(new java.awt.Color(250, 249, 249));
        jtxtSatekMu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtSatekMu.setText("0");
        jtxtSatekMu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtSatekMu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSatekMuFocusGained(evt);
            }
        });
        jtxtSatekMu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSatekMuActionPerformed(evt);
            }
        });

        jCCSatekThBon.setBackground(new java.awt.Color(40, 55, 71));
        jCCSatekThBon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCCSatekThBon.setForeground(new java.awt.Color(255, 255, 255));
        jCCSatekThBon.setText("สเต็กเนื้อทีโบน");
        jCCSatekThBon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCCSatekThBonMouseClicked(evt);
            }
        });
        jCCSatekThBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCSatekThBonActionPerformed(evt);
            }
        });

        jtxtSatekThBon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtSatekThBon.setForeground(new java.awt.Color(250, 249, 249));
        jtxtSatekThBon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtSatekThBon.setText("0");
        jtxtSatekThBon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtSatekThBon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSatekThBonFocusGained(evt);
            }
        });
        jtxtSatekThBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSatekThBonActionPerformed(evt);
            }
        });

        jCBCPhokChop.setBackground(new java.awt.Color(40, 55, 71));
        jCBCPhokChop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCPhokChop.setForeground(new java.awt.Color(255, 255, 255));
        jCBCPhokChop.setText("พอร์คช็อป");
        jCBCPhokChop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCPhokChopMouseClicked(evt);
            }
        });
        jCBCPhokChop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCPhokChopActionPerformed(evt);
            }
        });

        jtxtPhokChop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtPhokChop.setForeground(new java.awt.Color(250, 249, 249));
        jtxtPhokChop.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtPhokChop.setText("0");
        jtxtPhokChop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtPhokChop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtPhokChopFocusGained(evt);
            }
        });
        jtxtPhokChop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPhokChopActionPerformed(evt);
            }
        });

        jCBCSatekPla.setBackground(new java.awt.Color(40, 55, 71));
        jCBCSatekPla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBCSatekPla.setForeground(new java.awt.Color(255, 255, 255));
        jCBCSatekPla.setText("สเต็กปลา");
        jCBCSatekPla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCSatekPlaMouseClicked(evt);
            }
        });
        jCBCSatekPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCSatekPlaActionPerformed(evt);
            }
        });

        jtxtBCSatekPla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCSatekPla.setForeground(new java.awt.Color(250, 249, 249));
        jtxtBCSatekPla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCSatekPla.setText("0");
        jtxtBCSatekPla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCSatekPla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBCSatekPlaFocusGained(evt);
            }
        });
        jtxtBCSatekPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCSatekPlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtxtPhokChop, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCSatekPla)
                                    .addComponent(jCBCPhokChop)
                                    .addComponent(jCCSatekThBon)
                                    .addComponent(jCChicSatekMu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtBCSatekPla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSatekThBon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSatekMu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtxtBCPorpiakungsod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCChicmookrob)
                                    .addComponent(jCChickhamoopalor)
                                    .addComponent(jCBCKaengChuet)
                                    .addComponent(jCBCPorpiakungsod))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtBCKaengChuet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtChicmookrob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtkhamoopalor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtkhamoopalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCChickhamoopalor))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtChicmookrob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCChicmookrob))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBCPorpiakungsod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCPorpiakungsod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCKaengChuet)
                    .addComponent(jtxtBCKaengChuet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtSatekMu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCChicSatekMu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtSatekThBon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jtxtPhokChop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtBCSatekPla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jCCSatekThBon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBCPhokChop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCBCSatekPla)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 370, 330));

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel14.setBackground(new java.awt.Color(89, 128, 93));

        jCCSalatKungThot.setBackground(new java.awt.Color(89, 128, 93));
        jCCSalatKungThot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCCSalatKungThot.setForeground(new java.awt.Color(255, 255, 255));
        jCCSalatKungThot.setText("สลัดกุ้งทอด");
        jCCSalatKungThot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCCSalatKungThotMouseClicked(evt);
            }
        });
        jCCSalatKungThot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCSalatKungThotActionPerformed(evt);
            }
        });

        jtxtSalatKungThot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtSalatKungThot.setForeground(new java.awt.Color(250, 249, 249));
        jtxtSalatKungThot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtSalatKungThot.setText("0");
        jtxtSalatKungThot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtSalatKungThot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSalatKungThotFocusGained(evt);
            }
        });
        jtxtSalatKungThot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSalatKungThotActionPerformed(evt);
            }
        });

        jCSalatPhak.setBackground(new java.awt.Color(89, 128, 93));
        jCSalatPhak.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCSalatPhak.setForeground(new java.awt.Color(255, 255, 255));
        jCSalatPhak.setText("สลัดผัก");
        jCSalatPhak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCSalatPhakMouseClicked(evt);
            }
        });
        jCSalatPhak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSalatPhakActionPerformed(evt);
            }
        });

        jtxtSalatPhak.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtSalatPhak.setForeground(new java.awt.Color(250, 249, 249));
        jtxtSalatPhak.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtSalatPhak.setText("0");
        jtxtSalatPhak.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtSalatPhak.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSalatPhakFocusGained(evt);
            }
        });
        jtxtSalatPhak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSalatPhakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCSalatPhak)
                    .addComponent(jCCSalatKungThot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSalatPhak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSalatKungThot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSalatPhak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSalatPhak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSalatKungThot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCCSalatKungThot))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 370, 110));

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel21.setBackground(new java.awt.Color(94, 90, 128));

        jtxtKhaophat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtKhaophat.setForeground(new java.awt.Color(250, 249, 249));
        jtxtKhaophat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtKhaophat.setText("0");
        jtxtKhaophat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtKhaophat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtKhaophatFocusGained(evt);
            }
        });
        jtxtKhaophat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtKhaophatActionPerformed(evt);
            }
        });

        jCKhao1Tho.setBackground(new java.awt.Color(94, 90, 128));
        jCKhao1Tho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCKhao1Tho.setForeground(new java.awt.Color(255, 255, 255));
        jCKhao1Tho.setText("ข้าว 1 โถ");
        jCKhao1Tho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCKhao1ThoMouseClicked(evt);
            }
        });
        jCKhao1Tho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCKhao1ThoActionPerformed(evt);
            }
        });

        jtxtKhao1Tho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtKhao1Tho.setForeground(new java.awt.Color(250, 249, 249));
        jtxtKhao1Tho.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtKhao1Tho.setText("0");
        jtxtKhao1Tho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtKhao1Tho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtKhao1ThoFocusGained(evt);
            }
        });
        jtxtKhao1Tho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtKhao1ThoActionPerformed(evt);
            }
        });

        jCCKhaophat.setBackground(new java.awt.Color(94, 90, 128));
        jCCKhaophat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCCKhaophat.setForeground(new java.awt.Color(255, 255, 255));
        jCCKhaophat.setText("ข้าวผัด 1 จาน(ใหญ่)");
        jCCKhaophat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCCKhaophatMouseClicked(evt);
            }
        });
        jCCKhaophat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCKhaophatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCKhao1Tho)
                    .addComponent(jCCKhaophat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtKhao1Tho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtKhaophat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtKhao1Tho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCKhao1Tho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtKhaophat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCCKhaophat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 370, 110));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("โปรแกรมจัดการร้านอาหาร ");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 400, 150));

        jPanel4.setBackground(new java.awt.Color(49, 145, 225));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ค่าอาหาร");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("ค่าเมนูทานเล่น");

        jlblCostOfMeal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfMeal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfMeal.setText("0");
        jlblCostOfMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblCostOfThanlen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfThanlen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfThanlen.setText("0");
        jlblCostOfThanlen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCostOfThanlen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jlblCostOfThanlen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 400, 120));

        jPanel17.setBackground(new java.awt.Color(49, 145, 225));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ค่าเครื่องดื่ม");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ค่าจัดส่ง");

        jlblCostOfDrinks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfDrinks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfDrinks.setText("0");
        jlblCostOfDrinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblCostOfDelivery.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfDelivery.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfDelivery.setText("0");
        jlblCostOfDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 720, 400, 120));

        jPanel22.setBackground(new java.awt.Color(49, 145, 225));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("ราคารวมทั้งหมด");

        jtxtBCAlltotalprice.setEditable(false);
        jtxtBCAlltotalprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCAlltotalprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtBCAlltotalprice.setText("0");
        jtxtBCAlltotalprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCAlltotalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCAlltotalpriceActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("บาท");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("เงินทอนทั้งหมด");

        jtxtเงินทอน.setEditable(false);
        jtxtเงินทอน.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtเงินทอน.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtเงินทอน.setText("0");
        jtxtเงินทอน.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtเงินทอน.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtเงินทอนActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("บาท");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(4, 4, 4)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtBCAlltotalprice, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jtxtเงินทอน))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtxtBCAlltotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxtเงินทอน, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 840, 400, 140));

        setBounds(410, 20, 1196, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void jCChicTomyumkungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicTomyumkungMouseClicked
        //ต้มยำกุ้ง
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Tomyumkung = Double.parseDouble(jtxtTomyumkung.getText());
        double Tomyumkung1 = 150;

        if ( jCChicTomyumkung.isSelected())
        {
            i[0] = (Tomyumkung *Tomyumkung1) + cMeal ;
            String pMeal  = String.format("%.2f ",  i[0]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChicTomyumkungMouseClicked

    private void jCChicTomyumkungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicTomyumkungActionPerformed

    }//GEN-LAST:event_jCChicTomyumkungActionPerformed

    private void jCChicPikkaithodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicPikkaithodMouseClicked
        //ปีกไก่ทอดเกลือ 
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Pikkaithod = Double.parseDouble(jtxtChicPikkaithod.getText());
        double Pikkaithod1 =90;

        if (  jCChicPikkaithod .isSelected() )
        {
            i[1] = ((Pikkaithod *  Pikkaithod1)+ cMeal);
            String pMeal  = String.format("%.2f ",  i[1]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChicPikkaithodMouseClicked

    private void jCChicPikkaithodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicPikkaithodActionPerformed

    }//GEN-LAST:event_jCChicPikkaithodActionPerformed

    private void jCDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCDeliveryMouseClicked
        //ค่าส่งอาหาร
        double iDelivery = 60;

        if ( jCDelivery.isSelected())
        {
            String pDelivery  = String.format("%.2f",  iDelivery);
            jlblCostOfDelivery.setText(pDelivery );
        }
        else
        {
            jlblCostOfDelivery.setText(null);
        }
    }//GEN-LAST:event_jCDeliveryMouseClicked

    private void jCDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDeliveryActionPerformed

    }//GEN-LAST:event_jCDeliveryActionPerformed

    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked

    }//GEN-LAST:event_jBtnTotalMouseClicked

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
//ปุ่มรวมราคาทั้งหมด
        double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
        double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
        double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
        double cTotal4 = Double.parseDouble(jlblCostOfThanlen.getText());


        double allTotal = (cTotal1 + cTotal2 + cTotal3+cTotal4);
        String pMeal = String.format("%.2f ", allTotal);
        jtxtBCAlltotalprice.setText(pMeal);
    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked

    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
//ออกใบเสร็จ 
        double Qty1 = Double.parseDouble(jtxtTomyumkung.getText());
        double Qty2= Double.parseDouble(jtxtChicPikkaithod.getText());
        double Qty3= Double.parseDouble(jtxtBCPlathabthim3lod.getText());
        double Qty4= Double.parseDouble(jtxtBCPlathabthimthodnampa.getText());
        double Qty5= Double.parseDouble(jtxtPadkhanahmookrob.getText());
        double Qty6= Double.parseDouble(jtxtKaiPhatMetMamuang.getText());
        double Qty7= Double.parseDouble(jtxtBCYamThalRuam.getText());
        double Qty8= Double.parseDouble(jtxtBCPuPhatPhongKraRi.getText());
        double Qty9= Double.parseDouble(jtxtkhamoopalor.getText());
        double Qty10= Double.parseDouble(jtxtChicmookrob.getText());
        double Qty11= Double.parseDouble(jtxtBCPorpiakungsod.getText());
        double Qty12= Double.parseDouble(jtxtBCKaengChuet.getText());
        double Qty13= Double.parseDouble(jtxtSatekMu.getText());
        double Qty14= Double.parseDouble(jtxtSatekThBon.getText());
        double Qty15= Double.parseDouble(jtxtPhokChop.getText());
        double Qty16= Double.parseDouble(jtxtBCSatekPla.getText());
        double Qty17= Double.parseDouble(jtxtSalatPhak.getText());
        double Qty18= Double.parseDouble(jtxtSalatKungThot.getText());
        double Qty19= Double.parseDouble(jtxtKhao1Tho.getText());
        double Qty20= Double.parseDouble(jtxtKhaophat.getText());
        double Qty21= Double.parseDouble(jtxtBCThanlen.getText());
        double Qty22= Double.parseDouble(jtxtBCDrink.getText());
        double Qty23= Double.parseDouble(jlblCostOfMeal.getText());
        double Qty24= Double.parseDouble(jlblCostOfThanlen.getText());
        double Qty25= Double.parseDouble(jlblCostOfDrinks.getText());
        double Qty26= Double.parseDouble(jlblCostOfDelivery.getText());
        double Qty27= Double.parseDouble(jtxtBCAlltotalprice.getText());

        jTextArea1.append("\t\nโปรแกรมจัดการร้านอาหาร\n\n" + "ต้มยำกุ้งน้ำข้น : \t\t"
            + Qty1 + "\nปีกไก่ทอดเกลือ ! :\t\t"
            +Qty2+"\nปลาทับทิมสามรส ! :\t\t"
            +Qty3+ "\nปลาทับทิมทอดน้ำปลา ! :\t\t"
            +Qty4+"\nผัดคะน้าหมูกรอบ ! :\t\t"
            +Qty5+"\nไก่ผัดเผ็ดมะม่วง ! :\t\t"
            +Qty6+"\nยำทะเลรวม ! :\t\t\t"
            +Qty7+"\nปูผัดผงกระหรี่ ! :\t\t"
            +Qty8+"\nขาหมูพะโล้  :\t\t\t"
             +Qty9+"\nหมูกรอบทอดน้ำแดง  :\t\t"
            +Qty10+"\nปอเปี๊ยกุ้งสด  :\t\t\t"
             +Qty11+"\nแกงจืดเต้าหู้หมูสับ  :\t\t"
              +Qty12+"\nสเต็กหมู BBQ  :\t\t"
            +Qty13+"\nสเต็กเนื้อทีโบน  :\t\t"
            +Qty14+"\nพอร์คช็อป  :\t\t\t"
            +Qty15+"\nสเต็กปลา  :\t\t\t"
            +Qty16+"\nสลัดผัก  :\t\t\t"
            +Qty17+"\nสลัดกุ้งทอด  :\t\t\t"    
            +Qty18+"\nข้าว 1 โถ  :\t\t\t"
            +Qty19+"\nข้าวผัด 1 จาน(ใหญ่)  :\t\t"
            +Qty20+ "\nเมนูทานเล่น : \t\t\t"
            +Qty21+ "\nเครื่องดื่ม : \t\t\t"     
            +Qty22+"\n\n = > จำนวนค่าอาหาร = : \t\t\t"
            +Qty23+"\n = > จำนวนเงินค่าเมนูทานเล่น = : \t\t"
            +Qty24+"\n = > จำนวนเงินค่าเครื่องดื่ม = : \t\t"
            +Qty25+"\n = > ค่าบริการจัดส่ง = : \t\t\t"
            +Qty26+"\n = > รวมเป็นเงินทั้งหมด = : \t\t\t"
            + Qty27+"\n\nขอบคุณที่มาอุดหนุนครับลูกค้าทุกท่าน" );
    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
          jtxtBCAlltotalprice.setText("0");
        jlblCostOfDelivery.setText("0");
        jlblCostOfDrinks.setText("0");
        jlblCostOfMeal.setText("0");
       jtxtBCAlltotalprice.setText("0");
        jCDelivery.setSelected(false);
        jlblCostOfThanlen.setText("0");
        jtxtBCThanlen.setText("0");
        jtxtBCDrink.setText("0");
         jCBCPlathabthim3lod.setSelected(false);
        jCChicPadkhanahmookrob.setSelected(false);
        jCCKaiPhatMetMamuang.setSelected(false);
        jCBYamThalRuam.setSelected(false);
        jCBCPuPhatPhongKraRi.setSelected(false);
        jCKhao1Tho.setSelected(false);
        jCCKhaophat.setSelected(false);
        jCChickhamoopalor.setSelected(false);
        jCChicmookrob.setSelected(false);
        jCBCPorpiakungsod.setSelected(false);
        jCBCKaengChuet.setSelected(false);
        jCChicSatekMu.setSelected(false);
        jCCSatekThBon.setSelected(false);
        jCBCPhokChop.setSelected(false);
        jCBCSatekPla.setSelected(false);
        jCSalatPhak.setSelected(false);
        jCCSalatKungThot.setSelected(false);
        jTextเงินลูกค้า.setText("0");
        jtxtเงินทอน.setText("0");
        jBtnReset1.doClick();
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
// ปุ่มกด Exit
if (JOptionPane.showConfirmDialog(frame, "คุณต้องการออกจากโปรแกรมหรือไม่", "แจ้งเตือน",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jtxtTomyumkungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTomyumkungActionPerformed

    }//GEN-LAST:event_jtxtTomyumkungActionPerformed

    private void jCBCPlathabthimthodnampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCPlathabthimthodnampaActionPerformed

    }//GEN-LAST:event_jCBCPlathabthimthodnampaActionPerformed

    private void jCBCPlathabthimthodnampaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCPlathabthimthodnampaMouseClicked
        //ปลาทับทิมทอดน้ำปลา
        double Plathabthimthodnampa = Double.parseDouble(jtxtBCPlathabthimthodnampa.getText());
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Plathabthimthodnampa1 = 270;

        if (  jCBCPlathabthimthodnampa .isSelected() )
        {
            i[2] = ( (Plathabthimthodnampa * Plathabthimthodnampa1)+ cMeal);
            String pMeal  = String.format("%.2f",  i[2]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCPlathabthimthodnampaMouseClicked

    private void jCmbsnacks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbsnacks1ActionPerformed
        //เมนูทานเล่น
        double BCThanlen = Double.parseDouble(jtxtBCThanlen.getText());
        double เกี๊ยวซ่า = 25;
        double ลูกชิ้นปิ้ง= 5;
        double ไก่ทอด = 20;
        double ขนมปังปิ้ง= 10;

        if (jCmbMenuthanlen.getSelectedItem().equals("เกี๊ยวซ่า"))
        {
            String cเกี๊ยวซ่า = String.format("%.2f",  เกี๊ยวซ่า *  BCThanlen );
            jlblCostOfThanlen.setText( cเกี๊ยวซ่า);
        }
        if (jCmbMenuthanlen.getSelectedItem().equals("ลูกชิ้นปิ้ง"))
        {
            String cลูกชิ้นปิ้ง = String.format("%.2f",ลูกชิ้นปิ้ง *  BCThanlen );
            jlblCostOfThanlen.setText( cลูกชิ้นปิ้ง);
        }

        if (jCmbMenuthanlen.getSelectedItem().equals("ไก่ทอด"))
        {
            String cไก่ทอด= String.format("%.2f",  ไก่ทอด * BCThanlen  );
            jlblCostOfThanlen.setText( cไก่ทอด);
        }

        if (jCmbMenuthanlen.getSelectedItem().equals("ขนมปังปิ้ง"))
        {
            String cขนมปังปิ้ง = String.format("%.2f",  ขนมปังปิ้ง * BCThanlen );
            jlblCostOfThanlen.setText( cขนมปังปิ้ง);
        }
    }//GEN-LAST:event_jCmbsnacks1ActionPerformed
                           
    private void jtxtBCPlathabthimthodnampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCPlathabthimthodnampaActionPerformed

    }//GEN-LAST:event_jtxtBCPlathabthimthodnampaActionPerformed

    private void jtxtBCThanlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCThanlenActionPerformed
// จำนวนของเมนูทานเล่น            
        double BCThanlen = Double.parseDouble(jtxtBCThanlen.getText());
            {
               String pMeal  = String.format("%.2f ",  i[3]);
                jtxtBCThanlen.setText(pMeal );
            }     
    }//GEN-LAST:event_jtxtBCThanlenActionPerformed

    private void jtxtBCDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCDrinkActionPerformed
       //จำนวนของเครื่องดื่ม
        double BDDrinks = Double.parseDouble(jtxtBCDrink.getText());
        {
                String pMeal  = String.format("%.2f ",  i[4]);
                jtxtBCDrink.setText(pMeal );
        }
    }//GEN-LAST:event_jtxtBCDrinkActionPerformed

    private void jtxtBCAlltotalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCAlltotalpriceActionPerformed

    }//GEN-LAST:event_jtxtBCAlltotalpriceActionPerformed

    private void jBtnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReset1ActionPerformed
        jtxtBCPlathabthimthodnampa.setText("0"); 
        jtxtTomyumkung.setText("0"); 
        jtxtChicPikkaithod.setText("0"); 
        jCChicTomyumkung.setSelected(false); 
        jCChicPikkaithod.setSelected(false); 
        jCBCPlathabthimthodnampa.setSelected(false); 
        jtxtBCPlathabthim3lod.setText("0");
        jtxtPadkhanahmookrob.setText("0");
        jtxtKaiPhatMetMamuang.setText("0");
        jtxtBCYamThalRuam.setText("0");
        jtxtBCPuPhatPhongKraRi.setText("0");
        jtxtKhao1Tho.setText("0");
        jtxtKhaophat.setText("0");
        jtxtkhamoopalor.setText("0");
        jtxtChicmookrob.setText("0");
        jtxtBCPorpiakungsod.setText("0");
        jtxtBCKaengChuet.setText("0");
        jtxtSatekMu.setText("0");
        jtxtSatekThBon.setText("0");
        jtxtPhokChop.setText("0");
        jtxtBCSatekPla.setText("0");
        jtxtSalatPhak.setText("0");
        jtxtSalatKungThot.setText("0");
    }//GEN-LAST:event_jBtnReset1ActionPerformed

    private void jBtnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMousePressed
        jtxtBCThanlen.setText(null);
    }//GEN-LAST:event_jBtnResetMousePressed

    private void jBtnReset2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReset2MousePressed
       
    }//GEN-LAST:event_jBtnReset2MousePressed

    private void jBtnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReset2ActionPerformed

    }//GEN-LAST:event_jBtnReset2ActionPerformed

    private void jUseDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUseDrinkActionPerformed
        //เครื่องดื่ม
        JOptionPane.showMessageDialog(rootPane, jListDrink.getSelectedValue());
        double BDDrinks = Double.parseDouble(jtxtBCDrink.getText());
        double ชา = 10;
        double ชานมเย็น= 25;
        double กาแฟร้อน= 20;
        double กาแฟเย็น= 35;
        double เป๊ปซี่ = 20;
        double โค้ก= 20;
        double น้ำส้ม = 30;
        double น้ำแอปเปิ้ล = 20;
        double น้ำเปล่า = 14;

        if (jListDrink.getSelectedValue().equals("เลือก : น้ำแอปเปิ้ล"))
        {
            String cน้ำแอปเปิ้ล = String.format("%.2f",  น้ำแอปเปิ้ล * BDDrinks);
            jlblCostOfDrinks.setText( cน้ำแอปเปิ้ล);
        }
        if (jListDrink.getSelectedValue().equals("เลือก : ชา"))
        {
            String cชา = String.format("%.2f",ชา * BDDrinks);
            jlblCostOfDrinks.setText( cชา);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : ชานมเย็น"))
        {
            String cชานมเย็น = String.format("%.2f",  ชานมเย็น * BDDrinks);
            jlblCostOfDrinks.setText( cชานมเย็น);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : โค้ก"))
        {
            String cโค้ก = String.format("%.2f",  โค้ก * BDDrinks);
            jlblCostOfDrinks.setText( cโค้ก);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : เป๊ปซี่"))
        {
            String cเป๊ปซี่ = String.format("%.2f",  เป๊ปซี่ * BDDrinks);
            jlblCostOfDrinks.setText( cเป๊ปซี่);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : น้ำส้ม"))
        {
            String cน้ำส้ม = String.format("%.2f",  น้ำส้ม * BDDrinks);
            jlblCostOfDrinks.setText( cน้ำส้ม);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : กาแฟร้อน"))
        {
            String cกาแฟร้อน = String.format("%.2f",  กาแฟร้อน * BDDrinks);
            jlblCostOfDrinks.setText( cกาแฟร้อน);
        }

        if (jListDrink.getSelectedValue().equals("เลือก : กาแฟเย็น"))
        {
            String cกาแฟเย็น= String.format("%.2f",  กาแฟเย็น * BDDrinks);
            jlblCostOfDrinks.setText( cกาแฟเย็น);
        }
              if (jListDrink.getSelectedValue().equals("เลือก : น้ำเปล่า"))
        {
            String cน้ำเปล่า= String.format("%.2f",  น้ำเปล่า * BDDrinks);
            jlblCostOfDrinks.setText( cน้ำเปล่า);
        }
        
    }//GEN-LAST:event_jUseDrinkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtChicPikkaithodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChicPikkaithodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtChicPikkaithodActionPerformed

    private void jCBCPlathabthim3lodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCPlathabthim3lodMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCPlathabthim3lodMouseClicked

    private void jCBCPlathabthim3lodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCPlathabthim3lodActionPerformed
        //ปลาทับทิม 3 รส 
        double Plathabthimt3lod= Double.parseDouble(jtxtBCPlathabthim3lod.getText());
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Plathabthim3lod1 = 280;

        if (   jCBCPlathabthim3lod .isSelected() )
        {
            i[3] = ( (Plathabthimt3lod * Plathabthim3lod1)+ cMeal);
            String pMeal  = String.format("%.2f",  i[3]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCPlathabthim3lodActionPerformed

    private void jtxtBCPlathabthim3lodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCPlathabthim3lodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBCPlathabthim3lodActionPerformed

    private void jCBCKaengChuetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCKaengChuetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCKaengChuetMouseClicked

    private void jCBCKaengChuetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCKaengChuetActionPerformed
         //แกงจืดเต้าหู้หมูสับ
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double KaengChuet = Double.parseDouble(jtxtBCKaengChuet.getText());
        double KaengChuet1 = 110;

        if ( jCBCKaengChuet.isSelected())
        {
            i[7] = (KaengChuet *KaengChuet1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[7]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCKaengChuetActionPerformed

    private void jtxtBCKaengChuetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCKaengChuetActionPerformed
      
    }//GEN-LAST:event_jtxtBCKaengChuetActionPerformed

    private void jtxtBCPorpiakungsodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCPorpiakungsodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBCPorpiakungsodActionPerformed

    private void jCBCPorpiakungsodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCPorpiakungsodMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCPorpiakungsodMouseClicked

    private void jCBCPorpiakungsodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCPorpiakungsodActionPerformed
         //ปอเปี๊ยกุ้งสด
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Porpiakungsod = Double.parseDouble(jtxtBCPorpiakungsod.getText());
        double Porpiakungsod1 = 125;

        if ( jCBCPorpiakungsod.isSelected())
        {
            i[6] = (Porpiakungsod *Porpiakungsod1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[6]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCPorpiakungsodActionPerformed

    private void jCChicmookrobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicmookrobMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCChicmookrobMouseClicked

    private void jCChicmookrobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicmookrobActionPerformed
        // หมูกรอบทอดน้ำแดง
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double mookrob = Double.parseDouble(jtxtChicmookrob.getText());
        double mookrob1 = 120;

        if ( jCChicmookrob.isSelected())
        {
            i[5] = (mookrob *mookrob1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[5]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChicmookrobActionPerformed

    private void jtxtChicmookrobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChicmookrobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtChicmookrobActionPerformed

    private void jtxtkhamoopalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtkhamoopalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtkhamoopalorActionPerformed

    private void jCChickhamoopalorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChickhamoopalorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCChickhamoopalorMouseClicked

    private void jCChickhamoopalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChickhamoopalorActionPerformed
    //ขาหมูพะโล้
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double khamoopalor = Double.parseDouble(jtxtkhamoopalor.getText());
        double khamoopalor1 = 180;

        if ( jCChickhamoopalor.isSelected())
        {
            i[4] = (khamoopalor *khamoopalor1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[4]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChickhamoopalorActionPerformed

    private void jCChicPadkhanahmookrobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicPadkhanahmookrobMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCChicPadkhanahmookrobMouseClicked

    private void jCChicPadkhanahmookrobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicPadkhanahmookrobActionPerformed
         //ผัดคะน้าหมูกรอบ
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Padkhanahmookrob = Double.parseDouble(jtxtPadkhanahmookrob.getText());
        double Padkhanahmookrob1 = 120;

        if ( jCChicPadkhanahmookrob.isSelected())
        {
            i[8] = (Padkhanahmookrob *Padkhanahmookrob1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[8]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChicPadkhanahmookrobActionPerformed

    private void jCCKaiPhatMetMamuangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCCKaiPhatMetMamuangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCKaiPhatMetMamuangMouseClicked

    private void jCCKaiPhatMetMamuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCKaiPhatMetMamuangActionPerformed
        //ไก่ผัดเม็ดมะม่วง
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double KaiPhatMetMamuang = Double.parseDouble(jtxtKaiPhatMetMamuang.getText());
        double KaiPhatMetMamuang1 = 180;

        if ( jCCKaiPhatMetMamuang.isSelected())
        {
            i[10] = (KaiPhatMetMamuang *KaiPhatMetMamuang1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[10]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCCKaiPhatMetMamuangActionPerformed

    private void jCBYamThalRuamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBYamThalRuamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBYamThalRuamMouseClicked

    private void jCBYamThalRuamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBYamThalRuamActionPerformed
         //ยำทะเลรวม
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double YamThalRuam = Double.parseDouble(jtxtBCYamThalRuam.getText());
        double YamThalRuam1 = 170;

        if ( jCBYamThalRuam.isSelected())
        {
            i[11] = (YamThalRuam *YamThalRuam1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[11]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBYamThalRuamActionPerformed

    private void jtxtPadkhanahmookrobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPadkhanahmookrobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPadkhanahmookrobActionPerformed

    private void jtxtKaiPhatMetMamuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtKaiPhatMetMamuangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtKaiPhatMetMamuangActionPerformed

    private void jtxtBCPuPhatPhongKraRiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCPuPhatPhongKraRiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBCPuPhatPhongKraRiActionPerformed

    private void jCBCPuPhatPhongKraRiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCPuPhatPhongKraRiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCPuPhatPhongKraRiMouseClicked

    private void jCBCPuPhatPhongKraRiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCPuPhatPhongKraRiActionPerformed
        // ปูผัดผงกระหรี่
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double PuPhatPhongKraRi = Double.parseDouble(jtxtBCPuPhatPhongKraRi.getText());
        double PuPhatPhongKraRi1 = 150;

        if (  jCBCPuPhatPhongKraRi.isSelected())
        {
            i[12] = (PuPhatPhongKraRi *PuPhatPhongKraRi1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[12]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCPuPhatPhongKraRiActionPerformed

    private void jtxtBCYamThalRuamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCYamThalRuamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBCYamThalRuamActionPerformed

    private void jCBCSatekPlaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCSatekPlaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCSatekPlaMouseClicked

    private void jCBCSatekPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCSatekPlaActionPerformed
         //สเต็กปลา
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double SatekPla = Double.parseDouble(jtxtBCSatekPla.getText());
        double SatekPla1 = 128;

        if (  jCBCSatekPla.isSelected())
        {
            i[16] = (SatekPla *SatekPla1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[16]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCSatekPlaActionPerformed

    private void jtxtBCSatekPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCSatekPlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBCSatekPlaActionPerformed

    private void jtxtPhokChopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPhokChopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPhokChopActionPerformed

    private void jCBCPhokChopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCPhokChopMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCPhokChopMouseClicked

    private void jCBCPhokChopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCPhokChopActionPerformed
       //สเต็กพอร์คช็อป
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double PhokChop = Double.parseDouble(jtxtPhokChop.getText());
        double PhokChop1 = 178;

        if (   jCBCPhokChop.isSelected())
        {
            i[15] = (PhokChop *PhokChop1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[15]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCBCPhokChopActionPerformed

    private void jCCSatekThBonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCCSatekThBonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCSatekThBonMouseClicked

    private void jCCSatekThBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCSatekThBonActionPerformed
        //สเต็กเนื้อทีโบน
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double SatekThBon = Double.parseDouble(jtxtSatekThBon.getText());
        double SatekThBon1 = 248;

        if (  jCCSatekThBon.isSelected())
        {
            i[14] = (SatekThBon *SatekThBon1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[14]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCCSatekThBonActionPerformed

    private void jtxtSatekThBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSatekThBonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSatekThBonActionPerformed

    private void jtxtSatekMuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSatekMuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSatekMuActionPerformed

    private void jCChicSatekMuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicSatekMuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCChicSatekMuMouseClicked

    private void jCChicSatekMuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicSatekMuActionPerformed
        //สเต็กหมู BBQ
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double SatekMu = Double.parseDouble(jtxtSatekMu.getText());
        double SatekMu1 = 218;

        if (  jCChicSatekMu.isSelected())
        {
            i[13] = (SatekMu *SatekMu1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[13]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCChicSatekMuActionPerformed

    private void jtxtSalatPhakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSalatPhakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSalatPhakActionPerformed

    private void jCSalatPhakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCSalatPhakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSalatPhakMouseClicked

    private void jCSalatPhakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSalatPhakActionPerformed
        // สลัดผัก
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double SalatPhak = Double.parseDouble(jtxtSalatPhak.getText());
        double SalatPhak1 = 78;

        if (   jCSalatPhak.isSelected())
        {
            i[18] = (SalatPhak *SalatPhak1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[18]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCSalatPhakActionPerformed

    private void jCCSalatKungThotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCCSalatKungThotMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCSalatKungThotMouseClicked

    private void jCCSalatKungThotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCSalatKungThotActionPerformed
        // สลัดกุ้งทอด
         double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double SalatKungThot = Double.parseDouble(jtxtSalatKungThot.getText());
        double SalatKungThot1 = 138;

        if (  jCCSalatKungThot.isSelected())
        {
            i[19] = (SalatKungThot *SalatKungThot1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[19]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCCSalatKungThotActionPerformed

    private void jtxtSalatKungThotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSalatKungThotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSalatKungThotActionPerformed

    private void jtxtKhaophatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtKhaophatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtKhaophatActionPerformed

    private void jCKhao1ThoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCKhao1ThoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCKhao1ThoMouseClicked

    private void jCKhao1ThoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCKhao1ThoActionPerformed
        //ข้าว 1 โถ
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Khao1Tho = Double.parseDouble(jtxtKhao1Tho.getText());
        double Khao1Tho1 = 90;

        if (  jCKhao1Tho.isSelected())
        {
            i[27] = (Khao1Tho *Khao1Tho1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[27]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCKhao1ThoActionPerformed

    private void jtxtKhao1ThoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtKhao1ThoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtKhao1ThoActionPerformed

    private void jCCKhaophatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCCKhaophatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCKhaophatMouseClicked

    private void jCCKhaophatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCKhaophatActionPerformed
           //ข้าวผัด
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double Khaophat = Double.parseDouble(jtxtKhaophat.getText());
        double Khaophat1 = 140;

        if (   jCCKhaophat.isSelected())
        {
            i[28] = (Khaophat *Khaophat1) + cMeal ;
            String pMeal  = String.format("%.2f",  i[28]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_jCCKhaophatActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        //ปุ่มเลข 7
        String Enternumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        //ปุ่มเลข 8
        String Enternumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        //ปุ่มเลข 9
        String Enternumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        //ปุ่ม +
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        //ปุ่มเลข 4
        String Enternumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        //ปุ่มเลข 5
        String Enternumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        //ปุ่มเลข 6
        String Enternumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubActionPerformed
        //ปุ่ม -
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="-";
    }//GEN-LAST:event_jBtnSubActionPerformed

    private void jbTNmULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTNmULTActionPerformed
        //ปุ่ม *
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="*";
    }//GEN-LAST:event_jbTNmULTActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        //ปุ่มเลข 1
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        //ปุ่มเลข 2
        String Enternumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        //ปุ่มเลข 3
        String Enternumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void JbTNdIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbTNdIVActionPerformed
        //ปุ่ม หาร
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="/";
    }//GEN-LAST:event_JbTNdIVActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // ปุ่มลบทีละตัว
        String backspace=null;
        if(jtxtDisplay.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        //ปุ่มเลข 0
        String Enternumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        //ปุ่มลบทั้งหมดของเครื่องคิดเลข
        jtxtDisplay.setText(null);
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualsActionPerformed
        //ปุ่มคำนวณของเครื่องคิดเลข
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+")
        {
            result = firstnum +  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if (operations == "-")
        {
            result = firstnum -  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if (operations == "*")
        {
            result = firstnum *  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if (operations == "/")
        {
            result = firstnum /  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);

        }
        else  if (operations == "%")
        {
            result = firstnum %  secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtnEqualsActionPerformed

    private void jBtnPlusSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusSubActionPerformed
        //เครื่องหมายติดลบของตัวเลข
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops =ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPlusSubActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        //ปุ่มจุด
        jtxtDisplay.setText(jtxtDisplay.getText()+ jBtnDot.getText());
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jtxtTomyumkungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtTomyumkungFocusGained
        if(jtxtTomyumkung.getText().trim().toLowerCase().equals("0"))
        {
            jtxtTomyumkung.setText("");
            jtxtTomyumkung.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtTomyumkungFocusGained

    private void jtxtChicPikkaithodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtChicPikkaithodFocusGained
             if(jtxtChicPikkaithod.getText().equals("0"))
        {
            jtxtChicPikkaithod.setText("");
            jtxtChicPikkaithod.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtChicPikkaithodFocusGained

    private void jtxtBCPlathabthim3lodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCPlathabthim3lodFocusGained
        if( jtxtBCPlathabthim3lod.getText().equals("0"))
        {
            jtxtBCPlathabthim3lod.setText("");
             jtxtBCPlathabthim3lod.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCPlathabthim3lodFocusGained

    private void jtxtBCPlathabthimthodnampaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCPlathabthimthodnampaFocusGained
         if( jtxtBCPlathabthimthodnampa.getText().equals("0"))
        {
            jtxtBCPlathabthimthodnampa.setText("");
             jtxtBCPlathabthimthodnampa.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCPlathabthimthodnampaFocusGained

    private void jtxtPadkhanahmookrobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtPadkhanahmookrobFocusGained
       if( jtxtPadkhanahmookrob.getText().equals("0"))
        {
            jtxtPadkhanahmookrob.setText("");
             jtxtPadkhanahmookrob.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtPadkhanahmookrobFocusGained

    private void jtxtKaiPhatMetMamuangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtKaiPhatMetMamuangFocusGained
         if(  jtxtKaiPhatMetMamuang.getText().equals("0"))
        {
            jtxtKaiPhatMetMamuang.setText("");
              jtxtKaiPhatMetMamuang.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtKaiPhatMetMamuangFocusGained

    private void jtxtBCYamThalRuamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCYamThalRuamFocusGained
       if(  jtxtBCYamThalRuam.getText().equals("0"))
        {
           jtxtBCYamThalRuam.setText("");
              jtxtBCYamThalRuam.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCYamThalRuamFocusGained

    private void jtxtBCPuPhatPhongKraRiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCPuPhatPhongKraRiFocusGained
              if( jtxtBCPuPhatPhongKraRi.getText().equals("0"))
        {
           jtxtBCPuPhatPhongKraRi.setText("");
              jtxtBCPuPhatPhongKraRi.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCPuPhatPhongKraRiFocusGained

    private void jtxtKhao1ThoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtKhao1ThoFocusGained
         if(  jtxtKhao1Tho.getText().equals("0"))
        {
           jtxtKhao1Tho.setText("");
              jtxtKhao1Tho.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtKhao1ThoFocusGained

    private void jtxtKhaophatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtKhaophatFocusGained
              if(  jtxtKhaophat.getText().equals("0"))
        {
           jtxtKhaophat.setText("");
              jtxtKhaophat.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtKhaophatFocusGained

    private void jtxtBCThanlenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCThanlenFocusGained
           if(  jtxtBCThanlen.getText().equals("0"))
        {
           jtxtBCThanlen.setText("");
              jtxtBCThanlen.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCThanlenFocusGained

    private void jtxtBCDrinkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCDrinkFocusGained
                   if(  jtxtBCDrink.getText().equals("0"))
        {
           jtxtBCDrink.setText("");
              jtxtBCDrink.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCDrinkFocusGained

    private void jtxtkhamoopalorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtkhamoopalorFocusGained
                         if(   jtxtkhamoopalor.getText().equals("0"))
        {
            jtxtkhamoopalor.setText("");
               jtxtkhamoopalor.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtkhamoopalorFocusGained

    private void jtxtChicmookrobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtChicmookrobFocusGained
                         if(    jtxtChicmookrob.getText().equals("0"))
        {
             jtxtChicmookrob.setText("");
                jtxtChicmookrob.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtChicmookrobFocusGained

    private void jtxtBCPorpiakungsodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCPorpiakungsodFocusGained
                         if(     jtxtBCPorpiakungsod.getText().equals("0"))
        {
             jtxtBCPorpiakungsod.setText("");
                 jtxtBCPorpiakungsod.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCPorpiakungsodFocusGained

    private void jtxtBCKaengChuetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCKaengChuetFocusGained
                         if(     jtxtBCKaengChuet.getText().equals("0"))
        {
            jtxtBCKaengChuet.setText("");
                 jtxtBCKaengChuet.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCKaengChuetFocusGained

    private void jtxtSatekMuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSatekMuFocusGained
                       if(     jtxtSatekMu.getText().equals("0"))
        {
            jtxtSatekMu.setText("");
                 jtxtSatekMu.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtSatekMuFocusGained

    private void jtxtSatekThBonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSatekThBonFocusGained
                       if(      jtxtSatekThBon.getText().equals("0"))
        {
             jtxtSatekThBon.setText("");
                  jtxtSatekThBon.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtSatekThBonFocusGained

    private void jtxtPhokChopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtPhokChopFocusGained
                       if(      jtxtPhokChop.getText().equals("0"))
        {
             jtxtPhokChop.setText("");
                  jtxtPhokChop.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtPhokChopFocusGained

    private void jtxtBCSatekPlaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBCSatekPlaFocusGained
                        if(       jtxtBCSatekPla.getText().equals("0"))
        {
              jtxtBCSatekPla.setText("");
                   jtxtBCSatekPla.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtBCSatekPlaFocusGained

    private void jtxtSalatPhakFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSalatPhakFocusGained
                        if(       jtxtSalatPhak.getText().equals("0"))
        {
              jtxtSalatPhak.setText("");
                  jtxtSalatPhak.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtSalatPhakFocusGained

    private void jtxtSalatKungThotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSalatKungThotFocusGained
                        if(        jtxtSalatKungThot.getText().equals("0"))
        {
              jtxtSalatKungThot.setText("");
                   jtxtSalatKungThot.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxtSalatKungThotFocusGained

    private void jtxtเงินทอนActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtเงินทอนActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtเงินทอนActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double money1 = Double.parseDouble(jTextเงินลูกค้า.getText());
        double money2 = Double.parseDouble(jtxtBCAlltotalprice.getText());

        double allmoney = (money1 - money2);
        String pMeal = String.format("%.2f ", allmoney);
         jtxtเงินทอน.setText(pMeal);
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
       
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectKanin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectKanin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectKanin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectKanin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectKanin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbTNdIV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEquals;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnPlusSub;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnReset1;
    private javax.swing.JButton jBtnReset2;
    private javax.swing.JButton jBtnSub;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCBCKaengChuet;
    private javax.swing.JCheckBox jCBCPhokChop;
    private javax.swing.JCheckBox jCBCPlathabthim3lod;
    private javax.swing.JCheckBox jCBCPlathabthimthodnampa;
    private javax.swing.JCheckBox jCBCPorpiakungsod;
    private javax.swing.JCheckBox jCBCPuPhatPhongKraRi;
    private javax.swing.JCheckBox jCBCSatekPla;
    private javax.swing.JCheckBox jCBYamThalRuam;
    private javax.swing.JCheckBox jCCKaiPhatMetMamuang;
    private javax.swing.JCheckBox jCCKhaophat;
    private javax.swing.JCheckBox jCCSalatKungThot;
    private javax.swing.JCheckBox jCCSatekThBon;
    private javax.swing.JCheckBox jCChicPadkhanahmookrob;
    private javax.swing.JCheckBox jCChicPikkaithod;
    private javax.swing.JCheckBox jCChicSatekMu;
    private javax.swing.JCheckBox jCChicTomyumkung;
    private javax.swing.JCheckBox jCChickhamoopalor;
    private javax.swing.JCheckBox jCChicmookrob;
    private javax.swing.JCheckBox jCDelivery;
    private javax.swing.JCheckBox jCKhao1Tho;
    private javax.swing.JCheckBox jCSalatPhak;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox jCmbMenuthanlen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListDrink;
    private javax.swing.JMenu jMenu1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextเงินลูกค้า;
    private javax.swing.JButton jUseDrink;
    private javax.swing.JButton jbTNmULT;
    private javax.swing.JLabel jlblCostOfDelivery;
    private javax.swing.JLabel jlblCostOfDrinks;
    private javax.swing.JLabel jlblCostOfMeal;
    private javax.swing.JLabel jlblCostOfThanlen;
    private javax.swing.JTextField jtxtBCAlltotalprice;
    private javax.swing.JTextField jtxtBCDrink;
    private javax.swing.JTextField jtxtBCKaengChuet;
    private javax.swing.JTextField jtxtBCPlathabthim3lod;
    private javax.swing.JTextField jtxtBCPlathabthimthodnampa;
    private javax.swing.JTextField jtxtBCPorpiakungsod;
    private javax.swing.JTextField jtxtBCPuPhatPhongKraRi;
    private javax.swing.JTextField jtxtBCSatekPla;
    private javax.swing.JTextField jtxtBCThanlen;
    private javax.swing.JTextField jtxtBCYamThalRuam;
    private javax.swing.JTextField jtxtChicPikkaithod;
    private javax.swing.JTextField jtxtChicmookrob;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtKaiPhatMetMamuang;
    private javax.swing.JTextField jtxtKhao1Tho;
    private javax.swing.JTextField jtxtKhaophat;
    private javax.swing.JTextField jtxtPadkhanahmookrob;
    private javax.swing.JTextField jtxtPhokChop;
    private javax.swing.JTextField jtxtSalatKungThot;
    private javax.swing.JTextField jtxtSalatPhak;
    private javax.swing.JTextField jtxtSatekMu;
    private javax.swing.JTextField jtxtSatekThBon;
    private javax.swing.JTextField jtxtTomyumkung;
    private javax.swing.JTextField jtxtkhamoopalor;
    private javax.swing.JTextField jtxtเงินทอน;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    // End of variables declaration//GEN-END:variables

    }

