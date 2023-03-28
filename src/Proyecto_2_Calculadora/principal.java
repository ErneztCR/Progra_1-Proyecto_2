package Proyecto_2_Calculadora;

import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    String operador = "";
    boolean CambioEstado = false;
    float valor1 = 0, valor2 = 0;

    public principal() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDisplay = new javax.swing.JPanel();
        Lresultado = new javax.swing.JLabel();
        Lresultado2 = new javax.swing.JLabel();
        Lprincipal = new javax.swing.JLabel();
        PanelBotonera = new javax.swing.JPanel();
        BCE = new javax.swing.JButton();
        Bretroceso = new javax.swing.JButton();
        Bdot = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        Bplus = new javax.swing.JButton();
        Bminus = new javax.swing.JButton();
        Bmulti = new javax.swing.JButton();
        Bdivision = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        Braiz = new javax.swing.JButton();
        Bpi = new javax.swing.JButton();
        Belevado2 = new javax.swing.JButton();
        Belevado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(622, 559));
        getContentPane().setLayout(null);

        PanelDisplay.setBackground(new java.awt.Color(0, 0, 0));

        Lresultado.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        Lresultado.setForeground(new java.awt.Color(0, 255, 0));
        Lresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Lresultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lresultado2.setForeground(new java.awt.Color(0, 153, 0));
        Lresultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PanelDisplayLayout = new javax.swing.GroupLayout(PanelDisplay);
        PanelDisplay.setLayout(PanelDisplayLayout);
        PanelDisplayLayout.setHorizontalGroup(
            PanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lresultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(Lresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelDisplayLayout.setVerticalGroup(
            PanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDisplayLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(Lresultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelDisplay);
        PanelDisplay.setBounds(80, 20, 400, 90);
        getContentPane().add(Lprincipal);
        Lprincipal.setBounds(10, 0, 630, 0);

        PanelBotonera.setLayout(null);

        BCE.setBackground(new java.awt.Color(204, 0, 51));
        BCE.setFont(new java.awt.Font("Stencil", 0, 33)); // NOI18N
        BCE.setText("CE");
        BCE.setAutoscrolls(true);
        BCE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCEActionPerformed(evt);
            }
        });
        PanelBotonera.add(BCE);
        BCE.setBounds(0, 0, 240, 80);

        Bretroceso.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Bretroceso.setForeground(new java.awt.Color(51, 51, 51));
        Bretroceso.setText("←");
        Bretroceso.setAutoscrolls(true);
        Bretroceso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bretroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BretrocesoActionPerformed(evt);
            }
        });
        PanelBotonera.add(Bretroceso);
        Bretroceso.setBounds(160, 320, 80, 80);

        Bdot.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bdot.setForeground(new java.awt.Color(51, 51, 51));
        Bdot.setText(".");
        Bdot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdotActionPerformed(evt);
            }
        });
        PanelBotonera.add(Bdot);
        Bdot.setBounds(0, 320, 80, 80);

        B7.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B7.setForeground(new java.awt.Color(51, 51, 51));
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B7);
        B7.setBounds(0, 80, 80, 80);

        B8.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B8.setForeground(new java.awt.Color(51, 51, 51));
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B8);
        B8.setBounds(80, 80, 80, 80);

        B9.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B9.setForeground(new java.awt.Color(51, 51, 51));
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B9);
        B9.setBounds(160, 80, 80, 80);

        B4.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B4.setForeground(new java.awt.Color(51, 51, 51));
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B4);
        B4.setBounds(0, 160, 80, 80);

        B5.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B5.setForeground(new java.awt.Color(51, 51, 51));
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B5);
        B5.setBounds(80, 160, 80, 80);

        B6.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B6.setForeground(new java.awt.Color(51, 51, 51));
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B6);
        B6.setBounds(160, 160, 80, 80);

        B1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B1.setForeground(new java.awt.Color(51, 51, 51));
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B1);
        B1.setBounds(0, 240, 80, 80);

        B2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B2.setForeground(new java.awt.Color(51, 51, 51));
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B2);
        B2.setBounds(80, 240, 80, 80);

        B3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B3.setForeground(new java.awt.Color(51, 51, 51));
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B3);
        B3.setBounds(160, 240, 80, 80);

        B0.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        B0.setForeground(new java.awt.Color(51, 51, 51));
        B0.setText("0");
        B0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        PanelBotonera.add(B0);
        B0.setBounds(80, 320, 80, 80);

        getContentPane().add(PanelBotonera);
        PanelBotonera.setBounds(80, 130, 240, 400);

        jPanel1.setLayout(null);

        Bplus.setBackground(new java.awt.Color(204, 204, 204));
        Bplus.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bplus.setText("+");
        Bplus.setAutoscrolls(true);
        Bplus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BplusActionPerformed(evt);
            }
        });
        jPanel1.add(Bplus);
        Bplus.setBounds(0, 0, 80, 80);

        Bminus.setBackground(new java.awt.Color(204, 204, 204));
        Bminus.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bminus.setText("-");
        Bminus.setAutoscrolls(true);
        Bminus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminusActionPerformed(evt);
            }
        });
        jPanel1.add(Bminus);
        Bminus.setBounds(0, 80, 80, 80);

        Bmulti.setBackground(new java.awt.Color(204, 204, 204));
        Bmulti.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bmulti.setText("x");
        Bmulti.setAutoscrolls(true);
        Bmulti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiActionPerformed(evt);
            }
        });
        jPanel1.add(Bmulti);
        Bmulti.setBounds(0, 160, 80, 80);

        Bdivision.setBackground(new java.awt.Color(204, 204, 204));
        Bdivision.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bdivision.setText("/");
        Bdivision.setAutoscrolls(true);
        Bdivision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivisionActionPerformed(evt);
            }
        });
        jPanel1.add(Bdivision);
        Bdivision.setBounds(0, 240, 80, 80);

        Bigual.setBackground(new java.awt.Color(0, 153, 0));
        Bigual.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bigual.setText("=");
        Bigual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        jPanel1.add(Bigual);
        Bigual.setBounds(0, 320, 160, 80);

        Braiz.setBackground(new java.awt.Color(204, 204, 204));
        Braiz.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Braiz.setText("\t√");
        Braiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Braiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BraizActionPerformed(evt);
            }
        });
        jPanel1.add(Braiz);
        Braiz.setBounds(80, 0, 80, 80);

        Bpi.setBackground(new java.awt.Color(204, 204, 204));
        Bpi.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Bpi.setText("π");
        Bpi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpiActionPerformed(evt);
            }
        });
        jPanel1.add(Bpi);
        Bpi.setBounds(80, 80, 80, 80);

        Belevado2.setBackground(new java.awt.Color(204, 204, 204));
        Belevado2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Belevado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto_2_Calculadora/Pictures/Xala2.png"))); // NOI18N
        Belevado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Belevado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Belevado2ActionPerformed(evt);
            }
        });
        jPanel1.add(Belevado2);
        Belevado2.setBounds(80, 160, 80, 80);

        Belevado.setBackground(new java.awt.Color(204, 204, 204));
        Belevado.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        Belevado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto_2_Calculadora/Pictures/XelevadoaY.png"))); // NOI18N
        Belevado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Belevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelevadoActionPerformed(evt);
            }
        });
        jPanel1.add(Belevado);
        Belevado.setBounds(80, 240, 80, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 130, 160, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String formatearFloat(float numero) {
        if (numero % 1 == 0) {
            return String.format("%.0f", numero);
        } else {
            return String.valueOf(numero);
        }
    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B3ActionPerformed
        Lresultado.setText(Lresultado.getText() + "3");
        AlmacenarValores();
    }// GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B4ActionPerformed
        Lresultado.setText(Lresultado.getText() + "4");
        AlmacenarValores();
    }// GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B5ActionPerformed
        Lresultado.setText(Lresultado.getText() + "5");
        AlmacenarValores();
    }// GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B6ActionPerformed
        Lresultado.setText(Lresultado.getText() + "6");
        AlmacenarValores();
    }// GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B7ActionPerformed
        Lresultado.setText(Lresultado.getText() + "7");
        AlmacenarValores();
    }// GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B8ActionPerformed
        Lresultado.setText(Lresultado.getText() + "8");
        AlmacenarValores();
    }// GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B9ActionPerformed
        Lresultado.setText(Lresultado.getText() + "9");
        AlmacenarValores();
    }// GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B0ActionPerformed
        Lresultado.setText(Lresultado.getText() + "0");
        AlmacenarValores();
    }// GEN-LAST:event_B0ActionPerformed

    private void BdivisionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BdivisionActionPerformed
        CambioEstado = true;
        operador = "/";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);
    }// GEN-LAST:event_BdivisionActionPerformed

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BdotActionPerformed
        if (!Lresultado.getText().contains(".")) {
            Lresultado.setText(Lresultado.getText() + ".");
        }
    }// GEN-LAST:event_BdotActionPerformed

    private void BelevadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BelevadoActionPerformed
        CambioEstado = true;
        operador = "^";
        Lresultado.setText("");
        Lresultado2.setText(formatearFloat(valor1) + " " + operador);

    }// GEN-LAST:event_BelevadoActionPerformed

    private void BretrocesoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BretrocesoActionPerformed
    String currentValue = Lresultado.getText();
    if (currentValue.equals("")) {
        return;
    }
    String newValue = currentValue.substring(0, currentValue.length() - 1);
    Lresultado.setText(newValue);
    if (CambioEstado) {
        CambioEstado = false;
    } else if (operador.equals("")) {
        valor1 = Float.parseFloat(newValue);
    } else {
        valor2 = Float.parseFloat(newValue);
    }

    }// GEN-LAST:event_BretrocesoActionPerformed 

    private void Belevado2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Belevado2ActionPerformed
        CambioEstado = true;
        operador = "^2";
        valor1 = Float.parseFloat(Lresultado.getText());

    }// GEN-LAST:event_Belevado2ActionPerformed

    private void BraizActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BraizActionPerformed
        CambioEstado = true;
        operador = "√";
        float num = Float.parseFloat(Lresultado.getText());
        valor1 = num;
        Lresultado2.setText("√" + formatearFloat(num) + " " + operador);
    }// GEN-LAST:event_BraizActionPerformed

    private void BpiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BpiActionPerformed
        CambioEstado = true;
        operador = "π";
        Lresultado.setText(String.valueOf(Math.PI));
    }// GEN-LAST:event_BpiActionPerformed
    
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
                Elevado eleva = new Elevado(valor1, valor2);
                total = eleva.Eleva();
                break;
            case "^2":
                Elevado2 eleva2 = new Elevado2(valor1, valor2);
                total = eleva2.Eleva2();
                break;
            case "√":
                Raizcuadrada raiz = new Raizcuadrada(valor2);
                total = raiz.Raiz();
                break;
            case "π":
                PI pi = new PI(valor1);
                total = pi.Pi();
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
    private javax.swing.JButton Belevado2;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bminus;
    private javax.swing.JButton Bmulti;
    private javax.swing.JButton Bpi;
    private javax.swing.JButton Bplus;
    private javax.swing.JButton Braiz;
    private javax.swing.JButton Bretroceso;
    private javax.swing.JLabel Lprincipal;
    private javax.swing.JLabel Lresultado;
    private javax.swing.JLabel Lresultado2;
    private javax.swing.JPanel PanelBotonera;
    private javax.swing.JPanel PanelDisplay;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
