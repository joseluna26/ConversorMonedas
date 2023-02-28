package conversormonedas;

public class fraConversorMonedas extends javax.swing.JFrame {
    double dolar = 18.43;
    double euro = 19.63;
    double libra = 22.30;
    double yen = 0.14;
    double won = 0.014;
    MuestraResultado muestrares = new MuestraResultado();
    LimpiarCajas limpiarc = new LimpiarCajas();
    double kilometro = 1000;
    double total;
    

    public fraConversorMonedas() {
        initComponents();
        this.setLocationRelativeTo(null);
        ValidaNumeros valida = new ValidaNumeros();
        valida.solonumeros(txtMiMoneda);
        valida.solonumeros(txtTengo);
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblMiMoneda = new javax.swing.JLabel();
        txtMiMoneda = new javax.swing.JTextField();
        lblADivisa = new javax.swing.JLabel();
        cboDivisas = new javax.swing.JComboBox<>();
        cmdConvertir = new javax.swing.JToggleButton();
        lblResultado = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();
        ftxtResultado = new javax.swing.JFormattedTextField();
        panel2 = new javax.swing.JPanel();
        lblTengo = new javax.swing.JLabel();
        txtTengo = new javax.swing.JTextField();
        cboDivisaAPesos = new javax.swing.JComboBox<>();
        cmdConvertirPesos = new javax.swing.JButton();
        cmdLimpiarPesos = new javax.swing.JButton();
        lblResPesos = new javax.swing.JLabel();
        ftxtResultado2 = new javax.swing.JFormattedTextField();
        panel3 = new javax.swing.JPanel();
        txtTemp = new javax.swing.JTextField();
        cboTempDe = new javax.swing.JComboBox<>();
        cboTempA = new javax.swing.JComboBox<>();
        jtxtTempRes = new javax.swing.JFormattedTextField();
        cmdTempConv = new javax.swing.JButton();
        cmdTempLimpiar = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        lblConvDist = new javax.swing.JLabel();
        txtConvDist = new javax.swing.JTextField();
        cboDistDe = new javax.swing.JComboBox<>();
        lblDistA = new javax.swing.JLabel();
        cboDistA = new javax.swing.JComboBox<>();
        lblDistRes = new javax.swing.JLabel();
        cmdDistConv = new javax.swing.JButton();
        lblDistDe = new javax.swing.JLabel();
        cmdDistLimpiar = new javax.swing.JButton();
        ftxtDistConv = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        setResizable(false);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Pesos MX a Divisa Extranjera  "));

        lblMiMoneda.setText("Pesos MX");
        lblMiMoneda.setName("lblMiMoneda"); // NOI18N

        txtMiMoneda.setToolTipText("Moneda Local");
        txtMiMoneda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMiMoneda.setMinimumSize(new java.awt.Dimension(64, 25));
        txtMiMoneda.setName("txtMiMoneda"); // NOI18N
        txtMiMoneda.setPreferredSize(new java.awt.Dimension(64, 25));

        lblADivisa.setText("Convertir A:");
        lblADivisa.setName("lblADivisa"); // NOI18N

        cboDivisas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano" }));
        cboDivisas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboDivisas.setName("cboDivisa"); // NOI18N

        cmdConvertir.setText("Convertir");
        cmdConvertir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdConvertir.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdConvertir.setName("cmdConvertir"); // NOI18N
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado:");

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdLimpiar.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdLimpiar.setPreferredSize(new java.awt.Dimension(79, 23));
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        ftxtResultado.setEditable(false);
        ftxtResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftxtResultado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftxtResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ftxtResultado.setPreferredSize(new java.awt.Dimension(64, 22));
        ftxtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResultado)
                            .addComponent(txtMiMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMiMoneda)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ftxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblADivisa))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblADivisa)
                    .addComponent(lblMiMoneda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtMiMoneda.getAccessibleContext().setAccessibleName("");

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Divisa Extranjera a Pesos MX"));
        panel2.setPreferredSize(new java.awt.Dimension(321, 150));

        lblTengo.setText("Tengo:");

        txtTengo.setToolTipText("Moneda extranjera");
        txtTengo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTengo.setPreferredSize(new java.awt.Dimension(64, 25));

        cboDivisaAPesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano" }));
        cboDivisaAPesos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmdConvertirPesos.setText("Convertir");
        cmdConvertirPesos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdConvertirPesos.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdConvertirPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirPesosActionPerformed(evt);
            }
        });

        cmdLimpiarPesos.setText("Limpiar");
        cmdLimpiarPesos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdLimpiarPesos.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdLimpiarPesos.setPreferredSize(new java.awt.Dimension(79, 23));
        cmdLimpiarPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarPesosActionPerformed(evt);
            }
        });

        lblResPesos.setText("Resultado:");

        ftxtResultado2.setEditable(false);
        ftxtResultado2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftxtResultado2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblTengo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTengo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cboDivisaAPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(cmdConvertirPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLimpiarPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResPesos)
                            .addComponent(ftxtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTengo)
                    .addComponent(txtTengo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDivisaAPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblResPesos)
                        .addGap(43, 43, 43))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmdConvertirPesos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmdLimpiarPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ftxtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Temperatura "));
        panel3.setPreferredSize(new java.awt.Dimension(321, 150));

        txtTemp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cboTempDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        cboTempDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cboTempA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        cboTempA.setSelectedIndex(1);
        cboTempA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtxtTempRes.setEditable(false);
        jtxtTempRes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtTempRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jtxtTempRes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cmdTempConv.setText("Convertir");
        cmdTempConv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdTempConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTempConvActionPerformed(evt);
            }
        });

        cmdTempLimpiar.setText("Limpiar");
        cmdTempLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdTempLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTempLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTempDe, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTempA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jtxtTempRes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdTempConv, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdTempLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTempDe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTempA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTempRes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdTempConv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdTempLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        panel4.setBorder(javax.swing.BorderFactory.createTitledBorder(" Distancia "));
        panel4.setPreferredSize(new java.awt.Dimension(321, 150));

        lblConvDist.setText("Convertir:");

        txtConvDist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtConvDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvDistActionPerformed(evt);
            }
        });

        cboDistDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilómetro", "Metro", "Decímetro", "Centímetro", "Milímetro" }));
        cboDistDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboDistDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDistDeItemStateChanged(evt);
            }
        });
        cboDistDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistDeActionPerformed(evt);
            }
        });

        lblDistA.setText("A:");

        cboDistA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilómetro", "Metro", "Decímetro", "Centímetro", "Milímetro" }));
        cboDistA.setSelectedIndex(1);
        cboDistA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDistRes.setText("Resultado");

        cmdDistConv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdDistConv.setLabel("Convertir");
        cmdDistConv.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdDistConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDistConvActionPerformed(evt);
            }
        });

        lblDistDe.setText("De:");

        cmdDistLimpiar.setText("Limpiar");
        cmdDistLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdDistLimpiar.setMaximumSize(new java.awt.Dimension(100, 100));
        cmdDistLimpiar.setPreferredSize(new java.awt.Dimension(79, 23));
        cmdDistLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDistLimpiarActionPerformed(evt);
            }
        });

        ftxtDistConv.setEditable(false);
        ftxtDistConv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftxtDistConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.#######"))));
        ftxtDistConv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ftxtDistConv.setPreferredSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(lblDistRes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(ftxtDistConv, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdDistConv, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdDistLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConvDist)
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addComponent(lblConvDist)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboDistDe, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDistDe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboDistA, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDistA))))
                        .addGap(22, 22, 22))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConvDist)
                    .addComponent(lblDistA)
                    .addComponent(lblDistDe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvDist, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDistDe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDistA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDistRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(ftxtDistConv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdDistConv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmdDistLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed
        
        total = Double.parseDouble(txtMiMoneda.getText());
        
        switch (cboDivisas.getSelectedIndex())
        {
            case 0 -> total /= dolar;
            case 1 -> total /= euro;
            case 2 -> total /= libra;
            case 3 -> total /= yen;
            default -> total /= won;
        }
        muestrares.muestra(ftxtResultado, total);
        ftxtResultado.requestFocus();
        cmdConvertir.requestFocus();
    }//GEN-LAST:event_cmdConvertirActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        limpiarc.limpiar(panel1);
        txtMiMoneda.requestFocus();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdConvertirPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirPesosActionPerformed
        
        total = Double.parseDouble(txtTengo.getText());
        
        switch (cboDivisaAPesos.getSelectedIndex())
        {
            case 0 -> total *= dolar;
            case 1 -> total *= euro;
            case 2 -> total *= libra;
            case 3 -> total *= yen;
            default -> total *= won;
        }
        muestrares.muestra(ftxtResultado2, total);
        ftxtResultado2.requestFocus();
        cmdConvertirPesos.requestFocus();
    }//GEN-LAST:event_cmdConvertirPesosActionPerformed

    private void cmdLimpiarPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarPesosActionPerformed
        limpiarc.limpiar(panel2);
        txtTengo.requestFocus();
    }//GEN-LAST:event_cmdLimpiarPesosActionPerformed

    private void cboDistDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDistDeActionPerformed

    private void cboDistDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDistDeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDistDeItemStateChanged

    private void txtConvDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvDistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvDistActionPerformed

    private void cmdDistConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDistConvActionPerformed
        
        if(cboDistDe.getSelectedIndex() == 0 && cboDistA.getSelectedIndex() == 0 || cboDistDe.getSelectedIndex() == 1 && cboDistA.getSelectedIndex() == 1  || cboDistDe.getSelectedIndex() == 2 && cboDistA.getSelectedIndex() == 2 || cboDistDe.getSelectedIndex() == 3 && cboDistA.getSelectedIndex() == 3 || cboDistDe.getSelectedIndex() == 4 && cboDistA.getSelectedIndex() == 4){
            total = Double.parseDouble(txtConvDist.getText()) * 1;
        } else if(cboDistDe.getSelectedIndex() == 0 && cboDistA.getSelectedIndex() == 1 || cboDistDe.getSelectedIndex() == 1 && cboDistA.getSelectedIndex() == 4){ // km a m
            total = Double.parseDouble(txtConvDist.getText()) * 1000;
        }else if(cboDistDe.getSelectedIndex() == 0 && cboDistA.getSelectedIndex() == 2){ // km a dm
            total = Double.parseDouble(txtConvDist.getText()) * 10000;
        }else if(cboDistDe.getSelectedIndex() == 0 && cboDistA.getSelectedIndex() == 3){  // km a cm
            total = Double.parseDouble(txtConvDist.getText()) * 100000;
        }else if(cboDistDe.getSelectedIndex() == 0 && cboDistA.getSelectedIndex() == 4){ // km a mm
            total = Double.parseDouble(txtConvDist.getText()) * 1000000;
        }else if(cboDistDe.getSelectedIndex() == 1 && cboDistA.getSelectedIndex() == 0){ // m a km
            total = Double.parseDouble(txtConvDist.getText()) / 1000;
        }else if(cboDistDe.getSelectedIndex() == 1 && cboDistA.getSelectedIndex() == 2){ // m a dm
            total = Double.parseDouble(txtConvDist.getText()) * 10;
        }else if(cboDistDe.getSelectedIndex() == 1 && cboDistA.getSelectedIndex() == 3 || cboDistDe.getSelectedIndex() == 2 && cboDistA.getSelectedIndex() == 4 ){ // m a cm  ;  dm a mm
            total = Double.parseDouble(txtConvDist.getText()) * 100;
        }else if(cboDistDe.getSelectedIndex() == 2 && cboDistA.getSelectedIndex() == 0){ // dc a km
            total = Double.parseDouble(txtConvDist.getText()) / 10000;
        }else if(cboDistDe.getSelectedIndex() == 2 && cboDistA.getSelectedIndex() == 1 || cboDistDe.getSelectedIndex() == 4 && cboDistA.getSelectedIndex() == 3 || cboDistDe.getSelectedIndex() == 3 && cboDistA.getSelectedIndex() == 2){ // dc a m ; mm a cm  ; cm a dm
            total = Double.parseDouble(txtConvDist.getText()) / 10;
        }else if(cboDistDe.getSelectedIndex() == 2 && cboDistA.getSelectedIndex() == 3 || cboDistDe.getSelectedIndex() == 3 && cboDistA.getSelectedIndex() == 4){ // dc a dc  ;  cm a mm
            total = Double.parseDouble(txtConvDist.getText()) * 10;
        }else if(cboDistDe.getSelectedIndex() == 3 && cboDistA.getSelectedIndex() == 0){ // cm a km
            total = Double.parseDouble(txtConvDist.getText()) / 100000;
        }else if(cboDistDe.getSelectedIndex() == 3 && cboDistA.getSelectedIndex() == 1){ // cm a m
            total = Double.parseDouble(txtConvDist.getText()) / 100;
        }else if(cboDistDe.getSelectedIndex() == 4 && cboDistA.getSelectedIndex() == 0){ // mm a km
            total = Double.parseDouble(txtConvDist.getText()) / 1000000;
        }else if(cboDistDe.getSelectedIndex() == 4 && cboDistA.getSelectedIndex() == 1){ // mm a m
            total = Double.parseDouble(txtConvDist.getText()) / 1000;
        }else if(cboDistDe.getSelectedIndex() == 4 && cboDistA.getSelectedIndex() == 2){ // mm a dm
            total = Double.parseDouble(txtConvDist.getText()) / 100;
        }
        
            muestrares.muestra(ftxtDistConv, total);
            ftxtDistConv.requestFocus();// le pongo el foco a la caja formateada
            cmdDistConv.requestFocus(); // le mando el foco al botón para que se vea el formato de la caja formateada
    }//GEN-LAST:event_cmdDistConvActionPerformed
    
    
    private void cmdDistLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDistLimpiarActionPerformed
            limpiarc.limpiar(panel4);
            txtConvDist.requestFocus();
    }//GEN-LAST:event_cmdDistLimpiarActionPerformed

    private void ftxtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtResultadoActionPerformed

    private void cmdTempConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTempConvActionPerformed
        if(cboTempDe.getSelectedIndex() == 0 && cboTempA.getSelectedIndex() == 0 || cboTempDe.getSelectedIndex() == 1 && cboTempA.getSelectedIndex() == 1 || cboTempDe.getSelectedIndex() == 2 && cboTempA.getSelectedIndex() == 2){
            total = Double.parseDouble(txtTemp.getText()) * 1;
        } else if(cboTempDe.getSelectedIndex() == 0 && cboTempA.getSelectedIndex() == 1){
            total = Double.parseDouble(txtTemp.getText()) * 9/5 + 32;
        }else if(cboTempDe.getSelectedIndex() == 0 && cboTempA.getSelectedIndex() == 2){
            total = Double.parseDouble(txtTemp.getText()) + 273.15;
        }else if(cboTempDe.getSelectedIndex() == 1 && cboTempA.getSelectedIndex() == 0){
            total = (Double.parseDouble(txtTemp.getText()) - 32) * 5/9;
        }else if(cboTempDe.getSelectedIndex() == 1 && cboTempA.getSelectedIndex() == 2){
            total = (Double.parseDouble(txtTemp.getText()) - 32) * 5/9 + 273.15;
        }else if(cboTempDe.getSelectedIndex() == 2 && cboTempA.getSelectedIndex() == 0){
            total = Double.parseDouble(txtTemp.getText()) - 273.15;
        }else if(cboTempDe.getSelectedIndex() == 2 && cboTempA.getSelectedIndex() == 1){
            total = (Double.parseDouble(txtTemp.getText()) - 273.15) * 5/9 + 32;
        }
        
        muestrares.muestra(jtxtTempRes, total);
        jtxtTempRes.requestFocus();// le pongo el foco a la caja formateada
        cmdTempConv.requestFocus(); // le mando el foco al botón para que se vea el formato de la caja formateada    
        
    }//GEN-LAST:event_cmdTempConvActionPerformed

    private void cmdTempLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTempLimpiarActionPerformed
            limpiarc.limpiar(panel3);
            txtTemp.requestFocus();
    }//GEN-LAST:event_cmdTempLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDistA;
    private javax.swing.JComboBox<String> cboDistDe;
    private javax.swing.JComboBox<String> cboDivisaAPesos;
    private javax.swing.JComboBox<String> cboDivisas;
    private javax.swing.JComboBox<String> cboTempA;
    private javax.swing.JComboBox<String> cboTempDe;
    private javax.swing.JToggleButton cmdConvertir;
    private javax.swing.JButton cmdConvertirPesos;
    private javax.swing.JButton cmdDistConv;
    private javax.swing.JButton cmdDistLimpiar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLimpiarPesos;
    private javax.swing.JButton cmdTempConv;
    private javax.swing.JButton cmdTempLimpiar;
    private javax.swing.JFormattedTextField ftxtDistConv;
    private javax.swing.JFormattedTextField ftxtResultado;
    private javax.swing.JFormattedTextField ftxtResultado2;
    private javax.swing.JFormattedTextField jtxtTempRes;
    private javax.swing.JLabel lblADivisa;
    private javax.swing.JLabel lblConvDist;
    private javax.swing.JLabel lblDistA;
    private javax.swing.JLabel lblDistDe;
    private javax.swing.JLabel lblDistRes;
    private javax.swing.JLabel lblMiMoneda;
    private javax.swing.JLabel lblResPesos;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTengo;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JTextField txtConvDist;
    private javax.swing.JTextField txtMiMoneda;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtTengo;
    // End of variables declaration//GEN-END:variables
}
