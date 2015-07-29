package BinaerDezimal;

public class Start {

	static Output[] output = new Output[10];
	static Input[] input = new Input[4];
	static Verbindung[] verbindungs = new Verbindung[17];

	public static void main(String[] args) {

		setInput();
		setVerarbeitung(input, output);

		Gui gui = new Gui(input, verbindungs, output);
		gui.setVisible(true);
		gui.pack();
		gui.setResizable(false);

		setOutput(gui);

	}

	public static void setOutput(Gui gui) {
		for (int i = 0; i < 10; i++) {
			output[i] = new Output(i, gui);
		}

	}

	public static void setVerarbeitung(Input[] inputs, Output[] outputs) {

		for (int i = 0; i < 10; i++) {
			verbindungs[i] = new Verbindung(inputs[(int) (Math.random() * 3)], outputs[(int) (Math.random() * 9)]);
		}

	}

	public static void setInput() {
		for (int i = 0; i < 4; i++) {
			input[i] = new Input();

		}

	}

}
