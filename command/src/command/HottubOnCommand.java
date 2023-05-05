package command;

public class HottubOnCommand implements Command{

	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub)
	{
		this.hottub=hottub;
	}

	@Override
	public String execute() {
		hottub.circulate();
		hottub.jetsOn();
		return "A jacuzzi estava ligada";
	}
}