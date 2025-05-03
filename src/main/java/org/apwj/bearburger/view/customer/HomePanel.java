package org.apwj.bearburger.view.customer;

import javax.swing.border.*;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.apwj.bearburger.view.LoginPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static org.apwj.bearburger.App.mainFrame;

public class HomePanel extends JPanel {

    public static User LOGGED_IN_USER;
    public static JFrame cartFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    public HomePanel(int userId) {
        initComponents();
        LOGGED_IN_USER = userDao.searchById(userId);
        usernameLabel.setText(LOGGED_IN_USER.getUsername());
        logoutLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LOGGED_IN_USER = null;
                mainFrame.setContentPane(new LoginPanel().panel);
                mainFrame.pack();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });
    }


    private void browse(ActionEvent e) {
        BrowseFoodsPanel browseFoodsPanel = new BrowseFoodsPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(browseFoodsPanel.panel);
        subHomePanel.validate();
    }

    private void search(ActionEvent e) {
        SearchPanel searchPanel = new SearchPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(searchPanel.panel);
        subHomePanel.validate();
    }

    private void foodCart(ActionEvent e) {
        PaymentPanel paymentPanel = new PaymentPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(paymentPanel.panel);
        subHomePanel.validate();
//        Chat chat = new Chat();
//        subHomePanel.setLayout(new java.awt.BorderLayout());
//        subHomePanel.removeAll();
//        subHomePanel.add(chat);
//        subHomePanel.validate();
    }

    private void userProfile(ActionEvent e) {
        ProfileViewPanel profileViewPanel = new ProfileViewPanel(LOGGED_IN_USER.getUserId());
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileViewPanel.panel);
        subHomePanel.validate();
    }

    private void projectDetails(ActionEvent e) {
        ProjectDetails projectDetails = new ProjectDetails();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(projectDetails.panel);
        subHomePanel.validate();
    }

    private void viewCart(ActionEvent e) {
        cartFrame.setTitle("Food Cart");
        cartFrame.setResizable(false);
        CartPanel cartPanel = new CartPanel();
        cartFrame.setContentPane(cartPanel.panel);
        cartFrame.pack();
        cartFrame.setLocationRelativeTo(null);
        cartFrame.setVisible(true);
        cartFrame.setAlwaysOnTop(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		panel = new JPanel();
		subHomePanel = new JPanel();
		browseButton = new JButton();
		searchButton = new JButton();
		usernameLabel = new JLabel();
		logoutLabel = new JLabel();
		logo = new JLabel();
		viewCart = new JButton();
		userProfileButton = new JButton();
		foodCartButton = new JButton();

		//======== panel ========
		{
			panel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
			javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax
			. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
			.awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,panel. getBorder( )) ); panel. addPropertyChangeListener (new java. beans.
			PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .
			equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

			//======== subHomePanel ========
			{

				GroupLayout subHomePanelLayout = new GroupLayout(subHomePanel);
				subHomePanel.setLayout(subHomePanelLayout);
				subHomePanelLayout.setHorizontalGroup(
					subHomePanelLayout.createParallelGroup()
						.addGap(0, 728, Short.MAX_VALUE)
				);
				subHomePanelLayout.setVerticalGroup(
					subHomePanelLayout.createParallelGroup()
						.addGap(0, 0, Short.MAX_VALUE)
				);
			}

			//---- browseButton ----
			browseButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
			browseButton.setBorder(new LineBorder(new Color(0x21252b)));
			browseButton.setText("Sesiones");
			browseButton.addActionListener(e -> browse(e));

			//---- searchButton ----
			searchButton.setText("Informes");
			searchButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
			searchButton.setBorder(new LineBorder(new Color(0x21252b)));
			searchButton.addActionListener(e -> search(e));

			//---- usernameLabel ----
			usernameLabel.setText("Username");
			usernameLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));
			usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);

			//---- logoutLabel ----
			logoutLabel.setText("Logout");
			logoutLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
			logoutLabel.setForeground(new Color(0xff3333));
			logoutLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			logoutLabel.setHorizontalAlignment(SwingConstants.CENTER);

			//---- logo ----
			logo.setIcon(new ImageIcon(getClass().getResource("/img/phybo-logo-4.3.png")));
			logo.setDisabledIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));

			//---- viewCart ----
			viewCart.setText("View Cart");
			viewCart.setFont(new Font("Segoe UI", Font.BOLD, 22));
			viewCart.addActionListener(e -> viewCart(e));

			//---- userProfileButton ----
			userProfileButton.setText("Diagn\u00f3stico");
			userProfileButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
			userProfileButton.setBorder(new LineBorder(new Color(0x21252b)));
			userProfileButton.addActionListener(e -> userProfile(e));

			//---- foodCartButton ----
			foodCartButton.setText("Chat");
			foodCartButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
			foodCartButton.setBorder(new LineBorder(new Color(0x21252b)));
			foodCartButton.addActionListener(e -> {
			foodCart(e);
			foodCart(e);
		});

			GroupLayout panelLayout = new GroupLayout(panel);
			panel.setLayout(panelLayout);
			panelLayout.setHorizontalGroup(
				panelLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
						.addGroup(panelLayout.createParallelGroup()
							.addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
							.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(searchButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addComponent(browseButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
							.addGroup(panelLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(panelLayout.createParallelGroup()
									.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(logoutLabel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
									.addComponent(viewCart, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
									.addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
							.addGroup(panelLayout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addComponent(logo, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
						.addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			panelLayout.setVerticalGroup(
				panelLayout.createParallelGroup()
					.addGroup(panelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelLayout.createParallelGroup()
							.addGroup(panelLayout.createSequentialGroup()
								.addComponent(logo, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(viewCart, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addGap(9, 9, 9)
								.addComponent(usernameLabel)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(logoutLabel)
								.addGap(0, 20, Short.MAX_VALUE))
							.addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
			);
		}
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	public JPanel panel;
	public static JPanel subHomePanel;
	private JButton browseButton;
	private JButton searchButton;
	private JLabel usernameLabel;
	private JLabel logoutLabel;
	private JLabel logo;
	private JButton viewCart;
	private JButton userProfileButton;
	private JButton foodCartButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
