/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Administrator
 */
public class frmPersonaMantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form frmPersona
     */
    public frmPersonaMantenimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCuerpo = new javax.swing.JPanel();
        panControles = new javax.swing.JPanel();
        txtNumeroDocumento = new javax.swing.JTextField();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        panBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditarNuevaVentana = new javax.swing.JButton();
        panTabla = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }};
            panTitulo = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            panCuerpo.setLayout(new java.awt.BorderLayout());

            cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            jLabel6.setText("Numero Documento");

            jLabel1.setText("Codigo");

            jLabel7.setText("Tippo de usuario");

            jLabel2.setText("Nombres");

            jLabel3.setText("Paterno");

            txtPaterno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtPaternoActionPerformed(evt);
                }
            });

            jLabel4.setText("Materno");

            javax.swing.GroupLayout panControlesLayout = new javax.swing.GroupLayout(panControles);
            panControles.setLayout(panControlesLayout);
            panControlesLayout.setHorizontalGroup(
                panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panControlesLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(panControlesLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(txtPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodigo))
                    .addGap(30, 30, 30))
            );
            panControlesLayout.setVerticalGroup(
                panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panControlesLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(35, Short.MAX_VALUE))
            );

            panCuerpo.add(panControles, java.awt.BorderLayout.WEST);

            btnAgregar.setText("Agregar");

            btnEliminar.setText("Eliminar");

            btnEditar.setText("Actualizar");
            btnEditar.setToolTipText("");

            btnCancelar.setText("Cancelar");
            btnCancelar.setToolTipText("");

            btnEditarNuevaVentana.setText("Editar");

            javax.swing.GroupLayout panBotonesLayout = new javax.swing.GroupLayout(panBotones);
            panBotones.setLayout(panBotonesLayout);
            panBotonesLayout.setHorizontalGroup(
                panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBotonesLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addGroup(panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(btnEditarNuevaVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(46, 46, 46))
            );
            panBotonesLayout.setVerticalGroup(
                panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panBotonesLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(btnAgregar)
                    .addGap(7, 7, 7)
                    .addComponent(btnEliminar)
                    .addGap(29, 29, 29)
                    .addComponent(btnEditarNuevaVentana)
                    .addGap(18, 18, 18)
                    .addComponent(btnEditar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnCancelar)
                    .addContainerGap(23, Short.MAX_VALUE))
            );

            btnAgregar.getAccessibleContext().setAccessibleDescription("");

            panCuerpo.add(panBotones, java.awt.BorderLayout.EAST);

            getContentPane().add(panCuerpo, java.awt.BorderLayout.LINE_END);

            tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane1.setViewportView(tblPersonas);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout panTablaLayout = new javax.swing.GroupLayout(panTabla);
            panTabla.setLayout(panTablaLayout);
            panTablaLayout.setHorizontalGroup(
                panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTablaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            panTablaLayout.setVerticalGroup(
                panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTablaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            getContentPane().add(panTabla, java.awt.BorderLayout.SOUTH);

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Mantenimiento de Personas");

            javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
            panTitulo.setLayout(panTituloLayout);
            panTituloLayout.setHorizontalGroup(
                panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTituloLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addContainerGap())
            );
            panTituloLayout.setVerticalGroup(
                panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTituloLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            getContentPane().add(panTitulo, java.awt.BorderLayout.NORTH);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEditarNuevaVentana;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panBotones;
    private javax.swing.JPanel panControles;
    private javax.swing.JPanel panCuerpo;
    private javax.swing.JPanel panTabla;
    private javax.swing.JPanel panTitulo;
    public javax.swing.JTable tblPersonas;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtMaterno;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtNumeroDocumento;
    public javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
}
