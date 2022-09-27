/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.cadastroPacientes.view;

/**
 *
 * @author Eduardo
 */
public class GuiCadastroPaciente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroPaciente
     */
    public GuiCadastroPaciente() {
        initComponents();
        
        jDesktopPane.setVisible(false);
        jInternalFrameCadastrarPaciente.setVisible(false);
        jInternalFrameVisualizarPaciente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrameVisualizarPaciente = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldVisualizarNomePaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldVisualizarNumCard = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxVisualizarSexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldVisualizarDaraNascimento = new javax.swing.JTextField();
        jButtonVisualizarVoltarMenu = new javax.swing.JButton();
        jInternalFrameCadastrarPaciente = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCadastrarNomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCadastrarNumCard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCadastrarSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCadastrarDaraNascimento = new javax.swing.JTextField();
        jButtonCadastrarSalvar = new javax.swing.JButton();
        jButtonCadastrarCancelar = new javax.swing.JButton();
        jMenuBarMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroPaciente = new javax.swing.JMenuItem();
        jMenuVisualizar = new javax.swing.JMenu();
        jMenuItemVisualizarPaciente = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pacientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanelPrincipal.setLayout(null);

        jInternalFrameVisualizarPaciente.setVisible(true);
        jInternalFrameVisualizarPaciente.getContentPane().setLayout(null);

        jLabel9.setText("Nome do Paciente: ");
        jInternalFrameVisualizarPaciente.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 10, 110, 16);

        jTextFieldVisualizarNomePaciente.setEditable(false);
        jTextFieldVisualizarNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVisualizarNomePacienteActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPaciente.getContentPane().add(jTextFieldVisualizarNomePaciente);
        jTextFieldVisualizarNomePaciente.setBounds(160, 10, 220, 20);

        jLabel10.setText("Número do cartão: ");
        jInternalFrameVisualizarPaciente.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 40, 110, 16);

        jTextFieldVisualizarNumCard.setEditable(false);
        jTextFieldVisualizarNumCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVisualizarNumCardActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPaciente.getContentPane().add(jTextFieldVisualizarNumCard);
        jTextFieldVisualizarNumCard.setBounds(160, 40, 220, 20);

        jLabel11.setText("Sexo: ");
        jInternalFrameVisualizarPaciente.getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 70, 50, 20);

        jComboBoxVisualizarSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxVisualizarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVisualizarSexoActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPaciente.getContentPane().add(jComboBoxVisualizarSexo);
        jComboBoxVisualizarSexo.setBounds(50, 70, 100, 22);

        jLabel12.setText("Data de Nascimento: ");
        jInternalFrameVisualizarPaciente.getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 70, 120, 20);

        jTextFieldVisualizarDaraNascimento.setEditable(false);
        jInternalFrameVisualizarPaciente.getContentPane().add(jTextFieldVisualizarDaraNascimento);
        jTextFieldVisualizarDaraNascimento.setBounds(290, 70, 90, 22);

        jButtonVisualizarVoltarMenu.setText("Voltar ao menu principal");
        jButtonVisualizarVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarVoltarMenuActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPaciente.getContentPane().add(jButtonVisualizarVoltarMenu);
        jButtonVisualizarVoltarMenu.setBounds(290, 110, 170, 30);

        jInternalFrameCadastrarPaciente.setVisible(true);
        jInternalFrameCadastrarPaciente.getContentPane().setLayout(null);

        jLabel1.setText("Nome do Paciente: ");
        jInternalFrameCadastrarPaciente.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 110, 16);

        jTextFieldCadastrarNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastrarNomePacienteActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPaciente.getContentPane().add(jTextFieldCadastrarNomePaciente);
        jTextFieldCadastrarNomePaciente.setBounds(160, 10, 220, 20);

        jLabel2.setText("Número do cartão: ");
        jInternalFrameCadastrarPaciente.getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 110, 16);

        jTextFieldCadastrarNumCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastrarNumCardActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPaciente.getContentPane().add(jTextFieldCadastrarNumCard);
        jTextFieldCadastrarNumCard.setBounds(160, 40, 220, 20);

        jLabel3.setText("Sexo: ");
        jInternalFrameCadastrarPaciente.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 50, 20);

        jComboBoxCadastrarSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxCadastrarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastrarSexoActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPaciente.getContentPane().add(jComboBoxCadastrarSexo);
        jComboBoxCadastrarSexo.setBounds(50, 70, 100, 22);

        jLabel4.setText("Data de Nascimento: ");
        jInternalFrameCadastrarPaciente.getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 70, 120, 20);
        jInternalFrameCadastrarPaciente.getContentPane().add(jTextFieldCadastrarDaraNascimento);
        jTextFieldCadastrarDaraNascimento.setBounds(290, 70, 90, 22);

        jButtonCadastrarSalvar.setText("Salvar");
        jButtonCadastrarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSalvarActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPaciente.getContentPane().add(jButtonCadastrarSalvar);
        jButtonCadastrarSalvar.setBounds(300, 110, 63, 25);

        jButtonCadastrarCancelar.setText("Cancelar");
        jButtonCadastrarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCancelarActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPaciente.getContentPane().add(jButtonCadastrarCancelar);
        jButtonCadastrarCancelar.setBounds(370, 110, 90, 25);

        jDesktopPane.setLayer(jInternalFrameVisualizarPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameCadastrarPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameVisualizarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jInternalFrameVisualizarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jInternalFrameCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelPrincipal.add(jDesktopPane);
        jDesktopPane.setBounds(0, 0, 900, 440);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroPaciente.setText("Paciente");
        jMenuItemCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroPaciente);

        jMenuBarMenuPrincipal.add(jMenuCadastro);

        jMenuVisualizar.setText("Visualizar");

        jMenuItemVisualizarPaciente.setText("Paciente");
        jMenuItemVisualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarPacienteActionPerformed(evt);
            }
        });
        jMenuVisualizar.add(jMenuItemVisualizarPaciente);

        jMenuBarMenuPrincipal.add(jMenuVisualizar);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuSair.add(jMenuItemSair);

        jMenuBarMenuPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCancelarActionPerformed
        // TODO add your handling code here:
        jDesktopPane.setVisible(false);
        jInternalFrameCadastrarPaciente.setVisible(false);
    }//GEN-LAST:event_jButtonCadastrarCancelarActionPerformed

    private void jComboBoxCadastrarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastrarSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCadastrarSexoActionPerformed

    private void jTextFieldCadastrarNumCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastrarNumCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastrarNumCardActionPerformed

    private void jTextFieldCadastrarNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastrarNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastrarNomePacienteActionPerformed

    private void jButtonVisualizarVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarVoltarMenuActionPerformed
        // TODO add your handling code here:
        jDesktopPane.setVisible(false);
        jInternalFrameCadastrarPaciente.setVisible(false);
    }//GEN-LAST:event_jButtonVisualizarVoltarMenuActionPerformed

    private void jComboBoxVisualizarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVisualizarSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVisualizarSexoActionPerformed

    private void jTextFieldVisualizarNumCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVisualizarNumCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVisualizarNumCardActionPerformed

    private void jTextFieldVisualizarNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVisualizarNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVisualizarNomePacienteActionPerformed

    private void jMenuItemCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPacienteActionPerformed
        // TODO add your handling code here:
        jDesktopPane.setVisible(true);
        jInternalFrameCadastrarPaciente.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroPacienteActionPerformed

    private void jButtonCadastrarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarSalvarActionPerformed

    private void jMenuItemVisualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarPacienteActionPerformed
        // TODO add your handling code here:
        jDesktopPane.setVisible(true);
        jInternalFrameVisualizarPaciente.setVisible(true);
    }//GEN-LAST:event_jMenuItemVisualizarPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarCancelar;
    private javax.swing.JButton jButtonCadastrarSalvar;
    private javax.swing.JButton jButtonVisualizarVoltarMenu;
    private javax.swing.JComboBox<String> jComboBoxCadastrarSexo;
    private javax.swing.JComboBox<String> jComboBoxVisualizarSexo;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameCadastrarPaciente;
    private javax.swing.JInternalFrame jInternalFrameVisualizarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBarMenuPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastroPaciente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVisualizarPaciente;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVisualizar;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextFieldCadastrarDaraNascimento;
    private javax.swing.JTextField jTextFieldCadastrarNomePaciente;
    private javax.swing.JTextField jTextFieldCadastrarNumCard;
    private javax.swing.JTextField jTextFieldVisualizarDaraNascimento;
    private javax.swing.JTextField jTextFieldVisualizarNomePaciente;
    private javax.swing.JTextField jTextFieldVisualizarNumCard;
    // End of variables declaration//GEN-END:variables
}
