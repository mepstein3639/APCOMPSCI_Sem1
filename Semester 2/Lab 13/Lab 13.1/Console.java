public class Console extends GameSystems
{
	public Console()
	{
		super();
	}
	
	public Console(String x)
	{
		super(x);
	}

	public String getController()
	{
		return "Controller";
	}
	public String toString() 
	{
        return "Platform: " + super.getPlatform() + "\n" +
                "Serial Number: " + super.getserialNo() + "\n" +
                "Controller: " + getController() + "\n" ;
    }
}
