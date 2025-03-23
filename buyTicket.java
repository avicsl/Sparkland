
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class buyTicket extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private String name = "";
    private String contactNumber = "";
    
    public void date(){
        DateTimeFormatter dates = DateTimeFormatter .ofPattern("MMMM dd, yyyy");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dates.format(now));
    }
    
    public void time(){
        DateTimeFormatter times = DateTimeFormatter .ofPattern("hh : mm a");
        LocalDateTime now = LocalDateTime.now();
        time.setText(times.format(now));
    }
    
    public buyTicket() {
        super ("Sparkland!");
        initComponents();
        this.setLocation(270, 120);
        date();
        time();
        DateForTomorrow(); 
    }
    
   public boolean quantity(int quantity) {
    return quantity != 0;
}

    public void reset(){
        jButton7.setEnabled(true);
        total = 0.0;
        x = 0;
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField2.setText("0.0");
        jTextField6.setText("");
        jTextArea1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);    
    }
    
    public void totalTextArea (){
        jTextField2.setText(String.valueOf(total));
    }
    
    public void DateForTomorrow() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
    jTextField5.setText(formatter.format(tomorrow));
    jTextField5.setEditable(false);
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(184, 76, 101));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sparkland");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 290, -1));

        jButton3.setBackground(new java.awt.Color(184, 76, 101));
        jButton3.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 90, 30));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(184, 76, 101));
        jLabel3.setText("Ticket Purchased:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 10));

        jPanel4.setBackground(new java.awt.Color(255, 179, 196));

        jButton7.setBackground(new java.awt.Color(184, 76, 101));
        jButton7.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jButton7.setText("TOTAL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0.0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(184, 76, 101));
        jButton9.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jButton9.setText("PAY");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(184, 76, 101));
        jButton8.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jButton8.setText("RESET");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField6))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 220, 360));

        jPanel2.setBackground(new java.awt.Color(245, 166, 199));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 76, 101));
        jLabel2.setText("SPARK ELITE PASS");

        jSpinner1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel19.setFont(new java.awt.Font("Lucida Fax", 0, 9)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(184, 76, 101));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("VIP Pass Holder");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(184, 76, 101));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("₱ 1,200");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jCheckBox4.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(184, 76, 101));
        jCheckBox4.setText("Add to Cart");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jCheckBox4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 180, 80));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(184, 76, 101));
        jLabel4.setText("Contact Number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 100, 10));

        jLabel20.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(184, 76, 101));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Reminder: Bring your valid ID for verification at the park (Any Valid ID, Senior Citizen ID or PWD ID).");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 750, 10));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(184, 76, 101));
        jLabel5.setText("Visit Date:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 10));

        jPanel5.setBackground(new java.awt.Color(245, 166, 199));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(184, 76, 101));
        jLabel6.setText("TWINKLE PASS");

        jSpinner2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel22.setFont(new java.awt.Font("Lucida Fax", 0, 9)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(184, 76, 101));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Children 36-47 inches tall");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(184, 76, 101));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("₱ 700");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jCheckBox1.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(184, 76, 101));
        jCheckBox1.setText("Add to Cart");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, 80));

        jPanel6.setBackground(new java.awt.Color(245, 166, 199));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(184, 76, 101));
        jLabel7.setText("GLOW PASS");

        jSpinner3.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel24.setFont(new java.awt.Font("Lucida Fax", 0, 9)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(184, 76, 101));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Senior citizens, pregnant, & PWDs");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(184, 76, 101));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("₱ 640");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jCheckBox3.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(184, 76, 101));
        jCheckBox3.setText("Add to Cart");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jCheckBox3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, 80));

        jPanel7.setBackground(new java.awt.Color(245, 166, 199));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(184, 76, 101));
        jLabel8.setText("RADIANCE PASS");

        jSpinner4.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel26.setFont(new java.awt.Font("Lucida Fax", 0, 9)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(184, 76, 101));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("General Admission");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(184, 76, 101));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("₱ 800");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jCheckBox2.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(184, 76, 101));
        jCheckBox2.setText("Add to Cart");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 180, 80));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(184, 76, 101));
        jLabel9.setText("Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 10));

        jTextField3.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 300, -1));

        jLabel29.setFont(new java.awt.Font("Lucida Fax", 3, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(184, 76, 101));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("We're thrilled to help you secure your tickets for an unforgettable experience at Sparkland, where every moment is a spark of joy and excitement!");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 820, -1));

        jButton1.setBackground(new java.awt.Color(184, 76, 101));
        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jButton1.setText("TICKET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 40));

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

        jTextField4.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 280, -1));

        jLabel28.setFont(new java.awt.Font("Lucida Fax", 3, 8)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(184, 76, 101));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tickets must only be purchased one day before your visit and are valid only on that date.");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 520, 10));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(184, 76, 101));
        jLabel10.setText("Date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 30, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(184, 76, 101));
        jLabel12.setText("Time:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 40, -1));

        date.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 11, 120, 30));

        time.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 120, 30));

        jTextField5.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 520, -1));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        start start = new start();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    if(total==0.0){
            JOptionPane.showMessageDialog(null,"You haven't selected item.");
        }else{
            jTextArea1.setText(jTextArea1.getText()
                +"\n--------------------------------------------------------\n"
            +"Total: \t\t"+total+"\n"
            +"----Experience the magic of Sparkland!----\n"      
            );
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    reset();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    String inputText = jTextField6.getText();
    try {
    double inputValue = Double.parseDouble(inputText);

    if (inputValue == total) {
        int quantitySparkElite = (int) jSpinner1.getValue();
        int quantityGlow = (int) jSpinner3.getValue();
        int quantityTwinkle = (int) jSpinner2.getValue();
        int quantityRadiance = (int) jSpinner4.getValue();
        
        // Get total tickets to be added
        int totalQuantity = quantitySparkElite + quantityGlow + quantityTwinkle + quantityRadiance;
        
        TicketManager ticketManager = TicketManager.getInstance();

        // Check if adding this many tickets exceeds the maximum limit
        if (ticketManager.isQueueFull()) {
            JOptionPane.showMessageDialog(this, "Ticket queue is full. No more tickets can be added.");
            return;
        }

        int remainingTickets = ticketManager.remainingTickets();
        if (totalQuantity > remainingTickets) {
            JOptionPane.showMessageDialog(this, "You can only add " + remainingTickets + " more tickets.");
            return;
        }

        boolean allQuantitiesZero = !quantity(quantitySparkElite) 
                                 && !quantity(quantityGlow) 
                                 && !quantity(quantityTwinkle) 
                                 && !quantity(quantityRadiance);

        if (allQuantitiesZero) {
            JOptionPane.showMessageDialog(this, "Please increase the ticket quantity.");
            return;
        }

        String name = jTextField3.getText();
        String contactNumber = jTextField4.getText();
        String bookingDate = date.getText();
        String visitDate = jTextField5.getText();

        // Add Spark Elite Pass tickets
        for (int i = 0; i < quantitySparkElite; i++) {
            Ticket ticket = new Ticket(name, contactNumber, bookingDate, visitDate, "Spark Elite Pass", 1);
            ticketManager.ticketQueue.add(ticket);
        }

        // Add Glow Pass tickets
        for (int i = 0; i < quantityGlow; i++) {
            Ticket ticket = new Ticket(name, contactNumber, bookingDate, visitDate, "Glow Pass", 1);
            ticketManager.ticketQueue.add(ticket);
        }

        // Add Twinkle Pass tickets
        for (int i = 0; i < quantityTwinkle; i++) {
            Ticket ticket = new Ticket(name, contactNumber, bookingDate, visitDate, "Twinkle Pass", 1);
            ticketManager.ticketQueue.add(ticket);
        }

        // Add Radiance Pass tickets
        for (int i = 0; i < quantityRadiance; i++) {
            Ticket ticket = new Ticket(name, contactNumber, bookingDate, visitDate, "Radiance Pass", 1);
            ticketManager.ticketQueue.add(ticket);
        }

        // Reset fields after saving
        jTextField3.setText("");
        jTextField4.setText("");
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jTextField6.setText("");

        jTextArea1.setText(jTextArea1.getText()
            + "-----------------------------------------------------------\n"
            + "Time: " + time.getText() + "\n" 
            + "-----Experience the magic of Sparkland!------\n"
        );
        jButton1.setEnabled(false);
        JOptionPane.showMessageDialog(this, "You successfully booked your adventure tomorrow!\nSee you tomorrow at Sparkland!");

        reset();
    } else {
        JOptionPane.showMessageDialog(this, "Please enter the exact amount.");
        jTextField6.setText("");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    jTextField6.setText("");
}

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    String inputName = jTextField3.getText();
    String inputContactNumber = jTextField4.getText();
    
    if (inputName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter your name.");
        return;
    }
    if (!inputContactNumber.matches("^09\\d{9}$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid contact number. \n Format: 09XXXXXXXXX.");
        return;
    }
    name = inputName;
    contactNumber = inputContactNumber;

    int quantity = Integer.parseInt(jSpinner2.getValue().toString());
    if (quantity(quantity) && jCheckBox1.isSelected()) {
        x++;
        if (x == 1) {
            receipt(); 
        }
        double price = quantity * 700;   
        total += price;
        jTextArea1.setText(jTextArea1.getText() + 
            x + ". " + jLabel6.getText() + " (" + quantity + " pcs)            " + price + "\n");
        totalTextArea();
        
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
    
    }//GEN-LAST:event_dateActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    String inputName = jTextField3.getText();
    String inputContactNumber = jTextField4.getText();
    
    if (inputName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter your name.");
        return;
    }
    if (!inputContactNumber.matches("^09\\d{9}$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid contact number. \n Format: 09XXXXXXXXX.");
        return;
    }
    name = inputName;
    contactNumber = inputContactNumber;
    
    int quantity = Integer.parseInt(jSpinner4.getValue().toString());
    if (quantity(quantity) && jCheckBox2.isSelected()) {
        x++;
        if (x == 1) {
            receipt();
        }
        double price = quantity * 800;   
        total +=price;
        jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel8.getText() + " (" + quantity + " pcs)           " + price + "\n");
        totalTextArea();
        
    }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
    String inputName = jTextField3.getText();
    String inputContactNumber = jTextField4.getText();
    
    if (inputName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter your name.");
        return;
    }
    if (!inputContactNumber.matches("^09\\d{9}$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid contact number. \n Format: 09XXXXXXXXX.");
        return;
    }
    name = inputName;
    contactNumber = inputContactNumber;
    
    int quantity = Integer.parseInt(jSpinner3.getValue().toString());
    if (quantity(quantity) && jCheckBox3.isSelected()) {
        x++;
        if (x == 1) {
            receipt();
        }
        double price = quantity * 640;   
        total +=price;
        jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel7.getText() + " (" + quantity + " pcs)                  " + price + "\n");
        totalTextArea();
    }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
    String inputName = jTextField3.getText();
    String inputContactNumber = jTextField4.getText();
    
    if (inputName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter your name.");
        return;
    }
    if (!inputContactNumber.matches("^09\\d{9}$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid contact number. \n Format: 09XXXXXXXXX.");
        return;
    }
    name = inputName;
    contactNumber = inputContactNumber;
    
    int quantity = Integer.parseInt(jSpinner1.getValue().toString());
    if (quantity(quantity) && jCheckBox4.isSelected()) {
        x++;
        if (x == 1) {
            receipt();
        }
        double price = quantity * 1200;   
        total +=price;
        jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel2.getText() + " (" + quantity + " pcs)      " + price + "\n");
        totalTextArea();
        
    }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    
    }//GEN-LAST:event_jTextField5ActionPerformed

    public void receipt() {
    jTextArea1.setText(
        "----------------------Sparkland!----------------------\n" +
        "Date of Booking: " + date.getText() + "\n" +
        "Date of Visit: " + jTextField5.getText() + "\n" +
        "-----------------------------------------------------------\n" +
        "Name: " + name + "\n" +
        "Contact Number: " + contactNumber + "\n" +
        "-----------------------------------------------------------\n" +
        "Ticket Purchased                          Price(₱)\n"
    );
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
            java.util.logging.Logger.getLogger(buyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
