package device_management;

import behaviours.IINput;

public class Keyboard implements IINput {

	String type;
	int numberOfButtons;

	public Keyboard(String type, int numberOfButtons){
		this.type = type;
		this.numberOfButtons = numberOfButtons;
	}

	public String getType() {
		return type;
	}

	public int getNumberOfButtons() {
		return numberOfButtons;
	}

	@Override
	public String sendData(String data) {
		return "Buttons pressed" + data;
	}

}
