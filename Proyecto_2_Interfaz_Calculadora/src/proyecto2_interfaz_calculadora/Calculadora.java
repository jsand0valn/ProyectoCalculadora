package tarea_interfaz_calculadora;

/**
 *
 * @author Eduardo José Espinoza Rodríguez Programación 1
 */
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        //Tamaño de la ventana
        this.setBounds(300, 100, 890, 450);//Pocision
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        Calculadora_Virtual = new javax.swing.JPanel();
        N1 = new javax.swing.JTextField();
        V1 = new javax.swing.JLabel();
        N2 = new javax.swing.JTextField();
        V2 = new javax.swing.JLabel();
        NR = new javax.swing.JTextField();
        R = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        B00 = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        BI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BS = new javax.swing.JRadioButton();
        BR = new javax.swing.JRadioButton();
        BM = new javax.swing.JRadioButton();
        BD = new javax.swing.JRadioButton();
        BC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Calculadora_Virtual.setBackground(new java.awt.Color(0, 0, 0));
        Calculadora_Virtual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));

        N1.setBackground(new java.awt.Color(204, 204, 204));
        N1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N1.setBorder(null);
        N1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        V1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        V1.setForeground(new java.awt.Color(0, 153, 255));
        V1.setText("Valor 1");

        N2.setBackground(new java.awt.Color(204, 204, 204));
        N2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N2.setBorder(null);
        N2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        V2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        V2.setForeground(new java.awt.Color(0, 153, 255));
        V2.setText("Valor 2");

        NR.setBackground(new java.awt.Color(204, 204, 204));
        NR.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NR.setBorder(null);
        NR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NRActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        R.setForeground(new java.awt.Color(255, 51, 102));
        R.setText("Resultado");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Proyecto Calculadora");

        javax.swing.GroupLayout Calculadora_VirtualLayout = new javax.swing.GroupLayout(Calculadora_Virtual);
        Calculadora_Virtual.setLayout(Calculadora_VirtualLayout);
        Calculadora_VirtualLayout.setHorizontalGroup(
            Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Calculadora_VirtualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculadora_VirtualLayout.createSequentialGroup()
                        .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(V1)
                            .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NR, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(N1)
                            .addComponent(N2)))
                    .addGroup(Calculadora_VirtualLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Calculadora_VirtualLayout.setVerticalGroup(
            Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculadora_VirtualLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Calculadora_VirtualLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculadora_VirtualLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V1)
                        .addGap(58, 58, 58)))
                .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Calculadora_VirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Calculadora_VirtualLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Calculadora_VirtualLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        getContentPane().add(Calculadora_Virtual);
        Calculadora_Virtual.setBounds(0, 0, 700, 410);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 51)));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 130));
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        B7.setBackground(new java.awt.Color(204, 204, 255));
        B7.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel2.add(B7);

        B8.setBackground(new java.awt.Color(204, 204, 255));
        B8.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel2.add(B8);

        B9.setBackground(new java.awt.Color(204, 204, 255));
        B9.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel2.add(B9);

        B4.setBackground(new java.awt.Color(255, 204, 255));
        B4.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel2.add(B4);

        B5.setBackground(new java.awt.Color(255, 204, 255));
        B5.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel2.add(B5);

        B6.setBackground(new java.awt.Color(255, 204, 255));
        B6.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel2.add(B6);

        B1.setBackground(new java.awt.Color(255, 204, 204));
        B1.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1);

        B2.setBackground(new java.awt.Color(255, 204, 204));
        B2.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel2.add(B2);

        B3.setBackground(new java.awt.Color(255, 204, 204));
        B3.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel2.add(B3);

        B0.setBackground(new java.awt.Color(204, 255, 204));
        B0.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B0.setText("0");
        B0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        jPanel2.add(B0);

        B00.setBackground(new java.awt.Color(204, 255, 204));
        B00.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        B00.setText("00");
        B00.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B00ActionPerformed(evt);
            }
        });
        jPanel2.add(B00);

        BP.setBackground(new java.awt.Color(204, 255, 204));
        BP.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        BP.setText(".");
        BP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });
        jPanel2.add(BP);

        BI.setBackground(new java.awt.Color(0, 0, 0));
        BI.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        BI.setForeground(new java.awt.Color(255, 255, 153));
        BI.setText("=");
        BI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BIMouseExited(evt);
            }
        });
        BI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        BS.setBackground(new java.awt.Color(255, 51, 255));
        buttonGroup2.add(BS);
        BS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        BS.setText("+");
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });
        jPanel3.add(BS);

        BR.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup2.add(BR);
        BR.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        BR.setText("-");
        jPanel3.add(BR);

        BM.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup2.add(BM);
        BM.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        BM.setText("*");
        jPanel3.add(BM);

        BD.setBackground(new java.awt.Color(0, 255, 153));
        buttonGroup2.add(BD);
        BD.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        BD.setText("/");
        jPanel3.add(BD);

        BC.setBackground(new java.awt.Color(0, 0, 0));
        BC.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        BC.setForeground(new java.awt.Color(255, 255, 153));
        BC.setText("Clear");
        BC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BCMouseExited(evt);
            }
        });
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Numeros de atajo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BC)
                    .addComponent(BI, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BC)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(700, 0, 170, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSActionPerformed

    private void BIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIActionPerformed
        float Numero1=0, Numero2=0, Total=0;
        Numero1 = Float.parseFloat(N1.getText());
        Numero2 = Float.parseFloat(N2.getText());

        if (BS.isSelected()) {
            Total = Numero1 + Numero2;
        } else if (BR.isSelected()) {
            Total = Numero1 - Numero2;
        } else if (BM.isSelected()) {
            Total = Numero1 * Numero2;
        } else if (BD.isSelected()) {
            Total = Numero1 / Numero2;
        }
        NR.setText(String.valueOf(Total));

    }//GEN-LAST:event_BIActionPerformed

    private void BIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BIMouseExited

    }//GEN-LAST:event_BIMouseExited

    private void BIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BIMouseEntered
        NR.setText("Aqui se mostrara el resultado");
    }//GEN-LAST:event_BIMouseEntered

    private void NRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NRActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
