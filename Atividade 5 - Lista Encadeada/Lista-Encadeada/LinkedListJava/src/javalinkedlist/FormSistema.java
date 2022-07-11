package javalinkedlist;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {
    
    LinkedList<Atividade> lista = new LinkedList<>();
    Comparator<Atividade> compareTempo = (Atividade a1, Atividade a2) -> a1.getTempo() - a2.getTempo();
    
    public FormSistema() {
        initComponents();
        //carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        txtTempo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtPosicaoAdd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAtividades = new javax.swing.JTextArea();
        btnResolver = new javax.swing.JButton();
        txtPosicaoRemove = new javax.swing.JTextField();
        btnOrdPrioridade = new javax.swing.JButton();
        btnOrdTempo = new javax.swing.JButton();
        btnOrdNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/sistemas_info_logo_azul.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Atividade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Atividade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        txtPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPrioridade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prioridade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        txtTempo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTempo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/clipboard.png"))); // NOI18N
        btnAdd.setActionCommand("");
        btnAdd.setLabel("Adicionar Atividade");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPosicaoAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPosicaoAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/task.png"))); // NOI18N
        btnBuscar.setActionCommand("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPosicaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPosicaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Atividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        listAtividades.setEditable(false);
        listAtividades.setColumns(20);
        listAtividades.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listAtividades.setRows(5);
        listAtividades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Atividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane1.setViewportView(listAtividades);

        btnResolver.setBackground(new java.awt.Color(255, 255, 255));
        btnResolver.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/completed-task.png"))); // NOI18N
        btnResolver.setText("Resolver atividade");
        btnResolver.setActionCommand("");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        txtPosicaoRemove.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPosicaoRemove.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnOrdPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdPrioridade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdPrioridade.setLabel("Ordenar por prioridade");
        btnOrdPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdPrioridadeActionPerformed(evt);
            }
        });

        btnOrdTempo.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdTempo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdTempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdTempo.setText("Ordenar por tempo");
        btnOrdTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdTempoActionPerformed(evt);
            }
        });

        btnOrdNome.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdNome.setActionCommand("");
        btnOrdNome.setLabel("Ordenar por nome");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdPrioridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnResolver)
                        .addGap(5, 5, 5)
                        .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        btnOrdTempo.getAccessibleContext().setAccessibleName("Ordenar por tempo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Controle de Atividades");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
      /* String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Atividade p = new Atividade();
                leitura = line.split(",");
                System.out.println("Nome:"+leitura[0]+ " RG= " + leitura[1] + " , Idade=" + leitura[2] + "");
                p.setNome(leitura[0]);
                p.setRg(leitura[1]);
                int idade = (Integer.parseInt(leitura[2]));
                p.setIdade(idade);
                //addFila(p); // separar
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    void mostra(){
        listAtividades.setText("");
        if(!lista.isEmpty())
            for(Atividade a:lista)
                listAtividades.append(a + "\n");
    }
   
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Atividade a = new Atividade();
        a.setNome(txtNome.getText());
        a.setPrioridade(Integer.parseInt(txtPrioridade.getText()));
        a.setTempo(Integer.parseInt(txtTempo.getText()));
        if(txtPosicaoAdd.getText() .equals("")){
            lista.add(a);
        } else {
            lista.add(Integer.parseInt(txtPosicaoAdd.getText()), a);
        }
        mostra();
    }//GEN-LAST:event_btnAddActionPerformed

   
    
    
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        Atividade a;
        if(!lista.isEmpty()){
            if(txtPosicaoRemove.getText().equals("")){
                a = lista.remove();
            } else {
                a = lista.remove(Integer.parseInt(txtPosicaoRemove.getText()));
            }
            lblProx.setText(a.getNome());
        }
        mostra();
    }//GEN-LAST:event_btnResolverActionPerformed

    
    private void btnOrdPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdPrioridadeActionPerformed

    private void btnOrdTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdTempoActionPerformed
        lista.sort(compareTempo);
        mostra();
    }//GEN-LAST:event_btnOrdTempoActionPerformed

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        Collections.sort(lista);
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.JButton btnOrdPrioridade;
    private javax.swing.JButton btnOrdTempo;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JTextArea listAtividades;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPosicaoAdd;
    private javax.swing.JTextField txtPosicaoRemove;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
