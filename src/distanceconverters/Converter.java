/*
 * Converter
 * created by WilliamBD on 01/05/2018
 * to convert imperial values into metric.
 */
package distanceconverters;

/**
 *
 * @author widea9928
 */
public class Converter extends javax.swing.JFrame {

    /**
     * Creates new form Converter
     */
    public Converter() {
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

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ConvertButton = new javax.swing.JButton();
        ConversionType = new javax.swing.JComboBox();
        ValuePrompt = new javax.swing.JLabel();
        Value = new javax.swing.JTextField();
        Output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 102, 102));
        Title.setText("Distance Converter");

        ConvertButton.setText("Convert");
        ConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertButtonActionPerformed(evt);
            }
        });

        ConversionType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inches to Centimetres", "Feet to Centimetres", "Yards to Metres", "Miles to Kilometres" }));
        ConversionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversionTypeActionPerformed(evt);
            }
        });

        ValuePrompt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ValuePrompt.setForeground(new java.awt.Color(255, 102, 102));
        ValuePrompt.setText("Enter value to convert:");

        Output.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Output.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ValuePrompt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Value)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Title)
                        .addGap(62, 62, 62))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(ConversionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(ConvertButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(37, 37, 37)
                .addComponent(ConversionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValuePrompt)
                    .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(ConvertButton)
                .addGap(18, 18, 18)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConversionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversionTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConversionTypeActionPerformed

    private void ConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertButtonActionPerformed
        int conversion = ConversionType.getSelectedIndex();
        double measure = Double.parseDouble(Value.getText());
        String valueConverted = " ";

        //checks which conversion to do and then runs proper conversion.
        switch (conversion) {
            case 1:
                valueConverted = inch2Cent(measure);
                break;
            case 2:
                valueConverted = feet2Cent(measure);
                break;
            case 3:
                valueConverted = yards2Meters(measure);
                break;
            case 4:
                valueConverted = miles2Kilometers(measure);
                break;
        }
        //outputs the converted value.
        Output.setText(valueConverted);
    }//GEN-LAST:event_ConvertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ConversionType;
    private javax.swing.JButton ConvertButton;
    private javax.swing.JLabel Output;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField Value;
    private javax.swing.JLabel ValuePrompt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * converts inches into centimeters.
     *
     * @param inches
     * @return centimeters
     */
    private String inch2Cent(double inches) {
        double centimeters = inches * 2.54;
        return (centimeters + " centimeters");
    }

    /**
     * converts feet into centimeters.
     *
     * @param feet
     * @return centimeters
     */
    private String feet2Cent(double feet) {
        double centimeters = feet * 30;
        return (centimeters + " feet");

    }

    /**
     * converts yards into meters.
     *
     * @param yards
     * @return meters
     */
    private String yards2Meters(double yards) {
        double meters = yards * 0.91;
        return (meters + " meters");
    }

    /**
     * converts miles into kilometers.
     *
     * @param miles
     * @return kilometers
     */
    private String miles2Kilometers(double miles) {
        double kilometers = miles * 1.6;
        return (kilometers + " kilometers");
    }

}
