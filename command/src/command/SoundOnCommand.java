package command;

public class SoundOnCommand implements Command{

	Sound sound;
	
	public SoundOnCommand(Sound sound)
	{
		this.sound=sound;
	}

	@Override
	public String execute() {
		sound.on();
		sound.setRadio();
		return "O rádio estava ligado";
	}
}