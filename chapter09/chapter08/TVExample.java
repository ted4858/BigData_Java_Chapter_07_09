package chapter08;

public class TVExample {
	public static void main(String[] args) {
//		RemoteControl rc = null;
//		rc = new TV();
//		rc = new Audio();
		
		RemoteController rc = new RemoteController() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setMute(boolean mute) {
				// TODO Auto-generated method stub
				RemoteController.super.setMute(mute);
			}
			
		};
		
		temporary(new RemoteController() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setMute(boolean mute) {
				// TODO Auto-generated method stub
				RemoteController.super.setMute(mute);
			}
			
		});
		
	}
	
	public static void temporary(RemoteController remoteController) {
		
	}
	
}
