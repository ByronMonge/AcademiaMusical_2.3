package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        escritorioPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHorario = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);

        jPanel1.setBackground(new java.awt.Color(46, 49, 49));
        jPanel1.setAutoscrolls(true);

        btnRegistrarPersona.setBackground(new java.awt.Color(46, 49, 49));
        btnRegistrarPersona.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnRegistrarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroo.png"))); // NOI18N
        btnRegistrarPersona.setText("Registrar Persona");
        btnRegistrarPersona.setBorder(null);
        btnRegistrarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDocente.setBackground(new java.awt.Color(46, 49, 49));
        btnDocente.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnDocente.setText("Docente");
        btnDocente.setBorder(null);
        btnDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuariogrande.png"))); // NOI18N
        jLabel2.setText("USUARIO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnDashboard.setBackground(new java.awt.Color(46, 49, 49));
        btnDashboard.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        btnDashboard.setText("DASHBOARD");
        btnDashboard.setBorder(null);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCurso.setBackground(new java.awt.Color(46, 49, 49));
        btnCurso.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diploma (1).png"))); // NOI18N
        btnCurso.setText("Curso");
        btnCurso.setBorder(null);
        btnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEstudiante.setBackground(new java.awt.Color(46, 49, 49));
        btnEstudiante.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduado_1.png"))); // NOI18N
        btnEstudiante.setText("Estudiante");
        btnEstudiante.setBorder(null);
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAsignatura.setBackground(new java.awt.Color(46, 49, 49));
        btnAsignatura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        btnAsignatura.setText("Asignatura");
        btnAsignatura.setBorder(null);
        btnAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProductor.setBackground(new java.awt.Color(46, 49, 49));
        btnProductor.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnProductor.setForeground(new java.awt.Color(255, 255, 255));
        btnProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productor.png"))); // NOI18N
        btnProductor.setText("Productor");
        btnProductor.setBorder(null);
        btnProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAsignarAsignatura.setBackground(new java.awt.Color(46, 49, 49));
        btnAsignarAsignatura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAsignarAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignacion.png"))); // NOI18N
        btnAsignarAsignatura.setText("Asignar Asignatura");
        btnAsignarAsignatura.setBorder(null);
        btnAsignarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAula.setBackground(new java.awt.Color(46, 49, 49));
        btnAula.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAula.setForeground(new java.awt.Color(255, 255, 255));
        btnAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aula_1.png"))); // NOI18N
        btnAula.setText("Aula");
        btnAula.setBorder(null);
        btnAula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdministrador.setBackground(new java.awt.Color(46, 49, 49));
        btnAdministrador.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gerente.png"))); // NOI18N
        btnAdministrador.setText("Administrador");
        btnAdministrador.setBorder(null);
        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnInstrumento.setBackground(new java.awt.Color(46, 49, 49));
        btnInstrumento.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        btnInstrumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guitar-icon.png"))); // NOI18N
        btnInstrumento.setText("Instrumento");
        btnInstrumento.setBorder(null);
        btnInstrumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSetGrab.setBackground(new java.awt.Color(46, 49, 49));
        btnSetGrab.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnSetGrab.setForeground(new java.awt.Color(255, 255, 255));
        btnSetGrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/microfono.png"))); // NOI18N
        btnSetGrab.setText("Set de Grabacion");
        btnSetGrab.setBorder(null);
        btnSetGrab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSetGrab)
                    .addComponent(btnInstrumento)
                    .addComponent(btnAdministrador)
                    .addComponent(btnAula)
                    .addComponent(btnAsignarAsignatura)
                    .addComponent(btnProductor)
                    .addComponent(btnAsignatura)
                    .addComponent(btnEstudiante)
                    .addComponent(btnCurso)
                    .addComponent(btnDashboard)
                    .addComponent(btnRegistrarPersona)
                    .addComponent(btnDocente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDashboard)
                .addGap(34, 34, 34)
                .addComponent(btnRegistrarPersona)
                .addGap(42, 42, 42)
                .addComponent(btnDocente)
                .addGap(38, 38, 38)
                .addComponent(btnCurso)
                .addGap(41, 41, 41)
                .addComponent(btnEstudiante)
                .addGap(36, 36, 36)
                .addComponent(btnAsignatura)
                .addGap(18, 18, 18)
                .addComponent(btnProductor)
                .addGap(29, 29, 29)
                .addComponent(btnAsignarAsignatura)
                .addGap(31, 31, 31)
                .addComponent(btnAdministrador)
                .addGap(18, 18, 18)
                .addComponent(btnAula)
                .addGap(18, 18, 18)
                .addComponent(btnInstrumento)
                .addGap(18, 18, 18)
                .addComponent(btnSetGrab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setFocusable(false);

        escritorioPrincipal.setAutoscrolls(true);

        javax.swing.GroupLayout escritorioPrincipalLayout = new javax.swing.GroupLayout(escritorioPrincipal);
        escritorioPrincipal.setLayout(escritorioPrincipalLayout);
        escritorioPrincipalLayout.setHorizontalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1476, Short.MAX_VALUE)
        );
        escritorioPrincipalLayout.setVerticalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        btnHorario.setText("Horario");
        btnHorario.setBorder(null);
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        btnMatricula.setBackground(new java.awt.Color(46, 49, 49));
        btnMatricula.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnMatricula.setText("Matricula");
        btnMatricula.setBorder(null);
        btnMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioPrincipal)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorioPrincipal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAsignarAsignatura;
    private javax.swing.JButton btnAsignatura;
    private javax.swing.JButton btnAula;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnInstrumento;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnProductor;
    private javax.swing.JButton btnRegistrarPersona;
    private javax.swing.JButton btnSetGrab;
    private javax.swing.JDesktopPane escritorioPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
