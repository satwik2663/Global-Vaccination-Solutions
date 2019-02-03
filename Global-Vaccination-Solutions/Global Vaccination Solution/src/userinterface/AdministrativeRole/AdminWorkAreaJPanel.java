

package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    UserAccount userAccount;
    EcoSystem ecosystem;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Network network,UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network=network;
        this.userAccount=userAccount;
        this.ecosystem=ecosystem;
        valueLabel.setText(userAccount.getUsername());
        dateLabel.setText(" " + new Date());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        ManageRequestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrganizationJButton1 = new javax.swing.JButton();
        RequestServicesJButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 510, 80));

        userJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userJButton.setText("Manage Credentials");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 220, -1));

        ManageRequestJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ManageRequestJButton.setText("Manage Requests");
        ManageRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRequestJButtonActionPerformed(evt);
            }
        });
        add(ManageRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 220, -1));

        enterpriseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        enterpriseLabel.setText("Welcome");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 80, 50));

        valueLabel.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 130, -1));

        manageOrganizationJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageOrganizationJButton1.setText("Manage Organization");
        manageOrganizationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton1ActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 220, -1));

        RequestServicesJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RequestServicesJButton.setText("Request/View Services");
        RequestServicesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestServicesJButtonActionPerformed(evt);
            }
        });
        add(RequestServicesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 220, -1));

        dateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("<value>");
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void ManageRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRequestJButtonActionPerformed

        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Vaccination")){
            
            
        VaccinationViewServicesJPanel viewservicesJPanel = new VaccinationViewServicesJPanel( userProcessContainer,  enterprise,  network, userAccount, ecosystem);
        userProcessContainer.add("manageServicesReceived", viewservicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Hospital")){
            
            
        HospitalViewServicesJPanel viewservicesJPanel = new HospitalViewServicesJPanel( userProcessContainer,  enterprise,  network, userAccount, ecosystem);
        userProcessContainer.add("manageServicesReceived", viewservicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
         else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Orphanage")){
            
            
        OrphanageViewServicesJPanel viewservicesJPanel = new OrphanageViewServicesJPanel( userProcessContainer,  enterprise,  network, userAccount, ecosystem);
        userProcessContainer.add("manageServicesReceived", viewservicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
       
    }//GEN-LAST:event_ManageRequestJButtonActionPerformed

    private void manageOrganizationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton1ActionPerformed
        // TODO add your handling code here:
         ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer,enterprise.getEnterpriseType().getValue(), enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButton1ActionPerformed

    private void RequestServicesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestServicesJButtonActionPerformed
        // TODO add your handling code here:
         RequestServicesJPanel rsjp = new RequestServicesJPanel(userProcessContainer, enterprise, network, userAccount);
        userProcessContainer.add("RequestServicesJPanel", rsjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestServicesJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageRequestJButton;
    private javax.swing.JButton RequestServicesJButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton1;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}