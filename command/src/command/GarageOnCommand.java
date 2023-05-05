package command;

public class GarageOnCommand implements Command{

	GarageDoor garagerDoor;
	
	public GarageOnCommand(GarageDoor garageDoor)
	{
		this.garagerDoor=garageDoor;
	}

	@Override
	public String execute() {
		garagerDoor.up();
		garagerDoor.stop();
		return "A garagem estava aberta";
	}
}