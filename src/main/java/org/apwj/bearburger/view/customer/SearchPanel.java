package org.apwj.bearburger.view.customer;

import org.apwj.bearburger.dao.FoodDao;
import org.apwj.bearburger.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_COST_LABEL;
import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_FOODS_LABEL;
import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_COST;
import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_FOOD_NUMBER;
import static org.apwj.bearburger.view.customer.FoodDetails.FOOD_DETAILS_FRAME;

public class SearchPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    FoodDao foodDao = applicationContext.getBean("foodDao", FoodDao.class);

    private File selectedFood = null;
    private List<Food> foods;
    private final DefaultListModel<Food> foodListModel = new DefaultListModel<>();
    private final DefaultListModel<File> pdfListModel = new DefaultListModel<>();

    public SearchPanel() {

        initComponents();
        
        foods = foodDao.getAllFoods();
        File carpeta = new File("C:\\Users\\Aceri7\\git\\Phybot-GUI\\src\\main\\resources\\documents");
        File[] pdfs = carpeta.listFiles((dir, nombre) -> nombre.toLowerCase().endsWith(".pdf"));
        
        for(File pdf:pdfs)
        pdfListModel.addElement(pdf);
        foodItemsList.setModel(pdfListModel);
//        for(Food food:foods)
//            foodListModel.addElement(food);

        //foodItemsList.setModel(foodListModel);

        foodItemsList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedFood = (File) foodItemsList.getSelectedValue();
            }
        });
    }

    private void foodDetails(ActionEvent e) {

        if(selectedFood != null) {
            FOOD_DETAILS_FRAME.setTitle("BearBurger");
            FOOD_DETAILS_FRAME.setResizable(false);
            //FoodDetails foodDetails = new FoodDetails(((File) selectedFood));
            //FOOD_DETAILS_FRAME.setContentPane(foodDetails.panel);
            FOOD_DETAILS_FRAME.pack();
            FOOD_DETAILS_FRAME.setLocationRelativeTo(null);
            FOOD_DETAILS_FRAME.setVisible(true);
        }
    }
    
    private void searchFoodTFKeyReleased(KeyEvent e) {

        String searchText = searchFoodTF.getText().toLowerCase();
        foodListModel.removeAllElements();

        for (Food food: foods) {
            if(food.getTitle().toLowerCase().contains(searchText))
                foodListModel.addElement(food);
        }
    }

    private void search(ActionEvent e) {
        String searchText = searchFoodTF.getText().toLowerCase();
        foodListModel.removeAllElements();
        for (Food food: foods) {
            if(food.getTitle().toLowerCase().contains(searchText))
                foodListModel.addElement(food);
        }
    }

