/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.curp704;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author CC_Laboratorio
 */
public class curp extends javax.swing.JFrame {
    
    /**
     * Creates new form curp
     */
    public curp() {
        initComponents();
    }

    public int calcularEdad(int fecha){
        return fecha;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_curp = new javax.swing.JTextField();
        txt_rfc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edad_txt = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CURP:");

        jLabel2.setText("RFC:");

        jButton1.setText("VALIDAR CURP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VALIDAR RFC");

        edad.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_rfc, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txt_curp)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad)
                            .addComponent(edad_txt))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(edad_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edad)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String curp = txt_curp.getText();
        String rfc= txt_rfc.getText();
        String sexo="";
        String[] estados = {
            "AS", "BC", "BS", "CC", "CL", "CM", "CS", "CH", "DF", "DG",
            "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC",
            "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TS", "TL", "VZ",
            "YN", "ZS", "NE" 
        };
        String estado = curp.substring(11, 12);
        String rfc10 = rfc.substring(0, 9);
        String curp10 = curp.substring(0, 9);
        Boolean bandera = true;
        int mes = 00, dia= 00;
        String nombre = curp.substring(0, 3);
        if(curp.length() == 18){
            sexo = curp.substring(10);
            System.out.println(sexo);
            if(sexo.equals("M") || sexo.equals("H")){
                for(int i = 0; i <estados.length; i++){
                    if(!estados[i].equals(estado)){
                        bandera = false;
                    }
                }
                mes = Integer.parseInt(curp.substring(6, 7));
                dia = Integer.parseInt(curp.substring(8, 9));
                if(mes <=12){
                    if (mes == 2){
                        if(dia > 29){
                            System.out.println("Día inválido");
                            bandera = false;
                        }
                    } else {
                        if(dia > 31){
                            System.out.println("Día inválido");
                            bandera = false;
                        }
                    }
                    if(!curp10.equals(rfc10)){
                        System.out.println("RFC y CURP no coinciden");
                        bandera = false;
                    } else {
                        for (int x = 0; x < nombre.length(); x++) {
                        char c = nombre.charAt(x);
                            if (!((c >= 'A' && c <= 'Z') || c == ' ')) {
                                System.out.println("Nombre inválido: " + c);
                                bandera = false;
                            } else {
                                Integer edad = calculoEdad(curp);
                                if(edad != 0){
                                    edad_txt.setText(edad.toString());
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Mes inválido");
                    bandera = false;
                }
            } else {
                System.out.println("Sexo inválido");
                bandera = false;
            }
        } else {
            if(curp.length() <18){
                System.out.println("El CURP es menor a 18 dígitos");
            } else if (curp.length() > 18){
                System.out.println("El CURP es mayor a 18 dígitos");
            }
            bandera = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   public static int calculoEdad(String curp){
        String añoNacimiento="";
        for(int i=4;i<6;i++){
            añoNacimiento += curp.charAt(i);
        }
        
        int año = Integer.parseInt(añoNacimiento);
        if(año < 24){
            año += 2000;
        } else{
            año +=1900;
        }
        int mes = Integer.parseInt(curp.substring(6, 8));
        int dia = Integer.parseInt(curp.substring(8, 10));
        
        LocalDate fechaNac = LocalDate.of(año,dia,mes);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        
        return periodo.getYears();
   }
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
            java.util.logging.Logger.getLogger(curp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(curp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(curp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(curp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new curp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edad;
    private javax.swing.JLabel edad_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_rfc;
    // End of variables declaration//GEN-END:variables

    
}
