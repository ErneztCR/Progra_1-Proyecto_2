package Proyecto_2_Calculadora;

public class principal extends javax.swing.JFrame {

    String operador = "";
    boolean CambioEstado = false;
    float valor1 = 0, valor2 = 0;

    public principal() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bretroceso = new javax.swing.JButton();
        Bdot = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Lresultado = new javax.swing.JLabel();
        Lresultado2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Bplus = new javax.swing.JButton();
        BCE = new javax.swing.JButton();
        Bminus = new javax.swing.JButton();
        Bmulti = new javax.swing.JButton();
        Bdivision = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        Lprincipal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Belevado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(622, 559));
        setSize(new java.awt.Dimension(622, 559));
        getContentPane().setLayout(null);

        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        B1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B1.setText("1");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1);

        B2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B2.setText("2");
        B2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel2.add(B2);

        B3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B3.setText("3");
        B3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel2.add(B3);

        B4.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B4.setText("4");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel2.add(B4);

        B5.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B5.setText("5");
        B5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel2.add(B5);

        B6.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B6.setText("6");
        B6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel2.add(B6);

        B7.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B7.setText("7");
        B7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel2.add(B7);

        B8.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B8.setText("8");
        B8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel2.add(B8);

        B9.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B9.setText("9");
        B9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel2.add(B9);

        B0.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B0.setText("0");
        B0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        jPanel2.add(B0);

        Bretroceso.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Bretroceso.setText("←");
        Bretroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BretrocesoActionPerformed(evt);
            }
        });
        jPanel2.add(Bretroceso);

        Bdot.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bdot.setText(".");
        Bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdotActionPerformed(evt);
            }
        });
        jPanel2.add(Bdot);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 140, 280, 290);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Lresultado.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        Lresultado.setForeground(new java.awt.Color(0, 255, 0));
        Lresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Lresultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lresultado2.setForeground(new java.awt.Color(0, 153, 0));
        Lresultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lresultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(Lresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(Lresultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 20, 500, 90);

        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        Bplus.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bplus.setText("+");
        Bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BplusActionPerformed(evt);
            }
        });
        jPanel3.add(Bplus);

        BCE.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        BCE.setText("CE");
        BCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCEActionPerformed(evt);
            }
        });
        jPanel3.add(BCE);

        Bminus.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bminus.setText("-");
        Bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminusActionPerformed(evt);
            }
        });
        jPanel3.add(Bminus);

        Bmulti.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bmulti.setText("x");
        Bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiActionPerformed(evt);
            }
        });
        jPanel3.add(Bmulti);

        Bdivision.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bdivision.setText("/");
        Bdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivisionActionPerformed(evt);
            }
        });
        jPanel3.add(Bdivision);

        Bigual.setBackground(new java.awt.Color(204, 204, 204));
        Bigual.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bigual.setText("=");
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        jPanel3.add(Bigual);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 140, 170, 390);
        getContentPane().add(Lprincipal);
        Lprincipal.setBounds(10, 0, 630, 0);

        Belevado.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Belevado.setText("^");
        Belevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelevadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Belevado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Belevado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 193, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(550, 140, 90, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String formatearFloat(float numero) {
        if (numero % 1 == 0) {
            return String.format("%.0f", numero);
        } else {
            return String.valueOf(numero);
        }
    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Lresultado.setText(Lresultado.getText() + "3");
        AlmacenarValores();
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Lresultado.setText(Lresultado.getText() + "4");
        AlmacenarValores();
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Lresultado.setText(Lresultado.getText() + "5");
        AlmacenarValores();
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Lresultado.setText(Lresultado.getText() + "6");
        AlmacenarValores();
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Lresultado.setText(Lresultado.getText() + "7");
        AlmacenarValores();
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Lresultado.setText(Lresultado.getText() + "8");
        AlmacenarValores();
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Lresultado.setText(Lresultado.getText() + "9");
        AlmacenarValores();
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        Lresultado.setText(Lresultado.getText() + "0");
        AlmacenarValores();
    }//GEN-LAST:event_B0ActionPerformed

    private void BdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivisionActionPerformed
        CambioEstado = true;
        operador = "/";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);
    }//GEN-LAST:event_BdivisionActionPerformed

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdotActionPerformed
        if (!Lresultado.getText().contains(".")) {
        Lresultado.setText(Lresultado.getText() + ".");
    }
    }//GEN-LAST:event_BdotActionPerformed

    private void BelevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelevadoActionPerformed
       	CambioEstado = true;
        operador = "^";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador); 
    }//GEN-LAST:event_BelevadoActionPerformed

    private void BretrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BretrocesoActionPerformed
        String currentValue = Lresultado.getText();
        if (currentValue.equals("")) {
        return;
}
        String newValue = currentValue.substring(0, currentValue.length() - 1);
        Lresultado.setText(newValue);
    }//GEN-LAST:event_BretrocesoActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {
        Lresultado.setText(Lresultado.getText() + "1");
        AlmacenarValores();
    }

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {
        Lresultado.setText(Lresultado.getText() + "2");
        AlmacenarValores();
    }

    private void BCEActionPerformed(java.awt.event.ActionEvent evt) {
        Lresultado.setText("");
        Lresultado2.setText("");
        valor1 = 0;
        valor2 = 0;
        CambioEstado = false;
    }

    private void BplusActionPerformed(java.awt.event.ActionEvent evt) {
        CambioEstado = true;
        operador = "+";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);
    }

    private void BminusActionPerformed(java.awt.event.ActionEvent evt) {
        CambioEstado = true;
        operador = "-";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);
    }

    private void BigualActionPerformed(java.awt.event.ActionEvent evt) {
        float total = 0;
        valor2 = Float.parseFloat(Lresultado.getText());
        switch (operador) {
            case "+":
                total = (valor1 + valor2);
                break;
            case "-":
                total = valor1 - valor2;
                break;
            case "x":
                total = valor1 * valor2;
                break;
            case "/":
                total = valor1 / valor2;
                break;
            case "^": 
            total = (float) Math.pow(valor1, valor2);
            break;    
        }
        Lresultado2.setText(formatearFloat(valor1) + " " + operador + " " + formatearFloat(valor2) + " =");
        Lresultado.setText(formatearFloat(total));
        valor1 = total;
        valor2 = 0;
    }

    private void BmultiActionPerformed(java.awt.event.ActionEvent evt) {
        CambioEstado = true;
        operador = "x";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);
    }

    private void AlmacenarValores() {
        if (CambioEstado == false) {
            valor1 = Float.parseFloat(Lresultado.getText());
        } else {
            valor2 = Float.parseFloat(Lresultado.getText());
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BCE;
    private javax.swing.JButton Bdivision;
    private javax.swing.JButton Bdot;
    private javax.swing.JButton Belevado;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bminus;
    private javax.swing.JButton Bmulti;
    private javax.swing.JButton Bplus;
    private javax.swing.JButton Bretroceso;
    private javax.swing.JLabel Lprincipal;
    private javax.swing.JLabel Lresultado;
    private javax.swing.JLabel Lresultado2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
