package singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Configure {

	private static Configure INSTANCE;
	private String appId;
	private String userName;
	private String language;
	private Byte offline;
	private Byte autoDlc;
	private Integer buildId;
	private String dlcName;
	private Byte updateBd;
	private String signature;
	private String windowInfo;
	private String lvWindowInfo;
	private String applicationApp;
	private String workDirectory;
	private Byte waitForExit;
	private Byte noOperation;

	private Configure()
	{
		String path="D:\\PadroesProjeto\\singleton\\configuracao.txt";
		try(BufferedReader br= new BufferedReader(new FileReader(path)))
		{
			String linha=br.readLine();
			while(linha!=null)
			{
				String[] line=linha.split("=");
				switch (line[0]) 
				{
					case "AppId":
						this.appId=line[1];
						break;
					case "UserName":
						this.userName=line[1];
						break;
					case "Language":
						this.language=line[1];
						break;
					case "Offline":
						this.offline=Byte.valueOf(line[1]);
						break;
					case "AutoDLC":
						this.autoDlc=Byte.valueOf(line[1]);
						break;
					case "BuildId":
						this.buildId=Integer.parseInt(line[1]);
						break;
					case "DLCName":
						this.dlcName=line[1];
						break;
					case "UpdateDB":
						this.updateBd=Byte.valueOf(line[1]);
						break;
					case "Signature":
						this.signature=line[1];
						break;
					case "WindowInfo":
						this.windowInfo=line[1];
						break;
					case "LVWindowInfo":
						this.lvWindowInfo=line[1];
						break;
					case "ApplicationPath":
						this.applicationApp=line[1];
						break;
					case "WorkingDirectory":
						this.workDirectory=line[1];
						break;
					case "WaitForExit":
						this.waitForExit=Byte.parseByte(line[1]);
						break;
					case "NoOperation":
						this.noOperation=Byte.parseByte(line[1]);
						break;
					default:
						System.out.println("Erro ao instanciar o objeto");
						break;
				}
				linha=br.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static Configure getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE=new Configure();
		}
			return INSTANCE;
	}

	public String getAppId() {
		return appId;
	}

	public String getUserName() {
		return userName;
	}

	public String getLanguage() {
		return language;
	}

	public Byte getOffline() {
		return offline;
	}

	public Byte getAutoDlc() {
		return autoDlc;
	}

	public Integer getBuildId() {
		return buildId;
	}

	public String getDlcName() {
		return dlcName;
	}

	public Byte getUpdateBd() {
		return updateBd;
	}

	public String getSignature() {
		return signature;
	}

	public String getWindowInfo() {
		return windowInfo;
	}

	public String getLvWindowInfo() {
		return lvWindowInfo;
	}

	public String getApplicationApp() {
		return applicationApp;
	}

	public String getWorkDirectory() {
		return workDirectory;
	}

	public Byte getWaitForExit() {
		return waitForExit;
	}

	public Byte getNoOperation() {
		return noOperation;
	}
}