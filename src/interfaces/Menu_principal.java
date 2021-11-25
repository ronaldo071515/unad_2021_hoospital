
package interfaces;

import java.awt.Dimension;

public class Menu_principal extends javax.swing.JFrame {

    public Menu_principal() {
        initComponents();
        this.setExtendedState(Menu_principal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        container = new javax.swing.JDesktopPane();
        menu_bar = new javax.swing.JMenuBar();
        users = new javax.swing.JMenu();
        registerUser = new javax.swing.JMenuItem();
        searchUser = new javax.swing.JMenuItem();
        updateUser = new javax.swing.JMenuItem();
        funct = new javax.swing.JMenu();
        registerFunc = new javax.swing.JMenuItem();
        searchFun = new javax.swing.JMenuItem();
        updateFunc = new javax.swing.JMenuItem();
        deleteFunc = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        reports = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        users.setText("Usuarios");

        registerUser.setText("Registrar Usuario");
        registerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserActionPerformed(evt);
            }
        });
        users.add(registerUser);

        searchUser.setText("Consultar Usuario");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        users.add(searchUser);

        updateUser.setText("Actualizar Usuario");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        users.add(updateUser);

        menu_bar.add(users);

        funct.setText("Funcionarios");

        registerFunc.setText("Registrar Funcionario");
        registerFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFuncActionPerformed(evt);
            }
        });
        funct.add(registerFunc);

        searchFun.setText("Consultar Funcionario");
        searchFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFunActionPerformed(evt);
            }
        });
        funct.add(searchFun);

        updateFunc.setText("Actualizar Funcionario");
        updateFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFuncActionPerformed(evt);
            }
        });
        funct.add(updateFunc);

        deleteFunc.setText("ELiminar Funcionario");
        deleteFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFuncActionPerformed(evt);
            }
        });
        funct.add(deleteFunc);

        menu_bar.add(funct);

        jMenu1.setText("Vacunación");

        jMenuItem1.setText("Vacunar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menu_bar.add(jMenu1);

        reports.setText("Reportes");

        jMenuItem2.setText("Generar Reportes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        reports.add(jMenuItem2);

        menu_bar.add(reports);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerFuncActionPerformed

        RegistrarFuncionario registerFunc = new RegistrarFuncionario();
        container.add(registerFunc);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = registerFunc.getSize();
        registerFunc.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        registerFunc.show();
    }//GEN-LAST:event_registerFuncActionPerformed

    private void searchFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFunActionPerformed
        
        ConsultarFuncionario searchFun = new ConsultarFuncionario();
        container.add(searchFun);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = searchFun.getSize();
        searchFun.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        searchFun.show();
    }//GEN-LAST:event_searchFunActionPerformed

    private void registerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserActionPerformed
        
        RegistrarUsuario registerUser = new RegistrarUsuario();
        container.add(registerUser);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = registerUser.getSize();
        registerUser.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        registerUser.show();
    }//GEN-LAST:event_registerUserActionPerformed

    private void updateFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFuncActionPerformed
        
        ActualizarFuncionario updateFun = new ActualizarFuncionario();
        container.add(updateFun);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = updateFun.getSize();
        updateFun.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        updateFun.show();
    }//GEN-LAST:event_updateFuncActionPerformed

    private void deleteFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFuncActionPerformed
        
        EliminarFuncionario deleteFun = new EliminarFuncionario();
        container.add(deleteFun);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = deleteFun.getSize();
        deleteFun.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        deleteFun.show();
    }//GEN-LAST:event_deleteFuncActionPerformed

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        // TODO add your handling code here:
        ConsultarUsuario searchUser = new ConsultarUsuario();
        container.add(searchUser);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = searchUser.getSize();
        searchUser.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        searchUser.show();
    }//GEN-LAST:event_searchUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        ActualizarUsuario updateUser = new ActualizarUsuario();
        container.add(updateUser);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = updateUser.getSize();
        updateUser.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        updateUser.show();        
    }//GEN-LAST:event_updateUserActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VacunarUsuario vacUser = new VacunarUsuario();
        container.add(vacUser);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = vacUser.getSize();
        vacUser.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        vacUser.show();         
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Reportes reports = new Reportes();
        container.add(reports);
        Dimension desktopSize = container.getSize();
        Dimension FrameSize = reports.getSize();
        reports.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        reports.show();        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane container;
    private javax.swing.JMenuItem deleteFunc;
    private javax.swing.JMenu funct;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenuItem registerFunc;
    private javax.swing.JMenuItem registerUser;
    private javax.swing.JMenu reports;
    private javax.swing.JMenuItem searchFun;
    private javax.swing.JMenuItem searchUser;
    private javax.swing.JMenuItem updateFunc;
    private javax.swing.JMenuItem updateUser;
    private javax.swing.JMenu users;
    // End of variables declaration//GEN-END:variables
}
