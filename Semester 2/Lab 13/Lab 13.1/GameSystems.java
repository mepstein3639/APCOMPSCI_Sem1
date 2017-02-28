public abstract class GameSystems
{
	private String platform;
	private int serialNo;
	
	public GameSystems()
	{
		this.platform = "";
		this.serialNo = 1;
	}
	
	public GameSystems(String p)
	{
		this.platform = p;
		this.serialNo = 1 + (int)(Math.random()*9999999);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getserialNo()
	{
		return serialNo;
	}	
}