/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;

import com.LocaZilla.control.marca.MarcaControle;
import com.LocaZilla.control.operador.IOperadorControle;
import javax.swing.JOptionPane;
import com.LocaZilla.model.operador.Operador;
import com.LocaZilla.control.operador.OperadorControle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.nio.file.StandardCopyOption;


/**
 *
 * @author pedro
 */
public class TelaCadastroOperador extends javax.swing.JFrame {
    
    
    
    //Atributos
    
    IOperadorControle operadorControle = new OperadorControle();
    ImageIcon img = new ImageIcon("./src/com/LocaZilla/imagens/operador/LocaMini.png");
    
    
    /**
     * Creates new form TelaCadastroOperador
     */
    public TelaCadastroOperador() {
        initComponents();
        
        MarcaControle conferirBanco = new MarcaControle();
        
        conferirBanco.conferirBancoDeIDMarca();
        
        OperadorControle operadorBanco = new OperadorControle();
        
        operadorBanco.conferirBancoDeDados();
        
        
       //-------------------------------------
        jTextURLOperador.setEnabled(false);
        jTextIDOperador.setEnabled(false);
        this.setLocationRelativeTo(null);
        
        try {
            imprimirDadosNaGridOperador(operadorControle.listagemOperador());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
        
        //-------------------------------------
        
        
    }
    
    
    
    private void imprimirDadosNaGridOperador(ArrayList<Operador> listadeOperadores){
        try {
            DefaultTableModel model =  (DefaultTableModel) jTableOperadores.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Operador> lista = listadeOperadores.iterator();
            while(lista.hasNext()){
                String[] saida= new String[5];
                Operador aux = lista.next();
                saida[0]= aux.getIdOperador()+"";
                saida[1]= aux.getNomeOperador();
                saida[2] = aux.getSenhaOperador();
                saida[3] = aux.getUrlOperador();
                saida[4] = "";
                //Incluir nova linha na Tabela
                model.addRow(saida);
         } 
            jTableOperadores.setModel(model);
        } catch(Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
      } 
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextURLOperador = new javax.swing.JTextField();
        jButtonFotoOperadorNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVoltarTelaMarcas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFotoOperadorNovo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNomeOperadorNovo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextIDOperador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOperadores = new javax.swing.JTable();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jTextFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Operador");
        setBackground(new java.awt.Color(153, 153, 153));
        setIconImage(img.getImage());
        setPreferredSize(new java.awt.Dimension(800, 700));

        jTextURLOperador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButtonFotoOperadorNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/uploadicon_1.png"))); // NOI18N
        jButtonFotoOperadorNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoOperadorNovoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 188, 69));
        jLabel2.setText("Cadastro de Operadores");

        jButtonVoltarTelaMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Voltar.png"))); // NOI18N
        jButtonVoltarTelaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaMarcasActionPerformed(evt);
            }
        });
        jButtonVoltarTelaMarcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVoltarTelaMarcasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha");

        jLabelFotoOperadorNovo.setForeground(new java.awt.Color(153, 153, 153));
        jLabelFotoOperadorNovo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 188, 69), new java.awt.Color(240, 188, 69)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Id");

        jTextNomeOperadorNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextNomeOperadorNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomeOperadorNovoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("URL");

        jTextIDOperador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jTableOperadores.setBackground(new java.awt.Color(51, 51, 51));
        jTableOperadores.setForeground(new java.awt.Color(240, 188, 69));
        jTableOperadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Operador", "Senha", "URL", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOperadores.setRowHeight(100);
        jTableOperadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOperadoresMouseClicked(evt);
            }
        });
        jTableOperadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableOperadoresKeyPressed(evt);
            }
        });
        jTableOperadores.setAlignmentX(5.0F);

        jTableOperadores.setColumnSelectionAllowed(true);

        jTableOperadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableOperadores.setFillsViewportHeight(true);

        jTableOperadores.setFocusCycleRoot(true);

        jTableOperadores.setGridColor(new java.awt.Color(240, 188, 69));

        jTableOperadores.setRowHeight(100);

        jTableOperadores.setShowGrid(false);
        jScrollPane1.setViewportView(jTableOperadores);
        if (jTableOperadores.getColumnModel().getColumnCount() > 0) {
            jTableOperadores.getColumnModel().getColumn(4).setCellRenderer(new com.LocaZilla.Tools.operador.TabelaImagemOperador());
        }
        jTableOperadores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButtonIncluir.setBackground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Mais.png"))); // NOI18N
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        jButtonIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIncluirKeyPressed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(240, 188, 69));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(102, 102, 102));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Alterar.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jButtonAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAlterarKeyPressed(evt);
            }
        });

        jTextFieldSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextURLOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIDOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNomeOperadorNovo)
                                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelFotoOperadorNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFotoOperadorNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFotoOperadorNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFotoOperadorNovo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextIDOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextNomeOperadorNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextURLOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFotoOperadorNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoOperadorNovoActionPerformed
        // TODO add your handling code here:
        
        try {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("Image files",new String[] { "png", "jpg", "jpeg", "gif" }));
            fc.setCurrentDirectory(new File("C:\\"));
            Action details = fc.getActionMap().get("Go Up");
            details.actionPerformed(null);
            details.actionPerformed(null);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            if(arquivo != null){
                
                String nomeDoArquivo = arquivo.getPath();
                jTextURLOperador.setText(nomeDoArquivo);
                ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
                iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                    jLabelFotoOperadorNovo.getWidth(),jLabelFotoOperadorNovo.getHeight(),1));
                    jLabelFotoOperadorNovo.setIcon(iconLogo);     
                    File origemArquivo = new File(nomeDoArquivo);
                    File destinoArquivo = new File("./src/com/LocaZilla/Dados/operador/ImagemOperador/"+jTextNomeOperadorNovo.getText()+".jpeg");
                    
                    String saidaMascara = destinoArquivo+"";
                    
                    jTextURLOperador.setText(saidaMascara.replace(".JPG",""));
                    
                    try {
                    
                    Files.copy(origemArquivo.toPath(), destinoArquivo.toPath(),StandardCopyOption.REPLACE_EXISTING);
                    
                } catch (Exception e) {
                }
             
            }
            
       }    catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        
        
    }//GEN-LAST:event_jButtonFotoOperadorNovoActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
      
        try {
            Operador objeto = new Operador(0, jTextNomeOperadorNovo.getText(), jTextFieldSenha.getText(),
                    jTextURLOperador.getText());
            operadorControle.incluirOperador(objeto);
            imprimirDadosNaGridOperador(operadorControle.listagemOperador());
            
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

        
        
        
        jTextNomeOperadorNovo.setText("");
        jTextIDOperador.setText("");
        jTextFieldSenha.setText("");
        jLabelFotoOperadorNovo.setIcon(null);
        
        
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
         if(jTextNomeOperadorNovo.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Selecione um operador antes de alterar.");
           }else{
             
         
        try {
            Operador obj = new Operador(Integer.parseInt(jTextIDOperador.getText()), jTextNomeOperadorNovo.getText(), jTextFieldSenha.getText(),
                    jTextURLOperador.getText());
            operadorControle.alterarOperador(obj);
            imprimirDadosNaGridOperador(operadorControle.listagemOperador());
            jTextNomeOperadorNovo.setText("");
            jTextURLOperador.setText("");
            jTextFieldSenha.setText("");
            jLabelFotoOperadorNovo.setIcon(null);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
            }
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableOperadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOperadoresMouseClicked
        // TODO add your handling code here:
        
        
        try {
              
            this.jTextIDOperador.setText((String) this.jTableOperadores.getValueAt(jTableOperadores.getSelectedRow(), 0));
            this.jTextNomeOperadorNovo.setText((String) this.jTableOperadores.getValueAt(jTableOperadores.getSelectedRow(), 1));
            this.jTextFieldSenha.setText((String) this.jTableOperadores.getValueAt(jTableOperadores.getSelectedRow(), 2));
            this.jTextURLOperador.setText((String) this.jTableOperadores.getValueAt(jTableOperadores.getSelectedRow(), 3));
            String nomeArquivo = (String) this.jTableOperadores.getValueAt(jTableOperadores.getSelectedRow(), 3);
            
            jTextURLOperador.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelFotoOperadorNovo.getWidth(), jLabelFotoOperadorNovo.getHeight(), java.awt.Image.SCALE_SMOOTH));
            jLabelFotoOperadorNovo.setIcon(iconLogo);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Selecione um operador válido já cadastrado!");
        }
        
        
    }//GEN-LAST:event_jTableOperadoresMouseClicked
    
    private void jButtonVoltarTelaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasActionPerformed
        // TODO add your handling code here:

        super.dispose();

    }//GEN-LAST:event_jButtonVoltarTelaMarcasActionPerformed

    private void jTextNomeOperadorNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeOperadorNovoKeyPressed
        // TODO add your handling code here:            
            char e = evt.getKeyChar();
            evt.setKeyChar(Character.toUpperCase(e));
            if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTextNomeOperadorNovoKeyPressed

    private void jButtonVoltarTelaMarcasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonVoltarTelaMarcasKeyPressed

    private void jTextFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSenhaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTextFieldSenhaKeyPressed

    private void jButtonIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIncluirKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonIncluirKeyPressed

    private void jButtonAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAlterarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonAlterarKeyPressed

    private void jTableOperadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableOperadoresKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTableOperadoresKeyPressed

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
            java.util.logging.Logger.getLogger(TelaCadastroOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroOperador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonFotoOperadorNovo;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonVoltarTelaMarcas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFotoOperadorNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOperadores;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextIDOperador;
    private javax.swing.JTextField jTextNomeOperadorNovo;
    private javax.swing.JTextField jTextURLOperador;
    // End of variables declaration//GEN-END:variables
}
