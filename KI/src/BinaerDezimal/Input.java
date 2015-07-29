package BinaerDezimal;

import java.util.Random;

public class Input {

	// Attribute
	private boolean eingabe;
	private int eingabeInt;

	public Input() {

		this.eingabe = new Random().nextBoolean();
		eingabeToInt();

	}

	public void eingabeToInt() {

		if (eingabe) {
			eingabeInt = 1;
		} else {
			eingabeInt = 0;
		}

	}


	public void setEingabe(boolean eingabe) {
		this.eingabe = eingabe;
		
		if (eingabe) {
			eingabeInt = 1;
		} else {
			eingabeInt = 0;
		}
	}

	public boolean isEingabe() {
		return eingabe;
	}

	public int getEingabeInt() {
		return eingabeInt;
	}
	
}
