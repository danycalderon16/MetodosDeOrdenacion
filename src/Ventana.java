
import com.sun.javafx.binding.StringFormatter;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SB-D1
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(this);
        ma = (DefaultTableModel) tblA.getModel();
        mb = (DefaultTableModel) tblB.getModel();
        mc = (DefaultTableModel) tblC.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTam = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblA = new javax.swing.JTable();
        btnBurbuja = new javax.swing.JButton();
        btnQuickSort = new javax.swing.JButton();
        btnShellSort = new javax.swing.JButton();
        btnRadix = new javax.swing.JButton();
        btnMezlaDirecta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblC = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblB = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarB = new javax.swing.JButton();
        txtTamB = new javax.swing.JTextField();
        btnIntercalarAyB = new javax.swing.JButton();
        btnIntercalarListas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMezclaNatural = new javax.swing.JButton();
        btnAddAyB = new javax.swing.JButton();
        btnSemi = new javax.swing.JButton();
        tiempoDir = new javax.swing.JLabel();
        tiempoNat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tamaño ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 62, 28));
        jPanel1.add(txtTam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 66, 28));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar A");
        btnAgregar.setOpaque(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 225, -1));

        tblA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblA.setEnabled(false);
        jScrollPane1.setViewportView(tblA);
        if (tblA.getColumnModel().getColumnCount() > 0) {
            tblA.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 275, 400));

        btnBurbuja.setBackground(new java.awt.Color(255, 255, 255));
        btnBurbuja.setText("Ordenar Burbuja");
        btnBurbuja.setOpaque(false);
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 171, -1));

        btnQuickSort.setBackground(new java.awt.Color(255, 255, 255));
        btnQuickSort.setText("QuickSort");
        btnQuickSort.setOpaque(false);
        btnQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSortActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 171, -1));

        btnShellSort.setBackground(new java.awt.Color(255, 255, 255));
        btnShellSort.setText("Shell");
        btnShellSort.setOpaque(false);
        btnShellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShellSortActionPerformed(evt);
            }
        });
        jPanel1.add(btnShellSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 171, -1));

        btnRadix.setBackground(new java.awt.Color(255, 255, 255));
        btnRadix.setText("RadixSort");
        btnRadix.setOpaque(false);
        btnRadix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadixActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadix, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 171, -1));

        btnMezlaDirecta.setBackground(new java.awt.Color(255, 255, 255));
        btnMezlaDirecta.setText("Mezcla directa");
        btnMezlaDirecta.setOpaque(false);
        btnMezlaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMezlaDirectaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMezlaDirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 171, -1));

        tblC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblC);
        if (tblC.getColumnModel().getColumnCount() > 0) {
            tblC.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 160, 400));

        tblB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblB);
        if (tblB.getColumnModel().getColumnCount() > 0) {
            tblB.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 275, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tamaño ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 62, 28));

        btnAgregarB.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarB.setText("Agregar B");
        btnAgregarB.setOpaque(false);
        btnAgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 225, -1));
        jPanel1.add(txtTamB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 66, 28));

        btnIntercalarAyB.setBackground(new java.awt.Color(255, 255, 255));
        btnIntercalarAyB.setText("Intercalar");
        btnIntercalarAyB.setOpaque(false);
        btnIntercalarAyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntercalarAyBActionPerformed(evt);
            }
        });
        jPanel1.add(btnIntercalarAyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 160, -1));

        btnIntercalarListas.setBackground(new java.awt.Color(255, 255, 255));
        btnIntercalarListas.setText("Intercalar Listas");
        btnIntercalarListas.setOpaque(false);
        btnIntercalarListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntercalarListasActionPerformed(evt);
            }
        });
        jPanel1.add(btnIntercalarListas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 160, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Metodos de ordenación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 60));

        btnMezclaNatural.setBackground(new java.awt.Color(255, 255, 255));
        btnMezclaNatural.setText("Mezcla natural");
        btnMezclaNatural.setOpaque(false);
        btnMezclaNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMezclaNaturalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMezclaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 170, -1));

        btnAddAyB.setBackground(new java.awt.Color(255, 255, 255));
        btnAddAyB.setText("Agregar A y B");
        btnAddAyB.setOpaque(false);
        btnAddAyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAyBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 170, -1));

        btnSemi.setBackground(new java.awt.Color(255, 255, 255));
        btnSemi.setText("Semiordenado");
        btnSemi.setOpaque(false);
        btnSemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSemi, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 170, -1));

        tiempoDir.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tiempoDir.setText("---");
        jPanel1.add(tiempoDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 170, 30));

        tiempoNat.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tiempoNat.setText("---");
        jPanel1.add(tiempoNat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mezcla Directa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mezcla Natural");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        n = Integer.parseInt(txtTam.getText());
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * 1000);          
            llenarTablaA();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed
        A = MetodosDeOrdenacion.bubleSort(A, n);
        llenarTablaA();
    }//GEN-LAST:event_btnBurbujaActionPerformed

    private void btnQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSortActionPerformed
        A = MetodosDeOrdenacion.quicksort(A, 0, A.length - 1);
        //B = MetodosDeOrdenacion.quicksort(B, 0, B.length - 1);

        llenarTablaA();
        for (int i = 0; i < A.length; i++) {
            LA.insertar(A[i]);
        }
    }//GEN-LAST:event_btnQuickSortActionPerformed

    private void btnShellSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShellSortActionPerformed
        A = MetodosDeOrdenacion.shellSort(A);
        llenarTablaA();
    }//GEN-LAST:event_btnShellSortActionPerformed

    private void btnRadixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadixActionPerformed
        A = MetodosDeOrdenacion.radixSort(A);
        llenarTablaA();
    }//GEN-LAST:event_btnRadixActionPerformed

    private void btnMezlaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMezlaDirectaActionPerformed
        long inicio = System.nanoTime();
        String M[][] = MetodosDeOrdenacion.mezclaDirecta(A);
        long finalT = System.nanoTime();
        ma.getDataVector().removeAllElements();
        revalidate();
        ma.setColumnCount(M[0].length);
        for (String[] row: M) 
            ma.addRow(row);
        tiempoDir.setText(String.format("%d ns", (finalT-inicio)));
    }//GEN-LAST:event_btnMezlaDirectaActionPerformed

    private void btnAgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBActionPerformed
        if(txtTam.getText().isEmpty())
            nb = 16;
        else         
            nb = Integer.parseInt(txtTamB.getText());
        /*N = new String[n];
        for (int i = 0; i < n; i++) {
            N[i] = showInputDialog(this,"Dame el nombre");           
            llenarTablaN();
        }*/

        B = new int[nb];
        for (int i = 0; i < nb; i++) {
            B[i] = (int) (Math.random() * 1000);
        }
        B = MetodosDeOrdenacion.quicksort(B, 0, B.length - 1);
        mb.setRowCount(nb);
        for (int i = 0; i < nb; i++) {
            mb.setValueAt(B[i], i, 0);
            LB.insertar(B[i]);
        }

    }//GEN-LAST:event_btnAgregarBActionPerformed

    private void btnIntercalarAyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntercalarAyBActionPerformed
        C = MetodosDeOrdenacion.intercalar(A, B);
        mc.setRowCount(C.length);
        for (int i = 0; i < C.length; i++) {
            mc.setValueAt(C[i], i, 0);
        }

    }//GEN-LAST:event_btnIntercalarAyBActionPerformed

    private void btnIntercalarListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntercalarListasActionPerformed
        LC = intercalar(LA, LB);
        NodoEnt t = LC.getInicio();
        mc.setRowCount(0);
        while (t != null) {
            Object O[] = new Object[1];
            O[0] = t.getDato();
            t = t.getSig();
            mc.addRow(O);
        }
    }//GEN-LAST:event_btnIntercalarListasActionPerformed

    private void btnMezclaNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMezclaNaturalActionPerformed
        long inicio = System.nanoTime();
        String M[][] = MetodosDeOrdenacion.mezclaNatural(B);
        long finalT = System.nanoTime();
        mb.getDataVector().removeAllElements();
        revalidate();
        mb.setColumnCount(M[0].length);               
        for (String[] row: M) 
            mb.addRow(row);
        
        tiempoNat.setText(String.format("%d ns", (finalT-inicio)));
    }//GEN-LAST:event_btnMezclaNaturalActionPerformed

    private void btnAddAyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAyBActionPerformed
        if(txtTam.getText().isEmpty())
            n = 16;
        else         
            n = Integer.parseInt(txtTam.getText());
        ma.getDataVector().removeAllElements();
        mb.getDataVector().removeAllElements();
        revalidate();
        A = new int[n];
        B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * 1000); 
            B[i] = A[i];
            llenarTabla(A, ma, n);      
            llenarTabla(B, mb, n);
        }
    }//GEN-LAST:event_btnAddAyBActionPerformed

    private void btnSemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemiActionPerformed
        if(txtTam.getText().isEmpty())
            n = 16;
        else         
            n = Integer.parseInt(txtTam.getText());      
        ma.getDataVector().removeAllElements();
        mb.getDataVector().removeAllElements();
        revalidate();
        A = new int[n];
        B = new int[n];
        A[0] = B [0] = n;
        for (int i = 1; i < n; i++) {
            A[i] = i; 
            B[i] = A[i];
            llenarTabla(A, ma, n);      
            llenarTabla(B, mb, n);
        }
    }//GEN-LAST:event_btnSemiActionPerformed

    public ListaSE intercalar(ListaSE A, ListaSE B) {
        ListaSE C = new ListaSE();

        while (A.getInicio() != null && B.getInicio() != null) {
            if (A.getInicio().getDato() <= B.getInicio().getDato()) {
                C.insertar(A.getInicio().getDato());
                A.setInicio(A.getInicio().getSig());
            } else {
                C.insertar(B.getInicio().getDato());
                B.setInicio(B.getInicio().getSig());
            }
        }
        while (A.getInicio() != null) {
            C.insertar(A.getInicio().getDato());
            A.setInicio(A.getInicio().getSig());
        }
        while (B.getInicio() != null) {
            C.insertar(B.getInicio().getDato());
            B.setInicio(B.getInicio().getSig());
        }

        return C;
    }

    private void llenarTabla(int I[], DefaultTableModel dm,int tam) {
        dm.setRowCount(tam);
        for (int i = 0; i < tam; i++) {
            dm.setValueAt(I[i], i, 0);
        }
    }
    

    private void llenarTablaA() {
        ma.setRowCount(n);
        for (int i = 0; i < n; i++) {
            ma.setValueAt(A[i], i, 0);
        }
    }

    private void llenarTablaB() {
        mb.setRowCount(nb);
        for (int i = 0; i < nb; i++) {
            mb.setValueAt(B[i], i, 0);
        }
    }

    private void llenarTablaC() {
        ma.setRowCount(n);
        for (int i = 0; i < n; i++) {
            ma.setValueAt(A[i], i, 0);
        }
    }

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    private String N[];
    private int n = 0;
    private int nb = 0;

    private int aray[][][] = new int[7][15][32];

    private int A[];
    private int B[];
    private int C[];
    private DefaultTableModel ma;
    private DefaultTableModel mb;
    private DefaultTableModel mc;
    private ListaSE LA = new ListaSE();
    private ListaSE LB = new ListaSE();
    private ListaSE LC = new ListaSE();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAyB;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarB;
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnIntercalarAyB;
    private javax.swing.JButton btnIntercalarListas;
    private javax.swing.JButton btnMezclaNatural;
    private javax.swing.JButton btnMezlaDirecta;
    private javax.swing.JButton btnQuickSort;
    private javax.swing.JButton btnRadix;
    private javax.swing.JButton btnSemi;
    private javax.swing.JButton btnShellSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblA;
    private javax.swing.JTable tblB;
    private javax.swing.JTable tblC;
    private javax.swing.JLabel tiempoDir;
    private javax.swing.JLabel tiempoNat;
    private javax.swing.JTextField txtTam;
    private javax.swing.JTextField txtTamB;
    // End of variables declaration//GEN-END:variables
}
