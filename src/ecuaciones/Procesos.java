package ecuaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Procesos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procesos frame = new Procesos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Procesos() {
		setResizable(false);
		setTitle("Ecuaci\u00F3n Cuadratica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 599, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/ecuacion.png")));
		lblNewLabel.setBounds(32, 87, 141, 175);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/ecuacion_1.png")));
		lblNewLabel_1.setBounds(329, 0, 187, 84);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ecuaci\u00F3n Cuadr\u00E1tica:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(10, 11, 309, 49);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ingreso de Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(197, 87, 392, 222);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Ingresa el valor de (a) :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 44, 146, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ingresa el valor de (b) :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 97, 146, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Ingresa el valor de (c) :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 158, 146, 14);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/limpiar.png")));
		btnNewButton.setBounds(262, 17, 120, 71);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/cerrar-sesion.png")));
		btnNewButton_1.setBounds(269, 118, 113, 71);
		panel_1.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 41, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 94, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 155, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Datos de Salida", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 320, 579, 100);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(260, 18, 172, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(260, 61, 172, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado X1 : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(115, 19, 135, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Resultado X2 :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(115, 62, 135, 14);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Float a= Float.parseFloat(textField_2.getText());
			Float b= Float.parseFloat(textField_3.getText());
			Float c= Float.parseFloat(textField_4.getText());	
			
			double determinante= Math.pow(b,2)-(4*a*c);
			
			if(determinante>0) {
				
				double x1= ((b*(-1)) + Math.sqrt(determinante))/(2*a);
				
			    double x2=((b*(-1)) - Math.sqrt(determinante))/(2*a);
			    
				  textField.setText(""+x1);
			      textField_1.setText(""+x2);
			      
			}else {
				JOptionPane.showMessageDialog(null,"El determinante es NEGATIVO,no se puede continuar con la operación" );
			}
				
			
			
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/calculadora.png")));
		btnNewButton_2.setBounds(442, 18, 127, 63);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(17, 18, 72, 63);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Procesos.class.getResource("/iconos/matematicas.png")));
		
		JLabel lblNewLabel_9 = new JLabel("Software by Jhon F.");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(0, 424, 599, 14);
		panel.add(lblNewLabel_9);
	}
}
