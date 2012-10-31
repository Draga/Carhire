/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DefaultController;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author sujan
 */
public class PersonInfoViewPanel extends AbstractViewPanel {

    private DefaultController controller;
    
    /**
     * Creates new form TestViewPanel
     */
    public PersonInfoViewPanel(DefaultController controller) {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();

        lblName.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        lblName.setText("Name Here");

        lblAddress.setText("Address");

        lblPhone.setText("Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblAddress)
                    .addComponent(lblPhone))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhone)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    // End of variables declaration//GEN-END:variables

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(DefaultController.PERSON_ADDRESS_PROPERTY)){
            String newAddress = evt.getNewValue().toString();
            if(!this.lblAddress.getText().equals(newAddress))
                this.lblAddress.setText(newAddress);
        }
        
        if(evt.getPropertyName().equals(DefaultController.PERSON_NAME_PROPERTY)){
            String newName = evt.getNewValue().toString();
            if(!this.lblName.getText().equals(newName))
                this.lblName.setText(newName);
        }
        if(evt.getPropertyName().equals(DefaultController.PERSON_TELEPHONE_PROPERTY)){
            String newName = evt.getNewValue().toString();
            if(!this.lblPhone.getText().equals(newName))
                this.lblPhone.setText(newName);
        }
    }
}
