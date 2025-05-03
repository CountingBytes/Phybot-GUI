package org.apwj.bearburger.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.apwj.bearburger.App.mainFrame;

public class MainPanel {

    public MainPanel() {
        initComponents();
    }

    private void getStarted(ActionEvent e) {
        LoginPanel loginPanel = new LoginPanel();
        mainFrame.setContentPane(loginPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		panel = new JPanel();
		buttonGetStarted = new JButton();
		label2 = new JLabel();

		//======== panel ========
		{
			panel.setMaximumSize(new Dimension(1025, 575));
			panel.setForeground(new Color(0xeeeeee));
			panel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
			( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
			. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,panel. getBorder( )) ); panel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
			propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
			; }} );

			//---- buttonGetStarted ----
			buttonGetStarted.setText("Get Started");
			buttonGetStarted.setFont(new Font("Segoe UI", Font.BOLD, 22));
			buttonGetStarted.setBorderPainted(false);
			buttonGetStarted.setBackground(new Color(0x6699ff));
			buttonGetStarted.setForeground(Color.white);
			buttonGetStarted.addActionListener(e -> {
			getStarted(e);
			getStarted(e);
		});

			//---- label2 ----
			label2.setIcon(new ImageIcon(getClass().getResource("/img/medicalrehab.png")));
			label2.setHorizontalAlignment(SwingConstants.CENTER);

			GroupLayout panelLayout = new GroupLayout(panel);
			panel.setLayout(panelLayout);
			panelLayout.setHorizontalGroup(
				panelLayout.createParallelGroup()
					.addComponent(label2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
					.addGroup(panelLayout.createSequentialGroup()
						.addGap(416, 416, 416)
						.addComponent(buttonGetStarted, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(443, Short.MAX_VALUE))
			);
			panelLayout.setVerticalGroup(
				panelLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(buttonGetStarted, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35))
			);
		}
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	public JPanel panel;
	private JButton buttonGetStarted;
	private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
