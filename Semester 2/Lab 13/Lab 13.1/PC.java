public class PC extends GameSystems
{
    public PC()
	{
        super();
    }
	
	 public PC(String platform)
	{
        super(platform);
    }
	
    public String getsystemInput()
	{
        return "Razor chroma Keyboard and Mouse";
    }
    public String toString() 
	{
        return "Platform: " + super.getPlatform() + "\n" +
                "Serial Number: " + super.getserialNo() + "\n" +
                "System Input: " + getsystemInput() + "\n" ;
    }
}