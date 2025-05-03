/*
 * Created by JFormDesigner on Sat May 03 20:30:18 CEST 2025
 */

package org.apwj.bearburger.view.customer;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Aceri7
 */
public class Contact  extends JPanel{
	
	public Contact() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Javier Pelaez
		panel = new JPanel();
		mensajes = new JPanel();
		busqueda = new JPanel();
		textField1 = new JTextField();
		label1 = new JLabel();
		medico_uno = new JPanel();
		foto_medico_uno = new JLabel();
		nombre_medico_uno = new JLabel();
		preview_uno = new JLabel();
		medico_dos = new JPanel();
		nombre_medico_dos = new JLabel();
		preview_dos = new JLabel();
		foto_medico_uno3 = new JLabel();
		medico_tres = new JPanel();
		nombre_medico_tre = new JLabel();
		preview_tres = new JLabel();
		foto_medico_uno4 = new JLabel();
		conversacion = new JPanel();
		Banner_medico = new JPanel();
		telefono = new JLabel();
		foto_medico_uno2 = new JLabel();
		preview_uno2 = new JLabel();
		nombre_medico_uno2 = new JLabel();
		foto_medico_chat2 = new JLabel();
		foto_medico_chat3 = new JLabel();
		foto_medico_chat4 = new JLabel();
		text1 = new JPanel();
		label2 = new JLabel();
		text3 = new JPanel();
		label3 = new JLabel();
		text2 = new JPanel();
		label4 = new JLabel();
		Barra_mensaje = new JPanel();
		emojis = new JLabel();
		attachments = new JLabel();
		enviar = new JLabel();
		texto_mensaje = new JTextField();

