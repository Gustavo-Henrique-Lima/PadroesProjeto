package command;

public class CeilingFanOnCommand implements Command{

	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan=ceilingFan;
	}

	@Override
	public String execute() {
		ceilingFan.medium();
		return "O ventilador estava no médio";
	}
}