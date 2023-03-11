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

        panelestado = new javax.swing.JPanel();
        reservas = new javax.swing.JLabel();
        estadiantes = new javax.swing.JLabel();
        lblEstudiantes = new javax.swing.JLabel();
        docentes = new javax.swing.JLabel();
        lblDocentes = new javax.swing.JLabel();
        productores1 = new javax.swing.JLabel();
        lblProductores = new javax.swing.JLabel();
        lblReservas = new javax.swing.JLabel();
        instrumentos = new javax.swing.JLabel();
        lblInstrumentos = new javax.swing.JLabel();
        jtxtTituloMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setAutoscrolls(true);
        setFocusable(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        panelestado.setBackground(new java.awt.Color(255, 255, 255));

        reservas.setBackground(new java.awt.Color(102, 255, 204));
        reservas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        reservas.setForeground(new java.awt.Color(255, 255, 255));
        reservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservas.setText("Reservas");
        reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservas.setFocusable(false);
        reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservas.setOpaque(true);

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

        productores1.setBackground(new java.awt.Color(153, 204, 255));
        productores1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productores1.setForeground(new java.awt.Color(255, 255, 255));
        productores1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productores1.setText("Productores");
        productores1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productores1.setFocusable(false);
        productores1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productores1.setOpaque(true);

        lblProductores.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblProductores.setForeground(new java.awt.Color(102, 0, 0));
        lblProductores.setText("0");

        lblReservas.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblReservas.setForeground(new java.awt.Color(102, 0, 0));
        lblReservas.setText("0");

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

        javax.swing.GroupLayout panelestadoLayout = new javax.swing.GroupLayout(panelestado);
        panelestado.setLayout(panelestadoLayout);
        panelestadoLayout.setHorizontalGroup(
            panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelestadoLayout.createSequentialGroup()
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblEstudiantes)
                        .addGap(209, 209, 209)
                        .addComponent(lblDocentes))
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(estadiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(productores1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelestadoLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblProductores)
                        .addGap(253, 253, 253)
                        .addComponent(lblReservas)
                        .addGap(203, 203, 203)
                        .addComponent(lblInstrumentos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelestadoLayout.setVerticalGroup(
            panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productores1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProductores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtxtTituloMenu.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(155, 12, 27));
        jtxtTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        jtxtTituloMenu.setText("  Dashboard");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instru.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(panelestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel docentes;
    private javax.swing.JLabel estadiantes;
    private javax.swing.JLabel instrumentos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JLabel lblDocentes;
    private javax.swing.JLabel lblEstudiantes;
    private javax.swing.JLabel lblInstrumentos;
    private javax.swing.JLabel lblProductores;
    private javax.swing.JLabel lblReservas;
    private javax.swing.JPanel panelestado;
    private javax.swing.JLabel productores1;
    private javax.swing.JLabel reservas;
    // End of variables declaration//GEN-END:variables
}
