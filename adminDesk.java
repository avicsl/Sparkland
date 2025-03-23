import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;

public class adminDesk extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public adminDesk() {
        super("Admin Access Only");
        initComponents();
        this.setLocation(270, 120);
        initializeTableModel();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                populateTable(); // Populate table with ticket data
            }
        });
    }

    private void populateTable() {
   
    tableModel.setRowCount(0);
    TicketManager ticketManager = TicketManager.getInstance();
    PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>(ticketManager.ticketQueue);
    
    while (!ticketQueue.isEmpty()) {
        Ticket ticket = ticketQueue.poll(); 

        
        tableModel.addRow(new Object[]{
            ticket.getName(),
            ticket.getContactNumber(),
            ticket.getBookingDate(),
            ticket.getVisitDate(),
            ticket.getPassType(),
            ticket.getQuantity(),
            ticket.getTimestamp()
        });
    }
}

    private void initializeTableModel() {
       String[] columnNames = {"Name", "Contact Number", "Booking Date", "Visit Date", "Pass Type", "Quantity", "Timestamp"};

        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // All cells are non-editable
            }
        };
        jTable1.setModel(tableModel);
    }
    
    private int getPassPriority(String passType) {
        switch (passType) {
            case "Spark Elite Pass", "Glow Pass":
                return 1; // Highest priority
            case "Twinkle Pass", "Radiance Pass":
                return 2; // Lower priority
            default:
                return Integer.MAX_VALUE; // For any unknown pass type
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(184, 76, 101));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sparkland");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 290, -1));

        jButton1.setBackground(new java.awt.Color(184, 76, 101));
        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jButton1.setText("ADMIN DESK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, 40));

        jPanel3.setBackground(new java.awt.Color(184, 76, 101));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 130, 1050, 20));

        jButton3.setBackground(new java.awt.Color(184, 76, 101));
        jButton3.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 90, 30));

        jTable1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 217, 940, 280));

        jTextField3.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 420, -1));

        jButton7.setBackground(new java.awt.Color(184, 76, 101));
        jButton7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton7.setText("ENTER THE PARK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 160, 30));

        jLabel29.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(184, 76, 101));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Remaining Ticket to be Sold");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 150, 10));

        jButton8.setBackground(new java.awt.Color(184, 76, 101));
        jButton8.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jButton8.setText("PEEK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jButton9.setBackground(new java.awt.Color(184, 76, 101));
        jButton9.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jButton9.setText("REMAINING TICKET");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 150, -1));

        jButton10.setBackground(new java.awt.Color(184, 76, 101));
        jButton10.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jButton10.setText("PENDING TICKET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 150, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(184, 76, 101));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Show the next in Queue");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 420, 10));

        jLabel31.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(184, 76, 101));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Maximum Queue: 10");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 100, 10));

        jLabel32.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(184, 76, 101));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Number of Ticket in Queue");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 150, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alvhin\\Downloads\\amusement park gif (5).gif")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        start start = new start();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    TicketManager ticketManager = TicketManager.getInstance();
    PriorityQueue<Ticket> ticketQueue = ticketManager.ticketQueue;

    if (ticketQueue.isEmpty()) {
        JOptionPane.showMessageDialog(this, "There is no booking yet.", "Welcome to Sparkland!", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    Ticket removedTicket = ticketQueue.poll();
    ticketManager.ticketQueue = ticketQueue;
    jTextField3.setText("");
    populateTable();
    JOptionPane.showMessageDialog(this,
        "Ticket Processed: " + removedTicket.getName() + "\n"
        + "Pass Type: " + removedTicket.getPassType() + "\n"
        + "Timestamp: " + removedTicket.getTimestamp(), "Already Entered the Sparkland!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    TicketManager ticketManager = TicketManager.getInstance();
    PriorityQueue<Ticket> ticketQueue = ticketManager.ticketQueue;

    if (ticketQueue.isEmpty()) {
        jTextField3.setText("There is no booking yet.");
        return;
    }
    Ticket firstTicket = ticketQueue.peek();
    String ticketDetails = "Name: " + firstTicket.getName() + " | " +
                           "Pass Type: " + firstTicket.getPassType() + " | " +
                           "Timestamp: " + firstTicket.getTimestamp();
    jTextField3.setText(ticketDetails);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    TicketManager ticketManager = TicketManager.getInstance();
    int maxTickets = 10;
    int currentTickets = ticketManager.ticketQueue.size();
    int remainingTickets = maxTickets - currentTickets;
    JOptionPane.showMessageDialog(this, "Remaining tickets available for sale: " + remainingTickets);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    TicketManager ticketManager = TicketManager.getInstance();
    int numberOfTickets = ticketManager.ticketQueue.size();
    if (numberOfTickets == 0) {
    JOptionPane.showMessageDialog(this, "There are no tickets in the queue.");
} else {
    // Otherwise, show the number of tickets in the queue
    JOptionPane.showMessageDialog(this, "Number of tickets in the queue: " + numberOfTickets);
}
    }//GEN-LAST:event_jButton10ActionPerformed

    
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
            java.util.logging.Logger.getLogger(adminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
