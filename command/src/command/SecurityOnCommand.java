package command;

public class SecurityOnCommand implements Command{

	SecurityControl securityControl;
	
	public SecurityOnCommand(SecurityControl securityControl)
	{
		this.securityControl=securityControl;
	}

	@Override
	public String execute() {
		securityControl.arm();
		return "O alarme estava ligado";
	}
}