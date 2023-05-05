package command;

import java.io.Serializable;

public class LigthOnCommand implements Command,Serializable{

	private static final long serialVersionUID = 1L;
	Light light;
	public LigthOnCommand(Light light)
	{
		this.light=light;
	}

	@Override
	public String execute() {
		light.on();
		return "A luz estava acesa";
	}
}