package command;

public class SimpleRemoteControl {
	
	Command slot;
	private BackupService backupService=new BackupService();
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command)
	{
		slot=command;
	}
	
	public void buttonWasPressed()
	{
		backupService.store(slot.execute());
	}
}