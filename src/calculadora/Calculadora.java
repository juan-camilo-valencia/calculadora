package calculadora;

public class Calculadora extends javax.swing.JFrame {

    double firstnumber;
    double secondnumber;
    double result;
    String operator;
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 30, 42));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t1.setMinimumSize(new java.awt.Dimension(23, 44));
        t1.setPreferredSize(new java.awt.Dimension(23, 44));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b1.setText("1");
        b1.setMaximumSize(new java.awt.Dimension(45, 45));
        b1.setMinimumSize(new java.awt.Dimension(45, 45));
        b1.setPreferredSize(new java.awt.Dimension(50, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b2.setText("2");
        b2.setMaximumSize(new java.awt.Dimension(45, 45));
        b2.setMinimumSize(new java.awt.Dimension(45, 45));
        b2.setPreferredSize(new java.awt.Dimension(50, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b3.setText("3");
        b3.setMaximumSize(new java.awt.Dimension(45, 45));
        b3.setMinimumSize(new java.awt.Dimension(45, 45));
        b3.setPreferredSize(new java.awt.Dimension(50, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b4.setText("4");
        b4.setMaximumSize(new java.awt.Dimension(45, 45));
        b4.setMinimumSize(new java.awt.Dimension(45, 45));
        b4.setPreferredSize(new java.awt.Dimension(50, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b5.setText("5");
        b5.setMaximumSize(new java.awt.Dimension(45, 45));
        b5.setMinimumSize(new java.awt.Dimension(45, 45));
        b5.setPreferredSize(new java.awt.Dimension(50, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b6.setText("6");
        b6.setMaximumSize(new java.awt.Dimension(45, 45));
        b6.setMinimumSize(new java.awt.Dimension(45, 45));
        b6.setPreferredSize(new java.awt.Dimension(50, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b7.setText("7");
        b7.setMaximumSize(new java.awt.Dimension(45, 45));
        b7.setMinimumSize(new java.awt.Dimension(45, 45));
        b7.setPreferredSize(new java.awt.Dimension(50, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b8.setText("8");
        b8.setMaximumSize(new java.awt.Dimension(45, 45));
        b8.setMinimumSize(new java.awt.Dimension(45, 45));
        b8.setPreferredSize(new java.awt.Dimension(50, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b9.setText("9");
        b9.setMaximumSize(new java.awt.Dimension(45, 45));
        b9.setMinimumSize(new java.awt.Dimension(45, 45));
        b9.setPreferredSize(new java.awt.Dimension(50, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b10.setText("0");
        b10.setMaximumSize(new java.awt.Dimension(45, 45));
        b10.setMinimumSize(new java.awt.Dimension(45, 45));
        b10.setPreferredSize(new java.awt.Dimension(50, 50));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b11.setText("+");
        b11.setMaximumSize(new java.awt.Dimension(29, 29));
        b11.setMinimumSize(new java.awt.Dimension(29, 29));
        b11.setPreferredSize(new java.awt.Dimension(50, 50));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b12.setText("-");
        b12.setMaximumSize(new java.awt.Dimension(45, 45));
        b12.setMinimumSize(new java.awt.Dimension(45, 45));
        b12.setPreferredSize(new java.awt.Dimension(50, 50));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b13.setText("c");
        b13.setMaximumSize(new java.awt.Dimension(45, 45));
        b13.setMinimumSize(new java.awt.Dimension(45, 45));
        b13.setPreferredSize(new java.awt.Dimension(50, 50));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b14.setText("=");
        b14.setMaximumSize(new java.awt.Dimension(45, 45));
        b14.setMinimumSize(new java.awt.Dimension(45, 45));
        b14.setPreferredSize(new java.awt.Dimension(50, 50));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b15.setText("/");
        b15.setMaximumSize(new java.awt.Dimension(45, 45));
        b15.setMinimumSize(new java.awt.Dimension(45, 45));
        b15.setPreferredSize(new java.awt.Dimension(50, 50));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b16.setText("*");
        b16.setMaximumSize(new java.awt.Dimension(45, 45));
        b16.setMinimumSize(new java.awt.Dimension(45, 45));
        b16.setPreferredSize(new java.awt.Dimension(50, 50));
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        b17.setText(".");
        b17.setMaximumSize(new java.awt.Dimension(45, 45));
        b17.setMinimumSize(new java.awt.Dimension(45, 45));
        b17.setPreferredSize(new java.awt.Dimension(50, 50));
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
String number = t1.getText()+ b3.getText();
        t1.setText(number);        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String number = t1.getText()+ b1.getText();
        t1.setText(number);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String number = t1.getText()+ b2.getText();
        t1.setText(number);

    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    String number = t1.getText()+ b4.getText();
        t1.setText(number);    // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
String number = t1.getText()+ b5.getText();
        t1.setText(number);        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
String number = t1.getText()+ b6.getText();
        t1.setText(number);        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
String number = t1.getText()+ b7.getText();
        t1.setText(number);        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
  String number = t1.getText()+ b8.getText();
        t1.setText(number);     // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
 firstnumber = Double.parseDouble(t1.getText());
      t1.setText(" ");
operator="-";        // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
   String number = t1.getText()+ b9.getText();
        t1.setText(number);     // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
String number = t1.getText()+ b10.getText();
        t1.setText(number);        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
      firstnumber = Double.parseDouble(t1.getText());
      t1.setText(" ");
operator="+";// TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
 firstnumber = Double.parseDouble(t1.getText());
      t1.setText(" ");
operator="/";        // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
 firstnumber = Double.parseDouble(t1.getText());
      t1.setText(" ");
operator="*";        // TODO add your handling code here:
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        String number = t1.getText()+ b17.getText();
        t1.setText(number);// TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed

        secondnumber = Double.parseDouble(t1.getText());
        if(operator == "+")
        {result=firstnumber+secondnumber;
            t1.setText(Double.toString(result));}
        else if(operator == "-")
        {result=firstnumber-secondnumber;
           t1.setText(Double.toString(result));}
         else if(operator == "/")
        {result=firstnumber/secondnumber;
            t1.setText(Double.toString(result));}
         else if(operator == "*")
        {result=firstnumber*secondnumber;
            t1.setText(Double.toString(result));}
    }//GEN-LAST:event_b14ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
t1.setText(" ");        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t1;
}