//    private void addToCart(ActionEvent e) {
//        try {
//            if(selectedFood!=null){
//                TOTAL_COST += selectedFood.getPrice();
//                TOTAL_FOOD_NUMBER ++;
//                TOTAL_FOODS_LABEL.setText(String.valueOf(TOTAL_FOOD_NUMBER));
//                TOTAL_COST_LABEL.setText(String.valueOf(TOTAL_COST));
//            }
//        } catch (Exception ignored) { }
//    }

	private void searchFoodTFInputMethodTextChanged(InputMethodEvent e) {
		// TODO add your code here
	}

    @SuppressWarnings("serial")
	private void initComponents() {
    	

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		panel = new JPanel();
		label1 = new JLabel();
		scrollPane2 = new JScrollPane();
		foodItemsList = new JList();
		label5 = new JLabel();
		addToCartButton = new JButton();
		foodDetailsButton = new JButton();
		searchFoodTF = new JTextField();
		searchButton = new JButton();
		

		
		
		//======== panel ========
		{
			panel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
			javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax
			. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
			. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
			. Color .red ) ,panel. getBorder () ) ); panel. addPropertyChangeListener( new java. beans .
			PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .
			equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

			//---- label1 ----
			label1.setText("Informes");
			label1.setFont(new Font("Segoe UI", Font.BOLD, 45));
			label1.setHorizontalAlignment(SwingConstants.CENTER);

			//======== scrollPane2 ========
			{

				//---- foodItemsList ----
				foodItemsList.setFont(foodItemsList.getFont().deriveFont(foodItemsList.getFont().getSize() + 5f));
				scrollPane2.setViewportView(foodItemsList);
		    	
		    	//final Icon pdfIcon = UIManager.getIcon("C:\\Users\\Aceri7\\git\\Phybot-GUI\\src\\main\\resources\\img\\pdf_ico.png");
				URL url = getClass().getClassLoader().getResource("img/pdf_ico.png");
				if (url == null) {
				    throw new RuntimeException("Icono no encontrado en /img/pdf_ico.png");
				}
				
				

				//Icon pdfIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
				ImageIcon originalIcon = new ImageIcon(url);
				Image scaledImg = originalIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
				Icon pdfIcon = new ImageIcon(scaledImg);
				
				foodItemsList.setCellRenderer(new DefaultListCellRenderer(){
				    @Override
				    public Component getListCellRendererComponent(JList<?> list,
				                                                  Object value,
				                                                  int index,
				                                                  boolean isSelected,
				                                                  boolean cellHasFocus) {
				        // Obtiene el JLabel base con colores de selección, foco, etc.
				        JLabel label = (JLabel) super.getListCellRendererComponent(
				                list, value, index, isSelected, cellHasFocus);

				        if (value instanceof File) {
				            File pdf = (File) value;
				            // Muestra solo el nombre de archivo (sin ruta)
				            label.setText(pdf.getName());
				            // Ponle el icono
				            label.setIcon(pdfIcon);
				            // Opcional: margen entre icono y texto
				            label.setIconTextGap(10);
				        }

				        return label;
				    }
				});
			}

			//---- label5 ----
			label5.setText("Search Results");
			label5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));
			label5.setVisible(false);

			//---- addToCartButton ----
			addToCartButton.setText("Previsualizar");
			addToCartButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
			addToCartButton.addActionListener(e -> {
//			addToCart(e);
//			addToCart(e);
		});

			//---- foodDetailsButton ----
			foodDetailsButton.setText("Descargar");
			foodDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
			foodDetailsButton.addActionListener(e -> foodDetails(e));

			//---- searchFoodTF ----
			searchFoodTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			searchFoodTF.setVisible(false);
			searchFoodTF.addInputMethodListener(new InputMethodListener() {
				@Override
				public void caretPositionChanged(InputMethodEvent e) {}
				@Override
				public void inputMethodTextChanged(InputMethodEvent e) {
					searchFoodTFInputMethodTextChanged(e);
				}
			});
			searchFoodTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					searchFoodTFKeyReleased(e);
				}
			});

			//---- searchButton ----
			searchButton.setText("Search");
			searchButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
			searchButton.setVisible(false);
			searchButton.addActionListener(e -> {
			search(e);
			search(e);
		});

			GroupLayout panelLayout = new GroupLayout(panel);
			panel.setLayout(panelLayout);
			panelLayout.setHorizontalGroup(
				panelLayout.createParallelGroup()
					.addGroup(panelLayout.createSequentialGroup()
						.addGroup(panelLayout.createParallelGroup()
							.addGroup(panelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(panelLayout.createSequentialGroup()
								.addGroup(panelLayout.createParallelGroup()
									.addGroup(panelLayout.createSequentialGroup()
										.addGap(158, 158, 158)
										.addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addGap(57, 57, 57)
										.addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
									.addGroup(panelLayout.createSequentialGroup()
										.addGap(54, 54, 54)
										.addGroup(panelLayout.createParallelGroup()
											.addGroup(panelLayout.createSequentialGroup()
												.addGap(88, 88, 88)
												.addComponent(searchFoodTF, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
												.addGap(26, 26, 26)
												.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
											.addComponent(label5)
											.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE))))
								.addGap(0, 62, Short.MAX_VALUE)))
						.addContainerGap())
			);
			panelLayout.setVerticalGroup(
				panelLayout.createParallelGroup()
					.addGroup(panelLayout.createSequentialGroup()
						.addGap(28, 28, 28)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
						.addGroup(panelLayout.createParallelGroup()
							.addComponent(searchFoodTF, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(label5)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35))
			);
		}
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	public JPanel panel;
	private JLabel label1;
	private JScrollPane scrollPane2;
	private JList <File>foodItemsList;
	private JLabel label5;
	private JButton addToCartButton;
	private JButton foodDetailsButton;
	private JTextField searchFoodTF;
	private JButton searchButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}