package sourceFiles;


import javax.swing.JOptionPane;



public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
Utility.initialize();
Utility.centreWindow(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        imageLbl = new javax.swing.JLabel();
        staticInfoLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMI = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        bookMenu = new javax.swing.JMenu();
        issueBookMI = new javax.swing.JMenuItem();
        submitBookMI = new javax.swing.JMenuItem();
        searchBookMI = new javax.swing.JMenuItem();
        selectABookMI = new javax.swing.JMenuItem();
        issuedBooksMI = new javax.swing.JMenuItem();
        modifyMenu = new javax.swing.JMenu();
        addBook = new javax.swing.JMenuItem();
        modifyBookRecord = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        userMenu = new javax.swing.JMenu();
        addUserMI = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WelCome To Library Managment Program");
        setBounds(new java.awt.Rectangle(250, 65, 0, 0));
        setFont(new java.awt.Font("JasmineUPC", 1, 24)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/66.png"))); // NOI18N
        imageLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        staticInfoLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        staticInfoLbl.setForeground(new java.awt.Color(255, 0, 0));
        staticInfoLbl.setText("Check the File Menu for Facilities");

        fileMenu.setText("File");

        exitMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitMI.setText("Exit");
        exitMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMIActionPerformed(evt);
            }
        });
        fileMenu.add(exitMI);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(aboutMenuItem);

        menuBar.add(fileMenu);

        bookMenu.setText("BookMenu");
        bookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookMenuActionPerformed(evt);
            }
        });

        issueBookMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbook.png"))); // NOI18N
        issueBookMI.setText("Issue A Book");
        issueBookMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookMIActionPerformed(evt);
            }
        });
        bookMenu.add(issueBookMI);

        submitBookMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issuebook.png"))); // NOI18N
        submitBookMI.setText("Submit A Book");
        submitBookMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBookMIActionPerformed(evt);
            }
        });
        bookMenu.add(submitBookMI);

        searchBookMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/srchbook.png"))); // NOI18N
        searchBookMI.setText("Search A Book");
        searchBookMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookMIActionPerformed(evt);
            }
        });
        bookMenu.add(searchBookMI);

        selectABookMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/subBook.png"))); // NOI18N
        selectABookMI.setText("Select Book");
        selectABookMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectABookMIActionPerformed(evt);
            }
        });
        bookMenu.add(selectABookMI);

        issuedBooksMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issuebook.png"))); // NOI18N
        issuedBooksMI.setText("list Of Issued Books");
        issuedBooksMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedBooksMIActionPerformed(evt);
            }
        });
        bookMenu.add(issuedBooksMI);

        menuBar.add(bookMenu);

        modifyMenu.setText("Modify Record");

        addBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbook.png"))); // NOI18N
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        modifyMenu.add(addBook);

        modifyBookRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modbook.png"))); // NOI18N
        modifyBookRecord.setText("Modify Book Records");
        modifyBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBookRecordActionPerformed(evt);
            }
        });
        modifyMenu.add(modifyBookRecord);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        jMenuItem3.setText("Delete Book");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        modifyMenu.add(jMenuItem3);

        menuBar.add(modifyMenu);

        userMenu.setText("User");

        addUserMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        addUserMI.setText("Add User");
        addUserMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserMIActionPerformed(evt);
            }
        });
        userMenu.add(addUserMI);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        jMenuItem1.setText("Edit User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        userMenu.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        jMenuItem2.setText("Delete User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        userMenu.add(jMenuItem2);

        menuBar.add(userMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(staticInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void issueBookMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookMIActionPerformed
 new BookMenus().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_issueBookMIActionPerformed

    private void submitBookMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBookMIActionPerformed
new BookMenus().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_submitBookMIActionPerformed

    private void searchBookMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookMIActionPerformed
 new BookMenus().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_searchBookMIActionPerformed

    private void issuedBooksMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedBooksMIActionPerformed
//new IssuedBooks().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_issuedBooksMIActionPerformed

    private void bookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookMenuActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_bookMenuActionPerformed

    private void selectABookMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectABookMIActionPerformed
new BookMenus().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_selectABookMIActionPerformed

    private void modifyBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBookRecordActionPerformed
new BookManipulation().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_modifyBookRecordActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
new BookManipulation().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_addBookActionPerformed

    private void exitMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMIActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMIActionPerformed

    private void addUserMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserMIActionPerformed
new UserMenu().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_addUserMIActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   new UserMenu().setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   new UserMenu().setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
new BookManipulation().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
new About().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
    
       new SplashScreen(1000);
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new LoginForm().setVisible(true);
                
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem addBook;
    private javax.swing.JMenuItem addUserMI;
    private javax.swing.JMenu bookMenu;
    private javax.swing.JMenuItem exitMI;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JMenuItem issueBookMI;
    private javax.swing.JMenuItem issuedBooksMI;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modifyBookRecord;
    private javax.swing.JMenu modifyMenu;
    private javax.swing.JMenuItem searchBookMI;
    private javax.swing.JMenuItem selectABookMI;
    private javax.swing.JLabel staticInfoLbl;
    private javax.swing.JMenuItem submitBookMI;
    private javax.swing.JMenu userMenu;
    // End of variables declaration//GEN-END:variables

}
