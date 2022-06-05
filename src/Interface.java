
import java.util.concurrent.Semaphore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;




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
        screenCapacitySpinner = new javax.swing.JSpinner();
        buttonCapacitySpinner = new javax.swing.JSpinner();
        pinCapacitySpinner = new javax.swing.JSpinner();
        cameraCapacitySpinner = new javax.swing.JSpinner();
        number_of_screen_producers = new javax.swing.JSpinner();
        number_of_button_producers = new javax.swing.JSpinner();
        number_of_pin_producers = new javax.swing.JSpinner();
        number_of_camera_producers = new javax.swing.JSpinner();
        button_warehouse_capacity = new javax.swing.JSpinner();
        camera_warehouse_capacity = new javax.swing.JSpinner();
        pin_warehouse_capacity = new javax.swing.JSpinner();
        screen_warehouse_capacity = new javax.swing.JSpinner();
        number_of_assemblers = new javax.swing.JSpinner();
        number_of_days = new javax.swing.JSpinner();
        workday_hours = new javax.swing.JSpinner();
        cancelButton = new javax.swing.JButton();
        simulate = new javax.swing.JButton();
        simulate_default = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        kslslsl = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(700, 720));
        setPreferredSize(new java.awt.Dimension(700, 750));
        setSize(new java.awt.Dimension(700, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screenCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(screenCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        buttonCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(buttonCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        pinCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(pinCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        cameraCapacitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(cameraCapacitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        number_of_screen_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_screen_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        number_of_button_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_button_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        number_of_pin_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_pin_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        number_of_camera_producers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_camera_producers, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        button_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(button_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, -1, -1));

        camera_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(camera_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, -1, -1));

        pin_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(pin_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, -1, -1));

        screen_warehouse_capacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(screen_warehouse_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, -1, -1));

        number_of_assemblers.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_assemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 770, -1, -1));

        number_of_days.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(number_of_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 860, -1, -1));

        workday_hours.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(workday_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 890, -1, -1));

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 960, -1, -1));

        simulate.setEnabled(false);
        simulate.setText("Simular");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });
        getContentPane().add(simulate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 960, -1, -1));

        simulate_default.setText("Guardar configuración");
        simulate_default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulate_defaultActionPerformed(evt);
            }
        });
        getContentPane().add(simulate_default, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 960, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));
        getContentPane().add(kslslsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Infografía Cómo vender NFT Moderno Lila (11111).jpg")); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        
        Map<String, Integer> config = new HashMap<String, Integer>();
        String data = "";
        
        try {
              File file = new File("C:/Users/USER/Desktop/config.txt");
              
              Scanner myReader = new Scanner(file);
              while (myReader.hasNextLine()) {
                data = data + myReader.nextLine();
                  System.out.println(data);
              }

              myReader.close();
             
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();  
            }
        
            String[] pairs = data.split(",");
            
            
            for (int i=0;i<pairs.length;i++) {
                String pair = pairs[i];
                String[] keyValue = pair.split("=");

                config.put(keyValue[0], Integer.valueOf(keyValue[1].replace("}", "")));
            }
        
            
            
        Simulation simulation = new Simulation();
        Counter counter = new Counter(Integer.parseInt(number_of_days.getModel().getValue().toString()), 0, 0, 0, 0, 0, 0, 0, 0, 0, data, 0);
        Factory factory = new Factory(simulation, counter, data);
        simulation.setVisible(true);
        factory.start();
    
    }//GEN-LAST:event_simulateActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        super.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void simulate_defaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulate_defaultActionPerformed
        
        Dictionary config = new Hashtable();
        
        //Map<String, Integer> config = new HashMap<String, Integer>();
        
        config.put("numeroPpantalla", Integer.parseInt(number_of_screen_producers.getModel().getValue().toString()));
        config.put("numeroPboton", Integer.parseInt(number_of_button_producers.getModel().getValue().toString()));
        config.put("numeroPpin", Integer.parseInt(number_of_pin_producers.getModel().getValue().toString()));
        config.put("numeroPcamara", Integer.parseInt(number_of_camera_producers.getModel().getValue().toString()));
        
        config.put("capacidadPantalla", Integer.parseInt(screenCapacitySpinner.getModel().getValue().toString()));
        config.put("capacidadPin", Integer.parseInt(pinCapacitySpinner.getModel().getValue().toString()));
        config.put("capacidadBoton", Integer.parseInt(buttonCapacitySpinner.getModel().getValue().toString()));
        config.put("capacidadCamara", Integer.parseInt(cameraCapacitySpinner.getModel().getValue().toString()));
        
        config.put("capacidadAlmacenP", Integer.parseInt(screen_warehouse_capacity.getModel().getValue().toString()));
        config.put("capacidadAlmacenPin", Integer.parseInt(pin_warehouse_capacity.getModel().getValue().toString()));
        config.put("capacidadAlmacenB", Integer.parseInt(button_warehouse_capacity.getModel().getValue().toString()));
        config.put("capacidadAlmacenC", Integer.parseInt(camera_warehouse_capacity.getModel().getValue().toString()));
        
        config.put("numeroE", Integer.parseInt(number_of_assemblers.getModel().getValue().toString()));
        config.put("horas", Integer.parseInt(workday_hours.getModel().getValue().toString()));
        
        config.put("numeroDias", Integer.parseInt(number_of_days.getModel().getValue().toString()));
        
        try {
            File file = new File("C:/Users/USER/Desktop/config.txt");
            if (file.createNewFile()) {
              System.out.println("File created: " + file.getName());
            } else {
              System.out.println("File already exists.");
            }
        }catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        
        
        
        try {
            FileWriter writer = new FileWriter("C:/Users/USER/Desktop/config.txt");
            writer.write(config.toString());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        simulate.setEnabled(true);
        
    }//GEN-LAST:event_simulate_defaultActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel kslslsl;
    private javax.swing.JSpinner number_of_assemblers;
    public javax.swing.JSpinner number_of_button_producers;
    private javax.swing.JSpinner number_of_camera_producers;
    private javax.swing.JSpinner number_of_days;
    private javax.swing.JSpinner number_of_pin_producers;
    private javax.swing.JSpinner number_of_screen_producers;
    private java.awt.Panel panel4;
    private javax.swing.JSpinner pinCapacitySpinner;
    private javax.swing.JSpinner pin_warehouse_capacity;
    public javax.swing.JSpinner screenCapacitySpinner;
    private javax.swing.JSpinner screen_warehouse_capacity;
    private javax.swing.JButton simulate;
    private javax.swing.JButton simulate_default;
    private javax.swing.JSpinner workday_hours;
    // End of variables declaration//GEN-END:variables


}




