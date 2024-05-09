
package presentacion;

import datos.DatosEnvio;
import datos.DatosCli;
import javax.swing.JOptionPane;

public class CrearEnvio extends javax.swing.JFrame {

    public CrearCliente() {
        initComponents();
        inhabilitar();
        
        this.setLocationRelativeTo(null);
    }
    
    private String accion = "guardar";
    
    void inhabilitar() {
        txtidCliente.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new presentacion.PanelRound();
        txtidCliente = new javax.swing.JTextField();
        jTextLabel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jTextLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jTextLabel3 = new javax.swing.JLabel();
        jTextLabel4 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        jTextLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jTextLabel6 = new javax.swing.JLabel();
        jTextLabel7 = new javax.swing.JLabel();
        jTextLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jTextLabel9 = new javax.swing.JLabel();
        txtTelefonoAdicional = new javax.swing.JTextField();
        jTextLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        txtApellido1 = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextLabel11 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        usuarioLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(218, 218, 218));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        txtidCliente.setBorder(null);

        jTextLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel.setText("Fecha");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jTextLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel2.setText("Hora");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jTextLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel3.setText("Ciudad de origen");

        jTextLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel4.setText("Ciudad destino");

        txtNumeroDocumento.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel5.setText("Peso");

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel6.setText("Dimensiones");

        jTextLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel7.setText("Estado");

        jTextLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel8.setText("Precio");

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel9.setText("Tipo de envío");

        txtTelefonoAdicional.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel10.setText("Cliente");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        botonGuardar.setBackground(new java.awt.Color(76, 76, 143));
        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.setBorderPainted(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.setFocusable(false);
        botonGuardar.setMargin(new java.awt.Insets(8, 14, 8, 14));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(76, 76, 143));
        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.setMargin(new java.awt.Insets(8, 14, 8, 14));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        txtApellido1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        txtDireccion1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente" }));

        jTextLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextLabel11.setText("Transportista");

        txtEmail1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelar)
                        .addGap(59, 59, 59))))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jTextLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jTextLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jTextLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefonoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jTextLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextLabel)
                                            .addComponent(jTextLabel2))
                                        .addGap(120, 120, 120))
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(jTextLabel3)
                                        .addGap(44, 44, 44)))
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextLabel6)
                                    .addComponent(jTextLabel5)
                                    .addComponent(jTextLabel4)
                                    .addComponent(jTextLabel7))
                                .addGap(60, 60, 60)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(txtDireccion1)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(257, 257, 257))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextLabel)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextLabel3)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel4))
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextLabel9)
                    .addComponent(txtTelefonoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nuevo envío");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(729, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 900, 610));

        jPanel2.setBackground(new java.awt.Color(76, 76, 143));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/logo_blanco.jpg"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(76, 76, 143));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clientes");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);

        jButton2.setBackground(new java.awt.Color(76, 76, 143));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Destinatarios");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);

        jButton3.setBackground(new java.awt.Color(76, 76, 143));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Envios");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);

        jButton4.setBackground(new java.awt.Color(76, 76, 143));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Empleados");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);

        jButton5.setBackground(new java.awt.Color(76, 76, 143));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/iconos/settings.png"))); // NOI18N
        jButton5.setText("Ajustes");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(27, 27, 27))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 660));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        usuarioLog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/iconos/user.png"))); // NOI18N
        usuarioLog.setText("Administrador");
        usuarioLog.setToolTipText("");
        usuarioLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarioLog.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuarioLog)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(usuarioLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 900, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (txtNombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar el nombre del cliente");
            txtNombre.requestFocus();
            return;
        }
        
        if (txtApellido.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar el apellido del cliente");
            txtApellido.requestFocus();
            return;
        }
        
        if (txtNumeroDocumento.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar número de documento del cliente");
            txtNumeroDocumento.requestFocus();
            return;
        }
        
        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar la dirección del cliente");
            txtDireccion.requestFocus();
            return;
        }
        
        if (txtCiudad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar la ciudad del cliente");
            txtCiudad.requestFocus();
            return;
        }
        
        if (txtTelefono.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar el teléfono del cliente");
            txtTelefono.requestFocus();
            return;
        }
        

        DatosCliente dts = new DatosCliente();
        Cliente function = new Cliente();

        dts.setNombre(txtNombre.getText());
        dts.setApellido(txtApellido.getText());

        int seleccionado = tipoDocumento.getSelectedIndex();
        dts.setTipoDocumento((String) tipoDocumento.getItemAt(seleccionado));
        
        dts.setNumDocumento(txtNumeroDocumento.getText());
        dts.setDireccion(txtDireccion.getText());
        
        seleccionado = departamento.getSelectedIndex();
        dts.setDepartamento((String) departamento.getItemAt(seleccionado));
        
        dts.setCiudad(txtCiudad.getText());
        dts.setTelefono(txtTelefono.getText());
        dts.setTelefonoAdicional(txtTelefonoAdicional.getText());
        dts.setEmail(txtEmail.getText());
        
        if (accion.equals("guardar")) {
            if (function.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "¡El cliente fue registrado con éxito!");

            }
        }
        
        else if (accion.equals("editar")) {
            dts.setIdCliente(Integer.parseInt(txtidCliente.getText()));

            if (function.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "¡El cliente fue editado con éxito");
            }
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        this.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTextLabel;
    private javax.swing.JLabel jTextLabel10;
    private javax.swing.JLabel jTextLabel11;
    private javax.swing.JLabel jTextLabel2;
    private javax.swing.JLabel jTextLabel3;
    private javax.swing.JLabel jTextLabel4;
    private javax.swing.JLabel jTextLabel5;
    private javax.swing.JLabel jTextLabel6;
    private javax.swing.JLabel jTextLabel7;
    private javax.swing.JLabel jTextLabel8;
    private javax.swing.JLabel jTextLabel9;
    private presentacion.PanelRound panelRound1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoAdicional;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JLabel usuarioLog;
    // End of variables declaration//GEN-END:variables
}
