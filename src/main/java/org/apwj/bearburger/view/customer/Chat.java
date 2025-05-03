/*
 * Created by JFormDesigner on Fri May 02 20:05:40 CEST 2025
 */

package org.apwj.bearburger.view.customer;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;

/**
 * @author Aceri7
 */
public class Chat extends JPanel {
	public Chat() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
		frame1 = new JFrame();
		panel3 = new JPanel();
		title1 = compFactory.createTitle("");
		panel1 = new JPanel();
		mipanel = new JPanel();
		label1 = new JLabel();
		status = new JRadioButton();

		//======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new BorderLayout());

			//======== panel3 ========
			{
				panel3.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
				.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder
				.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
				awt.Font.BOLD,12),java.awt.Color.red),panel3. getBorder()))
				;panel3. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
				){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
				;
				panel3.setLayout(new CardLayout());
				panel3.add(title1, "card1");

				//======== panel1 ========
				{
					panel1.setAutoscrolls(true);
					panel1.setAlignmentX(33.0F);
					panel1.setLayout(new BorderLayout());

					//======== mipanel ========
					{
						mipanel.setPreferredSize(new Dimension(53, 83));
						mipanel.setLayout(new MigLayout(
							"fill",
							// columns
							"[grow 2]" +
							"[grow 1]",
							// rows
							"[grow]"));

						//---- label1 ----
						label1.setIcon(new ImageIcon(getClass().getResource("/img/doctor.png")));
						label1.setHorizontalAlignment(SwingConstants.RIGHT);
						mipanel.add(label1, "cell 0 0 2 1,alignx right,growx 0");

						//---- status ----
						status.setIcon(new ImageIcon(getClass().getResource("/img/green_led.png")));
						status.setSelectedIcon(new ImageIcon(getClass().getResource("/img/green_led.png")));
						status.setText("Online");
						mipanel.add(status, "cell 1 0,alignx center,growx 0");
					}
					panel1.add(mipanel, BorderLayout.NORTH);
				}
				panel3.add(panel1, "card2");
			}
			frame1ContentPane.add(panel3, BorderLayout.CENTER);
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	private JFrame frame1;
	private JPanel panel3;
	private JLabel title1;
	private JPanel panel1;
	private JPanel mipanel;
	private JLabel label1;
	private JRadioButton status;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
