package BinaerDezimal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {

	private JPanel contentPane, pFields, pButton;
	private JLabel lAusgabe, lEingabe;
	private JButton bFalsch, bWeiter;

	private Output[] outputs = new Output[10];
	private Input[] inputs = new Input[4];
	private Verbindung[] verbindungs = new Verbindung[17];
	private Verbindung[] aktiveVerbindungen = new Verbindung[17];

	public Gui(Input[] inputs, Verbindung[] verarbeitungs, Output[] outputs) {

		initGui();
		this.verbindungs = verarbeitungs;
		this.outputs = outputs;
		this.inputs = inputs;

	}

	private void initGui() {

		this.contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);

		this.pButton = new JPanel();
		this.pFields = new JPanel();

		contentPane.add(pButton, BorderLayout.SOUTH);
		contentPane.add(pFields, BorderLayout.CENTER);

		this.lEingabe = new JLabel("Eingabe");
		pFields.add(lEingabe);
		this.lAusgabe = new JLabel("Ausgabe");
		pFields.add(lAusgabe);

		this.bFalsch = new JButton("Falsch");
		this.bWeiter = new JButton("Richtig");

		pButton.add(bFalsch);
		pButton.add(bWeiter);

		bFalsch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				verbindungs[1].verbindungAbbauen();
				verbindungs[1].verbindungAuswerten(outputs, inputs);

				for (int i = 0; i < inputs.length; i++) {
					inputs[i].setEingabe(new Random().nextBoolean());
				}

				setlEingabe();

			}

		});

		bWeiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				verbindungs[1].verbindungVerbessern();
				verbindungs[1].verbindungAuswerten(outputs, inputs);

				for (int i = 0; i < inputs.length; i++) {
					inputs[i].setEingabe(new Random().nextBoolean());
				}

				setlEingabe();
			}
		});

	}

	public void verbindungVonInput(Input[] input) {

		for (int i = 0; i < verbindungs.length; i++) {
			for (int k = 0; k < input.length; k++) {
				if (verbindungs[i].getInput() == input[k]) {
					int j = 0;
					aktiveVerbindungen[j] = verbindungs[i];
					j++;
				}
			}

		}

	}
	
	
	
	

	public void setlAusgabe(String text) {
		lAusgabe.setText(text);
	}

	public void setlEingabe() {
		String str = String.valueOf(inputs[0].getEingabeInt());
		for (int i = 1; i < 4; i++) {
			str = str + String.valueOf(inputs[i].getEingabeInt());

		}

		lEingabe.setText(str);
	}

}
