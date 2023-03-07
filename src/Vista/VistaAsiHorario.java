package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaAsiHorario extends javax.swing.JInternalFrame {

    public VistaAsiHorario() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnAsignar() {
        return btnAsignar;
    }

    public void setBtnAsignar(JButton btnAsignar) {
        this.btnAsignar = btnAsignar;
    }

    public JButton getBtnCargarCur() {
        return btnCargarCur;
    }

    public void setBtnCargarCur(JButton btnCargarCur) {
        this.btnCargarCur = btnCargarCur;
    }

    public JButton getBtnCargarHor() {
        return btnCargarHor;
    }

    public void setBtnCargarHor(JButton btnCargarHor) {
        this.btnCargarHor = btnCargarHor;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
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

    public JDialog getjDlgBuscarHorario() {
        return jDlgBuscarHorario;
    }

    public void setjDlgBuscarHorario(JDialog jDlgBuscarHorario) {
        this.jDlgBuscarHorario = jDlgBuscarHorario;
    }

    public JTable getTblAsiAsignatura() {
        return tblAsiAsignatura;
    }

    public void setTblAsiAsignatura(JTable tblAsiAsignatura) {
        this.tblAsiAsignatura = tblAsiAsignatura;
    }

    public JTable getTblDlgjCurso() {
        return tblDlgjCurso;
    }

    public void setTblDlgjCurso(JTable tblDlgjCurso) {
        this.tblDlgjCurso = tblDlgjCurso;
    }

    public JTable getTblDlgjHorario() {
        return tblDlgjHorario;
    }

    public void setTblDlgjHorario(JTable tblDlgjHorario) {
        this.tblDlgjHorario = tblDlgjHorario;
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

    public JTextField getTxtBuscarHor() {
        return txtBuscarHor;
    }

    public void setTxtBuscarHor(JTextField txtBuscarHor) {
        this.txtBuscarHor = txtBuscarHor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgBuscarCurso = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        btnCargarCur = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarCur = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDlgjCurso = new javax.swing.JTable();
        jDlgBuscarHorario = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtBuscarHor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDlgjHorario = new javax.swing.JTable();
        btnCargarHor = new javax.swing.JButton();
        jDlgAsignarHorario = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtPeriodoCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaDeAsignacion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtNombreCurso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        btnBuscarCurso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDiaHorario = new javax.swing.JTextField();
        txtCodigoHorario = new javax.swing.JTextField();
        btnBuscarHorario = new javax.swing.JButton();
        txtHoraDeInicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraDeFin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsiAsignatura = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCargarCur.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarCur.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnCargarCur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarCur.setText("Cargar");
        btnCargarCur.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel19.setText("Cargar curso");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel17.setText("Buscar:");

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
        jScrollPane2.setViewportView(tblDlgjCurso);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(30, 30, 30)
                        .addComponent(txtBuscarCur, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(btnCargarCur, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarCur))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDlgBuscarCursoLayout = new javax.swing.GroupLayout(jDlgBuscarCurso.getContentPane());
        jDlgBuscarCurso.getContentPane().setLayout(jDlgBuscarCursoLayout);
        jDlgBuscarCursoLayout.setHorizontalGroup(
            jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgBuscarCursoLayout.setVerticalGroup(
            jDlgBuscarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel20.setText("Cargar horario");

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel18.setText("Buscar:");

        tblDlgjHorario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tblDlgjHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Dia de la semana", "Hora de inicio", "Hora fin"
            }
        ));
        jScrollPane3.setViewportView(tblDlgjHorario);

        btnCargarHor.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarHor.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnCargarHor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarHor.setText("Cargar");
        btnCargarHor.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(28, 28, 28)
                            .addComponent(txtBuscarHor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargarHor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarHor)
                    .addComponent(txtBuscarHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDlgBuscarHorarioLayout = new javax.swing.GroupLayout(jDlgBuscarHorario.getContentPane());
        jDlgBuscarHorario.getContentPane().setLayout(jDlgBuscarHorarioLayout);
        jDlgBuscarHorarioLayout.setHorizontalGroup(
            jDlgBuscarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgBuscarHorarioLayout.setVerticalGroup(
            jDlgBuscarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Periodo:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        jLabel3.setText("Asignar horario ");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setText("Fecha de asignación:");

        btnBuscarCurso.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCurso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.setBorder(null);
        btnBuscarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Información del curso");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("Información del horario");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Dia:");

        btnBuscarHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarHorario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarHorario.setText("Buscar");
        btnBuscarHorario.setBorder(null);
        btnBuscarHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarHorario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Hora de inicio:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Hora fin:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtPeriodoCurso)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(txtDiaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodigoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHoraDeFin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHoraDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnBuscarHorario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnBuscarCurso)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaDeAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel13))
                    .addComponent(fechaDeAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCurso))
                .addGap(12, 12, 12)
                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarHorario))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHoraDeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jDlgAsignarHorarioLayout = new javax.swing.GroupLayout(jDlgAsignarHorario.getContentPane());
        jDlgAsignarHorario.getContentPane().setLayout(jDlgAsignarHorarioLayout);
        jDlgAsignarHorarioLayout.setHorizontalGroup(
            jDlgAsignarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgAsignarHorarioLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDlgAsignarHorarioLayout.setVerticalGroup(
            jDlgAsignarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        btnAsignar.setBackground(new java.awt.Color(255, 255, 255));
        btnAsignar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AñadirDetalles.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.setBorder(null);
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
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
                            .addComponent(btnAsignar))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tblAsiAsignatura.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblAsiAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código de asignación", "Cédula", "Nombre y apellido del docente", "Nombre de la asignatura"
            }
        ));
        jScrollPane1.setViewportView(tblAsiAsignatura);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnBuscarHorario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarCur;
    private javax.swing.JButton btnCargarHor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser fechaDeAsignacion;
    private javax.swing.JDialog jDlgAsignarHorario;
    private javax.swing.JDialog jDlgBuscarCurso;
    private javax.swing.JDialog jDlgBuscarHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAsiAsignatura;
    private javax.swing.JTable tblDlgjCurso;
    private javax.swing.JTable tblDlgjHorario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCur;
    private javax.swing.JTextField txtBuscarHor;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCodigoHorario;
    private javax.swing.JTextField txtDiaHorario;
    private javax.swing.JTextField txtHoraDeFin;
    private javax.swing.JTextField txtHoraDeInicio;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtPeriodoCurso;
    // End of variables declaration//GEN-END:variables

}
