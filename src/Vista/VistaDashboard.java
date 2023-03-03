package Vista;

import javax.swing.JLabel;

public class VistaDashboard extends javax.swing.JInternalFrame {

    public VistaDashboard() {
        initComponents();
    }

    public JLabel getLblDocentes() {
        return lblDocentes;
    }

    public void setLblDocentes(JLabel lblDocentes) {
        this.lblDocentes = lblDocentes;
    }

    public JLabel getLblEstudiantes() {
        return lblEstudiantes;
    }

    public void setLblEstudiantes(JLabel lblEstudiantes) {
        this.lblEstudiantes = lblEstudiantes;
    }

    public JLabel getLblInstrumentos() {
        return lblInstrumentos;
    }

    public void setLblInstrumentos(JLabel lblInstrumentos) {
        this.lblInstrumentos = lblInstrumentos;
    }

    public JLabel getLblProductores() {
        return lblProductores;
    }

    public void setLblProductores(JLabel lblProductores) {
        this.lblProductores = lblProductores;
    }

    public JLabel getLblReservas() {
        return lblReservas;
    }

    public void setLblReservas(JLabel lblReservas) {
        this.lblReservas = lblReservas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDash = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelestado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        estadiantes = new javax.swing.JLabel();
        lblEstudiantes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        docentes = new javax.swing.JLabel();
        lblDocentes = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        reservas = new javax.swing.JLabel();
        lblReservas = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        instrumentos = new javax.swing.JLabel();
        lblInstrumentos = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        productores = new javax.swing.JLabel();
        lblProductores = new javax.swing.JLabel();
        jtxtTituloMenu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(null);
        setResizable(true);
        setAutoscrolls(true);
        setFocusable(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        PanelDash.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instru.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, 1040, 290));

        panelestado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Estado");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        estadiantes.setBackground(new java.awt.Color(197, 168, 255));
        estadiantes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        estadiantes.setForeground(new java.awt.Color(255, 255, 255));
        estadiantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadiantes.setText("Estudiantes");
        estadiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estadiantes.setFocusable(false);
        estadiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estadiantes.setOpaque(true);

        lblEstudiantes.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblEstudiantes.setForeground(new java.awt.Color(102, 0, 0));
        lblEstudiantes.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblEstudiantes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(estadiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(estadiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        docentes.setBackground(new java.awt.Color(153, 255, 153));
        docentes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        docentes.setForeground(new java.awt.Color(255, 255, 255));
        docentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docentes.setText("Profesores");
        docentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        docentes.setFocusable(false);
        docentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        docentes.setOpaque(true);

        lblDocentes.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblDocentes.setForeground(new java.awt.Color(102, 0, 0));
        lblDocentes.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(docentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblDocentes)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        reservas.setBackground(new java.awt.Color(102, 255, 204));
        reservas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        reservas.setForeground(new java.awt.Color(255, 255, 255));
        reservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservas.setText("Reservas");
        reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservas.setFocusable(false);
        reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservas.setOpaque(true);

        lblReservas.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblReservas.setForeground(new java.awt.Color(102, 0, 0));
        lblReservas.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblReservas)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        instrumentos.setBackground(new java.awt.Color(255, 153, 153));
        instrumentos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        instrumentos.setForeground(new java.awt.Color(255, 255, 255));
        instrumentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instrumentos.setText("Instrumentos");
        instrumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        instrumentos.setFocusable(false);
        instrumentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        instrumentos.setOpaque(true);

        lblInstrumentos.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblInstrumentos.setForeground(new java.awt.Color(102, 0, 0));
        lblInstrumentos.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(lblInstrumentos)
                .addGap(68, 68, 68))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        productores.setBackground(new java.awt.Color(153, 204, 255));
        productores.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productores.setForeground(new java.awt.Color(255, 255, 255));
        productores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productores.setText("Productores");
        productores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productores.setFocusable(false);
        productores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productores.setOpaque(true);

        lblProductores.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblProductores.setForeground(new java.awt.Color(102, 0, 0));
        lblProductores.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblProductores)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(productores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProductores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelestadoLayout = new javax.swing.GroupLayout(panelestado);
        panelestado.setLayout(panelestadoLayout);
        panelestadoLayout.setHorizontalGroup(
            panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        panelestadoLayout.setVerticalGroup(
            panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelestadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jtxtTituloMenu.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(155, 12, 27));
        jtxtTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        jtxtTituloMenu.setText("  Dashboard");

        javax.swing.GroupLayout PanelDashLayout = new javax.swing.GroupLayout(PanelDash);
        PanelDash.setLayout(PanelDashLayout);
        PanelDashLayout.setHorizontalGroup(
            PanelDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(panelestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDashLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDashLayout.setVerticalGroup(
            PanelDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDashLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDash;
    private javax.swing.JLabel docentes;
    private javax.swing.JLabel estadiantes;
    private javax.swing.JLabel instrumentos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JLabel lblDocentes;
    private javax.swing.JLabel lblEstudiantes;
    private javax.swing.JLabel lblInstrumentos;
    private javax.swing.JLabel lblProductores;
    private javax.swing.JLabel lblReservas;
    private javax.swing.JPanel panelestado;
    private javax.swing.JLabel productores;
    private javax.swing.JLabel reservas;
    // End of variables declaration//GEN-END:variables
}
