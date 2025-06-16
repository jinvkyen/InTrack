
package intrack;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DashboardPage extends javax.swing.JPanel {
    private MainWindow window;
    
    Connection conn = DB.connect();
    DefaultTableModel progressTableModel;
    
    public DashboardPage(MainWindow aThis) {
        this.window = aThis;
        initComponents();
        
        for (int i = 1; i <= 9; i++) {
            Hours.addItem(String.valueOf(i));
        }
        
        // progress table
        progressTableModel = new DefaultTableModel(
          new Object[]{"Task", "Role", "Hours"}, 0
        );
        ProgressTable.setModel(progressTableModel);
        
        progressTableModel = (DefaultTableModel) ProgressTable.getModel();
        
        // load progress data
        loadProgressTableData();
    }
    
    private void loadProgressTableData() {
       try (Connection conn = DB.connect();
         var stmt = conn.createStatement();
         var rs = stmt.executeQuery("SELECT task, role, hours FROM progress")) {

        // Clear existing rows
        progressTableModel.setRowCount(0);

        // Add rows from the database
        while (rs.next()) {
            String task = rs.getString("task");
            String role = rs.getString("role");
            int hours = rs.getInt("hours");

            progressTableModel.addRow(new Object[]{task, role, hours});
        }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load progress data.");
        }
             
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Task = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Role = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProgressTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        BackToComp = new javax.swing.JButton();
        Hours = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(880, 580));

        jLabel3.setFont(new java.awt.Font("SF Compact Display", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Progress Details");

        Task.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Task:");

        jLabel6.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Role / Position:");

        Role.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hours:");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorderPainted(false);
        jButton1.setDefaultCapable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ProgressTable.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        ProgressTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Task", "Role", "Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProgressTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jProgressBar1.setBackground(new java.awt.Color(242, 242, 242));
        jProgressBar1.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(102, 255, 0));
        jProgressBar1.setToolTipText("progress bar");

        jLabel1.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.controlDkShadow);
        jLabel1.setText("Total completed Hours:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );

        BackToComp.setBackground(java.awt.SystemColor.controlHighlight);
        BackToComp.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        BackToComp.setText("Go Back");
        BackToComp.setToolTipText("");
        BackToComp.setBorderPainted(false);
        BackToComp.setDefaultCapable(false);
        BackToComp.setRequestFocusEnabled(false);
        BackToComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToCompActionPerformed(evt);
            }
        });

        Hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        Hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackToComp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Hours, javax.swing.GroupLayout.Alignment.TRAILING, 0, 238, Short.MAX_VALUE)
                                .addComponent(Role, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Task, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackToComp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackToCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToCompActionPerformed
        BackToComp.addActionListener(e -> window.showPage("company"));
    }//GEN-LAST:event_BackToCompActionPerformed

    private void HoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoursActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String task = Task.getText().trim();
        String role = Role.getText().trim();
        String hours = (String) Hours.getSelectedItem();
        
        
        if (task.isEmpty() || role.isEmpty() || hours.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }
        
         
            try (Connection conn = DB.connect()) {
            String sql = "INSERT INTO progress(task, role, hours) VALUES (?, ?, ?)";
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, task);
            pstmt.setString(2, role);
            pstmt.setInt(3, Integer.parseInt(hours));
            pstmt.executeUpdate();

            // add to table display
            progressTableModel.addRow(new Object[]{task, role, hours});
            
            // load table display
            loadProgressTableData();

            // clear fields
            Task.setText("");
            Role.setText("");
            Hours.setSelectedIndex(0);
            

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting progress data.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToComp;
    private javax.swing.JComboBox<String> Hours;
    private javax.swing.JTable ProgressTable;
    private javax.swing.JTextField Role;
    private javax.swing.JTextField Task;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
