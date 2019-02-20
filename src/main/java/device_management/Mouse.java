package device_management;

import behaviours.IINput;

public class Mouse implements IINput {

	String type;
	int numberOfButtons;

	public Mouse(String type, int numberOfButtons){
		this.type = type;
		this.numberOfButtons = numberOfButtons;
	}

	@Override
	public String sendData(String data) {
		return "CLicking mouse button" + data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfButtons() {
		return numberOfButtons;
	}

	public void setNumberOfButtons(int numberOfButtons) {
		this.numberOfButtons = numberOfButtons;
	}
}
