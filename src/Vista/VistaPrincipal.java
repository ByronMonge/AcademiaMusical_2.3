package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    public JButton getBtnAdministrador() {
        return btnAdministrador;
    }

    public void setBtnAdministrador(JButton btnAdministrador) {
        this.btnAdministrador = btnAdministrador;
    }

    public JButton getBtnAsignarAsignatura() {
        return btnAsignarAsignatura;
    }

    public void setBtnAsignarAsignatura(JButton btnAsignarAsignatura) {
        this.btnAsignarAsignatura = btnAsignarAsignatura;
    }

    public JButton getBtnAsignatura() {
        return btnAsignatura;
    }

    public void setBtnAsignatura(JButton btnAsignatura) {
        this.btnAsignatura = btnAsignatura;
    }

    public JButton getBtnAula() {
        return btnAula;
    }

    public void setBtnAula(JButton btnAula) {
        this.btnAula = btnAula;
    }

    public JButton getBtnDirigir() {
        return btnDirigir;
    }

    public void setBtnDirigir(JButton btnDirigir) {
        this.btnDirigir = btnDirigir;
    }

    public JButton getBtnCurso() {
        return btnCurso;
    }

    public void setBtnCurso(JButton btnCurso) {
        this.btnCurso = btnCurso;
    }

    public JButton getBtnDashboard() {
        return btnDashboard;
    }

    public void setBtnDashboard(JButton btnDashboard) {
        this.btnDashboard = btnDashboard;
    }

    public JButton getBtnDocente() {
        return btnDocente;
    }

    public void setBtnDocente(JButton btnDocente) {
        this.btnDocente = btnDocente;
    }

    public JButton getBtnEstudiante() {
        return btnEstudiante;
    }

    public void setBtnEstudiante(JButton btnEstudiante) {
        this.btnEstudiante = btnEstudiante;
    }

    public JButton getBtnProductor() {
        return btnProductor;
    }

    public void setBtnProductor(JButton btnProductor) {
        this.btnProductor = btnProductor;
    }

    public JButton getBtnRegistrarPersona() {
        return btnRegistrarPersona;
    }

    public void setBtnRegistrarPersona(JButton btnRegistrarPersona) {
        this.btnRegistrarPersona = btnRegistrarPersona;
    }

    public JDesktopPane getEscritorioPrincipal() {
        return escritorioPrincipal;
    }

    public void setEscritorioPrincipal(JDesktopPane escritorioPrincipal) {
        this.escritorioPrincipal = escritorioPrincipal;
    }

    public JButton getBtnInstrumento() {
        return btnInstrumento;
    }

    public void setBtnInstrumento(JButton btnInstrumento) {
        this.btnInstrumento = btnInstrumento;
    }

    public JButton getBtnSetGrab() {
        return btnSetGrab;
    }

    public void setBtnSetGrab(JButton btnSetGrab) {
        this.btnSetGrab = btnSetGrab;
    }

    public JButton getBtnHorario() {
        return btnHorario;
    }

    public void setBtnHorario(JButton btnHorario) {
        this.btnHorario = btnHorario;
    }

    public JButton getBtnMatricula() {
        return btnMatricula;
    }

    public void setBtnMatricula(JButton btnMatricula) {
        this.btnMatricula = btnMatricula;
    }

    public JButton getBtnAsiHorario() {
        return btnAsiHorario;
    }

    public void setBtnAsiHorario(JButton btnAsiHorario) {
        this.btnAsiHorario = btnAsiHorario;
    }

    public JButton getBtnReserva() {
        return btnReserva;
    }

    public void setBtnReserva(JButton btnReserva) {
        this.btnReserva = btnReserva;
    }

    public JButton getBtnAsignarAula() {
        return btnAsignarAula;
    }

    public void setBtnAsignarAula(JButton btnAsignarAula) {
        this.btnAsignarAula = btnAsignarAula;
    }

    public JLabel getLblUsuario() {
        return jLabel2;
    }

    public void setLblUsuario(JLabel lblUsuario) {
        this.jLabel2 = lblUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHorario = new javax.swing.JButton();
        btnAsiHorario = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnDirigir = new javax.swing.JButton();
        btnAsignarAula = new javax.swing.JButton();
        escritorioPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPersona = new javax.swing.JButton();
        btnDocente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        btnAsignatura = new javax.swing.JButton();
        btnProductor = new javax.swing.JButton();
        btnAsignarAsignatura = new javax.swing.JButton();
        btnAula = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        btnInstrumento = new javax.swing.JButton();
        btnSetGrab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nota-musical.png"))); // NOI18N
        jLabel1.setText("Academia Musical Rednote ");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, -1));

        btnHorario.setBackground(new java.awt.Color(46, 49, 49));
        btnHorario.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        btnHorario.setText("Horario");
        btnHorario.setBorder(null);
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        btnAsiHorario.setBackground(new java.awt.Color(46, 49, 49));
        btnAsiHorario.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsiHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnAsiHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnAsiHorario.setText("Asignar Horario");
        btnAsiHorario.setBorder(null);
        btnAsiHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnAsiHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        btnMatricula.setBackground(new java.awt.Color(46, 49, 49));
        btnMatricula.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matricula.png"))); // NOI18N
        btnMatricula.setText("Matricula");
        btnMatricula.setBorder(null);
        btnMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        btnReserva.setBackground(new java.awt.Color(46, 49, 49));
        btnReserva.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reservaa.png"))); // NOI18N
        btnReserva.setText("Reservaciones");
        btnReserva.setBorder(null);
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        btnDirigir.setBackground(new java.awt.Color(46, 49, 49));
        btnDirigir.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnDirigir.setForeground(new java.awt.Color(255, 255, 255));
        btnDirigir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnDirigir.setText("Dirigir");
        btnDirigir.setBorder(null);
        btnDirigir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnDirigir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));

        btnAsignarAula.setBackground(new java.awt.Color(46, 49, 49));
        btnAsignarAula.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsignarAula.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aula_1.png"))); // NOI18N
        btnAsignarAula.setText("Asignar Aula");
        btnAsignarAula.setBorder(null);
        btnAsignarAula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnAsignarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, -1));

        escritorioPrincipal.setAutoscrolls(true);

        javax.swing.GroupLayout escritorioPrincipalLayout = new javax.swing.GroupLayout(escritorioPrincipal);
        escritorioPrincipal.setLayout(escritorioPrincipalLayout);
        escritorioPrincipalLayout.setHorizontalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioPrincipalLayout.setVerticalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(46, 49, 49));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersona.setBackground(new java.awt.Color(46, 49, 49));
        btnRegistrarPersona.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnRegistrarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroo.png"))); // NOI18N
        btnRegistrarPersona.setText("Registrar Persona");
        btnRegistrarPersona.setBorder(null);
        btnRegistrarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRegistrarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 239, -1, -1));

        btnDocente.setBackground(new java.awt.Color(46, 49, 49));
        btnDocente.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnDocente.setText("Docente");
        btnDocente.setBorder(null);
        btnDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 312, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuariogrande.png"))); // NOI18N
        jLabel2.setText("USUARIO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 26, 76, 120));

        btnDashboard.setBackground(new java.awt.Color(46, 49, 49));
        btnDashboard.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        btnDashboard.setText("DASHBOARD");
        btnDashboard.setBorder(null);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 174, -1, -1));

        btnCurso.setBackground(new java.awt.Color(46, 49, 49));
        btnCurso.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diploma (1).png"))); // NOI18N
        btnCurso.setText("Curso");
        btnCurso.setBorder(null);
        btnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 375, -1, -1));

        btnEstudiante.setBackground(new java.awt.Color(46, 49, 49));
        btnEstudiante.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduado_1.png"))); // NOI18N
        btnEstudiante.setText("Estudiante");
        btnEstudiante.setBorder(null);
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 449, -1, -1));

        btnAsignatura.setBackground(new java.awt.Color(46, 49, 49));
        btnAsignatura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        btnAsignatura.setText("Asignatura");
        btnAsignatura.setBorder(null);
        btnAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 518, -1, -1));

        btnProductor.setBackground(new java.awt.Color(46, 49, 49));
        btnProductor.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnProductor.setForeground(new java.awt.Color(255, 255, 255));
        btnProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productor.png"))); // NOI18N
        btnProductor.setText("Productor");
        btnProductor.setBorder(null);
        btnProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 569, -1, -1));

        btnAsignarAsignatura.setBackground(new java.awt.Color(46, 49, 49));
        btnAsignarAsignatura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsignarAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignacion.png"))); // NOI18N
        btnAsignarAsignatura.setText("Asignar Asignatura");
        btnAsignarAsignatura.setBorder(null);
        btnAsignarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAsignarAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 631, -1, -1));

        btnAula.setBackground(new java.awt.Color(46, 49, 49));
        btnAula.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAula.setForeground(new java.awt.Color(255, 255, 255));
        btnAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aula_1.png"))); // NOI18N
        btnAula.setText("Aula");
        btnAula.setBorder(null);
        btnAula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 746, -1, -1));

        btnAdministrador.setBackground(new java.awt.Color(46, 49, 49));
        btnAdministrador.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gerente.png"))); // NOI18N
        btnAdministrador.setText("Administrador");
        btnAdministrador.setBorder(null);
        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 695, -1, -1));

        btnInstrumento.setBackground(new java.awt.Color(46, 49, 49));
        btnInstrumento.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        btnInstrumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guitar-icon.png"))); // NOI18N
        btnInstrumento.setText("Instrumento");
        btnInstrumento.setBorder(null);
        btnInstrumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 797, -1, -1));

        btnSetGrab.setBackground(new java.awt.Color(46, 49, 49));
        btnSetGrab.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnSetGrab.setForeground(new java.awt.Color(255, 255, 255));
        btnSetGrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/microfono.png"))); // NOI18N
        btnSetGrab.setText("Set de Grabacion");
        btnSetGrab.setBorder(null);
        btnSetGrab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSetGrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 846, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escritorioPrincipal)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1660, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorioPrincipal))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAsiHorario;
    private javax.swing.JButton btnAsignarAsignatura;
    private javax.swing.JButton btnAsignarAula;
    private javax.swing.JButton btnAsignatura;
    private javax.swing.JButton btnAula;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDirigir;
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnInstrumento;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnProductor;
    private javax.swing.JButton btnRegistrarPersona;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnSetGrab;
    private javax.swing.JDesktopPane escritorioPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
