
package intrack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CompanyPage extends javax.swing.JPanel {

    private MainWindow window;
    DefaultTableModel companyTableModel;

    
    public CompanyPage(MainWindow aThis) {
        this.window = aThis;
        initComponents();
        
        companyTableModel = new DefaultTableModel(
        new Object[]{"Name", "Location", "Application Date", "Required Hours"}, 0
        );
        CompanyTable.setModel(companyTableModel);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        GoToDashboard = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        Location = new javax.swing.JTextField();
        location = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        ApplicationDate = new javax.swing.JTextField();
        hours = new javax.swing.JLabel();
        RequiredHours = new javax.swing.JTextField();
        jpane = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("SF Compact Display", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Company Profile");

        GoToDashboard.setBackground(java.awt.SystemColor.controlHighlight);
        GoToDashboard.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        GoToDashboard.setText("Go to Dashboard");
        GoToDashboard.setBorderPainted(false);
        GoToDashboard.setDefaultCapable(false);
        GoToDashboard.setRequestFocusEnabled(false);
        GoToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToDashboardActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        name.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name:");

        Location.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        location.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        location.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        location.setText("Location:");

        date.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Application Date:");

        ApplicationDate.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        hours.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N
        hours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours.setText("Required Hours:");

        RequiredHours.setFont(new java.awt.Font("SF Compact Display", 0, 14)); // NOI18N

        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Application Date", "Required Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jpane.setViewportView(CompanyTable);

        addButton.setBackground(new java.awt.Color(51, 153, 255));
        addButton.setFont(new java.awt.Font("SF Compact Display", 0, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorderPainted(false);
        addButton.setDefaultCapable(false);
        addButton.setRequestFocusEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpane))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(name)
                                        .addGap(40, 40, 40)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(date)
                                        .addGap(18, 18, 18)
                                        .addComponent(ApplicationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(location)
                                        .addGap(23, 23, 23)
                                        .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(hours)
                                        .addGap(24, 24, 24)
                                        .addComponent(RequiredHours, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(jLabel3)))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GoToDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApplicationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(date))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RequiredHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(location)
                            .addComponent(hours))))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jpane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoToDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void GoToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToDashboardActionPerformed
        GoToDashboard.addActionListener(e -> window.showPage("dashboard"));
    }//GEN-LAST:event_GoToDashboardActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String cname = Name.getText().trim();
        String clocation = Location.getText().trim();
        String cdate = ApplicationDate.getText().trim();
        String chours = RequiredHours.getText().trim();
        
        if (cname.isEmpty() || clocation.isEmpty() || cdate.isEmpty() || chours.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }
        
        try{
            Integer.parseInt(chours);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Required Hours must be a number.");
            return;
        }
        
        companyTableModel.addRow(new Object[]{cname, clocation, cdate, chours});
        
//        clears texts
        Name.setText("");
        Location.setText("");
        ApplicationDate.setText("");
        RequiredHours.setText("");
        
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApplicationDate;
    private javax.swing.JTable CompanyTable;
    private javax.swing.JButton GoToDashboard;
    private javax.swing.JTextField Location;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField RequiredHours;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jpane;
    private javax.swing.JLabel location;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
