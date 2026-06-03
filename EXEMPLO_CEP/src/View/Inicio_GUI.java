package View;

public class Inicio_GUI extends javax.swing.JFrame {
    public Inicio_GUI() {
        initComponents();
        ok_img.setVisible(false);
        erro_img.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CEP_TXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SAIR_TXT = new javax.swing.JButton();
        RUA_TXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BAIRRO_TXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CIDADE_TXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ESTADO_TXT = new javax.swing.JTextField();
        PESQUISAR_BTN = new javax.swing.JButton();
        mem_txt = new javax.swing.JLabel();
        LIMPAR_BTN = new javax.swing.JButton();
        erro_img = new javax.swing.JLabel();
        ok_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.setToolTipText("Digite o CEP com traço (12345-678)");

        CEP_TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CEP_TXT.setToolTipText("");
        CEP_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEP_TXTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEP");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(CEP_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CEP_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 30, 350, 80);

        SAIR_TXT.setText("SAIR");
        SAIR_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIR_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(SAIR_TXT);
        SAIR_TXT.setBounds(400, 80, 150, 30);

        RUA_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUA_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(RUA_TXT);
        RUA_TXT.setBounds(80, 160, 290, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Rua:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 160, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Bairro:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 210, 70, 30);

        BAIRRO_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAIRRO_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(BAIRRO_TXT);
        BAIRRO_TXT.setBounds(80, 210, 290, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cidade:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 270, 70, 30);

        CIDADE_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDADE_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(CIDADE_TXT);
        CIDADE_TXT.setBounds(80, 270, 290, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 330, 80, 30);

        ESTADO_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTADO_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(ESTADO_TXT);
        ESTADO_TXT.setBounds(80, 330, 290, 30);

        PESQUISAR_BTN.setText("PESQUISAR");
        PESQUISAR_BTN.setToolTipText("Clique para pesquisar");
        PESQUISAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PESQUISAR_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(PESQUISAR_BTN);
        PESQUISAR_BTN.setBounds(400, 30, 150, 30);
        jPanel1.add(mem_txt);
        mem_txt.setBounds(390, 180, 170, 30);

        LIMPAR_BTN.setText("LIMPAR");
        LIMPAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPAR_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(LIMPAR_BTN);
        LIMPAR_BTN.setBounds(400, 123, 150, 30);

        erro_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erro_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/no.png"))); // NOI18N
        jPanel1.add(erro_img);
        erro_img.setBounds(490, 270, 80, 80);

        ok_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ok_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ok.png"))); // NOI18N
        jPanel1.add(ok_img);
        ok_img.setBounds(390, 270, 80, 80);

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

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CEP_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEP_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEP_TXTActionPerformed

    private void RUA_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUA_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RUA_TXTActionPerformed

    private void BAIRRO_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAIRRO_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAIRRO_TXTActionPerformed

    private void CIDADE_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDADE_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDADE_TXTActionPerformed

    private void ESTADO_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTADO_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESTADO_TXTActionPerformed

    private void SAIR_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIR_TXTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SAIR_TXTActionPerformed

    private void PESQUISAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PESQUISAR_BTNActionPerformed
     Model.Pesquisa_DAO.buscarCep(CEP_TXT.getText());
    }//GEN-LAST:event_PESQUISAR_BTNActionPerformed

    private void LIMPAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPAR_BTNActionPerformed
        ok_img.setVisible(false);
        erro_img.setVisible(false);
        mem_txt.setText("");
        CEP_TXT.setText("");
        RUA_TXT.setText("");
        BAIRRO_TXT.setText("");
        CIDADE_TXT.setText("");
        ESTADO_TXT.setText("");
    }//GEN-LAST:event_LIMPAR_BTNActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BAIRRO_TXT;
    public static javax.swing.JTextField CEP_TXT;
    public static javax.swing.JTextField CIDADE_TXT;
    public static javax.swing.JTextField ESTADO_TXT;
    private javax.swing.JButton LIMPAR_BTN;
    private javax.swing.JButton PESQUISAR_BTN;
    public static javax.swing.JTextField RUA_TXT;
    private javax.swing.JButton SAIR_TXT;
    public static javax.swing.JLabel erro_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel mem_txt;
    public static javax.swing.JLabel ok_img;
    // End of variables declaration//GEN-END:variables
}
