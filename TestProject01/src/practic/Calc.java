package practic;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc {

	public static void main(String[] args) {

		JFrame okno = new JFrame("Kalkulator");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		Dimension rozmiarPola = new Dimension(60, 50);
		Dimension rozmiarGuzika = new Dimension(60, 45);

		Font czcionka = new Font("Arial", Font.BOLD, 32);
		JTextField pole1 = new JTextField();
		pole1.setFont(czcionka);
		pole1.setPreferredSize(rozmiarPola);
		panel.add(pole1);

		JTextField pole2 = new JTextField();
		pole2.setFont(czcionka);
		pole2.setPreferredSize(rozmiarPola);
		panel.add(pole2);

		JButton guzikPlus = new JButton("+");
		guzikPlus.setFont(czcionka);
		guzikPlus.setPreferredSize(rozmiarGuzika);
		panel.add(guzikPlus);

		JButton guzikMinus = new JButton("-");
		guzikMinus.setFont(czcionka);
		guzikMinus.setPreferredSize(rozmiarGuzika);
		panel.add(guzikMinus);

		JLabel etykieta = new JLabel("Wynik");
		etykieta.setFont(czcionka);
		panel.add(etykieta);

		guzikPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(pole1.getText());
				int b = Integer.parseInt(pole2.getText());
				etykieta.setText(String.valueOf(a + b));
			}
		});

		guzikMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(pole1.getText());
				int b = Integer.parseInt(pole2.getText());
				etykieta.setText(String.valueOf(a - b));
			}
		});

		LayoutManager layout = new FlowLayout(FlowLayout.LEFT, 20, 40);
		panel.setLayout(layout);
		okno.setContentPane(panel);
		okno.pack();
		okno.setVisible(true);
	}

}