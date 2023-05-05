package command;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		BackupService backup=new BackupService();
		
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light=new Light();
		LigthOnCommand lightOn=new LigthOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	
		GarageDoor garage=new GarageDoor();
		GarageOnCommand garageOn=new GarageOnCommand(garage);

		
		remote.setCommand(garageOn);
		remote.buttonWasPressed();
		
		Sound sound=new Sound();
		SoundOnCommand soundOn=new SoundOnCommand(sound);
		
		
		remote.setCommand(soundOn);
		remote.buttonWasPressed();
		
		Hottub hottub=new Hottub();
		HottubOnCommand hottubOn=new HottubOnCommand(hottub);
				
		remote.setCommand(hottubOn);
		remote.buttonWasPressed();
		
		System.out.println("O servidor caiu!!");
		
		backup.load();
		/*
		SecurityControl securityControl=new SecurityControl();
		SecurityOnCommand securityOnCommand=new SecurityOnCommand(securityControl);
		
		remote.setCommand(securityOnCommand);
		remote.buttonWasPressed();
		
		CeilingFan ceilingFan=new CeilingFan();
		CeilingFanOnCommand ceilingFanOnCommand=new CeilingFanOnCommand(ceilingFan);
		
		remote.setCommand(ceilingFanOnCommand);
		remote.buttonWasPressed();
		*/
	}
}
