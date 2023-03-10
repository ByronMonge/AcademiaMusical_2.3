package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaMatricula extends javax.swing.JInternalFrame {

    public VistaMatricula() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnCargarCur() {
        return btnCargarCur;
    }

    public void setBtnCargarCur(JButton btnCargarCur) {
        this.btnCargarCur = btnCargarCur;
    }

    public JButton getBtnCargarEst() {
        return btnCargarEst;
    }

    public void setBtnCargarEst(JButton btnCargarEst) {
        this.btnCargarEst = btnCargarEst;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnMatricular() {
        return btnMatricular;
    }

    public void setBtnMatricular(JButton btnMatricular) {
        this.btnMatricular = btnMatricular;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JDialog getjDlgBuscarCurso() {
        return jDlgBuscarCurso;
    }

    public void setjDlgBuscarCurso(JDialog jDlgBuscarCurso) {
        this.jDlgBuscarCurso = jDlgBuscarCurso;
    }

    public JDialog getjDlgBuscarEstudiante() {
        return jDlgBuscarEstudiante;
    }

    public void setjDlgBuscarEstudiante(JDialog jDlgBuscarEstudiante) {
        this.jDlgBuscarEstudiante = jDlgBuscarEstudiante;
    }

    public JTable getTblDlgEstudiantes() {
        return tblDlgEstudiantes;
    }

    public void setTblDlgEstudiantes(JTable tblDlgEstudiantes) {
        this.tblDlgEstudiantes = tblDlgEstudiantes;
    }

    public JTable getTblDlgjCurso() {
        return tblDlgjCurso;
    }

    public void setTblDlgjCurso(JTable tblDlgjCurso) {
        this.tblDlgjCurso = tblDlgjCurso;
    }

    public JTable getTblMatricula() {
        return tblMatricula;
    }

    public void setTblMatricula(JTable tblMatricula) {
        this.tblMatricula = tblMatricula;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtBuscarCur() {
        return txtBuscarCur;
    }

    public void setTxtBuscarCur(JTextField txtBuscarCur) {
        this.txtBuscarCur = txtBuscarCur;
    }

    public JTextField getTxtBuscarEst() {
        return txtBuscarEst;
    }

    public void setTxtBuscarEst(JTextField txtBuscarEst) {
        this.txtBuscarEst = txtBuscarEst;
    }

    public JButton getBtnBuscarCurso() {
        return btnBuscarCurso;
    }

    public void setBtnBuscarCurso(JButton btnBuscarCurso) {
        this.btnBuscarCurso = btnBuscarCurso;
    }

    public JButton getBtnBuscarEstudiante() {
        return btnBuscarEstudiante;
    }

    public void setBtnBuscarEstudiante(JButton btnBuscarEstudiante) {
        this.btnBuscarEstudiante = btnBuscarEstudiante;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JDateChooser getFechaDeMatricula() {
        return fechaDeMatricula;
    }

    public void setFechaDeMatricula(JDateChooser fechaDeMatricula) {
        this.fechaDeMatricula = fechaDeMatricula;
    }

    public JDialog getjDlgMatricula() {
        return jDlgMatricula;
    }

    public void setjDlgMatricula(JDialog jDlgMatricula) {
        this.jDlgMatricula = jDlgMatricula;
    }

    public JTextField getTxtCedulaAdministrador() {
        return txtCedulaAdministrador;
    }

    public void setTxtCedulaAdministrador(JTextField txtCedulaAdministrador) {
        this.txtCedulaAdministrador = txtCedulaAdministrador;
    }

    public JTextField getTxtCedulaEstudiante() {
        return txtCedulaEstudiante;
    }

    public void setTxtCedulaEstudiante(JTextField txtCedulaEstudiante) {
        this.txtCedulaEstudiante = txtCedulaEstudiante;
    }

    public JTextField getTxtCodigoCurso() {
        return txtCodigoCurso;
    }

    public void setTxtCodigoCurso(JTextField txtCodigoCurso) {
        this.txtCodigoCurso = txtCodigoCurso;
    }

    public JTextField getTxtNombreCurso() {
        return txtNombreCurso;
    }

    public void setTxtNombreCurso(JTextField txtNombreCurso) {
        this.txtNombreCurso = txtNombreCurso;
    }

    public JTextField getTxtNombreYApellidoAdministrador() {
        return txtNombreYApellidoAdministrador;
    }

    public void setTxtNombreYApellidoAdministrador(JTextField txtNombreYApellidoAdministrador) {
        this.txtNombreYApellidoAdministrador = txtNombreYApellidoAdministrador;
    }

    public JTextField getTxtNombreYApellidoEstudiante() {
        return txtNombreYApellidoEstudiante;
    }

    public void setTxtNombreYApellidoEstudiante(JTextField txtNombreYApellidoEstudiante) {
        this.txtNombreYApellidoEstudiante = txtNombreYApellidoEstudiante;
    }

    public JTextField getTxtCodigoAdministrador() {
        return txtCodigoAdministrador;
    }

    public void setTxtCodigoAdministrador(JTextField txtCodigoAdministrador) {
        this.txtCodigoAdministrador = txtCodigoAdministrador;
    }

    public JTextField getTxtCodigoEstudiantematri() {
        return txtCodigoEstudiantematri;
    }

    public void setTxtCodigoEstudiantematri(JTextField txtCodigoEstudiantematri) {
        this.txtCodigoEstudiantematri = txtCodigoEstudiantematri;
    }

    public JTextField getTxtCorreoEstudiante() {
        return txtCorreoEstudiante;
    }

    public void setTxtCorreoEstudiante(JTextField txtCorreoEstudiante) {
        this.txtCorreoEstudiante = txtCorreoEstudiante;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgBuscarEstudiante = new javax.swing.JDialog();
        txtBuscarEst = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDlgEstudiantes = new javax.swing.JTable();
        btnCargarEst = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jDlgBuscarCurso = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtBuscarCur = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDlgjCurso = new javax.swing.JTable();
        btnCargarCur = new javax.swing.JButton();
        jDlgMatricula = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        fechaDeMatricula = new com.toedter.calendar.JDateChooser();
        txtNombreYApellidoAdministrador = new javax.swing.JTextField();
        btnBuscarCurso = new javax.swing.JButton();
        txtCedulaAdministrador = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtNombreYApellidoEstudiante = new javax.swing.JTextField();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCedulaEstudiante = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        txtCodigoAdministrador = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtCodigoEstudiantematri = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        btnBuscarEstudiante = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCorreoEstudiante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnMatricular = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        tblDlgEstudiantes.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tblDlgEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Teléfono", "Correo"
            }
        ));
        jScrollPane2.setViewportView(tblDlgEstudiantes);

        btnCargarEst.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarEst.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnCargarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarEst.setText("Cargar");
        btnCargarEst.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel19.setText("Cargar estudiantes");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel17.setText("Buscar:");

        javax.swing.GroupLayout jDlgBuscarEstudianteLayout = new javax.swing.GroupLayout(jDlgBuscarEstudiante.getContentPane());
        jDlgBuscarEstudiante.getContentPane().setLayout(jDlgBuscarEstudianteLayout);
        jDlgBuscarEstudianteLayout.setHorizontalGroup(
            jDlgBuscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgBuscarEstudianteLayout.createSequentialGroup()
                .addGroup(jDlgBuscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDlgBuscarEstudianteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel19))
                    .addGroup(jDlgBuscarEstudianteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDlgBuscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                            .addGroup(jDlgBuscarEstudianteLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCargarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jDlgBuscarEstudianteLayout.setVerticalGroup(
            jDlgBuscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgBuscarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(20, 20, 20)
                .addGroup(jDlgBuscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(btnCargarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel21.setText("Cargar Curso");

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setText("Buscar:");

        tblDlgjCurso.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tblDlgjCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Periodo"
            }
        ));
        jScrollPane4.setViewportView(tblDlgjCurso);

        btnCargarCur.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarCur.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnCargarCur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarCur.setText("Cargar");
        btnCargarCur.setBorder(null);

        javax.swing.GroupLayout jDlgBuscarCursoLayout = new javax.swing.GroupLayout(jDlgBuscarCurso.getContentPane());
        jDlgBuscarCurso.getContentPane().setLayout(jDlgBuscarCursoLayout);
        jDlgBuscarCursoLayout.setHorizontalGroup(
            jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgBuscarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(jDlgBuscarCursoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCur, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarCur, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jDlgBuscarCursoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDlgBuscarCursoLayout.setVerticalGroup(
            jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgBuscarCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBuscarCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarCur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarCurso.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCurso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.setBorder(null);
        btnBuscarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel29.setText("Información del curso");

        jLabel23.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        jLabel23.setText("Registrar matricula");

        jLabel31.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel31.setText("Fecha de asignación:");

        jLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel.setText("Nombre:");

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel27.setText("Información del estudiante");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel24.setText("Nombre y apellido:");

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel25.setText("Nombre y apellido:");

        jLabel28.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel28.setText("Información del administrador");

        btnBuscarEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarEstudiante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarEstudiante.setText("Buscar");
        btnBuscarEstudiante.setBorder(null);
        btnBuscarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel30.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel30.setText("Cédula:");

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel26.setText("Cédula:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCorreoEstudiante)
                                        .addComponent(txtNombreYApellidoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(89, 89, 89)
                                .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoEstudiantematri, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtCedulaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNombreYApellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(340, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaDeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(415, 415, 415)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel)
                            .addComponent(jLabel29))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel31)
                        .addComponent(jLabel28))
                    .addComponent(fechaDeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEstudiante)
                    .addComponent(txtCodigoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtCedulaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoEstudiantematri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtNombreYApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtNombreYApellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCurso)
                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jDlgMatriculaLayout = new javax.swing.GroupLayout(jDlgMatricula.getContentPane());
        jDlgMatricula.getContentPane().setLayout(jDlgMatriculaLayout);
        jDlgMatriculaLayout.setHorizontalGroup(
            jDlgMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgMatriculaLayout.setVerticalGroup(
            jDlgMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblMatricula.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Número de matricula", "Cédula del estudiante", "Nombre y apellido del estudiante", "Cédula del administrador", "Nombre y apellido del administrador", "Nombre del curso"
            }
        ));
        jScrollPane1.setViewportView(tblMatricula);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        btnMatricular.setBackground(new java.awt.Color(255, 255, 255));
        btnMatricular.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnMatricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AñadirDetalles.png"))); // NOI18N
        btnMatricular.setText("Matricular");
        btnMatricular.setBorder(null);
        btnMatricular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compartimiento.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnModificar)
                .addGap(61, 61, 61)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar)
                            .addComponent(btnMatricular))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarCur;
    private javax.swing.JButton btnCargarEst;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser fechaDeMatricula;
    private javax.swing.JDialog jDlgBuscarCurso;
    private javax.swing.JDialog jDlgBuscarEstudiante;
    private javax.swing.JDialog jDlgMatricula;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDlgEstudiantes;
    private javax.swing.JTable tblDlgjCurso;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCur;
    private javax.swing.JTextField txtBuscarEst;
    private javax.swing.JTextField txtCedulaAdministrador;
    private javax.swing.JTextField txtCedulaEstudiante;
    private javax.swing.JTextField txtCodigoAdministrador;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCodigoEstudiantematri;
    private javax.swing.JTextField txtCorreoEstudiante;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNombreYApellidoAdministrador;
    private javax.swing.JTextField txtNombreYApellidoEstudiante;
    // End of variables declaration//GEN-END:variables
}
