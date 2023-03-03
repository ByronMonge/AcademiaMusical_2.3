package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaPersona extends javax.swing.JInternalFrame {

    public VistaPersona() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnModificar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnModificar = btnActualizar;
    }

    public JButton getBtnCancelar() {
        return btnModificarPersona;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnModificarPersona = btnCancelar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnGuardarDocente() {
        return btnGuardarDocente;
    }

    public void setBtnGuardarDocente(JButton btnGuardarDocente) {
        this.btnGuardarDocente = btnGuardarDocente;
    }

    public JButton getBtnGuardarProductor() {
        return btnGuardarProductor;
    }

    public void setBtnGuardarProductor(JButton btnGuardarProductor) {
        this.btnGuardarProductor = btnGuardarProductor;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JCheckBox getCheckDocente() {
        return checkDocente;
    }

    public void setCheckDocente(JCheckBox checkDocente) {
        this.checkDocente = checkDocente;
    }

    public JCheckBox getCheckProductor() {
        return checkProductor;
    }

    public void setCheckProductor(JCheckBox checkProductor) {
        this.checkProductor = checkProductor;
    }

    public JDateChooser getFechaContratacionDocente() {
        return fechaContratacionDocente;
    }

    public void setFechaContratacionDocente(JDateChooser fechaContratacionDocente) {
        this.fechaContratacionDocente = fechaContratacionDocente;
    }

    public JDateChooser getFechaContratacionProductor() {
        return fechaContratacionProductor;
    }

    public void setFechaContratacionProductor(JDateChooser fechaContratacionProductor) {
        this.fechaContratacionProductor = fechaContratacionProductor;
    }

    public JDateChooser getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(JDateChooser fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public JRadioButton getFemenino() {
        return femenino;
    }

    public void setFemenino(JRadioButton femenino) {
        this.femenino = femenino;
    }

    public ButtonGroup getGenero() {
        return genero;
    }

    public void setGenero(ButtonGroup genero) {
        this.genero = genero;
    }

    public JDialog getjDlgRegistroDocente() {
        return jDlgRegistroDocente;
    }

    public void setjDlgRegistroDocente(JDialog jDlgRegistroDocente) {
        this.jDlgRegistroDocente = jDlgRegistroDocente;
    }

    public JDialog getjDlgRegistroProductor() {
        return jDlgRegistroProductor;
    }

    public void setjDlgRegistroProductor(JDialog jDlgRegistroProductor) {
        this.jDlgRegistroProductor = jDlgRegistroProductor;
    }

    public JDialog getjDlogRegistro() {
        return jDlogRegistro;
    }

    public void setjDlogRegistro(JDialog jDlogRegistro) {
        this.jDlogRegistro = jDlogRegistro;
    }

    public JRadioButton getMasculino() {
        return masculino;
    }

    public void setMasculino(JRadioButton masculino) {
        this.masculino = masculino;
    }

    public JRadioButton getNoBinario() {
        return noBinario;
    }

    public void setNoBinario(JRadioButton noBinario) {
        this.noBinario = noBinario;
    }

    public ButtonGroup getRol() {
        return rol;
    }

    public void setRol(ButtonGroup rol) {
        this.rol = rol;
    }

    public JSpinner getSpinnerExperiencia() {
        return spinnerExperiencia;
    }

    public void setSpinnerExperiencia(JSpinner spinnerExperiencia) {
        this.spinnerExperiencia = spinnerExperiencia;
    }

    public JSpinner getSpinnerSueldoDocente() {
        return spinnerSueldoDocente;
    }

    public void setSpinnerSueldoDocente(JSpinner spinnerSueldoDocente) {
        this.spinnerSueldoDocente = spinnerSueldoDocente;
    }

    public JSpinner getSpinnerSueldoProductor() {
        return spinnerSueldoProductor;
    }

    public void setSpinnerSueldoProductor(JSpinner spinnerSueldoProductor) {
        this.spinnerSueldoProductor = spinnerSueldoProductor;
    }

    public JTable getTblPersona() {
        return tblPersona;
    }

    public void setTblPersona(JTable tblPersona) {
        this.tblPersona = tblPersona;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public void setTxtEspecialidad(JTextField txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }

    public JTextField getTxtPrimerApellido() {
        return txtPrimerApellido;
    }

    public void setTxtPrimerApellido(JTextField txtPrimerApellido) {
        this.txtPrimerApellido = txtPrimerApellido;
    }

    public JTextField getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public JButton getBtnModificarPersona() {
        return btnModificarPersona;
    }

    public void setBtnModificarPersona(JButton btnModificarPersona) {
        this.btnModificarPersona = btnModificarPersona;
    }

    public void setTxtPrimerNombre(JTextField txtPrimerNombre) {
        this.txtPrimerNombre = txtPrimerNombre;
    }

    public JTextField getTxtSegundoApellido() {
        return txtSegundoApellido;
    }

    public void setTxtSegundoApellido(JTextField txtSegundoApellido) {
        this.txtSegundoApellido = txtSegundoApellido;
    }

    public JTextField getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    public void setTxtSegundoNombre(JTextField txtSegundoNombre) {
        this.txtSegundoNombre = txtSegundoNombre;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JLabel getLblRol() {
        return lblRol;
    }

    public void setLblRol(JLabel lblRol) {
        this.lblRol = lblRol;
    }

    public JButton getBtnCancelarAdministrador() {
        return btnCancelarAdministrador;
    }

    public void setBtnCancelarAdministrador(JButton btnCancelarAdministrador) {
        this.btnCancelarAdministrador = btnCancelarAdministrador;
    }

    public JButton getBtnGuardarAdministrador() {
        return btnGuardarAdministrador;
    }

    public void setBtnGuardarAdministrador(JButton btnGuardarAdministrador) {
        this.btnGuardarAdministrador = btnGuardarAdministrador;
    }

    public JCheckBox getCheckAdministrador() {
        return checkAdministrador;
    }

    public void setCheckAdministrador(JCheckBox checkAdministrador) {
        this.checkAdministrador = checkAdministrador;
    }

    public JCheckBox getCheckEstudiante() {
        return checkEstudiante;
    }

    public void setCheckEstudiante(JCheckBox checkEstudiante) {
        this.checkEstudiante = checkEstudiante;
    }

    public JDateChooser getFechaContratacionAdministrador() {
        return fechaContratacionAdministrador;
    }

    public void setFechaContratacionAdministrador(JDateChooser fechaContratacionAdministrador) {
        this.fechaContratacionAdministrador = fechaContratacionAdministrador;
    }

    public JDialog getjDlgRegistroAdministrador() {
        return jDlgRegistroAdministrador;
    }

    public void setjDlgRegistroAdministrador(JDialog jDlgRegistroAdministrador) {
        this.jDlgRegistroAdministrador = jDlgRegistroAdministrador;
    }

    public JSpinner getSpinnerSueldoAdministrador() {
        return spinnerSueldoAdministrador;
    }

    public void setSpinnerSueldoAdministrador(JSpinner spinnerSueldoAdministrador) {
        this.spinnerSueldoAdministrador = spinnerSueldoAdministrador;
    }

    public JTextField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JTextField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlogRegistro = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtCedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        txtPrimerNombre = new javax.swing.JTextField();
        femenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        noBinario = new javax.swing.JRadioButton();
        txtSegundoNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnModificarPersona = new javax.swing.JButton();
        checkDocente = new javax.swing.JCheckBox();
        checkProductor = new javax.swing.JCheckBox();
        lblRol = new javax.swing.JLabel();
        checkEstudiante = new javax.swing.JCheckBox();
        checkAdministrador = new javax.swing.JCheckBox();
        btnCancelar3 = new javax.swing.JButton();
        genero = new javax.swing.ButtonGroup();
        rol = new javax.swing.ButtonGroup();
        jDlgRegistroDocente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGuardarDocente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        fechaContratacionDocente = new com.toedter.calendar.JDateChooser();
        spinnerSueldoDocente = new javax.swing.JSpinner();
        txtEspecialidad = new javax.swing.JTextField();
        btnCancelar1 = new javax.swing.JButton();
        jDlgRegistroProductor = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGuardarProductor = new javax.swing.JButton();
        spinnerExperiencia = new javax.swing.JSpinner();
        spinnerSueldoProductor = new javax.swing.JSpinner();
        fechaContratacionProductor = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        btnCancelar2 = new javax.swing.JButton();
        jDlgRegistroAdministrador = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        fechaContratacionAdministrador = new com.toedter.calendar.JDateChooser();
        spinnerSueldoAdministrador = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        btnGuardarAdministrador = new javax.swing.JButton();
        btnCancelarAdministrador = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        btnActualizar1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Cédula:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Primer nombre:");

        genero.add(masculino);
        masculino.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        masculino.setText("M");

        genero.add(femenino);
        femenino.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        femenino.setText("F");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Segundo nombre:");

        genero.add(noBinario);
        noBinario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        noBinario.setText("No binario");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Primer apellido:");

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Segundo apellido:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel3.setText("Registrar persona");

        btnModificarPersona.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarPersona.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnModificarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificarPersona.setText("Modificar");
        btnModificarPersona.setBorder(null);
        btnModificarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rol.add(checkDocente);
        checkDocente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        checkDocente.setText("Docente");

        rol.add(checkProductor);
        checkProductor.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        checkProductor.setText("Productor");

        lblRol.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblRol.setText("Asignar rol:");

        rol.add(checkEstudiante);
        checkEstudiante.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        checkEstudiante.setText("Estudiante");

        rol.add(checkAdministrador);
        checkAdministrador.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        checkAdministrador.setText("Administrador");

        btnCancelar3.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar3.setText("Cancelar");
        btnCancelar3.setBorder(null);
        btnCancelar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(masculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(femenino)
                                        .addGap(18, 18, 18)
                                        .addComponent(noBinario))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSegundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(txtPrimerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrimerNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRol)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(checkDocente)
                            .addComponent(checkAdministrador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(checkProductor)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(checkEstudiante)))
                        .addGap(90, 90, 90))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkAdministrador)
                                    .addComponent(checkEstudiante))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(masculino)
                                .addComponent(femenino)
                                .addComponent(noBinario)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblRol)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkDocente)
                            .addComponent(checkProductor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDlogRegistroLayout = new javax.swing.GroupLayout(jDlogRegistro.getContentPane());
        jDlogRegistro.getContentPane().setLayout(jDlogRegistroLayout);
        jDlogRegistroLayout.setHorizontalGroup(
            jDlogRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDlogRegistroLayout.setVerticalGroup(
            jDlogRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setText("Sueldo");

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setText("Especialidad:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Registrar docente");

        btnGuardarDocente.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarDocente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarDocente.setText("Guardar");
        btnGuardarDocente.setBorder(null);
        btnGuardarDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel17.setText("Fecha de contratacion:");

        spinnerSueldoDocente.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 1.0d));

        btnCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(null);
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnGuardarDocente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerSueldoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaContratacionDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSueldoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaContratacionDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDocente)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jDlgRegistroDocenteLayout = new javax.swing.GroupLayout(jDlgRegistroDocente.getContentPane());
        jDlgRegistroDocente.getContentPane().setLayout(jDlgRegistroDocenteLayout);
        jDlgRegistroDocenteLayout.setHorizontalGroup(
            jDlgRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgRegistroDocenteLayout.setVerticalGroup(
            jDlgRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Registrar productor");

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel18.setText("Experiencia:");

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel19.setText("Sueldo:");

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel20.setText("Fecha de contratacion:");

        btnGuardarProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarProductor.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarProductor.setText("Guardar");
        btnGuardarProductor.setBorder(null);
        btnGuardarProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel26.setText("$");

        btnCancelar2.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setBorder(null);
        btnCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(spinnerSueldoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addComponent(fechaContratacionProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnGuardarProductor)
                        .addGap(78, 78, 78)
                        .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(spinnerExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(spinnerSueldoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fechaContratacionProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProductor)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDlgRegistroProductorLayout = new javax.swing.GroupLayout(jDlgRegistroProductor.getContentPane());
        jDlgRegistroProductor.getContentPane().setLayout(jDlgRegistroProductorLayout);
        jDlgRegistroProductorLayout.setHorizontalGroup(
            jDlgRegistroProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgRegistroProductorLayout.setVerticalGroup(
            jDlgRegistroProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Registrar administrador");

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setText("Usuario:");

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setText("Contraseña:");

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel24.setText("Fecha de contratacion:");

        spinnerSueldoAdministrador.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 1.0d));

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel23.setText("Sueldo");

        btnGuardarAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarAdministrador.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarAdministrador.setText("Guardar");
        btnGuardarAdministrador.setBorder(null);
        btnGuardarAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCancelarAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarAdministrador.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelarAdministrador.setText("Cancelar");
        btnCancelarAdministrador.setBorder(null);
        btnCancelarAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel27.setText("$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel22))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnGuardarAdministrador)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaContratacionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelarAdministrador)
                                    .addComponent(spinnerSueldoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(fechaContratacionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(spinnerSueldoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAdministrador)
                    .addComponent(btnCancelarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDlgRegistroAdministradorLayout = new javax.swing.GroupLayout(jDlgRegistroAdministrador.getContentPane());
        jDlgRegistroAdministrador.getContentPane().setLayout(jDlgRegistroAdministradorLayout);
        jDlgRegistroAdministradorLayout.setHorizontalGroup(
            jDlgRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgRegistroAdministradorLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDlgRegistroAdministradorLayout.setVerticalGroup(
            jDlgRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroo.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(null);

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPersona);

        btnActualizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnCancelarAdministrador;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardarAdministrador;
    private javax.swing.JButton btnGuardarDocente;
    private javax.swing.JButton btnGuardarProductor;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarPersona;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkDocente;
    private javax.swing.JCheckBox checkEstudiante;
    private javax.swing.JCheckBox checkProductor;
    private com.toedter.calendar.JDateChooser fechaContratacionAdministrador;
    private com.toedter.calendar.JDateChooser fechaContratacionDocente;
    private com.toedter.calendar.JDateChooser fechaContratacionProductor;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JRadioButton femenino;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JDialog jDlgRegistroAdministrador;
    private javax.swing.JDialog jDlgRegistroDocente;
    private javax.swing.JDialog jDlgRegistroProductor;
    private javax.swing.JDialog jDlogRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRol;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton noBinario;
    private javax.swing.ButtonGroup rol;
    private javax.swing.JSpinner spinnerExperiencia;
    private javax.swing.JSpinner spinnerSueldoAdministrador;
    private javax.swing.JSpinner spinnerSueldoDocente;
    private javax.swing.JSpinner spinnerSueldoProductor;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
