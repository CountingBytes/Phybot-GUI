package org.apwj.bearburger.view.customer;

import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.customer.HomePanel.subHomePanel;

public class ProfileViewPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    User loggedInUser = null;

    public ProfileViewPanel(int userId) {

        initComponents();

        loggedInUser = userDao.searchById(userId);
        usernameLabel.setText(loggedInUser.getUsername());
        emailLabel.setText(loggedInUser.getEmail());
        phoneLabel.setText(loggedInUser.getPhone());
        genderLabel.setText(loggedInUser.getGender());
        reg_date_label.setText(String.valueOf(loggedInUser.getReg_date()));
    }

    private void modify(ActionEvent e) {

        ProfileModifyPanel profileModifyPanel = new ProfileModifyPanel(loggedInUser);
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileModifyPanel.panel);
        subHomePanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		panel = new JPanel();
		label5 = new JLabel();
		modifyButton = new JButton();
		label2 = new JLabel();
		usernameLabel = new JLabel();
		label4 = new JLabel();
		emailLabel = new JLabel();
		label6 = new JLabel();
		phoneLabel = new JLabel();
		label7 = new JLabel();
		genderLabel = new JLabel();
		label8 = new JLabel();
		reg_date_label = new JLabel();
		label9 = new JLabel();
		label11 = new JLabel();
		reg_date_label3 = new JLabel();
		usernameLabel2 = new JLabel();
		usernameLabel3 = new JLabel();
		usernameLabel4 = new JLabel();
		usernameLabel5 = new JLabel();

		//======== panel ========
		{
			panel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
			0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
			. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
			red) ,panel. getBorder( )) ); panel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
			beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

			//---- label5 ----
			label5.setText("Detalles del paciente");
			label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
			label5.setHorizontalAlignment(SwingConstants.CENTER);

			//---- modifyButton ----
			modifyButton.setText("Modify");
			modifyButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
			modifyButton.setVisible(false);
			modifyButton.addActionListener(e -> modify(e));

			//---- label2 ----
			label2.setText("Nombre");
			label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- usernameLabel ----
			usernameLabel.setText("Eduardo Rodr\u00edguez");
			usernameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			usernameLabel.setForeground(Color.white);
			usernameLabel.setVisible(false);

			//---- label4 ----
			label4.setText("Edad");
			label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- emailLabel ----
			emailLabel.setText("Hombre");
			emailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			emailLabel.setForeground(Color.white);
			emailLabel.setVisible(false);

			//---- label6 ----
			label6.setText("Sexo");
			label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- phoneLabel ----
			phoneLabel.setText("0123456789");
			phoneLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			phoneLabel.setForeground(Color.white);
			phoneLabel.setVisible(false);

			//---- label7 ----
			label7.setText("Patolog\u00eda");
			label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- genderLabel ----
			genderLabel.setText("x3 sesiones/semana + consulta presencial");
			genderLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			genderLabel.setForeground(Color.white);

			//---- label8 ----
			label8.setText("Fecha diagn\u00f3stico");
			label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- reg_date_label ----
			reg_date_label.setText("08/05/2024");
			reg_date_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			reg_date_label.setForeground(Color.white);

			//---- label9 ----
			label9.setText("Plan de tratamiento");
			label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- label11 ----
			label11.setText("Observaciones");
			label11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

			//---- reg_date_label3 ----
			reg_date_label3.setText("Dolor ascendente; diabetes tipo II");
			reg_date_label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			reg_date_label3.setForeground(Color.white);

			//---- usernameLabel2 ----
			usernameLabel2.setText("32 a\u00f1os");
			usernameLabel2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			usernameLabel2.setForeground(Color.white);

			//---- usernameLabel3 ----
			usernameLabel3.setText("Eduardo Rodr\u00edguez");
			usernameLabel3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			usernameLabel3.setForeground(Color.white);

			//---- usernameLabel4 ----
			usernameLabel4.setText("Hombre");
			usernameLabel4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			usernameLabel4.setForeground(Color.white);

			//---- usernameLabel5 ----
			usernameLabel5.setText("Fascitis plantar");
			usernameLabel5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
			usernameLabel5.setForeground(Color.white);

			GroupLayout panelLayout = new GroupLayout(panel);
			panel.setLayout(panelLayout);
			panelLayout.setHorizontalGroup(
				panelLayout.createParallelGroup()
					.addGroup(panelLayout.createSequentialGroup()
						.addGap(18, 18, 18)
						.addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(panelLayout.createParallelGroup()
							.addGroup(panelLayout.createSequentialGroup()
								.addComponent(label2)
								.addGap(18, 18, 18)
								.addComponent(usernameLabel3, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(panelLayout.createParallelGroup()
									.addGroup(panelLayout.createSequentialGroup()
										.addGroup(panelLayout.createParallelGroup()
											.addComponent(emailLabel)
											.addGroup(panelLayout.createSequentialGroup()
												.addGap(230, 230, 230)
												.addComponent(phoneLabel)))
										.addGap(0, 212, Short.MAX_VALUE))
									.addGroup(panelLayout.createSequentialGroup()
										.addComponent(usernameLabel)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
							.addGroup(panelLayout.createSequentialGroup()
								.addGroup(panelLayout.createParallelGroup()
									.addGroup(panelLayout.createSequentialGroup()
										.addComponent(label9, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(genderLabel))
									.addGroup(panelLayout.createSequentialGroup()
										.addComponent(label11)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(reg_date_label3, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE))
									.addGroup(panelLayout.createSequentialGroup()
										.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(label6)
											.addComponent(label4))
										.addGap(35, 35, 35)
										.addGroup(panelLayout.createParallelGroup()
											.addComponent(usernameLabel2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
											.addComponent(usernameLabel4, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
									.addGroup(panelLayout.createSequentialGroup()
										.addComponent(label7)
										.addGap(18, 18, 18)
										.addComponent(usernameLabel5, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
									.addGroup(panelLayout.createSequentialGroup()
										.addComponent(label8)
										.addGap(18, 18, 18)
										.addComponent(reg_date_label)))
								.addContainerGap(33, Short.MAX_VALUE))))
					.addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
						.addContainerGap())
			);
			panelLayout.setVerticalGroup(
				panelLayout.createParallelGroup()
					.addGroup(panelLayout.createSequentialGroup()
						.addGap(21, 21, 21)
						.addComponent(label5)
						.addGap(18, 18, 18)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(usernameLabel)
							.addComponent(usernameLabel3))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(usernameLabel2))
						.addGap(10, 10, 10)
						.addGroup(panelLayout.createParallelGroup()
							.addComponent(emailLabel)
							.addGroup(panelLayout.createSequentialGroup()
								.addGap(2, 2, 2)
								.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label6)
									.addComponent(usernameLabel4))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label7)
									.addComponent(phoneLabel)
									.addComponent(usernameLabel5))))
						.addGap(7, 7, 7)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(genderLabel)
							.addComponent(label9))
						.addGap(18, 18, 18)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label8)
							.addComponent(reg_date_label))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label11)
							.addComponent(reg_date_label3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
						.addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(56, 56, 56))
			);
		}
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	public JPanel panel;
	private JLabel label5;
	private JButton modifyButton;
	private JLabel label2;
	private JLabel usernameLabel;
	private JLabel label4;
	private JLabel emailLabel;
	private JLabel label6;
	private JLabel phoneLabel;
	private JLabel label7;
	private JLabel genderLabel;
	private JLabel label8;
	private JLabel reg_date_label;
	private JLabel label9;
	private JLabel label11;
	private JLabel reg_date_label3;
	private JLabel usernameLabel2;
	private JLabel usernameLabel3;
	private JLabel usernameLabel4;
	private JLabel usernameLabel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