N1.setText(N1.getText()+"2");
N2.setText(N2.getText()+"2");// TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
N1.setText(N1.getText()+"1");
N2.setText(N2.getText()+"1");
    }//GEN-LAST:event_B1ActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
N1.setText(N1.getText()+".");  
N2.setText(N2.getText()+".");// TODO add your handling code here:
    }//GEN-LAST:event_BPActionPerformed

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
N1.setText(N1.getText()+"00"); 
N2.setText(N2.getText()+"00");// TODO add your handling code here:
    }//GEN-LAST:event_B00ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
N1.setText(N1.getText()+"0");
N2.setText(N2.getText()+"0");// TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
N1.setText(N1.getText()+"3");   
N2.setText(N2.getText()+"3");// TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
N1.setText(N1.getText()+"4");  
N2.setText(N2.getText()+"4");// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
N1.setText(N1.getText()+"5");  
N2.setText(N2.getText()+"5");// TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
N1.setText(N1.getText()+"6"); 
N2.setText(N2.getText()+"6");// TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
N1.setText(N1.getText()+"7");
N2.setText(N2.getText()+"7");// TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
N1.setText(N1.getText()+"8");
N2.setText(N2.getText()+"8");// TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
N1.setText(N1.getText()+"9");
N2.setText(N2.getText()+"9");// TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void BCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BCMouseEntered

    private void BCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BCMouseExited

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
    N1.setText("");
   N2.setText("");
   NR.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_BCActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B00;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JRadioButton BD;
    private javax.swing.JButton BI;
    private javax.swing.JRadioButton BM;
    private javax.swing.JButton BP;
    private javax.swing.JRadioButton BR;
    private javax.swing.JRadioButton BS;
    private static javax.swing.JPanel Calculadora_Virtual;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField NR;
    private javax.swing.JLabel R;
    private javax.swing.JLabel V1;
    private javax.swing.JLabel V2;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
