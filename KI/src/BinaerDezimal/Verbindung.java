package BinaerDezimal;

public class Verbindung {

	// Assoziation
	private Input input;
	private Output output;

	// Attribute
	private int verbindung;

	public Verbindung(Input inputs, Output outputs) {
		this.output = outputs;
		this.input = inputs;
		this.verbindung = 0;

	}

	public void verbindungVerbessern() {
		
			verbindung++;	
		
	}

	public void verbindungAbbauen() {
		
			verbindung--;	
		
	}

	public void verbindungAuswerten(Output[] outputs, Input[] inputs) {
		if (verbindung >= 2) {
			this.output = outputs[(int) (Math.random() * 9)];
			this.input = inputs[(int) (Math.random() * 3)];
		}

	}
	
	

	public Input getInput() {
		return input;
	}

	public int getVerbindung() {
		return verbindung;
	}

	public Output getOutput() {
		return output;
	}
	
	

}
