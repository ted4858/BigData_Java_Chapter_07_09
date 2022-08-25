package chapter08;

public class TV implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		this.setMute(true);
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.setMute(false);
		RemoteController.changeBattery();
	}
	
}
