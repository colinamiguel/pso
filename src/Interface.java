
import java.util.concurrent.Semaphore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */

        
    
    
    public Interface() {
        
        
        
        initComponents();
        
        
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        panel4 = new java.awt.Panel();
        Productores1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        screenCapacitySpinner = new javax.swing.JSpinner();
        buttonCapacitySpinner = new javax.swing.JSpinner();
        pinCapacitySpinner = new javax.swing.JSpinner();
        cameraCapacitySpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        number_of_screen_producers = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        number_of_button_producers = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        number_of_pin_producers = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        number_of_camera_producers = new javax.swing.JSpinner();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        button_warehouse_capacity = new javax.swing.JSpinner();
        camera_warehouse_capacity = new javax.swing.JSpinner();
        pin_warehouse_capacity = new javax.swing.JSpinner();
        screen_warehouse_capacity = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        number_of_assemblers = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        number_of_days = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        workday_hours = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        simulate = new javax.swing.JButton();
        simulate_default = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        panel4.setBackground(new java.awt.Color(153, 153, 153));

        Productores1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Productores1.setForeground(new java.awt.Color(255, 255, 255));
        Productores1.setText("Gastos");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(Productores1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Productores1)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Almacén de botones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 427, -1, -1));

        jLabel3.setText("Seleccione la capacidad instalada de los productores de botones (botones x día): ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 179, -1, -1));

        jLabel4.setText("Seleccione la capacidad instalada de los productores de pines (pines x día): ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 247, -1, -1));

        jLabel5.setText("Seleccione la capacidad instalada de los productores de cámaras (cámaras x día): ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 314, -1, -1));

        screenCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(screenCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 101, -1, -1));

        buttonCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(buttonCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 176, -1, -1));

        pinCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(pinCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 241, -1, -1));

        cameraCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(cameraCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 314, -1, -1));

        jLabel6.setText("Seleccione el número de productores de pantalla:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 398, -1));

        number_of_screen_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_screen_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 127, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 160, 567, 10));

        jLabel7.setText("Seleccione el número de productores de botones:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, 390, -1));

        number_of_button_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_button_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 202, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 233, 567, 10));

        jLabel8.setText("Seleccione el número de productores de pines:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 398, -1));

        number_of_pin_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_pin_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 267, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 298, 567, 10));

        jLabel9.setText("Seleccione el número de productores de cámaras:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 340, 397, -1));

        number_of_camera_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_camera_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 340, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 371, 567, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Almacenes");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 392, 143, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Productores");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 66, 143, -1));

        jLabel12.setText("Seleccione la capacidad instalada de los productores de pantallas (pantallas x día): ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, -1, -1));

        jLabel13.setText("Almacén de cámaras");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 427, -1, -1));

        jLabel14.setText("Almacén de pines");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 427, -1, -1));

        jLabel15.setText("Almacén de pantallas");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 427, -1, -1));

        jLabel16.setText("Capacidad:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 455, -1, -1));

        jLabel17.setText("Capacidad:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 455, -1, -1));

        jLabel18.setText("Capacidad:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 455, -1, -1));

        jLabel19.setText("Capacidad:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 455, -1, -1));

        button_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(button_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 452, -1, -1));

        camera_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(camera_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 452, -1, -1));

        pin_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(pin_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 452, -1, -1));

        screen_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(screen_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 452, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Ensambladores");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 506, 143, -1));

        jLabel21.setText("Seleccione el número de ensambladores:");
        jLabel21.setMaximumSize(new java.awt.Dimension(392, 14));
        jLabel21.setMinimumSize(new java.awt.Dimension(392, 14));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 532, 388, -1));

        number_of_assemblers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_assemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 529, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Días ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 581, 143, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 560, 567, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 485, 567, 10));

        jLabel23.setText("Seleccione el número de días entre despachos:");
        jLabel23.setMaximumSize(new java.awt.Dimension(392, 14));
        jLabel23.setMinimumSize(new java.awt.Dimension(392, 14));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 616, 388, -1));

        number_of_days.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 610, -1, -1));

        jLabel24.setText("Seleccione las horas efectivas de trabajo en el día:");
        jLabel24.setMaximumSize(new java.awt.Dimension(392, 14));
        jLabel24.setMinimumSize(new java.awt.Dimension(392, 14));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 644, 388, -1));

        workday_hours.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(workday_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 641, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Sony Factory Planning");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 31, -1, -1));

        cancelButton.setText("Cancelar");
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 696, -1, -1));

        simulate.setText("Simular");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });
        getContentPane().add(simulate, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 696, -1, -1));

        simulate_default.setText("Simular (predeterminado)");
        getContentPane().add(simulate_default, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 696, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 12, 20, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        

        
        
        
        Simulation simulation = new Simulation();
        Factory factory = new Factory(simulation);
        simulation.setVisible(true);
        factory.start();
        
        

        
        
    
        
     
        
        
        
        
        
        
    }//GEN-LAST:event_simulateActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Productores1;
    private javax.swing.JSpinner buttonCapacitySpinner;
    private javax.swing.JSpinner button_warehouse_capacity;
    private javax.swing.JSpinner cameraCapacitySpinner;
    private javax.swing.JSpinner camera_warehouse_capacity;
    private javax.swing.JButton cancelButton;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JSpinner number_of_assemblers;
    private javax.swing.JSpinner number_of_button_producers;
    private javax.swing.JSpinner number_of_camera_producers;
    private javax.swing.JSpinner number_of_days;
    private javax.swing.JSpinner number_of_pin_producers;
    private javax.swing.JSpinner number_of_screen_producers;
    private java.awt.Panel panel4;
    private javax.swing.JSpinner pinCapacitySpinner;
    private javax.swing.JSpinner pin_warehouse_capacity;
    private javax.swing.JSpinner screenCapacitySpinner;
    private javax.swing.JSpinner screen_warehouse_capacity;
    private javax.swing.JButton simulate;
    private javax.swing.JButton simulate_default;
    private javax.swing.JSpinner workday_hours;
    // End of variables declaration//GEN-END:variables

 
    public void jbjhhib(){
    
    }
    
}


