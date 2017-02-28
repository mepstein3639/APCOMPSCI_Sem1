public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystems x = new XBox("Xbox");
		GameSystems y = new Playstation("Playstation");
		GameSystems z = new PC("PC");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
