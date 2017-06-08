import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.Random;

	public class MazeGame extends JFrame
	{
		Random rand = new Random();
		int sizeX = rand.nextInt(20) + 7;
		int sizeY = rand.nextInt(20) + 7;
		int cellSize = 20;
		Maze m1 = new Maze(sizeX, sizeY);
		
		public MazeGame()
		{
			initUI();
		}
		
		public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					MazeGame mz = new MazeGame();
					mz.setVisible(true);
				}
			});
		}
	
	private void initUI()
	{
		setTitle("MazeGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(sizeX * cellSize + 200, sizeY * cellSize + 75);
		MazeDisplay md = new MazeDisplay(m1, cellSize);
		add(md);
		addKeyListener(md);
		setContentPane(md);
		md.setFocusable(true);
		setLocationRelativeTo(null);
	}
}