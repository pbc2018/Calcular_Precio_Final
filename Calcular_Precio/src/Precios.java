import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Precios {

	private JFrame frame;
	private JTextField Cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Precios window = new Precios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Precios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 17));
		frame.setBounds(500, 500, 500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		TextField Precio = new TextField();
		Precio.setFont(new Font("Arial", Font.PLAIN, 17));
		Precio.setBounds(125, 122, 272, 41);
		frame.getContentPane().add(Precio);
		
		Label Cantidad_Texto = new Label("Cantidad");
		Cantidad_Texto.setBounds(21, 72, 89, 22);
		frame.getContentPane().add(Cantidad_Texto);
		
		Label Precio_Texto = new Label("Precio");
		Precio_Texto.setBounds(21, 122, 89, 22);
		frame.getContentPane().add(Precio_Texto);
		
		Label Salida_Texto = new Label("El Resultado es :");
		Salida_Texto.setAlignment(Label.CENTER);
		Salida_Texto.setBounds(21, 320, 453, 66);
		frame.getContentPane().add(Salida_Texto);
		
		JButton Calcular = new JButton("Calcular");
		Calcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int cantidad2 = Integer.parseInt(Cantidad.getText());
				double precio2=Double.parseDouble(Precio.getText());
				if(precio2<=0.0) {
					Salida_Texto.setText("EL precio es invalido tiene que ser mayor que 0");
				}
				else {
				Salida_Texto.setText("El Resultado es "+cantidad2*precio2);
				}
				
			}
			
		});
		Calcular.setFont(new Font("Arial", Font.PLAIN, 17));
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Calcular.setBounds(174, 223, 162, 39);
		frame.getContentPane().add(Calcular);
		
		Cantidad = new JTextField();
		Cantidad.setFont(new Font("Arial", Font.PLAIN, 16));
		Cantidad.setBounds(139, 63, 239, 41);
		frame.getContentPane().add(Cantidad);
		Cantidad.setColumns(12);
		
		
	}
}