		//======== panel ========
		{
			panel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
			EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
			. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
			java . awt. Color .red ) ,panel. getBorder () ) ); panel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
			{ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
			throw new RuntimeException( ) ;} } );
			panel.setLayout(null);

			//======== mensajes ========
			{
				mensajes.setBackground(new Color(0x4e5052));
				mensajes.setLayout(null);

				//======== busqueda ========
				{
					busqueda.setBackground(Color.gray);
					busqueda.setLayout(null);

					//---- textField1 ----
					textField1.setText("Buscar...");
					textField1.setBackground(Color.gray);
					textField1.setEditable(false);
					textField1.setForeground(Color.white);
					textField1.setBorder(null);
					textField1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
					busqueda.add(textField1);
					textField1.setBounds(15, 10, 145, 20);

					//---- label1 ----
					label1.setIcon(new ImageIcon(getClass().getResource("/img/etool16/search.png")));
					label1.setForeground(Color.red);
					busqueda.add(label1);
					label1.setBounds(185, 10, 25, 25);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < busqueda.getComponentCount(); i++) {
							Rectangle bounds = busqueda.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = busqueda.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						busqueda.setMinimumSize(preferredSize);
						busqueda.setPreferredSize(preferredSize);
					}
				}
				mensajes.add(busqueda);
				busqueda.setBounds(5, 15, 240, 40);

				//======== medico_uno ========
				{
					medico_uno.setLayout(null);

					//---- foto_medico_uno ----
					foto_medico_uno.setIcon(new ImageIcon(getClass().getResource("/img/doctor_circular (1).png")));
					medico_uno.add(foto_medico_uno);
					foto_medico_uno.setBounds(5, 5, 60, 55);

					//---- nombre_medico_uno ----
					nombre_medico_uno.setText("Dr. Mu\u00f1iz");
					medico_uno.add(nombre_medico_uno);
					nombre_medico_uno.setBounds(70, 5, 130, 20);

					//---- preview_uno ----
					preview_uno.setText("Escribiendo...");
					medico_uno.add(preview_uno);
					preview_uno.setBounds(65, 35, 130, 20);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < medico_uno.getComponentCount(); i++) {
							Rectangle bounds = medico_uno.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = medico_uno.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						medico_uno.setMinimumSize(preferredSize);
						medico_uno.setPreferredSize(preferredSize);
					}
				}
				mensajes.add(medico_uno);
				medico_uno.setBounds(5, 70, 235, 65);

				//======== medico_dos ========
				{
					medico_dos.setLayout(null);

					//---- nombre_medico_dos ----
					nombre_medico_dos.setText("Dra. fuente");
					medico_dos.add(nombre_medico_dos);
					nombre_medico_dos.setBounds(65, 5, 130, 20);

					//---- preview_dos ----
					preview_dos.setText("La pr\u00f3xima semana...");
					medico_dos.add(preview_dos);
					preview_dos.setBounds(65, 35, 130, 20);

					//---- foto_medico_uno3 ----
					foto_medico_uno3.setIcon(new ImageIcon(getClass().getResource("/img/doctor_circular_2 (1).png")));
					medico_dos.add(foto_medico_uno3);
					foto_medico_uno3.setBounds(5, 5, 60, 55);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < medico_dos.getComponentCount(); i++) {
							Rectangle bounds = medico_dos.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = medico_dos.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						medico_dos.setMinimumSize(preferredSize);
						medico_dos.setPreferredSize(preferredSize);
					}
				}
				mensajes.add(medico_dos);
				medico_dos.setBounds(5, 150, 235, 65);

				//======== medico_tres ========
				{
					medico_tres.setLayout(null);

					//---- nombre_medico_tre ----
					nombre_medico_tre.setText("Dr. Pel\u00e1ez");
					medico_tres.add(nombre_medico_tre);
					nombre_medico_tre.setBounds(60, 5, 130, 20);

					//---- preview_tres ----
					preview_tres.setText("Ya estamos en...");
					medico_tres.add(preview_tres);
					preview_tres.setBounds(60, 35, 130, 20);

					//---- foto_medico_uno4 ----
					foto_medico_uno4.setIcon(new ImageIcon(getClass().getResource("/img/doctor2_circular_transparent (1).png")));
					medico_tres.add(foto_medico_uno4);
					foto_medico_uno4.setBounds(5, 5, 60, 55);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < medico_tres.getComponentCount(); i++) {
							Rectangle bounds = medico_tres.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = medico_tres.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						medico_tres.setMinimumSize(preferredSize);
						medico_tres.setPreferredSize(preferredSize);
					}
				}
				mensajes.add(medico_tres);
				medico_tres.setBounds(5, 230, 235, 65);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < mensajes.getComponentCount(); i++) {
						Rectangle bounds = mensajes.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = mensajes.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					mensajes.setMinimumSize(preferredSize);
					mensajes.setPreferredSize(preferredSize);
				}
			}
			panel.add(mensajes);
			mensajes.setBounds(0, 0, 255, 420);

			//======== conversacion ========
			{
				conversacion.setBackground(Color.gray);
				conversacion.setLayout(null);

				//======== Banner_medico ========
				{
					Banner_medico.setLayout(null);
					Banner_medico.add(telefono);
					telefono.setBounds(210, 0, 70, 65);

					//---- foto_medico_uno2 ----
					foto_medico_uno2.setIcon(new ImageIcon(getClass().getResource("/img/doctor_circular (1).png")));
					Banner_medico.add(foto_medico_uno2);
					foto_medico_uno2.setBounds(5, 5, 60, 55);

					//---- preview_uno2 ----
					preview_uno2.setText("Escribiendo...");
					Banner_medico.add(preview_uno2);
					preview_uno2.setBounds(70, 35, 130, 20);

					//---- nombre_medico_uno2 ----
					nombre_medico_uno2.setText("Dr. Mu\u00f1iz");
					Banner_medico.add(nombre_medico_uno2);
					nombre_medico_uno2.setBounds(70, 10, 130, 20);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < Banner_medico.getComponentCount(); i++) {
							Rectangle bounds = Banner_medico.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = Banner_medico.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						Banner_medico.setMinimumSize(preferredSize);
						Banner_medico.setPreferredSize(preferredSize);
					}
				}
				conversacion.add(Banner_medico);
				Banner_medico.setBounds(0, 0, 420, 65);

				//---- foto_medico_chat2 ----
				foto_medico_chat2.setBackground(Color.black);
				foto_medico_chat2.setForeground(Color.black);
				foto_medico_chat2.setIcon(new ImageIcon(getClass().getResource("/img/doctor_circular (1).png")));
				conversacion.add(foto_medico_chat2);
				foto_medico_chat2.setBounds(10, 80, 55, 45);

				//---- foto_medico_chat3 ----
				foto_medico_chat3.setBackground(Color.black);
				foto_medico_chat3.setForeground(Color.black);
				foto_medico_chat3.setIcon(new ImageIcon(getClass().getResource("/img/iconfinder-3-avatar-2754579_120516.png")));
				conversacion.add(foto_medico_chat3);
				foto_medico_chat3.setBounds(340, 120, 60, 60);

				//---- foto_medico_chat4 ----
				foto_medico_chat4.setBackground(Color.black);
				foto_medico_chat4.setForeground(Color.black);
				foto_medico_chat4.setIcon(new ImageIcon(getClass().getResource("/img/doctor_circular (1).png")));
				conversacion.add(foto_medico_chat4);
				foto_medico_chat4.setBounds(10, 205, 55, 45);

				//======== text1 ========
				{
					text1.setBackground(new Color(0x0099ff));
					text1.setLayout(null);

					//---- label2 ----
					label2.setText("Ma\u00f1ana tenemos revisi\u00f3n");
					label2.setForeground(Color.white);
					text1.add(label2);
					label2.setBounds(5, 5, label2.getPreferredSize().width, 25);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < text1.getComponentCount(); i++) {
							Rectangle bounds = text1.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = text1.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						text1.setMinimumSize(preferredSize);
						text1.setPreferredSize(preferredSize);
					}
				}
				conversacion.add(text1);
				text1.setBounds(70, 90, 150, 30);

				//======== text3 ========
				{
					text3.setBackground(new Color(0x00cc66));
					text3.setLayout(null);

					//---- label3 ----
					label3.setText("OK doctor.");
					label3.setForeground(Color.white);
					text3.add(label3);
					label3.setBounds(5, 5, 69, 20);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < text3.getComponentCount(); i++) {
							Rectangle bounds = text3.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = text3.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						text3.setMinimumSize(preferredSize);
						text3.setPreferredSize(preferredSize);
					}
				}
				conversacion.add(text3);
				text3.setBounds(230, 135, 95, 30);

				//======== text2 ========
				{
					text2.setBackground(new Color(0x0099ff));
					text2.setLayout(null);

					//---- label4 ----
					label4.setText("9:30 - 10:30.");
					label4.setForeground(Color.white);
					text2.add(label4);
					label4.setBounds(5, 5, label4.getPreferredSize().width, 25);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < text2.getComponentCount(); i++) {
							Rectangle bounds = text2.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = text2.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						text2.setMinimumSize(preferredSize);
						text2.setPreferredSize(preferredSize);
					}
				}
				conversacion.add(text2);
				text2.setBounds(70, 215, 95, 30);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < conversacion.getComponentCount(); i++) {
						Rectangle bounds = conversacion.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = conversacion.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					conversacion.setMinimumSize(preferredSize);
					conversacion.setPreferredSize(preferredSize);
				}
			}
			panel.add(conversacion);
			conversacion.setBounds(260, 0, 415, 380);

			//======== Barra_mensaje ========
			{
				Barra_mensaje.setBackground(new Color(0xd3d3d3));
				Barra_mensaje.setLayout(null);

				//---- emojis ----
				emojis.setIcon(new ImageIcon(getClass().getResource("/img/emoji_smile_icon_160172.png")));
				Barra_mensaje.add(emojis);
				emojis.setBounds(0, 0, 45, 40);

				//---- attachments ----
				attachments.setIcon(new ImageIcon(getClass().getResource("/img/attach-paperclip-symbol_icon-icons.com_73094.png")));
				attachments.setFont(new Font("Segoe UI", Font.PLAIN, 3));
				attachments.setPreferredSize(new Dimension(24, 24));
				Barra_mensaje.add(attachments);
				attachments.setBounds(45, 0, 45, 40);

				//---- enviar ----
				enviar.setIcon(new ImageIcon(getClass().getResource("/img/send_90420.png")));
				Barra_mensaje.add(enviar);
				enviar.setBounds(380, 10, 35, 25);

				//---- texto_mensaje ----
				texto_mensaje.setText("Escribe aqu\u00ed tu mensaje");
				texto_mensaje.setForeground(Color.gray);
				texto_mensaje.setBackground(new Color(0xd3d3d3));
				texto_mensaje.setBorder(new EmptyBorder(5, 5, 5, 5));
				Barra_mensaje.add(texto_mensaje);
				texto_mensaje.setBounds(105, 10, 255, texto_mensaje.getPreferredSize().height);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < Barra_mensaje.getComponentCount(); i++) {
						Rectangle bounds = Barra_mensaje.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = Barra_mensaje.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					Barra_mensaje.setMinimumSize(preferredSize);
					Barra_mensaje.setPreferredSize(preferredSize);
				}
			}
			panel.add(Barra_mensaje);
			Barra_mensaje.setBounds(260, 380, 415, 40);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel.getComponentCount(); i++) {
					Rectangle bounds = panel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel.setMinimumSize(preferredSize);
				panel.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Javier Pelaez
	public JPanel panel;
	private JPanel mensajes;
	private JPanel busqueda;
	private JTextField textField1;
	private JLabel label1;
	private JPanel medico_uno;
	private JLabel foto_medico_uno;
	private JLabel nombre_medico_uno;
	private JLabel preview_uno;
	private JPanel medico_dos;
	private JLabel nombre_medico_dos;
	private JLabel preview_dos;
	private JLabel foto_medico_uno3;
	private JPanel medico_tres;
	private JLabel nombre_medico_tre;
	private JLabel preview_tres;
	private JLabel foto_medico_uno4;
	private JPanel conversacion;
	private JPanel Banner_medico;
	private JLabel telefono;
	private JLabel foto_medico_uno2;
	private JLabel preview_uno2;
	private JLabel nombre_medico_uno2;
	private JLabel foto_medico_chat2;
	private JLabel foto_medico_chat3;
	private JLabel foto_medico_chat4;
	private JPanel text1;
	private JLabel label2;
	private JPanel text3;
	private JLabel label3;
	private JPanel text2;
	private JLabel label4;
	private JPanel Barra_mensaje;
	private JLabel emojis;
	private JLabel attachments;
	private JLabel enviar;
	private JTextField texto_mensaje;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
