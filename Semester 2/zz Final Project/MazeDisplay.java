import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Path2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class MazeDisplay extends JPanel implements Printable, ActionListener, KeyListener
	{
	  Maze m1;
	  int offsetX = 10;
	  int offsetY = 10;
	  int cellSize = 20;
	  
	  Integer moveCounter = 0;
	  
	  int pointX, pointY, oldX, oldY;
	  int pointX2, pointY2, oldX2, oldY2;
	  boolean erase;
	  
	  public MazeDisplay()
	  {
		  m1 = new Maze();
		  pointX = offsetX + cellSize / 2;
		  pointY = offsetY + cellSize / 2;
		  pointX2 = offsetX + cellSize / 2;
		  pointY2 = offsetY + cellSize / 2;
		  oldX = pointX;
		  oldY = pointY;
		  oldX2 = pointX2;
		  oldY2 = pointY2;
		  addKeyListener(this);
	  }
	  
	   public MazeDisplay(Maze m2)
	  {
		  m1 = m2;
		  pointX = offsetX + cellSize / 2;
		  pointY = offsetY + cellSize / 2;
		  pointX2 = offsetX + cellSize / 2;
		  pointY2 = offsetY + cellSize / 2;
		  oldX = pointX;
		  oldY = pointY;
		  oldX2 = pointX2;
		  oldY2 = pointY2;
		  addKeyListener(this);
	  }
	  
	  public MazeDisplay(Maze m2, int cellSize2)
	  {
		  m1 = m2;
		  cellSize = cellSize2;
		  pointX = offsetX + cellSize / 2;
		  pointY = offsetY + cellSize / 2;
		  pointX2 = offsetX + cellSize / 2;
		  pointY2 = offsetY + cellSize / 2;
		  oldX = pointX;
		  oldY = pointY;
		  oldX2 = pointX2;
		  oldY2 = pointY2;
		  addKeyListener(this);
	  }
	  public int print(Graphics g, PageFormat pf, int page)
			throws PrinterException
			{
			  if (page > 0)
			  {
				  return NO_SUCH_PAGE;
			  }
			  
			  Graphics2D g2d = (Graphics2D) g;
			  g2d.translate(pf.getImageableX(), pf.getImageableY());
			  
			  doDrawing(g2d);
			  
			  return PAGE_EXISTS;
			}
		
		public void actionPerformed(ActionEvent e)
		{
			myPrint();
		}
		
		public void myPrint()
			{
			  PrinterJob job = PrinterJob.getPrinterJob();
			  job.setPrintable(this);
			  job.setJobName("Maze");
			  boolean ok = job.printDialog();
			  if (ok) 
			  {
				try
				{
					job.print();
				}
				catch (PrinterException ex)
				{
				  System.out.println("Print failed");
				}
		    }
		}
		
		private void doDrawing(Graphics g)
		{
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.black);
			
			Dimension size = getSize();
			Insets insets = getInsets();
			
			int w = size.width - insets.left - insets.right;
			int h = size.height - insets.top - insets.bottom;
			
			g2d.setBackground(Color.white);
			g2d.clearRect(0, 0, w, h);
			
			Path2D mazeShape = new Path2D.Double();
			
			int x, y;
			for (Integer i = 0; i < m1.sizeX; i++)
			{
				x = i * cellSize + offsetX;
				for(Integer j = 0; j < m1.sizeY; j++)
				{
					y = j * cellSize + offsetY;
					
					if(m1.cells[i][j].walls[0] == 1)
					{
						mazeShape.moveTo(x, y);
						mazeShape.lineTo(x + cellSize, y);
						g2d.drawLine(x, y, x + cellSize -1, y);
					}
					if(m1.cells[i][j].walls[1] == 1)
					{
						mazeShape.moveTo(x+ cellSize, y);
						mazeShape.lineTo(x + cellSize, y + cellSize);
						g2d.drawLine(x + cellSize, y, x + cellSize, y + cellSize -1);
					}
					if(m1.cells[i][j].walls[2] == 1)
					{
						mazeShape.moveTo(x, y + cellSize);
						mazeShape.lineTo(x + cellSize, y + cellSize);
						g2d.drawLine(x, y + cellSize, x + cellSize-1, y + cellSize);
					}
					if(m1.cells[i][j].walls[3] == 1)
					{
						mazeShape.moveTo(x, y);
						mazeShape.lineTo(x, y + cellSize);
						g2d.drawLine(x, y, x, y + cellSize-1);
					}
				}
			}
			
			x = (oldX - offsetX - cellSize / 2) / cellSize;
			y = (oldY - offsetY - cellSize / 2) / cellSize;
			
			if(x >= 0 && x < m1.sizeX && oldX > pointX && m1.cells[x][y].walls[3] == 1)
			{
				pointX = oldX;
				pointY = oldY;
			}
			else if (x >= 0 && x < m1.sizeX && oldX < pointX && m1.cells[x][y].walls[1] == 1)
			{
				pointX = oldX;
				pointY = oldY;
			}
			else if (y >= 0 && y < m1.sizeY && oldY > pointY && m1.cells[x][y].walls[0] == 1)
			{
				pointX = oldX;
				pointY = oldY;
			}
			else if (y >= 0 && y < m1.sizeY && oldY < pointY && m1.cells[x][y].walls[2] == 1)
			{
				pointX = oldX;
				pointY = oldY;
			}
			if(pointX != oldX || pointY != oldY)
			{
				moveCounter++;
			}
			g2d.drawString("Moves:" + moveCounter.toString(), m1.sizeX * cellSize + offsetX + 20, 20);
			g2d.drawString("Move: Arrow Keys", m1.sizeX * cellSize + offsetX + 20, 40);
			
			if (y == m1.sizeY - 1 && x == m1.sizeX -1)
			{
				System.out.println("Blue Won!");
				g2d.drawString("Blue Won!", m1.sizeX * cellSize + offsetX + 20, 120);
			}
			
			g.setColor(Color.CYAN);
			g.fillRect(oldX - 2, oldY - 2,4,4);
	
			
			g.setColor(Color.BLUE);
			g.fillRect(pointX - 2, pointY - 2,4,4);
		
		
		
		
		
		
					g2d.setColor(Color.black);
		
		int x2, y2;
			
			x2 = (oldX2 - offsetX - cellSize / 2) / cellSize;
			y2 = (oldY2 - offsetY - cellSize / 2) / cellSize;
			
			if(x2 >= 0 && x2 < m1.sizeX && oldX2 > pointX2 && m1.cells[x2][y2].walls[3] == 1)
			{
				pointX2 = oldX2;
				pointY2 = oldY2;
			}
			else if (x2 >= 0 && x2 < m1.sizeX && oldX2 < pointX2 && m1.cells[x2][y2].walls[1] == 1)
			{
				pointX2 = oldX2;
				pointY2 = oldY2;
			}
			else if (y2 >= 0 && y2 < m1.sizeY && oldY2 > pointY2 && m1.cells[x2][y2].walls[0] == 1)
			{
				pointX2 = oldX2;
				pointY2 = oldY2;
			}
			else if (y2 >= 0 && y2 < m1.sizeY && oldY2 < pointY2 && m1.cells[x2][y2].walls[2] == 1)
			{
				pointX2 = oldX2;
				pointY2 = oldY2;
			}
			if(pointX2 != oldX2 || pointY2 != oldY2)
			{
				moveCounter++;
			}
			g2d.drawString("Moves:" + moveCounter.toString(), m1.sizeX * cellSize + offsetX + 20, 80);
			g2d.drawString("Move: WASD", m1.sizeX * cellSize + offsetX + 20, 100);
			
			
			if (y2 == m1.sizeY - 1 && x2 == m1.sizeX -1)
			{
				System.out.println("Red Won!");
				g2d.drawString("Red Won!", m1.sizeX * cellSize + offsetX + 20, 120);
			}
			
			g.setColor(Color.PINK);
			g.fillRect(oldX2 - 2, oldY2 - 2,4,4);
	
			
			g.setColor(Color.RED);
			g.fillRect(pointX2 - 2, pointY2 - 2,4,4);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			doDrawing(g);
		}
		@SuppressWarnings("static-access")
		@Override
		public void keyPressed(KeyEvent key)
		{
			oldX = pointX;
			oldY = pointY;
			
			if (key.getKeyCode() == key. VK_DOWN) 
			{
				pointY = pointY + cellSize;
				if (pointY > getBounds().height)
				{
					pointY = getBounds().height;
				}
			}
			if (key.getKeyCode() == key.VK_UP)
			{
				pointY = pointY - cellSize;
				if (pointY < 0) {
					pointY = 0;
				}
			}
			if (key.getKeyCode() == key.VK_LEFT)
			{
				pointX = pointX - cellSize;
				if (pointX < 0) {
					pointX = 0;
				}
			}
			if (key.getKeyCode() == key. VK_RIGHT) 
			{
				pointX = pointX + cellSize;
				if (pointX > getBounds().width)
				{
					pointX = getBounds().width;
				}
			}
				
				
				
				
			oldX2 = pointX2;
			oldY2 = pointY2;
				
			if (key.getKeyCode() == key. VK_S) 
			{
				pointY2 = pointY2 + cellSize;
				if (pointY2 > getBounds().height)
				{
					pointY2 = getBounds().height;
				}
			}
			if (key.getKeyCode() == key.VK_W)
			{
				pointY2 = pointY2 - cellSize;
				if (pointY2 < 0) {
					pointY2 = 0;
				}
			}
			if (key.getKeyCode() == key.VK_A)
			{
				pointX2 = pointX2 - cellSize;
				if (pointX2 < 0) {
					pointX2 = 0;
				}
			}
			if (key.getKeyCode() == key. VK_D) 
			{
				pointX2 = pointX2 + cellSize;
				if (pointX2 > getBounds().width)
				{
					pointX2 = getBounds().width;
				}
				
				
				
				
			}
			
			repaint();
		}
		@Override
		public void keyReleased(KeyEvent arg0)
		{
			
		}
		@Override
		public void keyTyped(KeyEvent arg0)
		{
			
		}
}