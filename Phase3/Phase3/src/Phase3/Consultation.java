
package Phase3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author seni
 */
public class Consultation extends javax.swing.JFrame {
    
    static String rf;
    static int x=0;
    static int y=0;
    static String c1=" ";
    static ArrayList<String> Consultation = new ArrayList<>();

    /**
     * Creates new form Consultation
     */
    public Consultation() {
        
        initComponents();
        
        this.setResizable(false);
        
        this.setBounds(550, 50, 900,1000);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textDoctorn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textDateConsult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textConsultationtime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPtientName = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        doctordetailsBtn = new javax.swing.JButton();
        patientdetailsBtn = new javax.swing.JButton();
        costcalBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textNotearea = new javax.swing.JTextArea();
        textEncrypt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Consultation");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel1.setText("Doctor Name");

        textDoctorn.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        textDoctorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDoctornActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel2.setText("Date of Consultation");
        jLabel2.setToolTipText("");

        textDateConsult.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        textDateConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDateConsultActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel3.setText("Time of Consultation");

        textConsultationtime.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        textConsultationtime.setToolTipText("");
        textConsultationtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultationtimeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel4.setText("Patient Name");

        textPtientName.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        textPtientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPtientNameActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        doctordetailsBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        doctordetailsBtn.setText("Doctor Details");
        doctordetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctordetailsBtnActionPerformed(evt);
            }
        });

        patientdetailsBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        patientdetailsBtn.setText("Patient Details");
        patientdetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientdetailsBtnActionPerformed(evt);
            }
        });

        costcalBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        costcalBtn.setText("Cost Calculation");
        costcalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costcalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doctordetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientdetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(costcalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(doctordetailsBtn)
                .addGap(28, 28, 28)
                .addComponent(patientdetailsBtn)
                .addGap(18, 18, 18)
                .addComponent(costcalBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel5.setText("Patient Note");

        textNotearea.setColumns(20);
        textNotearea.setRows(5);
        jScrollPane1.setViewportView(textNotearea);

        textEncrypt.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        textEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEncryptActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel6.setText("Cost For Consultation");

        textCost.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel7.setText("(Encrypted Note)");

        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textDoctorn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDateConsult, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textConsultationtime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPtientName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCost, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addGap(201, 201, 201)
                .addComponent(closeBtn)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkBtn)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDoctorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBtn)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDateConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textConsultationtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(textPtientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 126, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearBtn)
                            .addComponent(addBtn)
                            .addComponent(closeBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

         if(textDoctorn.getText().length()<=0 || textDateConsult.getText().length()<=0 || textConsultationtime.getText().length()<=0
                || textNotearea.getText().length()<=0){
                    JOptionPane.showMessageDialog( null, "Important Text Fields are Empty");
        }
         else{
         
        String a=" ";
        String b=" ";
        String d=" ";
        String j=" ";
        String f=" ";
        String h=" ";
        
        a=textDoctorn.getText();
        b=textDateConsult.getText();
        d=textConsultationtime.getText();
        f=textNotearea.getText();
        
       
        
        Noteencrypt c=new Noteencrypt();
        String g= textNotearea.getText();
        String n=c.edisplay(g);
        textEncrypt.setText(n);
        
       // Patient p1=new Patient();
        textPtientName.setText(rf);
        textCost.setText(c1);
        
        
           try
        {
            
            h=c1;
            j=rf;
        
       // File myObj = new File("filename.txt");
       // myObj.createNewFile();
       // System.out.println("File created: " + myObj.getName());

        FileWriter myWriter = new FileWriter("Consultation.txt",true);
        
            myWriter.write("Doctor Name:"+a+ "\n");
            myWriter.write("Date of Consultation:"+b+ "\n");
            myWriter.write("Time of Consultation:"+d+ "\n");
            myWriter.write("Patient Name:"+j+ "\n");
            myWriter.write("Patient Note:"+f+ "\n");
            myWriter.write("Cost For Consultation:"+h+ "\n");
            
        
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
    catch(IOException e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
    }
           
           Consultation.add(a);
          
           
         JOptionPane.showMessageDialog( null, "Succesfully Updated"); 
         }
   
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        textDoctorn.setText(" ");
        textDateConsult.setText(" ");
        textConsultationtime.setText(" ");
        textPtientName.setText(" ");
        textNotearea.setText(" ");
        textEncrypt.setText(" ");
        textCost.setText(" ");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
       
        Mainmenu m=new Mainmenu();
        m.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void doctordetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctordetailsBtnActionPerformed
       
        Doctorlist dl=new Doctorlist();
        dl.setVisible(true);
    }//GEN-LAST:event_doctordetailsBtnActionPerformed

    private void patientdetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientdetailsBtnActionPerformed

        
        
        
    //    Patient p=new Patient();
      //  p.setVisible(true);
        
        if(x==0){
        
            Patient p1=new Patient();
           p1.setVisible(true);
        }
        
        x=x+1;
        
        
    
    }//GEN-LAST:event_patientdetailsBtnActionPerformed

    private void costcalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costcalBtnActionPerformed

        
         if(y==0){
        
            Cost p2=new Cost();
           p2.setVisible(true);
        }
        
        y=y+1;
    }//GEN-LAST:event_costcalBtnActionPerformed

    private void textDoctornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDoctornActionPerformed
   
    }//GEN-LAST:event_textDoctornActionPerformed

    private void textDateConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDateConsultActionPerformed
      
    }//GEN-LAST:event_textDateConsultActionPerformed

    private void textConsultationtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultationtimeActionPerformed
      
    }//GEN-LAST:event_textConsultationtimeActionPerformed

    private void textPtientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPtientNameActionPerformed
      
    }//GEN-LAST:event_textPtientNameActionPerformed

    private void textEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEncryptActionPerformed
      
    }//GEN-LAST:event_textEncryptActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed

        String z = textDoctorn.getText();
      
        if (Consultation.contains(z)){
           
            JOptionPane.showMessageDialog(null,"Already book a Consultation to this Doctor");
        }
        else{
            JOptionPane.showMessageDialog(null,"You are not book a Consultation to this Doctor yet");
        }
    }//GEN-LAST:event_checkBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton costcalBtn;
    private javax.swing.JButton doctordetailsBtn;
    javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton patientdetailsBtn;
    private javax.swing.JTextField textConsultationtime;
    private javax.swing.JTextField textCost;
    private javax.swing.JTextField textDateConsult;
    private javax.swing.JTextField textDoctorn;
    private javax.swing.JTextField textEncrypt;
    private javax.swing.JTextArea textNotearea;
    private javax.swing.JTextField textPtientName;
    // End of variables declaration//GEN-END:variables
}
