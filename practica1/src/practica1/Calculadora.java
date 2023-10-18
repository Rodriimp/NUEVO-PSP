package practica1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculadora {
	private JFrame frmPractica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmPractica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPractica = new JFrame();
		frmPractica.setTitle("practica 1");
		frmPractica.setBounds(100, 100, 450, 300);
		frmPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPractica.getContentPane().setLayout(null);

		JButton botonCalc = new JButton("Calculadora");
		botonCalc.setIcon(new ImageIcon("C:\\Users\\rmoreno1202\\Downloads\\calculadora.png"));
		botonCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\calc";

				Proceso p = new Proceso();
				p.ejecutarProceso(ruta);
			}
		});
		botonCalc.setBounds(47, 62, 157, 138);
		frmPractica.getContentPane().add(botonCalc);

		JButton botonBlocNotas = new JButton("Bloc de notas");
		botonBlocNotas.setIcon(new ImageIcon("C:\\Users\\rmoreno1202\\Downloads\\notas (1).png"));
		botonBlocNotas.setBounds(228, 62, 171, 138);
		frmPractica.getContentPane().add(botonBlocNotas);

		botonBlocNotas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";

				Proceso p = new Proceso();

				p.ejecutarProceso(ruta);
			}

		});
	}
}
