package BinaerDezimal;

public class Output {

	// Assoziation
	private Gui gui;

	// Attrubute
	private int ausgabe;

	public Output(int ausgabe, Gui gui) {

		this.ausgabe = ausgabe;
		this.gui = gui;

	}

	public void ausgeben() {
		gui.setlAusgabe("Ausgabe: " + (char) ausgabe);

	}

}
