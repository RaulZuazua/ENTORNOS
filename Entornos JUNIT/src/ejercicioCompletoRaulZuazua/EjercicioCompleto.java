package ejercicioCompletoRaulZuazua;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjercicioCompleto {
	
	//TODO: CALCULO
	
public static int Complemento (int antiguedad, boolean plus){
		
		int complemento=0;
		
		if(antiguedad>=5){
			
			
			if(plus==true)
				complemento=1000;

		
			else 
			complemento=500;
		
		
		}
	
		
		else {
			
			if(plus==true)
				complemento=300;
			else 
				complemento=100;
	
		}
		
		return complemento;
		
	}
	
	
	



	private JFrame frame;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldAntiguedad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioCompleto window = new EjercicioCompleto();
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
	public EjercicioCompleto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 484, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 476, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(93, 44, 46, 14);
		panel.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(93, 92, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad");
		lblAntiguedad.setBounds(93, 137, 64, 14);
		panel.add(lblAntiguedad);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(250, 41, 51, 20);
		panel.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(250, 89, 86, 20);
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldAntiguedad = new JTextField();
		textFieldAntiguedad.setBounds(250, 134, 51, 20);
		panel.add(textFieldAntiguedad);
		textFieldAntiguedad.setColumns(10);
		
		JLabel lblPlus = new JLabel("Plus");
		lblPlus.setBounds(93, 184, 64, 14);
		panel.add(lblPlus);
		
		JCheckBox CheckBoxPlus = new JCheckBox("");
		CheckBoxPlus.setBounds(250, 180, 97, 23);
		panel.add(CheckBoxPlus);
		
		
		//TODO: boton crear
		
		JButton btnNewButtonAceptar = new JButton("Aceptar");
		btnNewButtonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int complemento;
				
				if (textFieldCodigo.getText().length()<3 ||textFieldCodigo.getText().length()>3 ||textFieldCodigo.getText().equals("000")||textFieldCodigo.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "El codigo debe contener 3 cifras y ser mayor que 000");
					
				}
				
				
				else if (textFieldNombre.getText().length()>20){
					
					JOptionPane.showMessageDialog(null, "El Nombre es demasiado largo (Max: 20 caracteres).");
				}
				
				
				else if (textFieldAntiguedad.getText().length()<2 ||textFieldAntiguedad.getText().length()>2){
					
					
					JOptionPane.showMessageDialog(null, "La antiguedad debe de tener 2 digitos (Incluido 00)");
					
				}
				
				else{
				complemento=Complemento(Integer.parseInt(textFieldAntiguedad.getText()), CheckBoxPlus.isSelected());
				
				JOptionPane.showMessageDialog(null, "El complemento para este usuario es de: " + complemento + "€");
				
				}
				
				
				
				
			}
		});
		btnNewButtonAceptar.setBounds(79, 242, 89, 23);
		panel.add(btnNewButtonAceptar);
		
		
		//TODO: BOTON CANCELAR
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int result=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cancelar y salir de la aplicacion?","",dialogButton);
			
			if (result==JOptionPane.YES_OPTION)
				
				System.exit(1); 
			
			}
			
			
			
		});
		btnCancelar.setRequestFocusEnabled(false);
		btnCancelar.setBounds(273, 242, 89, 23);
		panel.add(btnCancelar);
	}
}
